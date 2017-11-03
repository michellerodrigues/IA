import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;

public class a extends Canvas
{
  static int[] a;

  public a()
  {
    setFullScreenMode(true);
  }

  static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i = paramGraphics.getTranslateX();
    int j = paramGraphics.getTranslateY();
    paramGraphics.translate(-i, -j);
    paramInt1 += i;
    paramInt2 += j;
    int k = 960;
    if ((a != null) && (960 < a.length))
      k = a.length;
    int m = 1;
    int n;
    try
    {
      n = paramInt5 + (paramInt6 << 24);
      if (Display.getDisplay(NET_Lizard.a).numAlphaLevels() > 2)
      {
        if ((a == null) || (a.length != k) || (a[0] != n))
        {
          if ((a == null) || (a.length != k))
          {
            if (a != null)
              a = null;
            a = new int[k];
          }
          int[] arrayOfInt = a;
          for (i2 = 0; i2 < arrayOfInt.length; i2++)
            arrayOfInt[i2] = n;
        }
        int i1 = paramGraphics.getClipX();
        int i2 = paramGraphics.getClipY();
        int i3 = paramGraphics.getClipWidth();
        int i4 = paramGraphics.getClipHeight();
        int i5 = paramInt1;
        int i6 = paramInt2;
        if (i5 < i1)
        {
          paramInt3 -= i1 - i5;
          i5 = i1;
        }
        if (i6 < i2)
        {
          paramInt4 -= i2 - i6;
          i6 = i2;
        }
        if (i5 + paramInt3 > i1 + i3)
          paramInt3 = i1 + i3 - i5;
        if (i6 + paramInt4 > i2 + i4)
          paramInt4 = i2 + i4 - i6;
        try
        {
          if ((paramInt3 > 0) && (paramInt4 > 0))
          {
            paramGraphics.setClip(i5, i6, paramInt3, paramInt4);
            int i7 = i6;
            while (i7 < i6 + paramInt4)
            {
              paramGraphics.drawRGB(a, 0, 240, 0, i7, 240, 4, true);
              i7 += 4;
            }
          }
          m = 0;
        }
        catch (Exception localException1)
        {
        }
        paramGraphics.setClip(i1, i2, i3, i4);
      }
    }
    catch (Exception localException2)
    {
    }
    if (m != 0)
      try
      {
        n = paramGraphics.getColor();
        paramGraphics.setColor(paramInt5);
        paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
        paramGraphics.setColor(n);
      }
      catch (Exception localException3)
      {
      }
    paramGraphics.translate(i, j);
  }

  public int getWidth()
  {
    return 240;
  }

  static final int a(int paramInt)
  {
    return paramInt;
  }

  public void paint(Graphics paramGraphics)
  {
  }
}