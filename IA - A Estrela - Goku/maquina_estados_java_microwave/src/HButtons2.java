


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class HButtons2
  implements ActionListener
{
  private Microondas88 micro;

  public HButtons2(Microondas88 micro)
  {
    this.micro = micro;
  }

  public void actionPerformed(ActionEvent e)
  {
    if ((e.getSource() instanceof JButton))
    {
      JButton bts =  (JButton)e.getSource();
     
      
      String btsValue = bts.getText().toString();
      int t = Integer.valueOf(btsValue);

      switch (t) 
      {
      	case 30:
      	case 60:
      	case 600:
      	case 1:
      	case -1:
      	case 2:
      	case 3:
         if (this.micro.getStatus() == "Aquecendo")
          break;
        this.micro.setTime(t);

        break;
      case 'S':
        if (this.micro.getStatus() == "Aquecendo")
          break;
        this.micro.start();

        break;
      case 'P':
        this.micro.pause();
      }
    }
  }
}