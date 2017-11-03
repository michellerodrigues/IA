

import State.EstadosMicroondas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Timer;

public class Microondas88 extends Observable  implements ActionListener
{
  private boolean porta = false;
  int tempo=30;
  int min, seg;
  Timer t = new Timer(1000, this);

  private EstadosMicroondas state = EstadosMicroondas.getEstadoInicial();

  public synchronized void addObserver(Observer arg0)
  {
    super.addObserver(arg0);
  }

  public void setTime(int tempo) 
  {
   
    this.state = this.state.setPort(this.porta);
    setChanged();
    notifyObservers(this.tempo);
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
      
      setChanged();
      notifyObservers(tempo);
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

    setChanged();
    notifyObservers(this.tempo);
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