import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d
{
  int a;
  boolean b = true;
  short[][] c;
  Image d;
  int e = 1;
  int f = 1;
  final byte[] g = { 0, 4, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 10, 0, 0, 0, 0, 0, 12, 0, 0, 2, 0, 0, 0, 16, 0, 3, 17, 0, 1, 0, -4, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, -10, 0, 0, 0, 0, 0, -12, 0, 0, -2, 0, 0, 0, -16, 0, -3, -17, -1, 0, 0, 0, 5, -5, 19, -19, 20, -20, 0, 0, 0, 0, 6, -6, 7, -7, 0, 0, 0, 0, 0, 0, 0, 0, 21, -21, 9, -9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22, -22, 23, -23, 0, 0, 11, -11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, -13, 24, -24, 0, 0, 0, 0, 14, -14, 0, 0, 15, -15, 0, 0, 0, 0, 0, 0, 0, 0, 27, -27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, -25, 26, -26, 18, -18, 0, 0, 0 };
  int h = 127;
  String i = "";
  String j = "";
  boolean k = true;
  boolean l = true;

  private final int[] a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = new int[2];
    int m = this.a + this.f;
    int n = a(paramString, paramInt2, paramInt3);
    if ((paramInt1 & 0x20) > 0)
      arrayOfInt[1] -= m;
    if ((paramInt1 & 0x2) > 0)
      arrayOfInt[1] -= (m >> 1);
    if ((paramInt1 & 0x8) > 0)
      arrayOfInt[0] -= n;
    if ((paramInt1 & 0x1) > 0)
      arrayOfInt[0] -= (n >> 1);
    return arrayOfInt;
  }

  public final int a(char paramChar)
  {
    if ((paramChar == '\n') || (paramChar == '\r'))
      return 0;
    int m;
    return m = this.e + this.c[a(paramChar)][2];
  }

  private final void c()
  {
    byte[] arrayOfByte;
    int i2 = (arrayOfByte = e.m.a("cf" + this.i, -1)).length / 6;
    if (this.h < i2)
      this.h = i2;
    this.c = new short[this.h + 2][6];
    int i1 = 0;
    for (int n = 0; n < this.h; n++)
    {
      for (int m = 0; m < 6; m++)
      {
        this.c[n][m] = (short)arrayOfByte[i1];
        i1++;
      }
      if (this.c[n][0] < 0)
      {
        int tmp124_123 = 0;
        short[] tmp124_122 = this.c[n];
        tmp124_122[tmp124_123] = (short)(tmp124_122[tmp124_123] + 256);
      }
      if (this.c[n][1] < 0)
      {
        int tmp150_149 = 1;
        short[] tmp150_148 = this.c[n];
        tmp150_148[tmp150_149] = (short)(tmp150_148[tmp150_149] + 256);
      }
      if (i1 >= arrayOfByte.length)
        break;
    }
    if (this.c[0][2] == 0)
      this.c[0][2] = this.c[16][2];
    if (this.c[0][2] == 0)
      this.c[0][2] = this.c[33][2];
    this.c[0][3] = 0;
    if (i2 < 146)
    {
      this.k = false;
      this.l = false;
      this.b = false;
    }
    else
    {
      this.k = true;
      this.l = true;
      this.b = true;
    }
    this.a = this.c[a(1062)][3];
    int i3 = 0;
    long l1 = 0L;
    for (int i4 = 65; i4 <= 90; i4++)
    {
      l1 += this.c[a(i4)][3];
      if (i3 >= this.c[a(i4)][3])
        continue;
      i3 = this.c[a(i4)][3];
    }
    this.a = (int)(l1 / 26L);
    this.a = i3;
    int i5 = 100;
    int i6 = -100;
    int i9;
    for (int i7 = 0; i7 < this.c.length; i7++)
    {
      i8 = -this.c[i7][5];
      i9 = -(this.c[i7][3] + this.c[i7][5]);
      if (i6 < i8)
        i6 = i8;
      if (i5 <= i9)
        continue;
      i5 = i9;
    }
    int i8 = i6 - i5;
    if (this.a > i8)
      this.a = i8;
    int i10;
    if ((i10 = (i9 = i8 - this.a >> 1) - i6) != 0)
      for (int i11 = 0; i11 < this.c.length; i11++)
      {
        int tmp535_534 = 5;
        short[] tmp535_533 = this.c[i11];
        tmp535_533[tmp535_534] = (short)(tmp535_533[tmp535_534] - i10);
      }
    i5 = 100;
    i6 = -100;
    int i13;
    for (int i12 = 65; i12 <= 90; i12++)
    {
      i13 = a(i12);
      int i14 = -this.c[i13][5];
      int i15 = -(this.c[i13][3] + this.c[i13][5]);
      if (i6 < i14)
        i6 = i14;
      if (i5 <= i15)
        continue;
      i5 = i15;
    }
    i8 = i6 - i5;
    if ((i10 = (i9 = this.a - i8 >> 1) - i6) != 0)
      for (i13 = 0; i13 < this.c.length; i13++)
      {
        int tmp686_685 = 5;
        short[] tmp686_684 = this.c[i13];
        tmp686_684[tmp686_685] = (short)(tmp686_684[tmp686_685] - i10);
      }
  }

  private final void d()
  {
    try
    {
      this.d = e.a("/fnt" + this.j + ".png");
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final int a(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2, int paramInt3)
  {
    int m = paramInt1;
    int n = paramInt2 + this.a;
    String str = "" + paramChar;
    if ((paramInt3 != 0) && (paramInt3 != 20))
    {
      int[] arrayOfInt = a(str, paramInt3, 0, 1);
      m += arrayOfInt[0];
      n += arrayOfInt[1];
    }
    int i1 = paramGraphics.getClipX();
    int i2 = paramGraphics.getClipY();
    int i3 = paramGraphics.getClipWidth();
    int i4 = paramGraphics.getClipHeight();
    int i5 = a(paramChar);
    int i6 = this.c[i5][3];
    m += this.c[i5][4];
    n -= this.c[i5][5] + i6;
    int i7 = this.c[i5][2];
    int i8 = this.c[i5][3];
    int i9 = m;
    int i10 = n;
    if (i9 < i1)
    {
      i7 -= i1 - i9;
      i9 = i1;
    }
    if (i10 < i2)
    {
      i8 -= i2 - i10;
      i10 = i2;
    }
    if (i9 + i7 > i1 + i3)
      i7 = i1 + i3 - i9;
    if (i10 + i8 > i2 + i4)
      i8 = i2 + i4 - i10;
    if ((i7 > 0) && (i8 > 0) && (m >= -i7))
    {
      paramGraphics.setClip(i9, i10, i7, i8);
      paramGraphics.drawImage(this.d, m - this.c[i5][0], n - this.c[i5][1], 20);
    }
    paramGraphics.setClip(i1, i2, i3, i4);
    return a(paramChar);
  }

  public final int a(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2)
  {
    int m = paramGraphics.getClipX();
    int n = paramGraphics.getClipY();
    int i1 = paramGraphics.getClipWidth();
    int i2 = paramGraphics.getClipHeight();
    int i3 = a(paramChar);
    short[] arrayOfShort;
    int i4 = (arrayOfShort = this.c[i3])[3];
    paramInt1 += arrayOfShort[4];
    paramInt2 -= arrayOfShort[5] + i4;
    int i5 = arrayOfShort[2];
    int i6 = arrayOfShort[3];
    int i7 = paramInt1;
    int i8 = paramInt2;
    if (i7 < m)
    {
      i5 -= m - i7;
      i7 = m;
    }
    if (i8 < n)
    {
      i6 -= n - i8;
      i8 = n;
    }
    if (i7 + i5 > m + i1)
      i5 = m + i1 - i7;
    if (i8 + i6 > n + i2)
      i6 = n + i2 - i8;
    if ((i5 > 0) && (i6 > 0))
    {
      paramGraphics.setClip(i7, i8, i5, i6);
      paramGraphics.drawImage(this.d, paramInt1 - arrayOfShort[0], paramInt2 - arrayOfShort[1], 20);
    }
    paramGraphics.setClip(m, n, i1, i2);
    return a(paramChar);
  }

  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramGraphics, paramString, 0, paramString.length(), paramInt1, paramInt2, paramInt3);
  }

  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int m = paramInt3;
    int n = paramInt4 + this.a;
    if ((paramInt5 != 0) && (paramInt5 != 20))
    {
      int[] arrayOfInt = a(paramString, paramInt5, paramInt1, paramInt2);
      m += arrayOfInt[0];
      n += arrayOfInt[1];
    }
    int i1 = paramGraphics.getClipX();
    int i2 = paramGraphics.getClipY();
    int i3 = paramGraphics.getClipWidth();
    int i4 = paramGraphics.getClipHeight();
    for (int i5 = paramInt1; i5 < paramInt1 + paramInt2; i5++)
    {
      int i6 = paramString.charAt(i5);
      int i7 = a(i6);
      short[] arrayOfShort;
      int i8 = (arrayOfShort = this.c[i7])[3];
      int i9 = m + arrayOfShort[4];
      int i10 = n - (arrayOfShort[5] + i8);
      int i11 = arrayOfShort[2];
      int i12 = arrayOfShort[3];
      int i13 = i9;
      int i14 = i10;
      if (i13 < i1)
      {
        i11 -= i1 - i13;
        i13 = i1;
      }
      if (i14 < i2)
      {
        i12 -= i2 - i14;
        i14 = i2;
      }
      if (i13 + i11 > i1 + i3)
        i11 = i1 + i3 - i13;
      if (i14 + i12 > i2 + i4)
        i12 = i2 + i4 - i14;
      if ((i11 > 0) && (i12 > 0))
      {
        paramGraphics.setClip(i13, i14, i11, i12);
        paramGraphics.drawImage(this.d, i9 - arrayOfShort[0], i10 - arrayOfShort[1], 20);
      }
      if ((i6 == 10) || (i6 == 13))
        continue;
      m += i11 + this.e;
    }
    paramGraphics.setClip(i1, i2, i3, i4);
  }

  public static d a(String paramString1, String paramString2)
  {
    d locald;
    (locald = new d()).j = paramString1;
    locald.i = paramString2;
    locald.c = null;
    locald.c();
    locald.d = null;
    locald.d();
    return locald;
  }

  public static d a()
  {
    d locald;
    (locald = new d()).c = null;
    locald.c();
    locald.d = null;
    locald.d();
    return locald;
  }

  public final int b()
  {
    return this.f + this.a;
  }

  private int a(int paramInt)
  {
    int m;
    if ((m = paramInt) == 946)
      m = 223;
    if ((m >= 192) && (m - 192 < this.g.length))
    {
      int n;
      if (((n = this.g[(m - 192)]) < 0) || (m == 228))
      {
        n = -n;
        i1 = 100;
        if (this.b)
          i1 = 201;
        return i1 + n;
      }
      int i1 = 100;
      if (this.b)
        i1 = 165;
      return i1 + n;
    }
    if (m > 848)
      m -= 848;
    if ((m >= 97) && (m <= 122))
    {
      if (this.k)
        m += 35;
      else
        m -= 32;
    }
    else if ((m >= 192) && (m <= 223))
      m -= 96;
    else if ((m >= 224) && (m <= 255))
    {
      if (this.l)
        m -= 61;
      else
        m -= 128;
    }
    else if ((m >= 154) && (m <= 191))
      m -= 26;
    m -= 32;
    if ((m < 0) || (m >= this.h))
      m = 0;
    return m;
  }

  public final int a(String paramString)
  {
    int m = 0;
    int n = paramString.length();
    for (int i1 = 0; i1 < n; i1++)
      m += a(paramString.charAt(i1));
    return m;
  }

  private int a(String paramString, int paramInt1, int paramInt2)
  {
    int m = 0;
    for (int n = 0; n < paramInt2; n++)
      m += a(paramString.charAt(n + paramInt1));
    return m;
  }
}