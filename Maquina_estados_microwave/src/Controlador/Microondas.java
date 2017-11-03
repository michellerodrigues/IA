package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Timer;

import State.*;

public class Microondas extends Observable implements ActionListener {

	
	private boolean porta = false ;  // false = porta fechada / true = aberta
	char tempo[] = new char[5];
	Timer t = new Timer(1000, this);;
	
	private MicroEstado state = MicroEstado.getEstadoInicial() ;
	
	public Microondas() {
		tempo[4] = tempo[3] = tempo[1] = tempo[0] = '0';
		tempo[2] = ':';
	}
	
	@Override
	public synchronized void addObserver(Observer arg0) {
		super.addObserver(arg0);
	}

	public void setTime( char Time ) {
		tempo[0] = tempo[1];
		tempo[1] = tempo[3];
		tempo[3] = tempo[4];
		tempo[4] = Time;
		
		state = state.setPort(porta);
		setChanged();
		notifyObservers( String.valueOf(tempo) );
	}
	
	public void open()
	{
		if( getStatus().equals("Ligado"))
		{
			pause();
		}
		
		state = state.open();
		
		if( getStatus().equals("Aberto") )
		{
			porta = true ;
			setChanged();
			notifyObservers( "Aberto" );
		}
	}
	
	private void close()
	{
		state = state.close() ;
		
		if( state.getStatus().equals("Fechado") )
		{
			porta = false ;
			setChanged();
			notifyObservers( "Fechado" );
		}
	}
	
	public void start()
	{
		state = state.start() ;
		
		if( state.getStatus().equals("Ligado") )
		{
			t.start();
			setChanged();
			notifyObservers( "Ligado" );
		}
	}
	
	public void pause()
	{
		if( getStatus().equals("Ligado") )
		{
			state = state.pause();
			t.stop();
		}
		else if( getStatus().equals("Fechado") || getStatus().equals("Aberto") ) // Segundo toque do "Desliga/Cancela"
		{
			state = state.pause();
			state = state.setPort(porta == false ? false : true);
			t.stop();
			tempo[4] = tempo[3] = tempo[1] = tempo[0] = '0';
			setChanged();
			notifyObservers( String.valueOf(tempo) );
			setChanged();
			notifyObservers( "Parado" );
			return;
		}
		
		setChanged();
		notifyObservers( "Pausado" );
	}
	
	private void timeOver()
	{
		state = state.timeOver();
		t.stop();
		setChanged();
		notifyObservers( "FimTempo" );
	}
	
	public String getStatus()
	{
		return state.getStatus() ;
	}
	
	private void decreaseTime() {
		
		int min = Integer.valueOf( (tempo[0] - '0') ) * 10 + Integer.valueOf( (tempo[1] - '0') );
		int seg = Integer.valueOf( (tempo[3] - '0') ) * 10 + Integer.valueOf( (tempo[4] - '0') );
		int segundos = (seg + min * 60) - 1 ;

		if( segundos <= 0 )
		{
			min = seg = 0;
			tempo[0] = tempo[1] = tempo[3] = tempo[4] = '0';
			timeOver();
		}
		else
		{
			if ( segundos >= 6000 )
			{
				segundos = 5999;
			}
			min = segundos / 60;
			seg = segundos % 60;
			tempo[0] = (char) ( (min / 10) + '0' );
			tempo[1] = (char) ( (min % 10) + '0' );
			tempo[3] = (char) ( (seg / 10) + '0' );
			tempo[4] = (char) ( (seg % 10) + '0' );
		}
		setChanged();
		notifyObservers( String.valueOf(tempo) );
	}
	
	public void changePort() {

		if( porta == false )
		{
			open();
		}
		else
		{
			close();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		decreaseTime();
	}

}