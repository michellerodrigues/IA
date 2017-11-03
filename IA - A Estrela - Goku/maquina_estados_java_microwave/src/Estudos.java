import java.awt.*;
import java.io.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;

public class Estudos extends JFrame{
  private BufferedImage imagem;
  
  public Estudos(){
    super("Estudos Java");
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
	
    JButton btn = new JButton("Carregar Imagem");
    btn.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          imagem = null;
          
          try{
            imagem = ImageIO.read(
              new File("Imagens/Fechado.jpg"));
          }
          catch(IOException exc){
            JOptionPane.showMessageDialog(null, 
              "Erro ao carregar a imagem: " + 
              exc.getMessage());
          }

          if(imagem != null){
            desenhar();   
          }
        }
      }
    );

    c.add(btn);
    	
    setSize(400, 300);
    setVisible(true);
  }

  public void desenhar(){
    // desenha a imagem no JFrame
    Graphics g = getGraphics();   
    g.drawImage(imagem, 0, 0, this);
  }
  
  public static void main(String args[]){
    Estudos app = new Estudos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}