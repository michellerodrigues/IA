package Handlers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Controlador.Microondas;

public class Porta extends MouseAdapter implements MouseListener {
	
	Microondas micro;
	
	public Porta( Microondas micro ) {
		this.micro = micro;
	}
	
	public void mouseClicked(MouseEvent e){
		
		if(e.getButton() == MouseEvent.BUTTON2)
			return;
		
		int clicx=e.getX();
		int clicy=e.getY();
	
		if (	( (clicx >=  10 && clicx <= 540) && (clicy >=  40 && clicy <= 380) ) || ( (clicx >= 540 && clicx <= 615) && (clicy >= 335 && clicy <= 365) ) )
		{
			micro.changePort();
		}
		// System.out.println("X = "+clicx+"   Y = "+clicy);
	}

}
