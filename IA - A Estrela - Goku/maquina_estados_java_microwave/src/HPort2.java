


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HPort2 extends MouseAdapter
  implements MouseListener
{
  Microondas88 micro;

  public HPort2(Microondas88 micro)
  {
    this.micro = micro;
  }

  public void mouseClicked(MouseEvent e)
  {
    if (e.getButton() == 2) {
      return;
    }
    int clicx = e.getX();
    int clicy = e.getY();

    if (((clicx >= 10) && (clicx <= 540) && (clicy >= 40) && (clicy <= 380)) || ((clicx >= 540) && (clicx <= 615) && (clicy >= 335) && (clicy <= 365)))
    {
      this.micro.changePort();
    }
  }
}