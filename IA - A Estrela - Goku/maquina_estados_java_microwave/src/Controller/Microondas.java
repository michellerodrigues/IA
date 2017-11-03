package Controller;

import State.EstadosMicroondas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Timer;

public class Microondas extends Observable
implements ActionListener
{
	private boolean porta = false;
	String tempo;
	int min, seg;
	Timer t = new Timer(1000, this);

	private EstadosMicroondas state = EstadosMicroondas.getEstadoInicial();

	public Microondas()
	{
		this.min=0;
		this.seg=0;

	}

	public synchronized void addObserver(Observer arg0)
	{
		super.addObserver(arg0);
	}

	public void setTime(char Time) {

		int minAux=0;
		int segAux = 0;

		int valor = 1; //verificar como vou pegar o time ==1


		if((Time=='1') || (Time=='5') )  //+1min
		{
			if(Time=='5')
				valor=5;
			minAux=min+valor;
			if(minAux<=59)
			{
				min = minAux;
			}
			else 
			{
				min=0;
			}
		}

		if((Time=='3'))  //+30seg
		{
			valor = 3;
			segAux = seg + (valor*10);
			if(segAux<=59)
			{
				seg = segAux;
			}
			else //s1 >5
			{
				seg = 0;
			}
		}


		if(Time=='7') //Inc Minuto
		{
			minAux = min +valor;
			if(minAux<=59)
			{
				min = minAux;
			}
			else 
			{
				min=0;
			}
		}
		if(Time=='6') //dec Minuto
		{
			minAux = min - valor;
			if((minAux>0) && (minAux<=59))
			{
				min = minAux;
			}
			else 
			{
				min=59;
			}
		}

		if(Time=='9') //Inc seg
		{
			segAux = seg +valor;
			if(minAux<=59)
			{
				seg = segAux;
			}
			else 
			{
				seg=0;
			}
		}
		if(Time=='8') //dec seg
		{
			segAux = seg - valor;
			if((segAux>0) && (segAux<=59))
			{
				seg = segAux;
			}
			else 
			{
				seg=59;
			}
		}


		this.state = this.state.setPort(this.porta);

		setChanged();
		if(seg==0)
		{
			tempo = Integer.toString(min) + ":00";
		}
		else
		{
			tempo = Integer.toString(min) + ":" + Integer.toString(seg);
		}

		notifyObservers(String.valueOf(this.tempo));
	}

	public void open()
	{
		if (getStatus().equals("Aquecendo"))
		{
			pause();
		}

		this.state = this.state.open();

		if (getStatus().equals("Aberto"))
		{
			this.porta = true;
			setChanged();
			notifyObservers("Aberto");
		}
	}

	private void close()
	{
		this.state = this.state.close();

		if (this.state.getStatus().equals("Fechado"))
		{
			this.porta = false;
			setChanged();
			notifyObservers("Fechado");
		}
	}

	public void start()
	{
		this.state = this.state.start();

		if (this.state.getStatus().equals("Aquecendo"))
		{
			this.t.start();
			setChanged();
			notifyObservers("Aquecendo");
		}
	}

	public void pause()
	{
		if (getStatus().equals("Aquecendo"))
		{
			this.state = this.state.pause();
			this.t.stop();
		}
		else if ((getStatus().equals("Fechado")) || (getStatus().equals("Aberto")))
		{
			this.state = this.state.pause();
			this.state = this.state.setPort(this.porta);
			this.t.stop();

			min = 0;
			seg = 0;

			setChanged();
			tempo = Integer.toString(min) + Integer.toString(seg);
			notifyObservers(String.valueOf(this.tempo));
			setChanged();
			notifyObservers("Parado");
			return;
		}

		setChanged();
		notifyObservers("Pausado");
	}

	private void timeOver()
	{
		this.state = this.state.timeOver();
		this.t.stop();
		setChanged();
		notifyObservers("FimTempo");
	}

	public String getStatus()
	{
		return this.state.getStatus();
	}

	private void decreaseTime()
	{
		int miliseconds = seg * 1000 + min * 60000;
		miliseconds -= 1000;

		if (miliseconds <= 0)
		{
			seg = 0;
			min = 0;
			timeOver();
		}
		else
		{
			seg = miliseconds / 1000 % 60;
			min = miliseconds / 1000 / 60;
		}

		//String s = String.valueOf(seg < 10 ? "0" + Integer.toString(seg) : Integer.valueOf(seg));
		//String m = String.valueOf(min < 10 ? "0" + Integer.toString(min) : Integer.valueOf(min));
		String s =  Integer.toString(seg);
		String m = Integer.toString(min);

		setChanged();
		tempo = m + s;
		notifyObservers(String.valueOf(tempo));
	}

	public void changePort()
	{
		if (!this.porta)
		{
			open();
		}
		else
		{
			close();
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		decreaseTime();
	}
}