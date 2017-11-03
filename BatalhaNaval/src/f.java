import GlomoReg.GlomoCountry;
import GlomoReg.GlomoCountryShort;
import GlomoReg.GlomoRegistrator;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class f
{
  static int[] a;
  static int[] b;
  static int[] c;
  static int d;
  static int e;
  static i f;
  static boolean g;
  static boolean h;
  static int i;
  static int j;
  static int k;
  static int l;
  static int m;
  static int n;
  static int o;
  static int p;
  static int q;
  static int r;
  static boolean s;
  static boolean t;
  static long u;
  static long v;
  static String[][] w;
  static String[][] x;
  static boolean y;
  static int z;
  int A = 2;
  char[] B;
  static int C;
  static long D;
  static int E;
  static int F;
  static boolean G;
  boolean H = false;
  static g I;
  static g J;
  static String[] K;
  static i L;
  static int M;
  static int[] N;
  static int[] O;
  int P = d / 2;
  int Q = e / 2;
  int R;
  g S;
  int T = 6;
  int U = 5;
  String V;
  boolean W = false;
  boolean X = false;
  static String Y;
  int Z;
  int aa;
  int ab;
  static int ac;
  private static boolean aE;
  private static boolean aF;
  static int ad;
  static int ae;
  static boolean af;
  static boolean ag;
  static int[] ah = { 1113683060, 1818588008, 1768977184, 1112801280 };
  static String[] ai;
  static int aj;
  static int ak;
  static int[] al;
  static int am;
  static int[][] an;
  static Player ao;
  private static GlomoRegistrator aG;
  static f ap;
  static boolean aq;
  int ar = 6;
  int as = 6;
  static int at;
  private static int[][] aH;
  static boolean au;
  static String[][] av;
  static int aw;
  static long ax;
  static long ay;
  static int[] az;
  static int[] aA;
  static int aB;
  static byte aC;
  static byte aD;

  static
  {
    new int[] { 1296389185, 759778886, 793592142, 1229342035 }[4] = 1412320582;
    new int[] { 1399874915, 1768319331, 1635019119 }[3] = 1845493760;
    new int[] { 1296647248 }[1] = 758263344;
    a = new int[] { 1684368640 };
    new int[1][0] = 1819934720;
    b = new int[] { 1684890368 };
    new int[] { 1296647276, 1702112586, 1634872661 }[3] = 1380712448;
    y = true;
    az = new int[] { 1296647276, 1702112598, 1701733487, 1912602624 };
    aA = new int[] { 1313166368, 1281981025, 1919156224 };
    al = new int[] { 1296647276, 1702112590, 1634559232 };
    g = true;
    N = new int[32];
    O = new int[N.length];
    aj = 0;
    m = a(234, 238, 247);
    j = a(69, 132, 235);
    k = a(40, 31, 14);
    i = a(24, 61, 121);
    p = a(255, 255, 255);
    l = a(22, 56, 112);
    n = a(40, 90, 172);
    o = a(67, 106, 172);
    aB = 0;
    M = d;
    at = 0;
    ac = 0;
    ae = 894;
    aw = 32;
    aD = -58;
    aC = 2;
    au = true;
    G = true;
    aq = false;
    an = new int[][] { { 83, 104, 111, 114, 116, 45, 78, 117, 109, 98, 101, 114 }, { 67, 111, 100, 101 }, { 80, 97, 121, 109, 101, 110, 116, 45, 84, 101, 120, 116 } };
    c = new int[] { 71, 97, 109, 101, 45 };
    K = new String[an.length];
    aH = new int[][] { { 110, 111, 116, 83, 77, 83 }, { 106, 97, 118, 97, 120, 46, 119, 105, 114, 101, 108, 101, 115, 115, 46, 109, 101, 115, 115, 97, 103, 105, 110, 103, 46, 77, 101, 115, 115, 97, 103, 101 } };
    F = 3;
    E = e - 4;
    z = d - 10 - F;
    C = 2;
    new int[] { 1296647276, 1702112595, 761491300 }[3] = 1694498816;
    new int[] { 1869753968 }[1] = 1852243968;
    new int[1][0] = 1684368689;
    new int[1][0] = 1684368690;
    new int[1][0] = 1852990573;
    new int[] { 1835623282, 1868915817, 1953066862, 779119713, 1952870258 }[5] = 1828716544;
    new int[] { 1885892462, 1697540461 }[2] = 1701380096;
    new int[] { 1668246830, 1852795753, 1630423373 }[3] = 1162412032;
    new int[] { 1668246830, 1936682617, 1701996899, 1936945006, 778661221 }[5] = 1761607680;
    new int[1][0] = 1229800777;
    new int[] { 1668246830, 1836020847, 1919904865, 776555845 }[4] = 1224736768;
    new int[] { 1668246830, 1935764851, 1970169646 }[3] = 1768777065;
    new int[] { 1668246830, 1936287085, 1701737262 }[3] = 1768777065;
    Y = "";
  }

  private f(i parami)
  {
    L = f.f = parami;
    e = L.getWidth();
    d = L.getHeight();
    M = d;
    au = q();
    if (I == null)
      I = g.a();
    I.b = 0;
    I.d = 16777215;
    if (e >= 240)
      I.e = 2;
    E = e - 4;
    z = d - 10 - F;
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 << 16) + (paramInt2 << 8) + paramInt3;
  }

  private final void a(String paramString)
  {
    if (paramString == null)
      return;
    int i1 = paramString.length();
    this.B = new char[i1];
    for (int i2 = 0; i2 < paramString.length(); i2++)
      this.B[i2] = paramString.charAt(i2);
  }

  public static f a(i parami, d paramd)
  {
    if ((ap != null) && (L != null))
      return ap;
    f localf;
    ap = localf = new f(parami);
    return localf;
  }

  private static final String b(String paramString)
  {
    if (paramString != null)
    {
      do
      {
        paramString = paramString.substring(1, paramString.length());
        if (paramString.length() <= 0)
          break;
      }
      while (paramString.charAt(0) == ' ');
      while ((paramString.length() > 0) && (paramString.charAt(paramString.length() - 1) == ' '))
        paramString = paramString.substring(0, paramString.length() - 1);
    }
    return paramString;
  }

  private final void c(String paramString)
  {
    try
    {
      ai = a(paramString, J, E, true);
      return;
    }
    catch (Exception localException)
    {
      ai = null;
    }
  }

  private static boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = !paramBoolean2;
    if (paramBoolean1)
    {
      D = 0L;
      q = 0;
      ai = null;
      return false;
    }
    h = !h;
    long l1 = System.currentTimeMillis();
    if (ai == null)
    {
      if (bool1 != t)
      {
        if (bool1)
          u = l1 - D;
        else
          D = l1 - u;
        t = bool1;
      }
      if (bool1)
        D = 0L;
    }
    if (ai != null)
    {
      if (ad != 0)
      {
        long l2 = System.currentTimeMillis();
        if (((aE) || (aF)) && (l2 - ax >= 88L) && ((aE) || (l2 - ay >= 500L)))
        {
          boolean bool2 = k();
          aE = false;
          return bool2;
        }
      }
      ap.l();
      return false;
    }
    a(l1);
    if ((!bool1) && ((h) || (l1 - v > 80L)))
    {
      q += 1;
      v = l1;
    }
    if ((c(l1)) && (s()))
      return false;
    b(l1);
    return false;
  }

  static final boolean a(boolean paramBoolean)
  {
    return a(paramBoolean, true);
  }

  private static boolean c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      D = 0L;
      ai = null;
      return false;
    }
    if (ai != null)
      return false;
    long l1 = 182777L;
    long l2 = System.currentTimeMillis();
    if ((D == 0L) || (D > l2))
      D = l2;
    if (l2 < D + l1)
      return false;
    D = 2L;
    D = 0L;
    g();
    G = true;
    f();
    return false;
  }

  private static final int a(Graphics paramGraphics, String paramString1, String paramString2)
  {
    try
    {
      int i1 = I.b() - I.f + 4;
      if (au)
        i1 = i1 * 14 >> 3;
      int i2 = d - i1;
      if (paramGraphics != null)
      {
        paramGraphics.setColor(o);
        paramGraphics.fillRect(0, i2, e, i1);
        i2 += (i1 - (I.b() - I.f) >> 1);
        I.a(paramGraphics, paramString2, 4, i2, 20);
        I.a(paramGraphics, paramString1, e - I.a(paramString1) - 3, i2, 20);
      }
      return i1;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  static boolean a()
  {
    return !g;
  }

  private static final void f()
  {
    if (J == null)
      J = I;
    aq = false;
    g();
    String str1 = b(c);
    ai = null;
    s = d < 127;
    E = e - 8;
    z = d - 5 - 2 * F - (J.b() + C);
    if (!s)
      z -= 2 * (J.b() + C);
    String[] arrayOfString = new String[3];
    int i1 = 0;
    for (int i2 = 0; i2 < 3; i2++)
    {
      if (y)
        arrayOfString[i2] = NET_Lizard.a.getAppProperty(str1 + (i2 + 1));
      if (arrayOfString[i2] == null)
        continue;
      i1 = 1;
    }
    for (int i3 = 0; i3 < K.length; i3++)
      try
      {
        K[i3] = null;
        if (y)
          K[i3] = NET_Lizard.a.getAppProperty(b(an[i3]));
      }
      catch (Exception localException1)
      {
        K[i3] = null;
      }
    int i4 = (K[0] == null) || (K[1] == null) ? 1 : 0;
    String str2 = null;
    if (i4 != 0)
    {
      for (int i5 = 0; i5 < K.length; i5++)
        try
        {
          K[i5] = x[(4 + ak)][(i5 + 1)];
        }
        catch (Exception localException2)
        {
          K[i5] = null;
        }
      try
      {
        str2 = x[(4 + ak)][(K.length + 1)];
      }
      catch (Exception localException3)
      {
      }
      if ((G) && (K[0] != null) && (K[1] != null))
      {
        ak = 0;
        aq = true;
        for (int i6 = 0; i6 < K.length; i6++)
          K[i6] = null;
        str2 = null;
      }
    }
    String str3 = x[0][0] + '\r' + x[0][1];
    if (!G)
      str3 = x[0][1];
    int i7;
    if ((K[0] != null) && (K[0].length() > 0) && (K[1] != null) && (K[1].length() > 0))
    {
      str3 = str3 + x[0][2] + K[0] + x[0][3] + K[1] + '\r';
    }
    else if (aq)
    {
      str3 = str3 + x[2][3] + '\r' + '\r' + x[2][4] + '\r' + '\r';
      for (i7 = 0; i7 < x.length; i7++)
        try
        {
          if ((x[(4 + i7)] != null) && (x[(4 + i7)].length >= 3) && (x[(4 + i7)][0] != null) && (x[(4 + i7)][0].charAt(0) == '*'))
            str3 = str3 + x[(4 + i7)][0] + '\r' + '\r';
        }
        catch (Exception localException4)
        {
          break;
        }
    }
    else
    {
      str3 = str3 + x[3][0] + '\r' + x[3][1];
    }
    if ((K[2] != null) && (K[2].length() > 0))
      str3 = str3 + '\r' + K[2] + '\r';
    if (str2 != null)
      str3 = str3 + '\r' + str2 + '\r';
    if (i1 != 0)
    {
      str3 = str3 + '\r' + x[1][0] + x[1][1] + x[1][2] + NET_Lizard.a.getAppProperty(b(an[0])) + x[1][3] + '\r' + '\r';
      for (i7 = 0; i7 < 3; i7++)
      {
        if (arrayOfString[i7] == null)
          continue;
        str3 = str3 + arrayOfString[i7] + '\r';
      }
    }
    ap.c(str3);
  }

  private static boolean g()
  {
    int i1;
    if (((i1 = r() > 0 ? 1 : 0) != 0) && (y) && (NET_Lizard.a.getAppProperty(b(aH[0])) != null))
      i1 = 0;
    return i1;
  }

  private final char b(int paramInt)
  {
    if (paramInt < this.B.length)
      return this.B[paramInt];
    if (paramInt == this.B.length)
      return ' ';
    return '<';
  }

  private final void h()
  {
    this.W = false;
    ad = 0;
    if (aG.checkSerial(Y))
    {
      c(12);
      return;
    }
    c(21);
  }

  private final void b(Graphics paramGraphics)
  {
    int i1 = I.b();
    try
    {
      String str1 = "";
      String str2 = "";
      try
      {
        str1 = w[34][5];
      }
      catch (Exception localException1)
      {
      }
      try
      {
        str2 = w[34][0];
      }
      catch (Exception localException2)
      {
      }
      i1 = a(paramGraphics, str1, str2);
    }
    catch (Exception localException3)
    {
    }
    paramGraphics.setClip(0, 0, e, d);
    int i2 = this.Q;
    int i3 = this.P;
    int i4 = this.Z;
    int i5 = this.S.a('Щ');
    int i6 = this.S.b() - this.S.f + 2;
    i5++;
    if (d < 176)
      i6++;
    int i7 = i6 + i6 + i6 + 4 + 4;
    int i8 = (i2 - 8 - i5) / this.T;
    int i9 = (i3 - i7 - i6 - 4 - i6) / this.U;
    int i10 = i6;
    if (i5 < i8)
      i5 = i8;
    if (i6 < i9)
      i6 = i9;
    int i11 = e - this.T * i5 >> 1;
    if ((i12 = i7 + (d - i7 - i6 - 4 - this.U * i6 >> 1)) < i7)
      i12 = i7;
    int i13 = i5 >> 1;
    int i14 = 1;
    int i15 = i6 - i10 >> 1;
    if (1 < i15)
      i14 = i15;
    int i16 = this.T * i5;
    int i17 = this.U * i6 + i14;
    int i18 = i11;
    int i19;
    int i20 = (i19 = i12) - 3 >> 1;
    int i21 = 0;
    i21 = 1 + n();
    if (i20 < i21 + I.b() + 5)
      i20 = i21 + I.b() + 5;
    a(paramGraphics, this.V, i21, false);
    int i22 = a(paramGraphics, Y, i20, true);
    paramGraphics.setClip(0, 0, e, d);
    if (i10 < m())
      i10 = m();
    if (i10 < i1)
      i10 = i1;
    int i23 = d - i10 - i22 - 4 - i14;
    int i24 = this.U;
    int i25 = (i25 = I.b() - I.f) + (i25 >> 1);
    if (((i26 = i23 / this.U) < i6) && (i23 < i17) && (i26 >= i25))
    {
      i6 = i26;
      i17 = i24 * i6 + i14;
    }
    if ((i26 < i25) && (i23 < i17))
    {
      i17 = (i24 = i23 / i25) * i25 + i14;
      i26 = i23 / i24;
    }
    if ((i26 > i6 + 1) && (i24 * (i6 + 1) + i14 < i23))
    {
      i6++;
      if ((i26 > i6 + 1) && (i24 * (i6 + 1) + i14 < i23))
        i6++;
      if ((i26 > i6 + 1) && (i24 * (i6 + 1) + i14 < i23))
        i6++;
      i17 = i24 * i6 + i14;
    }
    i18 -= i13;
    i16 += i13 + i13;
    int i12 = (i19 = i25 = i22 + (d - i22 - i10 - 2 - i17 >> 1)) + (i14 >> 1);
    paramGraphics.setColor(j);
    paramGraphics.drawRect(i18, i19, i16 - 1, i17 - 1);
    paramGraphics.setClip(0, 0, e, d);
    int i26 = 0;
    int i27 = 0;
    do
    {
      i26++;
      i27++;
    }
    while ((i27 < 5) && (this.ab > i26 + i24 - 1));
    i12 -= i26 * i6;
    i14 = i6 - (I.b() - I.f) >> 1;
    for (int i28 = 0; i28 < this.U; i28++)
      for (int i29 = 0; i29 < this.T; i29++)
      {
        if ((i28 >= i26) && (i28 - i26 < i24))
        {
          int i30 = i11 + i29 * i5;
          int i31 = i12 + i28 * i6;
          int i32 = i5;
          int i33 = i6;
          if (i.b(i30, i31, i32, i33))
          {
            this.aa = i29;
            this.ab = i28;
            ad = 53;
            ag = true;
            aE = true;
            i.i = false;
          }
          if (((i29 == this.aa ? 1 : 0) & (i28 == this.ab ? 1 : 0)) != 0)
          {
            paramGraphics.setColor(l);
            paramGraphics.fillRect(i30, i31, i32 - 1, i33 - 1);
            paramGraphics.setColor(n);
            paramGraphics.fillRect(i30 + 1, i31 + 1, i32 - 1 - 2, i33 - 1 - 2);
          }
          char c1;
          if ((c1 = b(i4)) == '<')
            c1 = 'C';
          I.a(paramGraphics, c1, i11 + i29 * i5 + (i5 - (I.a(c1) - I.e) >> 1), i12 + i28 * i6 + i14, 20);
        }
        i4++;
        if (i4 > this.R + 2)
          break;
      }
    paramGraphics.setColor(j);
    paramGraphics.drawRect(0, 0, e - 1, d - 1);
  }

  private final int a(Graphics paramGraphics, String paramString, int paramInt, boolean paramBoolean)
  {
    int i1;
    if ((i1 = this.S.a(paramString)) < e / 3)
      i1 = e / 3;
    int i2 = e - i1 >> 1;
    int i3 = 1;
    int i4 = this.S.b() - this.S.f + 2;
    if (paramBoolean)
    {
      paramGraphics.setClip(0, 0, e, d);
      i4++;
      if (e >= 240)
        i4++;
      i3 = i4 + 2 - (this.S.b() - this.S.f) >> 1;
      paramGraphics.setColor(l);
      paramGraphics.drawRect(i2 - 5 - 1, paramInt - 1, i1 + 10 - 1 - 1 + 2, i4 + 2 - 1 + 2);
      paramGraphics.setColor(n);
      paramGraphics.drawRect(i2 - 5 - 2, paramInt - 2, i1 + 10 - 1 - 1 + 4, i4 + 2 - 1 + 4);
    }
    else
    {
      i4++;
      if (e >= 240)
        i4++;
    }
    I.a(paramGraphics, paramString, e - this.S.a(paramString) >> 1, paramInt + i3, 20);
    return paramInt + i4 + 4 + 1;
  }

  private final void i()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    switch (ad)
    {
    case -3:
    case 52:
      this.aa -= 1;
      i1 = 1;
      break;
    case -4:
    case 54:
      this.aa += 1;
      i2 = 1;
      break;
    case -1:
    case 50:
      this.ab -= 1;
      i3 = 1;
      break;
    case -2:
    case 56:
      this.ab += 1;
      i4 = 1;
    }
    if (this.aa < 0)
      this.aa = (this.T - 1);
    if (this.aa >= this.T)
      this.aa = 0;
    if (this.ab < 0)
      this.ab = (this.U - 1);
    if (this.ab >= this.U)
      this.ab = 0;
    int i5;
    if ((i5 = this.Z + this.aa + this.T * this.ab) > this.R + this.A)
    {
      if (i2 != 0)
        this.aa = 0;
      if (i4 != 0)
        this.ab = 0;
      if (i3 != 0)
        this.ab = (this.U - 2);
      if (i1 != 0)
        this.aa = (this.R - this.Z + this.A - this.T * (this.U - 1));
    }
    if ((ad == 53) || (ad == -6) || (ad == -5))
      if ((i5 <= this.R) || (b(i5) == ' '))
      {
        if ((((!this.X ? 1 : 0) & (Y.length() > 0 ? 1 : 0)) != 0) || (b(i5) != ' '))
        {
          int i6 = this.Q;
          if ((Y != null) && (Y.length() > 0) && ((I.a(Y + "  ") > i6) || (Y.length() >= this.ar)))
            Y = Y.substring(0, Y.length() - 1);
          Y += b(i5);
        }
      }
      else if ((Y != null) && (Y.length() > 0))
        Y = Y.substring(0, Y.length() - 1);
    if (ad != -7)
    {
      if (ad != 35);
    }
    else
    {
      while (Y.length() > 0)
      {
        if (Y.charAt(Y.length() - 1) != ' ')
          break;
        Y = Y.substring(0, Y.length() - 1);
      }
      if ((Y.length() > 0) && (Y.length() >= this.as))
        h();
    }
  }

  private final void a(boolean paramBoolean, String paramString)
  {
    this.as = aG.getActivationKeySize();
    this.ar = aG.getActivationKeySize();
    this.Q = (e - 4 - (e >> 4));
    this.P = (d - 4 - (d >> 4));
    if (I == null)
      I = J;
    this.S = I;
    this.X = paramBoolean;
    this.W = true;
    if (this.X)
    {
      this.Z = 48;
      this.R = 57;
      a(w[33][0]);
      this.V = w[32][0];
      this.Z = 0;
      this.R = (this.Z + this.B.length - 1);
    }
    else
    {
      this.V = w[32][0];
      this.Z = 65;
      this.R = 90;
      a(w[33][0]);
      this.Z = 0;
      this.R = (this.Z + this.B.length - 1);
    }
    if ((paramString != null) && (paramString.length() > 0))
      this.V = paramString;
    int i1 = this.R - this.Z + this.A + 1;
    this.T = d(i1);
    if (this.T < 1)
      this.T = 1;
    int i2 = this.S.a('W') + 2;
    if (this.T * i2 > this.Q)
      this.T = (this.Q / i2);
    if (this.T < 1)
      this.T = 1;
    this.U = (i1 / this.T);
    this.T = (this.Q * this.T * 2 / (this.Q + this.P));
    this.U = (this.P * this.U * 2 / (this.Q + this.P));
    if (this.T < 1)
      this.T = 1;
    if (this.U < 1)
      this.U = 1;
    for (int i3 = 0; i3 < 3; i3++)
    {
      if (this.U <= 1)
        continue;
      this.T += 1;
      this.U -= 1;
    }
    while (((this.T * this.U > i1 ? 1 : 0) & (this.U > 1 ? 1 : 0)) != 0)
      this.U -= 1;
    while (this.T * this.U < i1)
      this.U += 1;
    this.aa = 0;
    this.ab = 0;
    Y = "";
    ad = 0;
  }

  private static String a(int[] paramArrayOfInt)
  {
    String str = new String();
    i1 = 0;
    break label174;
  }

  private static String b(int[] paramArrayOfInt)
  {
    char[] arrayOfChar = new char[paramArrayOfInt.length];
    for (int i1 = 0; i1 < arrayOfChar.length; i1++)
      arrayOfChar[i1] = (char)paramArrayOfInt[i1];
    return new String(arrayOfChar);
  }

  protected static final boolean a(int paramInt)
  {
    if (e())
    {
      ad = paramInt;
      af = false;
      if ((paramInt == 42) || (paramInt == -6) || (paramInt == -7) || (paramInt == -5) || (paramInt == 48))
      {
        aE = true;
        aF = false;
      }
      else
      {
        aF = true;
        aE = false;
      }
      aE = true;
      ay = System.currentTimeMillis();
      return true;
    }
    return false;
  }

  protected static final boolean b()
  {
    if (e())
    {
      if (af)
        ad = 0;
      else
        ag = true;
      return true;
    }
    return false;
  }

  private static boolean j()
  {
    if (ai == null)
      return false;
    if (ap.W)
    {
      ap.i();
      return false;
    }
    switch (ad)
    {
    case -1:
    case 50:
      if (r <= 0)
        break;
      r -= 1;
      break;
    case -2:
    case 56:
      try
      {
        if (r < av[1].length - 1)
          r += 1;
      }
      catch (Exception localException1)
      {
      }
    case -6:
    case -5:
    case 53:
      switch (aj)
      {
      case 0:
        if (!aG.setCountry(r))
          break;
        c(3);
        break;
      case 3:
        if (r == 0)
          c(15);
        if (r == 1)
          ap.a(true, null);
        if (r != 2)
          break;
        c(0);
        break;
      case 15:
        try
        {
          if (aG.requestSerial())
            c(6);
          else
            c(9);
        }
        catch (Exception localException2)
        {
          c(9);
        }
        break;
      default:
        c(3);
        break;
      case 12:
        h.p = false;
      case 24:
        ai = null;
        ad = 0;
        ag = false;
        return true;
      }
      ad = 0;
      ag = false;
      break;
    case -7:
    case 35:
      if (aj == 12)
        break;
      ai = null;
      ad = 0;
      ag = false;
      return true;
    }
    return false;
  }

  private static boolean k()
  {
    ax = System.currentTimeMillis();
    af = true;
    boolean bool = j();
    if (ag)
    {
      ad = 0;
      ag = false;
    }
    return bool;
  }

  private final void l()
  {
    try
    {
      if (i.cs)
        this.H = true;
      if (this.H)
      {
        int i1 = a(null, "", "");
        int i2;
        if ((i2 = I.b() + 2) < m())
          i2 = m();
        if (i2 < i1)
          i2 = i1;
        if (i.c(0, d - i2, e / 3, i2))
          a(f.ad = 53);
        if (i.c(e - e / 3, d - i2, e / 3, i2))
          a(f.ad = 35);
      }
      if (i.ct)
      {
        if (af)
          ad = 0;
        else
          ag = true;
      }
      else
        return;
    }
    catch (Exception localException)
    {
    }
  }

  private static final void c(int paramInt)
  {
    aB = 0;
    M = d;
    if (J == null)
      J = I;
    int i1 = aG.getCountryInfo().id_int();
    Vector localVector = aG.getCountriesList();
    if ((paramInt == 3) && (i1 < 0))
      paramInt = 0;
    int i2 = localVector.size();
    for (int i3 = 0; i3 < i2; i3++)
      ((GlomoCountryShort)localVector.elementAt(i3)).id();
    O[aj] = at;
    N[aj] = r;
    aj = paramInt;
    at = O[paramInt];
    r = N[paramInt];
    av = null;
    av = new String[3][];
    String str = "";
    if (w[(paramInt + 0)] != null)
      for (int i4 = 0; i4 < w[(paramInt + 0)].length; i4++)
      {
        str = str + w[(paramInt + 0)][i4];
        if (paramInt == 15)
          try
          {
            if (i4 == 0)
              str = str + " " + aG.getCountryInfo().srvNumReg();
            if (i4 == 1)
              str = str + " " + aG.getActivationKey();
            if (i4 == 2)
              str = str + '\r' + aG.getCountryInfo().priceReg();
          }
          catch (Exception localException)
          {
          }
        if (i4 >= w[(paramInt + 0)].length - 1)
          continue;
        str = str + '\r';
      }
    int i5;
    if (paramInt == 3)
      for (i5 = 0; i5 < i2; i5++)
      {
        int i6;
        if ((i6 = ((GlomoCountryShort)localVector.elementAt(i5)).id()) != i1)
          continue;
        String[] tmp401_398 = new String[1];
        String tmp415_412 = ((GlomoCountryShort)localVector.elementAt(i5)).name();
        str = tmp415_412;
        tmp401_398[0] = tmp415_412;
        av[0] = tmp401_398;
      }
    av[0] = ap.a(str, J, e - J.a(" "), true);
    av[1] = w[(paramInt + 1)];
    if (paramInt == 0)
    {
      av[1] = new String[i2];
      for (i5 = 0; i5 < i2; i5++)
        av[1][i5] = ((GlomoCountryShort)localVector.elementAt(i5)).name();
    }
  }

  private static void d(String paramString)
  {
    try
    {
      if ((ao != null) && (ao.getState() == 400))
        ao.stop();
      if (ao != null)
        ao.close();
      if (ao != null)
        ao = null;
    }
    catch (Exception localException1)
    {
    }
    InputStream localInputStream = null;
    try
    {
      localInputStream = L.getClass().getResourceAsStream(paramString);
    }
    catch (Exception localException2)
    {
    }
    if (ao == null)
      try
      {
        ao = Manager.createPlayer(localInputStream, "audio/X-wav");
      }
      catch (Exception localException3)
      {
      }
    if (ao == null)
      try
      {
        ao = Manager.createPlayer(localInputStream, "audio/amr");
      }
      catch (Exception localException4)
      {
      }
    if (ao == null)
      try
      {
        ao = Manager.createPlayer(localInputStream, "audio/midi");
      }
      catch (Exception localException5)
      {
      }
    if (ao != null)
      try
      {
        ao.realize();
        ao.prefetch();
      }
      catch (Exception localException6)
      {
      }
    try
    {
      ao.setLoopCount(e + d);
    }
    catch (Exception localException7)
    {
    }
    try
    {
      ((VolumeControl)ao.getControl("VolumeControl")).setLevel(e.o);
    }
    catch (Exception localException8)
    {
    }
    try
    {
      ao.start();
    }
    catch (Exception localException9)
    {
    }
    try
    {
      if (localInputStream != null)
        localInputStream.close();
      return;
    }
    catch (Exception localException10)
    {
    }
  }

  private static int m()
  {
    return d - (aB + M);
  }

  private static int n()
  {
    return aB;
  }

  private static boolean o()
  {
    int i1;
    if ((i1 = aD) < 0)
      i1 += 256;
    int i2;
    if ((i2 = aC) < 0)
      i2 += 256;
    return (f.aw = (i2 << 16) + (i1 << 8)) > 0;
  }

  private static void a(long paramLong)
  {
    if ((D == 0L) || (D > paramLong))
    {
      D = paramLong;
      q = 0;
    }
  }

  private static void b(long paramLong)
  {
    if (D > 2L)
      ac += 1;
    if (D > 2L)
      c(18);
    else
      c(3);
    D = 0L;
    g();
    G = true;
    f();
  }

  private static String[] a(String paramString, g paramg, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1;
    String[] arrayOfString1 = new String[i1 = paramString.length()];
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 1;
    int i10 = 0;
    char c2 = '\000';
    for (int i11 = 0; i11 < i1 + 1; i11++)
    {
      char c1;
      if (i11 >= i1)
        c1 = '\n';
      else
        c1 = paramString.charAt(i11);
      i5 = c1;
      if (paramBoolean1)
        i2 = paramg.a(c1);
      else
        i2 = 5;
      if ((c1 != '\n') && (c1 != '\r'))
      {
        i4 += i2;
        i3 += i2;
      }
      switch (i5)
      {
      case 32:
        i9 = i11 + 1;
        i3 = 0;
        break;
      case 10:
      case 13:
        i9 = i11;
        i4 = paramInt + 1;
        i3 = 0;
        if (i11 < i1)
        {
          i11++;
          if (i11 < i1)
          {
            c2 = c1;
            if ((((c1 = paramString.charAt(i11)) == '\n') || (c1 == '\r')) && (c1 != c2))
              i11++;
          }
          i10 = i11;
          i11--;
        }
        else
        {
          i10 = i1;
        }
        c1 = '\n';
      }
      if (((i4 <= paramInt) || (!paramBoolean1)) && (c1 != '\n'))
      {
        i6++;
      }
      else
      {
        if ((i9 == i8) && (i6 > 0))
        {
          i9 = i8 + i6;
          i3 = 0;
          if ((i11 < i1) && (i11 + 1 > i9))
            i3 = paramg.a(paramString.substring(i9, i11 + 1));
        }
        if (i9 > i8)
          arrayOfString1[i7] = paramString.substring(i8, i9);
        else
          arrayOfString1[i7] = "";
        if ((i8 = i9) < i10)
          i8 = i10;
        i9 = i8;
        i4 = i3;
        i6 = i11 - i9 + 1;
        if ((paramBoolean2) && (arrayOfString1[i7] != null) && (arrayOfString1[i7].length() > 0))
          while ((arrayOfString1[i7].length() > 0) && (arrayOfString1[i7].charAt(arrayOfString1[i7].length() - 1) == ' '))
            arrayOfString1[i7] = arrayOfString1[i7].substring(0, arrayOfString1[i7].length() - 1);
        i7++;
      }
    }
    int i12 = i7;
    String[] arrayOfString2 = null;
    arrayOfString2 = new String[i12];
    System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, i12);
    return arrayOfString2;
  }

  private String[] a(String paramString, g paramg, int paramInt, boolean paramBoolean)
  {
    return a(paramString, paramg, paramInt, paramBoolean, true);
  }

  private static int d(int paramInt)
  {
    int i1 = 0;
    for (int i2 = 0; i2 * i2 <= paramInt; i2++)
      i1 = i2;
    return i1;
  }

  private static final boolean a(String paramString1, String paramString2)
  {
    if (((paramString1 == null) || (paramString2 == null)) && ((paramString1 != null) || (paramString2 != null)))
      return false;
    if ((paramString1 == null) && (paramString2 == null))
      return true;
    if ((paramString1 != null) && (paramString2 != null))
    {
      if (paramString1.length() != paramString2.length())
        return false;
      for (int i1 = 0; i1 < paramString1.length(); i1++)
        if (paramString1.charAt(i1) != paramString2.charAt(i1))
          return false;
      return true;
    }
    return false;
  }

  static void c()
  {
    ai = null;
    D = 1L;
  }

  static boolean d()
  {
    return D == 1L;
  }

  private static boolean d(boolean paramBoolean)
  {
    try
    {
      byte[] arrayOfByte;
      if (((arrayOfByte = e.m.a(a(b), -1))[0] != 0) && (arrayOfByte[0] != 32))
        y = false;
      else
        y = true;
      if ((arrayOfByte[1] != 0) && (arrayOfByte[1] != 32))
        paramBoolean = true;
    }
    catch (Exception localException)
    {
    }
    return paramBoolean;
  }

  private static boolean e(boolean paramBoolean)
  {
    String str = null;
    try
    {
      str = NET_Lizard.a.getAppProperty(a(al));
    }
    catch (Exception localException1)
    {
    }
    str = b(str);
    if (!paramBoolean)
      try
      {
        if ((str == null) || (str.length() < 1) || (!a(str, a(ah))))
          paramBoolean = true;
      }
      catch (Exception localException2)
      {
        paramBoolean = true;
      }
    return paramBoolean;
  }

  private static boolean f(boolean paramBoolean)
  {
    String str = null;
    try
    {
      str = NET_Lizard.a.getAppProperty(a(az));
    }
    catch (Exception localException1)
    {
    }
    str = b(str);
    if (!paramBoolean)
      try
      {
        if ((str == null) || (str.length() < 1) || (!a(str, a(aA))))
          paramBoolean = true;
      }
      catch (Exception localException2)
      {
        paramBoolean = true;
      }
    return paramBoolean;
  }

  static final boolean b(boolean paramBoolean)
  {
    if (p())
    {
      g = false;
      return true;
    }
    try
    {
      x = e.m.c(a(a));
      if ((x == null) || (x[0] == null) || (x[0].length <= 0))
      {
        g = false;
        paramBoolean = true;
      }
    }
    catch (Exception localException1)
    {
      g = false;
      paramBoolean = true;
    }
    try
    {
      w = e.m.c("dem3");
      if ((w == null) || (w[0] == null) || (w[0].length <= 0))
      {
        g = false;
        paramBoolean = true;
      }
    }
    catch (Exception localException2)
    {
      g = false;
      return true;
    }
    if (((NET_Lizard.a.getAppProperty(a(az)) != null) || (NET_Lizard.a.getAppProperty(a(al)) != null)) && ((f(paramBoolean)) || (e(paramBoolean))))
    {
      g = false;
      return true;
    }
    if (!paramBoolean)
      paramBoolean = !aG.isActivated();
    c(0);
    if ((paramBoolean = d(paramBoolean)))
      paramBoolean |= o();
    else
      aw <<= 1;
    if (paramBoolean)
      paramBoolean |= c(true);
    if (paramBoolean)
      d(new String());
    return paramBoolean;
  }

  private static boolean p()
  {
    try
    {
      GlomoRegistrator.CheckMidletsSecutiry(NET_Lizard.a, new String[] { "Battleships BT", "/icons/ico.png", "NET_Lizard" });
      Object localObject = null;
      aG = new GlomoRegistrator(NET_Lizard.a);
    }
    catch (Throwable localThrowable)
    {
      return true;
    }
    return false;
  }

  private boolean q()
  {
    try
    {
      return f.hasPointerEvents();
    }
    catch (Exception localException)
    {
      return false;
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  private static int r()
  {
    try
    {
      Class.forName(b(aH[1]));
      return 1;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  private static boolean c(long paramLong)
  {
    return paramLong < D + aw;
  }

  private static boolean s()
  {
    int i1;
    int i2 = i1 = q;
    int i3 = 0;
    int i4 = 0;
    while (i2 > 0)
    {
      i2 >>= 1;
      i3++;
    }
    if (i3 > 20)
      return false;
    do
    {
      i3 >>= 1;
      i4++;
    }
    while (i3 > 0);
    return i4 <= 4;
  }

  static boolean e()
  {
    return ai != null;
  }

  static final boolean a(Graphics paramGraphics)
  {
    if (ai == null)
      return false;
    paramGraphics.setColor(m);
    paramGraphics.setClip(0, aB, e, M);
    paramGraphics.fillRect(0, aB, e, M);
    if (ap.W)
    {
      ap.b(paramGraphics);
      return true;
    }
    int i1 = 0;
    try
    {
      String str1 = "";
      String str2 = "";
      try
      {
        str1 = w[34][1];
      }
      catch (Exception localException1)
      {
      }
      try
      {
        str2 = w[34][0];
      }
      catch (Exception localException2)
      {
      }
      i1 = a(paramGraphics, str1, str2);
    }
    catch (Exception localException3)
    {
    }
    int i2 = aB + 2;
    if (av == null)
      return true;
    int i3 = J.b();
    if (av[0] != null)
      for (int i4 = 0; i4 < av[0].length; i4++)
      {
        J.a(paramGraphics, av[0][i4], e >> 1, i2, 17);
        i2 += i3;
      }
    int i5 = i3;
    i2 += i5;
    if ((av[1] == null) || (av[1].length <= 0))
      return true;
    int i6 = av[1].length;
    i3 = J.b() - J.f + 4;
    if (d >= 320)
      i3 += 2;
    if (au)
      i3 = i3 * 14 >> 3;
    int i7 = i6 * i3;
    if (i1 < i5)
      i1 = i5;
    int i8 = M - i1 - i2 - 4;
    int i9 = i6 > 1 ? 1 : 0;
    int i10 = 3;
    if (e >= 240)
      i10++;
    else if (e <= 128)
      i10--;
    i8 -= 2 * i10;
    if (i9 != 0)
      i8 -= 2 * i1;
    if (e >= 240)
      i8 -= 2;
    if (i7 >= i8)
      i7 = (i6 = i8 / i3) * i3;
    i8 += 2 * i10;
    i2 += (i8 - (i7 + 2 * i10) >> 1);
    int i17;
    int i18;
    int i19;
    if (i9 != 0)
    {
      i2 += i1;
      int i11 = i7 + 2 * i10;
      i12 = i2;
      i14 = (i13 = i1) / 3;
      i15 = i13 - 2 * i14;
      i16 = -1;
      i17 = 2;
      paramGraphics.setColor(i);
      paramGraphics.fillRect(0, i12 - i13, e, i13);
      paramGraphics.fillRect(0, i12 + i11, e, i13);
      paramGraphics.setColor(k);
      paramGraphics.drawRect(1, i12 - i13, e - 3, i13 - 1);
      paramGraphics.drawRect(1, i12 + i11, e - 3, i13 - 1);
      if (i.b(0, i12 - i13, e, i13))
      {
        ag = true;
        ad = 50;
        aE = true;
        aF = true;
        ay = System.currentTimeMillis();
      }
      if (i.b(0, i12 + i11, e, i13))
      {
        ag = true;
        ad = 56;
        aE = true;
        aF = true;
        ay = System.currentTimeMillis();
      }
      paramGraphics.setColor(p);
      i18 = e >> 1;
      i19 = 1;
      int i20 = i12 - i13 + i14;
      for (int i21 = 0; i21 < 2; i21++)
      {
        for (int i22 = 0; i22 < i15; i22++)
        {
          paramGraphics.drawLine(i18, i20, i18 + i19, i20);
          i20++;
          i18 += i16;
          i19 += i17;
        }
        i20 = i12 + i11 + i14;
        i16 = -i16;
        i17 = -i17;
        i19 += i17;
      }
    }
    i2 += i10;
    int i12 = i3;
    int i13 = 0;
    if (i.cr)
      if (i.cs)
      {
        am = i.eH;
      }
      else
      {
        i14 = Math.abs(i.eH - am);
        i15 = 1;
        if (i.eH < am)
          i15 = -1;
        while (i14 >= i12)
        {
          i13 += i15;
          i14 -= i12;
        }
        am += i13 * i12;
        at -= i13;
      }
    if (at > av[1].length - i6)
      at = av[1].length - i6;
    if (at < 0)
      at = 0;
    if (at > r)
      at = r;
    if (r - at > i6 - 1)
      at = r - (i6 - 1);
    int i14 = i3;
    i2 += (i14 - (I.b() - I.f) >> 1);
    int i15 = at;
    int i16 = 0;
    while ((i15 < av[1].length) && (i16 < i6))
    {
      i17 = i2 - (i14 - (I.b() - I.f) >> 1);
      if ((i.c(0, i17, e, i14)) && (r != i15))
        r = i15;
      if (i.b(0, i17, e, i14))
      {
        if (r != i15)
          r = i15;
        ad = 53;
        aE = true;
      }
      if (i15 == r)
      {
        i18 = 3;
        if (e >= 240)
          i18++;
        i19 = e - 2 * i18;
        paramGraphics.setColor(n);
        paramGraphics.fillRect(i18, i17, i19, i14);
        paramGraphics.setColor(l);
        paramGraphics.drawRect(i18, i17, i19 - 1, i14 - 1);
      }
      J.a(paramGraphics, av[1][i15], e >> 1, i2, 17);
      i2 += i3;
      i16++;
      i15++;
    }
    paramGraphics.setColor(j);
    paramGraphics.drawRect(0, 0, e - 1, d - 1);
    return true;
  }
}