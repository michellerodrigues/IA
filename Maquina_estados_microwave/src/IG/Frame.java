package IG;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Handlers.PainelComando;
import Handlers.Porta;

public class Frame extends JFrame implements Observer
{
	/**
	 * Exibir Relógio e Botões
	 */
	
	private JLabel Display = new JLabel("00:00");
	private JButton Botao_0;
	private JButton Botao_1;
	private JButton Botao_2;
	private JButton Botao_3;
	private JButton Botao_4;
	private JButton Botao_5;
	private JButton Botao_6;
	private JButton Botao_7;
	private JButton Botao_8;
	private JButton Botao_9;
	private JButton Botao_D;
	private JButton Botao_L;
	private PainelComando Painel;
	
	/**
	 * Exibir imagem do microondas
	 */
	private JImagePanel interfaceMicro;
	
	/**
	 * Variáveis Estáticas para desenhar objetos
	 */
	private static int FRAME_W = 645;
	private static int FRAME_H = 420;
	
	private static int IMAGE_W = 640;
	private static int IMAGE_H = 391;

	private static int CONTADOR_FONTSIZE = 25;


	private static int BOTAO_W = 27;
	private static int BOTAO_H = 19;
	private static int BOTAO_COL_1 =533;
	private static int BOTAO_LIN_1 = 172;
	private static int BOTAO_ESPACO = 2;
	private static int BOTAO_COL_2 = BOTAO_COL_1+BOTAO_W+BOTAO_ESPACO;
	private static int BOTAO_COL_3 = BOTAO_COL_2+BOTAO_W+BOTAO_ESPACO;
	private static int BOTAO_LIN_2 = BOTAO_LIN_1+BOTAO_H+BOTAO_ESPACO;
	private static int BOTAO_LIN_3 = BOTAO_LIN_2+BOTAO_H+BOTAO_ESPACO;
	private static int BOTAO_LIN_4 = BOTAO_LIN_3+BOTAO_H+BOTAO_ESPACO;
	

	private static final long serialVersionUID = 1L;
	
	public Frame( PainelComando handlerBotao, Porta  handlerPorta)
	{		
		super();
				
		setSize( FRAME_W, FRAME_H );
		setTitle( "MICROONDAS" );
		setResizable(false);
		this.Painel = handlerBotao;
		this.addMouseListener(  handlerPorta );
		
		getContentPane().setLayout( null );  
		getContentPane().setBackground( Color.WHITE );
		
		try 
		{
			IniciaComponentes() ;
		}
		catch( IOException e )
		{
			e.printStackTrace();
		}
		
		addWindowListener( new WindowAdapter () {
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		} ) ;
		
		setVisible( true ) ;
	}	
	
	private void IniciaComponentes() throws IOException
	{
		/**
		 /* Exibição do contador de minutos
		 */
		Display = new JLabel("00:00");
		Display.setFont( new Font("Courier", Font.BOLD, CONTADOR_FONTSIZE) );
		Display.setBounds( 538, 62, CONTADOR_FONTSIZE*4, CONTADOR_FONTSIZE );
		/**
		 * Adiciona relógio na tela
		 */
		this.add( Display );
		
		/**
		 * Painel com a imagem do microondas
		 */
		interfaceMicro = new JImagePanel( "Imagens/Fechado.jpg" );
		interfaceMicro.setBounds( 0, 0, IMAGE_W, IMAGE_H );

		/**
		 * Adiciona a imagem do microondas na tela
		 */
		this.add( interfaceMicro );
		
		/**
		 * Adiciona botões na tela
		 */

		Botao_1 = new JButton("1");
		Botao_1.setBounds( BOTAO_COL_1, BOTAO_LIN_1, BOTAO_W, BOTAO_H );
		Botao_1.addActionListener( Painel );
		Botao_1.setBackground(new Color(0,0,0,0));
		Botao_1.setContentAreaFilled(false);
		this.add( Botao_1 );
		
		Botao_2 = new JButton("2");
		Botao_2.setBounds( BOTAO_COL_2, BOTAO_LIN_1, BOTAO_W, BOTAO_H );
		Botao_2.addActionListener( Painel );
		Botao_2.setBackground(new Color(0,0,0,0));
		Botao_2.setContentAreaFilled(false);
		this.add( Botao_2 );
		
		Botao_3 = new JButton("3");
		Botao_3.setBounds( BOTAO_COL_3, BOTAO_LIN_1, BOTAO_W, BOTAO_H );
		Botao_3.addActionListener( Painel );
		Botao_3.setBackground(new Color(0,0,0,0));
		Botao_3.setContentAreaFilled(false);
		this.add( Botao_3 );

		Botao_4 = new JButton("4");
		Botao_4.setBounds( BOTAO_COL_1, BOTAO_LIN_2, BOTAO_W, BOTAO_H );
		Botao_4.addActionListener( Painel );
		Botao_4.setBackground(new Color(0,0,0,0));
		Botao_4.setContentAreaFilled(false);
		this.add( Botao_4 );
		
		Botao_5 = new JButton("5");
		Botao_5.setBounds( BOTAO_COL_2, BOTAO_LIN_2, BOTAO_W, BOTAO_H );
		Botao_5.addActionListener( Painel );
		Botao_5.setBackground(new Color(0,0,0,0));
		Botao_5.setContentAreaFilled(false);
		this.add( Botao_5 );
		
		Botao_6 = new JButton("6");
		Botao_6.setBounds( BOTAO_COL_3, BOTAO_LIN_2, BOTAO_W, BOTAO_H );
		Botao_6.addActionListener( Painel );
		Botao_6.setBackground(new Color(0,0,0,0));
		Botao_6.setContentAreaFilled(false);
		this.add( Botao_6 );
		
		Botao_7 = new JButton("7");
		Botao_7.setBounds( BOTAO_COL_1, BOTAO_LIN_3, BOTAO_W, BOTAO_H );
		Botao_7.addActionListener( Painel );
		Botao_7.setBackground(new Color(0,0,0,0));
		Botao_7.setContentAreaFilled(false);
		this.add( Botao_7 );
		
		Botao_8 = new JButton("8");
		Botao_8.setBounds( BOTAO_COL_2, BOTAO_LIN_3, BOTAO_W, BOTAO_H );
		Botao_8.addActionListener( Painel );
		Botao_8.setBackground(new Color(0,0,0,0));
		Botao_8.setContentAreaFilled(false);
		this.add( Botao_8 );
		
		Botao_9 = new JButton("9");
		Botao_9.setBounds( BOTAO_COL_3, BOTAO_LIN_3, BOTAO_W, BOTAO_H );
		Botao_9.addActionListener( Painel );
		Botao_9.setBackground(new Color(0,0,0,0));
		Botao_9.setContentAreaFilled(false);
		this.add( Botao_9 );
		
		Botao_L = new JButton("D");
		Botao_L.setBounds( BOTAO_COL_1, BOTAO_LIN_4, BOTAO_W, BOTAO_H );
		Botao_L.addActionListener( Painel );
		Botao_L.setBackground(new Color(0,0,0,0));
		Botao_L.setContentAreaFilled(false);
		this.add( Botao_L );
		
		Botao_0 = new JButton("0");
		Botao_0.setBounds( BOTAO_COL_2, BOTAO_LIN_4, BOTAO_W, BOTAO_H );
		Botao_0.addActionListener( Painel );
		Botao_0.setBackground(new Color(0,0,0,0));
		Botao_0.setContentAreaFilled(false);
		this.add( Botao_0 );
		
		Botao_D = new JButton("L");
		Botao_D.setBounds( BOTAO_COL_3, BOTAO_LIN_4, BOTAO_W, BOTAO_H );
		Botao_D.addActionListener( Painel );
		Botao_D.setBackground(new Color(0,0,0,0));
		Botao_D.setContentAreaFilled(false);
		this.add( Botao_D );
	}
	
	private void Display( String mensagem ) {
		this.Display.setText( mensagem);
	}
	
	private void mudaFigura(String figura) {

		try {
			interfaceMicro.setImage( "Imagens/"+figura+".jpg" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.repaint();

	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		String mensagem = String.valueOf(arg); 
		
		System.out.println("Mensagem: "+mensagem);
		if ( mensagem == "Aberto" )
		{
			mudaFigura("Aberto");
		}
		else if ( mensagem == "Fechado"	)
		{
			mudaFigura("Fechado");
		}
		else if ( mensagem ==  "Ligado" )
		{
			this.Display.setForeground(Color.red);
			mudaFigura("Ligado");
		}
		else if ( mensagem == "Parado" )
		{
			this.Display.setForeground(Color.darkGray);
			mudaFigura("Fechado");
		}
		else if ( mensagem == "Pausado" )
		{
			this.Display.setForeground(Color.green);
			mudaFigura("Fechado");
		}
		else if ( mensagem == "FimTempo" )
		{
			this.Display.setForeground(Color.darkGray);
			mudaFigura("Fechado");
			java.awt.Toolkit.getDefaultToolkit().beep();
			System.out.print((char) 7);
		}
		else
		{
			Display( mensagem );	
		}
		this.repaint();
	}
	
}
