package GUI;
import handlers.HButtons;
import handlers.HPort;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import GUI.JImagePanel;

public class Frame extends JFrame
implements Observer
{
	private JLabel lDisplay = new JLabel("00:00");
	int min, seg;
	private JButton bt5min; 
	private JButton bt30seg;
	private JButton bt1min;
	private JButton btIncMin;
	private JButton btDecMin;
	private JButton btStart;
	private JButton btCancela;
	private JButton btAbrirPorta;	
	private HButtons hButton; //TROCAR 


	private JImagePanel iMicro;
	private JButton btIncSeg;
	private JButton btDecSeg;
	private static int FRAME_W = 1200;
	private static int FRAME_H = 680;

	private static int IMAGE_W = 1200;
	private static int IMAGE_H = 1200;

	private static int CONTADOR_FONTSIZE = 30;

	private static int BOTAO_W = 30;
	private static int BOTAO_H = 19;
	private static final long serialVersionUID = 1L;

	public Frame(HButtons hB, HPort hPort)
	{
		setSize(FRAME_W, FRAME_H);
		setTitle("MICROONDAS");
		setResizable(false);
		this.hButton = hB;
		addMouseListener(hPort);

		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		try
		{
			IniciaComponentes();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

	private void IniciaComponentes()
			throws IOException
			{
		this.lDisplay = new JLabel("00:00");
		this.lDisplay.setFont(new Font("Courier", 1, CONTADOR_FONTSIZE));
		this.lDisplay.setBounds(1020, 150, CONTADOR_FONTSIZE * 4, CONTADOR_FONTSIZE);

		add(this.lDisplay);

		this.iMicro = new JImagePanel("Imagens/Fechado.JPG");
		this.iMicro.setBounds(0, 0, IMAGE_W, IMAGE_H);

		add(this.iMicro);

		this.bt1min = new JButton("1");
		this.bt1min.setBounds(1053, 421, BOTAO_W, BOTAO_H);
		this.bt1min.addActionListener(this.hButton);
		this.bt1min.setContentAreaFilled(true);
		add(this.bt1min);

		this.bt30seg = new JButton("3");
		this.bt30seg.setBounds(1107, 421, BOTAO_W, BOTAO_H);
		this.bt30seg.addActionListener(this.hButton);
		this.bt30seg.setContentAreaFilled(true);
		add(this.bt30seg);

		this.bt5min = new JButton("5");
		this.bt5min.setBounds(1000, 421, BOTAO_W, BOTAO_H);
		this.bt5min.addActionListener(this.hButton);
		this.bt5min.setContentAreaFilled(true);
		add(this.bt5min);

		this.btIncMin = new JButton("7");
		this.btIncMin.setBounds(1010, 490, BOTAO_W, BOTAO_H);
		this.btIncMin.addActionListener(this.hButton);
		this.btIncMin.setContentAreaFilled(true);
		add(this.btIncMin);

		this.btDecMin = new JButton("6");
		this.btDecMin.setBounds(1010, 525, BOTAO_W, BOTAO_H);
		this.btDecMin.addActionListener(this.hButton);
		this.btDecMin.setBackground(new Color(0, 0, 0, 0));
		this.btDecMin.setContentAreaFilled(true);
		add(this.btDecMin);

		this.btIncSeg = new JButton("9");
		this.btIncSeg.setBounds(1086, 487, BOTAO_W, BOTAO_H);
		this.btIncSeg.addActionListener(this.hButton);
		this.btIncSeg.setBackground(new Color(0, 0, 0, 0));
		this.btIncSeg.setContentAreaFilled(true);
		add(this.btIncSeg);

		this.btDecSeg = new JButton("8");
		this.btDecSeg.setBounds(1086, 523, BOTAO_W, BOTAO_H);
		this.btDecSeg.addActionListener(this.hButton);
		this.btDecSeg.setBackground(new Color(0, 0, 0, 0));
		this.btDecSeg.setContentAreaFilled(true);
		add(this.btDecSeg);

		this.btCancela = new JButton("0");
		this.btCancela.setBounds(1005, 570, BOTAO_W, BOTAO_H);
		this.btCancela.addActionListener(this.hButton);
		this.btCancela.setBackground(new Color(0, 0, 0, 0));
		this.btCancela.setContentAreaFilled(true);
		add(this.btCancela);

		this.btStart = new JButton("2");
		this.btStart.setBounds(1084, 570, BOTAO_W, BOTAO_H);
		this.btStart.addActionListener(this.hButton);
		this.btStart.setBackground(new Color(0, 0, 0, 0));
		this.btStart.setContentAreaFilled(true);
		add(this.btStart);
		
		this.btAbrirPorta = new JButton("A");
		this.btAbrirPorta.setBounds(1053,330, BOTAO_W, BOTAO_H);
		this.btAbrirPorta.addActionListener(this.hButton);
		this.btAbrirPorta.setBackground(new Color(0, 0, 0, 0));
		this.btAbrirPorta.setContentAreaFilled(true);
		add(this.btAbrirPorta);
		
			}

	private void showTime(String msg) {

		this.lDisplay.setText(msg);
		//  this.lDisplay.setText(String.valueOf(msg.charAt(1)) + String.valueOf(msg.charAt(0)) + ":" + '0' + '0');
	}

	private void mudaFigura(String figura)
	{
		try {
			this.iMicro.setImage("Imagens/" + figura + ".JPG");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		repaint();
	}

	public void update(Observable o, Object arg)
	{
		String mensagem = String.valueOf(arg);

		System.out.println("Mensagem: " + mensagem);
		if (mensagem == "Aberto")
		{
			mudaFigura("Aberto");
		}
		else if (mensagem == "Fechado")
		{
			mudaFigura("Fechado");
		}
		else if (mensagem == "Aquecendo")
		{
			this.lDisplay.setForeground(Color.red);
			mudaFigura("Ligado");
		}
		else if (mensagem == "Parado")
		{
			this.lDisplay.setForeground(Color.darkGray);
			mudaFigura("Fechado");
		}
		else if (mensagem == "Pausado")
		{
			this.lDisplay.setForeground(Color.green);
			mudaFigura("Fechado");
		}
		else if (mensagem == "FimTempo")
		{
			this.lDisplay.setForeground(Color.darkGray);
			Toolkit.getDefaultToolkit().beep();
			System.out.print('\007');
		}
		else
		{
			showTime(mensagem);
		}
		repaint();
	}
}