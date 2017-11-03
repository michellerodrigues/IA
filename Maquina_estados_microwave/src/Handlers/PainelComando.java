package Handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controlador.Microondas;

public class PainelComando implements ActionListener {

	private Microondas micro;
	
	public PainelComando( Microondas micro ){
		this.micro = micro;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if( e.getSource() instanceof JButton )
		{
			JButton j = (JButton) e.getSource();/*Unsafe but...*/
			char c = j.getText().toString().charAt(0);
			if ( c == 'D' )
			{
				micro.pause();
			}
			else if ( micro.getStatus() != "Ligado" )
			{
				if (c >= '0' && c <= '9' )
				{
					micro.setTime( c );
				}
				else if ( c == 'L' )
				{
					micro.start();
				}
			}
		}
	}
}