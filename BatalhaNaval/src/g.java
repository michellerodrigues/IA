import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class g
{
  int a;
  int b = -1;
  Font c;
  int d = 2708892;
  int e = 1;
  int f = 1;
  String g = "";

  public g()
  {
    c();
    if (this.c == null)
      d();
  }

  private final int[] a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = new int[2];
    int i = this.a + this.f;
    int j = a(paramString, paramInt2, paramInt3);
    if ((paramInt1 & 0x20) > 0)
      arrayOfInt[1] -= i;
    if ((paramInt1 & 0x2) > 0)
      arrayOfInt[1] -= (i >> 1);
    if ((paramInt1 & 0x8) > 0)
      arrayOfInt[0] -= j;
    if ((paramInt1 & 0x1) > 0)
      arrayOfInt[0] -= (j >> 1);
    return arrayOfInt;
  }

  public final int a(char paramChar)
  {
    if ((paramChar == '\n') || (paramChar == '\r'))
      return 0;
    int i;
    return i = this.c.charWidth(paramChar) + this.e;
  }

  private final void c()
  {
    if (this.c == null)
      d();
    this.a = (this.c.getHeight() - this.f);
  }

  private final void d()
  {
    this.c = Font.getFont(0, 0, 8);
    if ((this.g.length() > 0) && (this.g.charAt(0) == '2'))
      this.d = 16777215;
  }

  private int a(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2)
  {
    try
    {
      paramGraphics.setFont(this.c);
      int i = paramGraphics.getColor();
      paramInt2 -= this.c.getHeight();
      if (this.b >= 0)
      {
        paramGraphics.setColor(this.b);
        for (int j = paramInt2 - 1; j <= paramInt2 + 1; j++)
          for (int k = paramInt1 - 1; k <= paramInt1 + 1; k++)
          {
            if ((k == paramInt1) && (j == paramInt2))
              continue;
            paramGraphics.drawChar(paramChar, k, j, 20);
          }
      }
      paramGraphics.setColor(this.d);
      paramGraphics.drawChar(paramChar, paramInt1, paramInt2, 20);
      paramGraphics.setColor(i);
    }
    catch (Exception localException)
    {
    }
    return a(paramChar);
  }

  public final int a(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    int j = paramInt2 + this.a;
    String str = "" + paramChar;
    if ((paramInt3 != 0) && (paramInt3 != 20))
    {
      int[] arrayOfInt = a(str, paramInt3, 0, 1);
      i += arrayOfInt[0];
      j += arrayOfInt[1];
    }
    return a(paramGraphics, paramChar, i, j);
  }

  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramGraphics, paramString, 0, paramString.length(), paramInt1, paramInt2, paramInt3);
  }

  private void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = paramInt3;
    int j = paramInt4 + this.a;
    if ((paramInt5 != 0) && (paramInt5 != 20))
    {
      int[] arrayOfInt = a(paramString, paramInt5, paramInt1, paramInt2);
      i += arrayOfInt[0];
      j += arrayOfInt[1];
    }
    for (int k = paramInt1; k < paramInt1 + paramInt2; k++)
      i += a(paramGraphics, paramString.charAt(k), i, j);
  }

  public static g a()
  {
    return new g();
  }

  public final int b()
  {
    return this.f + this.a;
  }

  public final int a(String paramString)
  {
    int i = 0;
    int j = paramString.length();
    for (int k = 0; k < j; k++)
      i += a(paramString.charAt(k));
    return i;
  }

  private int a(String paramString, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = 0; j < paramInt2; j++)
      i += a(paramString.charAt(j + paramInt1));
    return i;
  }
}