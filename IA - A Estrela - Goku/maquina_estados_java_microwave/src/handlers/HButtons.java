package handlers;

import Controller.Microondas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class HButtons
  implements ActionListener
{
  private Microondas micro;

  public HButtons(Microondas micro)
  {
    this.micro = micro;
  }

  public void actionPerformed(ActionEvent e)
  {
    if ((e.getSource() instanceof JButton))
    {
      JButton j = (JButton)e.getSource();
      char c = j.getText().toString().charAt(0);

      switch (c)
      {
      case '1': //1min
      case '3': //30seg
      case '4': //1min
      case '5': //5min
      case '6': //dec
      case '7': //inc
      case '8': //dec
      case '9': //inc
        if (this.micro.getStatus() == "Aquecendo")
          break;
        this.micro.setTime(c);

        break;
      case '2': //start
        if (this.micro.getStatus() == "Aquecendo")
          break;
        this.micro.start();
        break;
      case '0': //cancela
        this.micro.pause();
      case 'A': //abre porta
    	this.micro.changePort();
      }
    }
  }
}