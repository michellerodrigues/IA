package Principal;

import Controlador.Microondas;
import Handlers.PainelComando;
import Handlers.Porta;
import IG.Frame;

public class Main 
{
	public static void main( String args[] )
	{
		Microondas microondas = new Microondas();
		PainelComando hButton = new PainelComando( microondas );
		Porta Porta = new Porta( microondas );
		Frame f = new Frame( hButton, Porta );
		microondas.addObserver(f);
	}
}
