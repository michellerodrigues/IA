


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

public class Frame2 extends JFrame
  implements Observer
{
  private JLabel lDisplay = new JLabel("00:00");
  int min, seg;
  private JButton bt5min;
  private JButton bt30seg;
  private JButton bt1min;
  private JButton btInc;
  private JButton btDec;
  private JButton btStart;
  private JButton btCancela;
  private HButtons2 hButton;
  
  
  private JImagePanel iMicro;
  private static int FRAME_W = 1200;
  private static int FRAME_H = 680;

  private static int IMAGE_W = 1200;
  private static int IMAGE_H = 1200;

  private static int CONTADOR_FONTSIZE = 30;

  private static int BOTAO_W = 27;
  private static int BOTAO_H = 19;
  private static int BOTAO_COL_1 = 1070;
  private static int BOTAO_LIN_1 = 475;
  private static int BOTAO_ESPACO = 2;
  private static int BOTAO_COL_2 = BOTAO_COL_1 + BOTAO_W + BOTAO_ESPACO;
  private static int BOTAO_COL_3 = BOTAO_COL_2 + BOTAO_W + BOTAO_ESPACO;
  private static int BOTAO_LIN_2 = BOTAO_LIN_1 + BOTAO_H + BOTAO_ESPACO;
  private static int BOTAO_LIN_3 = BOTAO_LIN_2 + BOTAO_H + BOTAO_ESPACO;
  private static int BOTAO_LIN_4 = BOTAO_LIN_3 + BOTAO_H + BOTAO_ESPACO;
  private static final long serialVersionUID = 1L;

  public Frame2(HButtons2 hB, HPort2 hPort)
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

    this.bt1min = new JButton("60");
    this.bt1min.setBounds(BOTAO_COL_2, BOTAO_LIN_1, BOTAO_W, BOTAO_H);
    this.bt1min.addActionListener(this.hButton);
    this.bt1min.setContentAreaFilled(true);
    add(this.bt1min);

    this.bt30seg = new JButton("30");
    this.bt30seg.setBounds(BOTAO_COL_2, BOTAO_LIN_1, BOTAO_W, BOTAO_H);
    this.bt30seg.addActionListener(this.hButton);
    this.bt30seg.setBackground(new Color(0, 0, 0, 0));
    this.bt30seg.setContentAreaFilled(true);
    add(this.bt30seg);

    this.bt5min = new JButton("300");
    this.bt5min.setBounds(BOTAO_COL_3, BOTAO_LIN_1, BOTAO_W, BOTAO_H);
    this.bt5min.addActionListener(this.hButton);
    this.bt5min.setBackground(new Color(0, 0, 0, 0));
    this.bt5min.setContentAreaFilled(true);
    add(this.bt5min);

    this.btInc = new JButton("1");
    this.btInc.setBounds(BOTAO_COL_1, BOTAO_LIN_2, BOTAO_W, BOTAO_H);
    this.btInc.addActionListener(this.hButton);
    this.btInc.setBackground(new Color(0, 0, 0, 0));
    this.btInc.setContentAreaFilled(true);
    add(this.btInc);

    this.btDec = new JButton("-1");
    this.btDec.setBounds(BOTAO_COL_2, BOTAO_LIN_2, BOTAO_W, BOTAO_H);
    this.btDec.addActionListener(this.hButton);
    this.btDec.setBackground(new Color(0, 0, 0, 0));
    this.btDec.setContentAreaFilled(true);
    add(this.btDec);

    this.btCancela = new JButton("2");
    this.btCancela.setBounds(BOTAO_COL_1, BOTAO_LIN_4, BOTAO_W, BOTAO_H);
    this.btCancela.addActionListener(this.hButton);
    this.btCancela.setBackground(new Color(0, 0, 0, 0));
    this.btCancela.setContentAreaFilled(true);
    add(this.btCancela);

    this.btStart = new JButton("3");
    this.btStart.setBounds(BOTAO_COL_3, BOTAO_LIN_4, BOTAO_W, BOTAO_H);
    this.btStart.addActionListener(this.hButton);
    this.btStart.setBackground(new Color(0, 0, 0, 0));
    this.btStart.setContentAreaFilled(true);
    add(this.btStart);
  }

  private void showTime(String msg) {
      
	  this.lDisplay.setText(String.valueOf(msg) + ":" + "mica");
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