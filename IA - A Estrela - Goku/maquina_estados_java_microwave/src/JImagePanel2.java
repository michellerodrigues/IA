

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JImagePanel2 extends JPanel
{
  private static final long serialVersionUID = 1L;
  private BufferedImage image = null;

  public JImagePanel2(BufferedImage img)
  {
    setImage(img);
  }

  public JImagePanel2(File imgSrc)
    throws IOException
  {
    this(ImageIO.read(imgSrc));
  }

  public JImagePanel2(String fileName)
    throws IOException
  {
    this(new File(fileName));
  }

  public final void setImage(BufferedImage img)
  {
    if (img == null) {
      throw new NullPointerException("Buffered image cannot be null!");
    }
    this.image = img;
    invalidate();
  }

  public void setImage(File img)
    throws IOException
  {
    setImage(ImageIO.read(img));
  }

  public void setImage(String fileName)
    throws IOException
  {
    setImage(new File(fileName));
  }

  public BufferedImage getImage()
  {
    return this.image;
  }

  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g.create();
    g.drawImage(image, 0, 0, this);
    g2d.dispose();
  }


}