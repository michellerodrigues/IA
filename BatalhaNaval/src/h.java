import java.io.PrintStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class h
{
  static int a;
  static int b;
  boolean c;
  String d = null;
  static int e;
  static int f;
  byte[] g = { 31, 22, 33, 32, 35, 42, 35, 35, 47, 38, 41, 40, 35, 44, 36 };
  int h = 15;
  static i i;
  int j = -1;
  int k;
  boolean l = true;
  Image m;
  boolean n = false;
  int o = 1;
  static boolean p;
  int q = 110;
  int r = 5;
  boolean s = false;
  boolean t = false;
  static boolean u;
  boolean v = false;
  static boolean w;
  static d x;
  static Font y;
  static int z;
  static d A;
  static boolean B;
  boolean C;
  int D = a;
  int E = 100;
  int F = 2;
  Image G;
  Image H;
  Image I;
  static int[] J;
  Image[] K;
  int[][] L;
  int[][] M = { { 83, 105, 116, 101, 85, 82, 76 }, { 77, 73, 68, 108, 101, 116, 45, 73, 110, 102, 111, 45, 85, 82, 76 } };
  boolean N = false;
  int[] O = new int[10];
  int P;
  int Q;
  boolean R = false;
  boolean S;
  boolean T;
  Image U;
  boolean V = false;
  boolean W = false;
  boolean X = false;
  int Y = 3;
  int Z;
  int aa = 1;
  boolean ab = false;
  boolean ac = true;
  int ad;
  static Image ae;
  static Image af;
  Image[] ag;
  int[][] ah;
  int ai;
  int aj;
  boolean ak = false;
  boolean al = false;
  boolean am = false;
  static boolean an;
  boolean ao = false;
  int ap = 0;
  private int[][] bR = { { 104, 108 }, { 99, 114 }, { 105, 110 }, new int[0], { 105, 110, 48 }, new int[0], new int[0] };
  Image aq;
  int ar;
  int as;
  int at = 2;
  int au = 0;
  int av = 0;
  int aw;
  byte[] ax = new byte[100];
  int ay = 100;
  boolean az = false;
  int[][] aA;
  String[] aB;
  String[] aC;
  int aD = 10;
  byte[][] aE = { { 47, 108, 112, 46, 112, 110, 103 }, { 47, 108, 112, 50, 46, 112, 110, 103 }, { 47, 112, 46, 112, 110, 103 }, { 47, 109, 105, 46, 112, 110, 103 }, { 47, 109, 105, 49, 46, 112, 110, 103 }, { 47, 109, 105 }, { 46, 112, 110, 103 }, { 47, 107, 110, 112, 46, 112, 110, 103 }, { 47, 110, 108, 46, 112, 110, 103 }, { 108, 122 }, { 108, 100, 46, 112, 110, 103 }, { 47, 111, 114, 46, 112, 110, 103 }, { 47, 111, 114, 95, 102, 46, 112, 110, 103 }, { 47, 105, 108, 48, 46, 112, 110, 103 }, { 111, 114, 49 }, { 111, 114, 50 }, { 47, 108, 105, 48, 46, 112, 110, 103 } };
  boolean aF = true;
  int aG = 10;
  Image aH;
  Image aI;
  Image[] aJ;
  boolean aK;
  int aL = 0;
  int aM = 3;
  boolean aN;
  boolean aO;
  int aP;
  long aQ;
  long aR;
  static boolean aS;
  int aT;
  int aU = 11;
  String aV;
  String[] aW;
  String[] aX;
  int aY = 0;
  int aZ = 0;
  int ba = 0;
  String[] bb;
  d bc;
  Image bd;
  static boolean be = false;
  static boolean bf;
  Image[] bg;
  long bh;
  int bi;
  Image bj;
  Image bk;
  int bl;
  Image bm;
  long bn = 7L;
  long bo = 70L;
  long bp = 20L;
  boolean bq = false;
  boolean br = false;
  boolean bs = false;
  int bt = 0;
  int bu = 12;
  int bv = 0;
  static String bw;
  int bx = 1;
  int by;
  int bz = 4;
  int bA = 0;
  int bB;
  long bC;
  long bD = 0L;
  long bE;
  int bF = -1;
  static boolean bG;
  boolean bH = false;
  boolean bI;
  int bJ = 0;
  int bK = 3;
  int bL;
  int bM;
  int bN;
  int bO = 1;
  int bP = 0;
  int bQ = 100;

  static
  {
    p = false;
    bf = true;
    an = true;
    z = 0;
    aS = true;
    e = 176;
    a = 208;
    f = e >> 1;
    b = a >> 1;
    bG = false;
    B = false;
    w = false;
    u = true;
  }

  public h(i parami)
  {
    i = parami;
    g();
    i.cg = false;
  }

  private final void h()
  {
    try
    {
      this.aq = null;
      String str = i.a(this.aE[9]);
      try
      {
        this.aq = e.a(str);
      }
      catch (Exception localException1)
      {
        this.n = false;
        i.D = false;
        return;
      }
      try
      {
        this.H = e.a(i.a(this.aE[10]));
      }
      catch (Exception localException2)
      {
      }
      this.j = 0;
      long l1 = System.currentTimeMillis();
      this.at = -1;
      x();
      this.at = 2;
      long l2 = l1;
      int i1 = 3000 / ((e >> 2) - this.at);
      while (this.at < e >> 2)
      {
        B();
        this.at += 1;
        if ((l1 = System.currentTimeMillis()) - l2 >= i1)
          continue;
        try
        {
          Thread.sleep(i1 - (l1 - l2));
        }
        catch (Exception localException3)
        {
        }
      }
      this.at = (short)e;
      this.H = null;
    }
    catch (Exception localException4)
    {
    }
    this.aq = null;
  }

  private final void i()
  {
    boolean bool1 = i.aw;
    boolean bool2 = i.bN;
    i.aw = false;
    i.bN = true;
    int i1 = this.j;
    this.j = 0;
    this.bJ = 0;
    try
    {
      try
      {
        this.bj = e.a(i.a(this.aE[11]));
      }
      catch (OutOfMemoryError localOutOfMemoryError1)
      {
      }
      try
      {
        if (this.bj != null)
          this.bj = e.a(this.bj);
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
      }
      try
      {
        if ((this.bj != null) && ((this.bj.getWidth() != e) || (this.bj.getHeight() != a)))
          this.bj = e.a(this.bj, 0, 0, this.bj.getWidth(), this.bj.getHeight(), e, a, 0, false, true);
      }
      catch (OutOfMemoryError localOutOfMemoryError3)
      {
      }
      try
      {
        try
        {
          this.bk = e.a(i.a(this.aE[12]));
          if ((this.bk != null) && (this.bk.getWidth() > e))
            this.bk = e.a(this.bk, 0, 0, this.bk.getWidth(), this.bk.getHeight(), e, this.bk.getHeight() * e / this.bk.getWidth(), 0, true, true);
          this.bl = (e >> 1);
          int i2 = this.bl / 6;
          while (this.bl >= 0)
          {
            this.bl -= i2;
            B();
            Thread.sleep(7L);
          }
        }
        catch (Exception localException1)
        {
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError4)
      {
      }
      this.j = 0;
      this.bl = 0;
      if ((this.bj != null) || (this.bk != null))
        x();
      B();
      if (an)
        Thread.sleep(78L);
      this.P = 0;
      while ((this.P != 53) && (this.P != -6) && (this.P != -5) && (this.P != -7) && (this.P != 35))
      {
        Thread.sleep(33L);
        u();
      }
      this.bj = null;
      this.bk = null;
      i.n();
      return;
    }
    catch (Exception localException2)
    {
      i.n();
      i.aw = bool1;
      i.bN = bool2;
      this.bk = null;
      this.bj = null;
      this.P = 0;
      this.W = false;
      this.V = true;
      this.j = i1;
      this.aq = null;
      an = false;
    }
  }

  private static void j()
  {
    byte[] arrayOfByte;
    (arrayOfByte = e.a)[8] = 0;
    arrayOfByte[17] = 0;
    arrayOfByte[18] = 0;
    for (int i1 = 64; i1 < 112; i1++)
      arrayOfByte[i1] = 0;
  }

  private static void k()
  {
    byte[] arrayOfByte;
    (arrayOfByte = i.z)[8] = 0;
    arrayOfByte[17] = 0;
    arrayOfByte[18] = 0;
  }

  private static void l()
  {
    for (int i1 = 0; i1 < i.dw.length; i1++)
      i.dw[i1] = 0;
  }

  private final void m()
  {
    if ((i.ca) && (!l.g))
    {
      this.P = 0;
      this.V = true;
      this.W = false;
      while ((this.c) && (!l.g))
      {
        if (!l.s)
        {
          i.b();
          i.u();
        }
        if ((this.P == -7) || (this.P == 35))
        {
          i.b();
          i.b(-1);
          break;
        }
        B();
        try
        {
          Thread.sleep(30L);
        }
        catch (Exception localException)
        {
        }
      }
      if (!l.g)
      {
        this.P = 0;
        this.V = true;
        this.W = false;
        if ((this.c) && (this.aL == 5))
          return;
        c(15);
        return;
      }
    }
    if ((i.ca) && (l.g))
      i.b(7);
    this.n = false;
    if (!i.ca)
      e.a();
  }

  private static Image a(Image paramImage, int paramInt)
  {
    Image localImage1 = null;
    Image localImage2 = null;
    try
    {
      if (paramImage != null)
        localImage2 = paramImage;
      int i1 = (localImage2.getWidth() == e) || (localImage2.getHeight() == a) ? 1 : 0;
      if (be)
        return localImage2;
      if ((localImage2.isMutable()) && (i1 != 0))
        return localImage2;
      Graphics localGraphics;
      (localGraphics = (localImage1 = Image.createImage(e, a)).getGraphics()).setColor(paramInt);
      localGraphics.fillRect(0, 0, localImage1.getWidth(), localImage1.getHeight());
      localGraphics.drawImage(localImage2, localImage1.getWidth() >> 1, localImage1.getHeight() >> 1, 3);
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      System.out.println("out off memory menu fon");
    }
    return localImage1;
  }

  private static Image n()
  {
    return null;
  }

  private final void a(String paramString, Image paramImage)
  {
    this.G = null;
    try
    {
      Thread.sleep(7L);
    }
    catch (Exception localException1)
    {
    }
    try
    {
      this.G = a(paramImage, 0);
    }
    catch (Exception localException2)
    {
    }
    if (this.G == null)
      this.j = 0;
  }

  private final void o()
  {
    if ((!G()) || (!F()))
      return;
    if ((!G()) && (!F()))
      return;
    this.bg = null;
    this.bg = new Image[2];
    for (int i1 = 0; i1 < this.bg.length; i1++)
      try
      {
        this.bg[i1] = e.a("/obn" + i1 + ".png");
      }
      catch (Exception localException1)
      {
        return;
      }
    this.bI = true;
    i.n();
    this.P = 0;
    i.repaint();
    i.serviceRepaints();
    try
    {
      Thread.sleep(270L);
      for (int i2 = 0; i2 < 130; i2++)
      {
        Thread.sleep(10L);
        u();
        if (this.P != 0)
          break;
      }
    }
    catch (Exception localException2)
    {
    }
    this.P = 0;
    this.bg = null;
    this.bI = false;
    i.n();
  }

  private final void p()
  {
    this.G = null;
    this.G = n();
  }

  public static final void a()
  {
    x = d.a();
    y = Font.getFont(0, 0, 8);
    A = x;
  }

  private final void q()
  {
    try
    {
      this.K = new Image[3];
      for (int i1 = 0; i1 < this.K.length; i1++)
        try
        {
          this.K[i1] = e.a("/int" + i1 + ".png");
        }
        catch (Exception localException1)
        {
        }
      if ((this.K[1] != null) && (this.K[2] != null))
      {
        this.L = new int[this.K.length][2];
        this.L[1][1] = (a - this.K[1].getHeight());
        this.L[2][0] = (e + (this.K[2].getWidth() >> 1));
        this.L[2][1] = (this.K[2].getHeight() / 4);
        int i2 = 0;
        this.aY = 4;
        d();
        try
        {
          if (an)
            Thread.sleep(17L);
          int i3;
          if ((i3 = e / 64) < 1)
            i3 = 1;
          int i4 = i3 / 6;
          if (i3 == i4)
            i3 = i4 + 1;
          long l1 = System.currentTimeMillis();
          this.am = false;
          int i5 = 1;
          this.P = 0;
          int i6 = 0;
          while (true)
          {
            if ((i5 != 0) && ((this.L[2][0] < e - this.K[2].getWidth()) || (System.currentTimeMillis() >= l1 + 1500L)))
            {
              this.am = true;
              i5 = 0;
            }
            if (this.P != 0)
            {
              if ((this.P == 53) || (this.P == -6) || (this.P == -5))
                this.br = true;
              if ((this.P == 50) || (this.P == 56) || (this.P == -2) || (this.P == -1))
                s();
            }
            if ((this.br) && (this.bP >= b))
            {
              this.br = false;
              this.P = 53;
              this.W = true;
              s();
              break;
            }
            long l2 = System.currentTimeMillis();
            B();
            Thread.sleep(7L);
            long l3 = System.currentTimeMillis();
            long l4 = 128L;
            try
            {
              if (l3 - l2 < l4)
                Thread.sleep(l4 - (l3 - l2));
            }
            catch (Exception localException2)
            {
            }
            this.L[1][0] -= i3;
            this.L[2][0] -= i4;
            if ((i4 == 0) && (i6 != 0))
              this.L[2][0] -= 1;
            i6 = i6 == 0 ? 1 : 0;
            if (this.L[2][0] < -this.K[2].getWidth() - 1)
              this.L[2][0] = (e + 1);
            if ((this.P != 0) && (!this.am) && (i5 != 0))
              this.P = 0;
          }
          this.am = false;
        }
        catch (Exception localException3)
        {
        }
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
    }
    this.m = null;
    this.aA = null;
    this.K = null;
    this.L = null;
  }

  protected final void a(int paramInt)
  {
    if (this.R)
      b(paramInt);
    this.P = paramInt;
    this.V = false;
    this.bn = 0L;
    this.X = true;
  }

  private final void b(int paramInt)
  {
    byte[] arrayOfByte;
    if ((arrayOfByte = this.g)[0] != 1)
      arrayOfByte = e.a(arrayOfByte, 30);
    int i1 = paramInt - 48;
    if ((this.Q < arrayOfByte.length) && (i1 == arrayOfByte[this.Q]))
    {
      this.Q += 1;
      if (this.Q >= arrayOfByte.length)
      {
        if (e.a[12] == 0)
          e.a[12] = 7;
        else
          e.a[12] = 0;
        p = false;
      }
      return;
    }
    this.Q = 0;
  }

  protected final void b()
  {
    if (this.V)
      this.P = 0;
    else
      this.W = true;
    this.bn = 0L;
    this.X = false;
  }

  private void r()
  {
    this.V = true;
    if (i.du)
    {
      i.d(this.P);
      return;
    }
    if (this.am)
    {
      t();
      return;
    }
    if (this.aC == null)
      return;
    if (((this.s) || (this.t)) && (i.b != null))
    {
      if ((this.P == -7) || (this.P == 35))
      {
        i.b();
        i.b(-1);
        this.s = false;
        this.t = false;
      }
      return;
    }
    this.aK = true;
    this.Z = 3;
    this.bE = System.currentTimeMillis();
    int i1;
    int i3;
    switch (this.P)
    {
    case -1:
    case 50:
      if (this.au > 0)
      {
        this.au -= 1;
        if (this.ba == 0)
          this.bA -= 1;
      }
      else
      {
        this.au = (this.aC.length - 1);
        this.bA = (this.au - (this.aa - 1));
      }
      if ((this.aL == 4) && (e.d > 1))
        e.d -= 1;
      this.T = true;
      H();
      return;
    case -2:
    case 56:
      if (this.au < this.aC.length - 1)
      {
        this.au += 1;
        if (this.ba == this.ay)
          this.bA += 1;
      }
      else
      {
        this.au = 0;
        this.bA = 0;
      }
      if ((this.aL == 4) && (e.d < i.bt))
        e.d += 1;
      this.S = true;
      H();
      return;
    case -7:
    case 35:
      if (this.aL == 0)
        break;
      if ((this.aL == 8) && (this.aM == 6))
      {
        this.aM = 0;
        this.av = 0;
      }
      if ((this.aL == 14) || (this.aL == 15))
      {
        this.aM = 0;
        this.av = 0;
      }
      if (this.aL == 16)
      {
        this.aM = 15;
        this.av = 0;
      }
      i1 = this.aM;
      i3 = this.av;
      c(this.aM);
      this.au = i3;
      H();
      if ((i1 == -1) && (this.aM == -3))
      {
        this.aM = 0;
        this.av = this.aw;
      }
      if ((this.aM == 6) || (this.aM == 7) || (this.aM == 8))
      {
        this.aM = 0;
        this.av = this.aw;
      }
      return;
    case -6:
    case -5:
    case -4:
    case -3:
    case 52:
    case 53:
    case 54:
      int i4;
      switch (this.aL)
      {
      case -1:
        c(-3);
        return;
      case -3:
        i.cW = (byte)this.au;
        e.b();
      case 4:
        this.aY = 5;
        d();
        y();
        m();
        return;
      case 7:
        if (this.au != 0)
          break;
        this.n = false;
        i.D = false;
        return;
      case 6:
        j();
        k();
        l();
        c(8);
        return;
      case 8:
        c(0);
        this.au = 0;
        return;
      case 16:
        if (this.au == 0)
          return;
        if (this.au == 1)
        {
          i.Y = !i.Y;
          return;
        }
        if (this.au != 2)
          break;
        this.c = true;
        c(5);
        return;
      case 15:
        i.ca = true;
        if (i.cj[2] != 0)
          e.g = false;
        else
          for (i1 = 32; i1 < 64; i1++)
            e.a[i1] = 0;
        i.cW = 1;
        e.g = false;
        if (this.au == 0)
        {
          i.bX = false;
          i.b();
          this.c = true;
          i.bK &= 126;
          i.bK &= 125;
          if (i.Y)
            i.bK |= 2;
          i.cb = 1;
          z();
          m();
          return;
        }
        if (this.au == 1)
        {
          i.bX = false;
          this.c = false;
          i.eg = 0;
          i.by = 0;
          i.eg = 0;
          i.by = 0;
          byte[] arrayOfByte;
          if ((arrayOfByte = i.z) != null)
          {
            for (i3 = 32; i3 < e.c; i3++)
              arrayOfByte[i3] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[17] = 0;
            arrayOfByte[18] = 0;
          }
          if (l.c != null)
            break;
          this.t = true;
          return;
        }
        else
        {
          if (this.au != 2)
            break;
          i.bX = true;
          i.b();
          this.c = true;
          i.l();
          i.cb = (byte)e.d;
          i.u();
          m();
          return;
        }
      case 14:
        i.ca = false;
        e.a();
        int i2 = 0;
        if ((!p) && (this.aN))
          i2++;
        if ((this.au == 0) && (!p) && (this.aN))
        {
          e.a();
          m();
          return;
        }
        if (this.au == i2)
        {
          if (I())
            c(-1);
          else
            c(-3);
          this.aY = 2;
          d();
          return;
        }
        i3 = 2;
        if (!this.aN)
          i3--;
        if ((this.au != i3) || (p) || (!this.aO))
          break;
        c(5);
        return;
      case 10:
        this.aY = 0;
        a("" + this.au);
        return;
      case 18:
        if (this.au == 0)
        {
          i4 = 0;
          k.a(i.cL + 1, a - i.cK - i.cL - 2);
          k.b(null);
        }
        if (this.au != 1)
          break;
        if (p)
        {
          this.n = false;
          i.aw = true;
          i.cE = false;
          e.d = -1;
          i.bN = false;
          f.c();
        }
        else
        {
          k.a(i.cL + 1, a - i.cK - i.cL - 2);
          k.a(null);
          return;
        }
      case 0:
        switch (J[this.au])
        {
        case 0:
          c(14);
          break;
        case 1:
          l.c = null;
          c(15);
          break;
        case 2:
          if (bf)
          {
            C();
          }
          else
          {
            this.n = false;
            i.aw = true;
            i.cE = false;
            e.d = -1;
            i.bN = false;
            f.c();
          }
          break;
        case 3:
          try
          {
            NET_Lizard.a.platformRequest(this.d);
            this.n = false;
            i.D = false;
          }
          catch (Exception localException)
          {
            this.aY = 3;
            d();
          }
        case 4:
          c(18);
          break;
        case 5:
          i.f();
          break;
        case 6:
          c(2);
          break;
        case 7:
          c(10);
          break;
        case 8:
          this.aY = 1;
          d();
          break;
        case 9:
          c(7);
        default:
          return;
        }
      case 5:
        e.d = this.au + 1;
        if (i.ca)
        {
          i.bK &= 126;
          i.bK &= 125;
          if (i.Y)
            i.bK |= 2;
          i.cb = (byte)e.d;
        }
        if (!i.ca)
        {
          i4 = e.d;
          if (e.d > 0)
          {
            this.aY = 5;
            d();
          }
          e.d = i4;
        }
        boolean bool = bG;
        bG = true;
        z();
        bG = bool;
        m();
        return;
      case 2:
        switch (J[this.au])
        {
        case 0:
          e.k = !e.k;
          D();
          if (e.k)
          {
            w();
            return;
          }
          i.s();
          break;
        case 1:
          int i5 = m.v;
          int i6 = 10;
          if ((this.P == 52) || (this.P == -3))
            i6 = -10;
          if (i5 += i6 > 100)
            i5 -= 100;
          if (i5 > 100)
            i5 = 100;
          if (i5 < 0)
            i5 = 0;
          m.v = i5;
          m.b();
          D();
          break;
        case 2:
          i.cz = !i.cz;
          D();
          break;
        case 3:
          if (!i.dV)
            break;
          e.n = !e.n;
          D();
          if (e.n)
            i.x();
          break;
        case 4:
          c(6);
        }
        return;
      case 3:
        switch (this.au)
        {
        case 0:
          e.k = true;
          w();
          v();
          return;
        case 1:
          e.k = false;
          i.s();
          v();
        }
      case -2:
      case 1:
      case 9:
      case 11:
      case 12:
      case 13:
      case 17:
      }
    }
  }

  private final void s()
  {
    r();
    int i1 = 0;
    switch (this.P)
    {
    case -7:
    case -6:
    case -5:
    case 35:
    case 53:
      this.P = 0;
      i1 = 1;
    }
    if ((this.W) || (i1 != 0))
    {
      this.P = 0;
      this.W = false;
      this.bn = 0L;
    }
    if ((this.bq) && (!this.am) && (!i.du))
    {
      this.P = 0;
      this.W = false;
      this.bn = 0L;
      this.bq = false;
      i.i = false;
    }
  }

  private final void t()
  {
    int i1;
    int i2;
    if ((this.aY == 1) && (this.P != 0))
      switch (this.P)
      {
      case 35:
        this.N = true;
        break;
      case 55:
        for (i1 = 0; i1 < this.O.length; i1++)
        {
          if (i1 == 7)
            continue;
          this.O[i1] = 0;
        }
        if ((this.N) || (this.O[7] > 0))
          this.O[7] += 1;
        this.N = false;
        break;
      case 56:
        for (i2 = 0; i2 < this.O.length; i2++)
        {
          if (i2 == 8)
            continue;
          this.O[i2] = 0;
        }
        if ((this.N) || (this.O[8] > 0))
          if (this.O[8] += 1 == 3)
            i.aA = true;
        this.N = false;
        break;
      case 57:
        for (int i3 = 0; i3 < this.O.length; i3++)
        {
          if (i3 == 9)
            continue;
          this.O[i3] = 0;
        }
        if ((this.N) || (this.O[9] > 0))
          this.O[9] += 1;
        this.N = false;
        break;
      case 50:
        for (int i4 = 0; i4 < this.O.length; i4++)
        {
          if (i4 == 2)
            continue;
          this.O[i4] = 0;
        }
        if ((this.N) || (this.O[2] > 0))
          if (this.O[2] += 1 == 3)
            bG = true;
        this.N = false;
        break;
      case 49:
        for (int i5 = 0; i5 < this.O.length; i5++)
        {
          if (i5 == 1)
            continue;
          this.O[i5] = 0;
        }
        if ((this.N) || (this.O[1] > 0))
          if (this.O[1] += 1 == 3)
            i.dm = !i.dm;
        this.N = false;
        break;
      case 51:
        for (int i6 = 0; i6 < this.O.length; i6++)
        {
          if (i6 == 3)
            continue;
          this.O[i6] = 0;
        }
        if ((this.N) || (this.O[3] > 0))
          if (this.O[3] += 1 == 3)
            i.o = !i.o;
        this.N = false;
        break;
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 52:
      case 53:
      case 54:
      default:
        this.N = false;
        for (int i7 = 0; i7 < this.O.length; i7++)
          this.O[i7] = 0;
      }
    switch (this.P)
    {
    case -1:
    case 50:
      return;
    case -2:
    case 56:
      return;
    case 35:
      if (this.aY != 1)
        break;
      return;
    case -7:
      return;
    case -6:
    case -5:
    case 53:
      A();
      if ((this.bH) && (this.aL == 0) && (this.aC != null))
      {
        i1 = this.au;
        i2 = this.aC.length;
        c(this.aL);
        this.au = (i1 + this.aC.length - i2);
      }
    }
  }

  private final void u()
  {
    try
    {
      if (i.cs)
        this.v = true;
      if (this.v)
      {
        int i1;
        if ((i1 = x.b() + 2) < i.cK)
          i1 = i.cK;
        int i2;
        if ((i2 = x.b() + 2) < i.cL)
          i2 = i.cL;
        int i3 = 0;
        int i4 = this.aD;
        if (i.du)
          i4 = 1;
        int i5 = 0;
        int i6;
        if (i.cr)
          if (i.cs)
          {
            this.bi = i.eH;
          }
          else
          {
            i3 = -(i.eH - this.bi);
            i6 = Math.abs(i.eH - this.bi);
            int i7 = 1;
            if (i.eH < this.bi)
              i7 = -1;
            while (i6 >= i4)
            {
              i5 += i7;
              i6 -= i4;
            }
            this.bi += i5 * i4;
            if (!i.du)
            {
              this.bA -= i5;
              if (this.bA < 0)
                this.bA = 0;
              if (this.bA > this.aC.length - this.aa)
                this.bA = (this.aC.length - this.aa);
              if ((this.bA != 0) && (i5 != 0))
                H();
            }
          }
        if (i.du)
        {
          i.dt += i3;
          if (i.dt < 0)
            i.dt = 0;
          if ((i6 = i.aC + 2 - i.aD) < 0)
            i6 = 0;
          if (i.dt > i6)
            i.dt = i6;
        }
        if (((this.am) || (i.du) || (!this.az)) && (i.b(0, i2, e, a - i1 - i2)))
          a(this.P = 53);
        if (i.c(0, a - i1, e / 3, i1))
          a(this.P = 53);
        if (i.c(e - e / 3, a - i1, e / 3, i1))
          a(this.P = 35);
      }
      if (i.ct)
      {
        if (this.V)
          this.P = 0;
        else
          this.W = true;
        this.bn = 0L;
        this.X = false;
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void v()
  {
    D();
    c(0);
    this.au = 0;
    this.aM = this.aL;
    this.av = this.au;
  }

  private final void c(int paramInt)
  {
    i.n();
    this.Y = 3;
    int i1 = 0;
    if ((paramInt >= 0) && (paramInt < this.ax.length))
      i1 = this.ax[paramInt];
    if (paramInt == 0)
      i.t = null;
    if ((paramInt == 0) || (paramInt == 15))
      i.b();
    if (this.aL == 0)
      this.aw = this.au;
    if (paramInt == 14)
      i.ca = false;
    if (paramInt == 15)
      i.ca = true;
    if ((paramInt == 15) || (paramInt == 7))
      i.b(-1);
    this.aM = this.aL;
    this.av = this.au;
    if ((this.aL >= 0) && (this.aL < this.ax.length))
      this.ax[this.aL] = (byte)this.au;
    try
    {
      this.bt = 0;
      if (paramInt == 0)
      {
        if (this.d == null)
          try
          {
            this.d = NET_Lizard.a.getAppProperty(i.a(this.M[0]));
          }
          catch (Exception localException1)
          {
          }
        if (this.d == null)
          try
          {
            this.d = NET_Lizard.a.getAppProperty(i.a(this.M[1]));
          }
          catch (Exception localException2)
          {
          }
        this.bt += this.bu;
        this.bt += 5;
      }
      this.bb = null;
      Object localObject;
      int i3;
      int i4;
      try
      {
        if (((arrayOfString = i.l[(10 + paramInt + 30)]) != null) && (arrayOfString.length > 0) && (arrayOfString[0].length() > 1) && (arrayOfString[0].charAt(0) > ' '))
        {
          localObject = "";
          i3 = 0;
          for (i4 = 0; i4 < arrayOfString.length; i4++)
            localObject = (String)localObject + arrayOfString[0] + '\r';
          while ((((String)localObject).charAt(((String)localObject).length() - 1) == '\r') || (((String)localObject).charAt(((String)localObject).length() - 1) == '\n'))
            localObject = ((String)localObject).substring(0, ((String)localObject).length() - 1);
          if (this.bc == null)
            this.bc = A;
          this.bb = e.m.a((String)localObject, this.bc, e - this.bc.a(" "), true);
        }
      }
      catch (Exception localException3)
      {
        this.bb = null;
      }
      String[] arrayOfString = null;
      if (paramInt != 5)
      {
        arrayOfString = new String[(localObject = i.l[(10 + paramInt + this.bt)]).length];
        for (i3 = 0; i3 < arrayOfString.length; i3++)
          arrayOfString[i3] = localObject[i3];
        if ((p) && (paramInt == 0) && (bf))
          arrayOfString[1] = i.l[34][0];
        J = new int[arrayOfString.length];
        for (i4 = 0; i4 < J.length; i4++)
          J[i4] = i4;
        if (paramInt == 0)
        {
          if (F())
          {
            if (i.b == null)
            {
              c.a(3);
              i.d();
              i.b = new l(i.cB);
            }
          }
          else
          {
            aS = false;
            i.ca = false;
          }
          arrayOfString = a(arrayOfString, new boolean[] { false, !aS ? 1 : 0, !p ? 1 : 0, this.d == null ? 1 : 0, !i.cG ? 1 : 0, !i.dv ? 1 : 0 });
        }
        if (paramInt == 14)
        {
          this.aN = ((I()) && (!p));
          this.aO = false;
          arrayOfString = a(arrayOfString, new boolean[] { !this.aN ? 1 : 0, false, !this.aO ? 1 : 0 });
          i1 = 0;
        }
        int i5;
        if (paramInt == 15)
        {
          i5 = (i.w()) && (!p) ? 1 : 0;
          arrayOfString = a(arrayOfString, new boolean[] { false, false, i5 == 0 ? 1 : 0 });
          if ((i5 == 0) && (i1 == 2))
            i1 = 0;
          if (i5 != 0)
            i1 = 2;
        }
        if (paramInt == 2)
        {
          i5 = ((!I()) && (!i.w())) || (p) ? 1 : 0;
          arrayOfString = a(arrayOfString, new boolean[] { false, false, !i.cy ? 1 : 0, !i.dV ? 1 : 0, i5 });
        }
      }
      if (paramInt == 5)
      {
        int i2;
        if ((i2 = e.d) < 1)
        {
          i3 = e.d;
          e.a();
          i2 = e.d;
          e.d = i3;
        }
        if (i2 < 1)
          i2 = 1;
        i3 = e.e;
        if ((bG) || (i.ca))
          i3 = i.bt;
        if (p)
          i3 = 1;
        if (i3 >= 1)
        {
          if (i2 > i3)
            i2 = i3;
          arrayOfString = new String[i3];
          for (i4 = 0; i4 < i3; i4++)
          {
            arrayOfString[i4] = (i.l[14][0] + String.valueOf(i4 + 1));
            try
            {
              if ((i.bu != null) && (i4 + 1 < i.bu.length))
                arrayOfString[i4] = i.bu[(i4 + 1)][0];
            }
            catch (Exception localException4)
            {
            }
          }
          i1 = i2 - 1;
        }
        else
        {
          return;
        }
      }
      if (arrayOfString == null)
        return;
      if (arrayOfString.length < 1)
        return;
      if (paramInt == -3)
        i1 = i.cW;
      if (paramInt == 3)
        i1 = 1;
      this.aC = arrayOfString;
      this.aL = paramInt;
      this.au = i1;
      this.bA = 0;
      this.aF = true;
      this.bL = this.bN;
    }
    catch (Exception localException5)
    {
    }
    H();
  }

  public static final void a(Graphics paramGraphics, String paramString, boolean paramBoolean)
  {
    paramGraphics.setColor(i.p);
    int i1 = 0;
    int i2 = 0;
    int i3 = x.b() + 3;
    i2 = 2;
    if (paramBoolean)
    {
      i4 = 1;
      if ((a > 100) && (paramBoolean))
        try
        {
          try
          {
            if (af == null)
              af = e.a(i.a(NET_Lizard.c.bO.aE[16]));
          }
          catch (Exception localException1)
          {
          }
          try
          {
            if ((af == null) && (!u))
              af = e.a(i.a(NET_Lizard.c.bO.aE[16]));
          }
          catch (Exception localException2)
          {
          }
          i4 = 0;
          if (!i.r)
          {
            ae = null;
            af = null;
          }
          return;
        }
        catch (Exception localException3)
        {
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
        }
      if (i4 != 0)
        try
        {
          if (ae == null)
            ae = e.a(i.a(NET_Lizard.c.bO.aE[12]));
          i2 = a - ae.getHeight() >> 1;
          paramGraphics.drawImage(ae, f, i2, 17);
          if (i2 += ae.getHeight() + 3 < b - i3)
            i2 = b - i3;
          ae = null;
          af = null;
        }
        catch (Exception localException4)
        {
        }
    }
    else
    {
      i2 = b + i3;
    }
    paramGraphics.setColor(z);
    paramGraphics.setFont(y);
    for (int i4 = 0; i4 < 1; i4++)
    {
      if (i4 == 1)
      {
        i2 += i3;
        paramString = i.l[1][1] + String.valueOf(e.d);
        if ((e.d < 1) || (i.bN))
          paramString = "";
      }
      i1 = e - x.a(paramString) >> 1;
      if ((!paramBoolean) && (i4 >= 1))
        continue;
      x.a(paramGraphics, paramString, i1, i2, 20);
    }
    try
    {
      int i5 = 0;
    }
    catch (Exception localException5)
    {
    }
    if (!i.r)
      ae = null;
  }

  public static final void a(Graphics paramGraphics)
  {
    a(paramGraphics, i.l[1][0], true);
  }

  private static void w()
  {
    if (e.k)
      i.m();
  }

  private final void x()
  {
    this.as = 0;
    this.ar = 255;
    long l1 = 55L;
    long l2 = 900L;
    if (!f())
      this.ar = 0;
    else
      do
      {
        long l3 = System.currentTimeMillis();
        B();
        long l4;
        long l5;
        if ((l5 = (l4 = System.currentTimeMillis()) - l3) < l1)
        {
          try
          {
            Thread.sleep(l1 - l5);
          }
          catch (Exception localException1)
          {
          }
          l5 = l1;
        }
        int i1;
        if ((i1 = (int)(256L * l5 / l2)) < 1)
          i1 = 1;
        this.ar -= i1;
      }
      while (this.ar > 0);
    B();
    try
    {
      Thread.sleep(470L);
      return;
    }
    catch (Exception localException2)
    {
    }
  }

  final void c()
  {
    long l1;
    if ((l1 = System.currentTimeMillis()) - this.aR >= 120L)
    {
      this.aR = l1;
      this.aZ += 1;
      if (this.aZ > 3)
      {
        this.aZ = 0;
        this.Y -= 1;
      }
    }
  }

  private static void y()
  {
    boolean bool = bG;
    bG = false;
    z();
    bG = bool;
  }

  private static void z()
  {
    int i1 = e.d;
    e.a();
    e.d = i1;
    if ((!bG) || (e.d < 1))
      e.d = 1;
    if (!bG)
    {
      e.e = 1;
      i.Y = false;
    }
    e.f = 0;
    byte[] arrayOfByte = e.a;
    if (i.ca)
      arrayOfByte = i.z;
    if (!bG)
    {
      i.eg = 0;
      i.by = 0;
      if (arrayOfByte != null)
      {
        arrayOfByte[8] = 0;
        arrayOfByte[17] = 0;
        arrayOfByte[18] = 0;
      }
    }
    if (!i.ca)
      e.b();
    if (i.ca)
      try
      {
        i.u();
        return;
      }
      catch (Exception localException)
      {
      }
  }

  public final void b(Graphics paramGraphics)
  {
    try
    {
      if (this.aq != null)
      {
        h(paramGraphics);
        return;
      }
      if (g(paramGraphics))
        return;
      if (this.K != null)
      {
        c(paramGraphics);
        if (this.am)
          d(paramGraphics);
        return;
      }
      if (paramGraphics != null)
      {
        if (this.bj != null)
          paramGraphics.drawImage(this.bj, f + this.bl, 0, 17);
        if (this.bk != null)
          paramGraphics.drawImage(this.bk, f - this.bl, a - this.bk.getHeight(), 17);
        if (((this.bj != null) || (this.bk != null)) && (this.ar > 0))
        {
          i.a(paramGraphics, 0, 0, e, a, this.as, this.ar);
          return;
        }
        if ((this.bj != null) || (this.bk != null))
          f(paramGraphics);
        if ((this.bj != null) && (i.m != null) && (this.bs))
          paramGraphics.drawImage(i.m, -(i.m.getWidth() >> 1), a - i.m.getHeight(), 20);
        if (this.bj != null)
          return;
        if (this.aX != null)
        {
          e(paramGraphics);
          return;
        }
      }
      if (!this.bH)
        return;
      if (paramGraphics != null)
        paramGraphics.setFont(y);
      if (this.am)
      {
        d(paramGraphics);
        return;
      }
      d locald = x;
      if (this.aL == 5)
        locald = A;
      if (this.aC == null)
        return;
      int i1 = 3;
      int i2 = 3;
      int i3 = locald.b() + 6;
      int i5;
      if (this.aH != null)
      {
        i3 = this.aH.getHeight();
        i4 = locald.f;
        i5 = 0;
        i1 = i3 - (locald.b() - i4) >> 1;
        i2 = 1 + (5 * i3 >> 3);
      }
      if ((i.aQ != null) && (i.aQ.length > 2) && (i.aQ[1] != null) && (i.G != null))
      {
        i3 = i.G[3][5];
        i4 = locald.f;
        i5 = 0;
        i1 = i3 - (locald.b() - i4) >> 1;
        i2 = 1 + (5 * i3 >> 3);
      }
      int i4 = 0;
      int i6 = (i5 = 10 - this.bA * (i3 + 4)) + this.bA * (i3 + 4);
      int i7 = 0;
      int i8 = 5;
      if (a < 297)
        i8 = 4;
      i7 = a - (i3 + 4) * i8 >> 1;
      i7 -= 10;
      if (i7 < 0)
        i7 = 0;
      if (i7 < i.cL)
        i7 = i.cL;
      if (paramGraphics != null)
      {
        i.c(paramGraphics);
        if (this.G != null)
          paramGraphics.drawImage(this.G, f, b, 3);
      }
      int i10;
      int i11;
      if (this.bb != null)
      {
        i9 = 0;
        if ((i11 = (i10 = this.bb.length * locald.b()) + 4) <= 0)
          i11 = 0;
        if ((i9 = i11 - i10 >> 1) < 2 + i.cL)
          i9 = 2 + i.cL;
        for (int i12 = 0; i12 < this.bb.length; i12++)
        {
          if (paramGraphics != null)
            this.bc.a(paramGraphics, this.bb[i12], f, i9, 17);
          i9 += this.bc.b();
        }
        if (i7 < i9)
          i7 = i9;
      }
      int i9 = 5;
      if (this.aL != 3)
      {
        if (i.n[2] != null)
          i9 = i.n[2].getHeight() >> 1;
      }
      else
        i9 = 0;
      i7 += i9;
      i5 += i7;
      int i13 = i6 += i7 - 0 - 3 - 1;
      int i14 = 0;
      String str = null;
      String[] arrayOfString = null;
      int i18;
      if (this.aL == 2)
      {
        i15 = 0;
        arrayOfString = new String[4];
        for (i16 = 0; i16 < arrayOfString.length; i16++)
          arrayOfString[i16] = "";
        for (i17 = 0; i17 < J.length; i17++)
        {
          i18 = 1;
          if (e.k)
            i18 = 0;
          if (J[i17] == 0)
            arrayOfString[i17] = i.l[8][i18];
          if (J[i17] == 1)
            arrayOfString[i17] = ("" + m.v + "%");
          if (J[i17] == 2)
          {
            i18 = 1;
            if (i.cz)
              i18 = 0;
            arrayOfString[i17] = i.l[19][i18];
          }
          if (J[i17] != 3)
            continue;
          i18 = 1;
          if (e.n)
            i18 = 0;
          arrayOfString[i17] = i.l[8][i18];
        }
      }
      if (this.aL == 16)
      {
        (arrayOfString = new String[2])[0] = i.l[1][9];
        i16 = 0;
        if (!i.Y)
          i16++;
        arrayOfString[1] = i.l[8][i16];
      }
      if (this.aF)
      {
        i15 = 1;
        for (i17 = 0; i17 < this.aC.length; i17++)
        {
          str = this.aC[i17];
          if ((this.aL == 2) && (i17 < arrayOfString.length))
            str = str + arrayOfString[i17];
          if ((this.aL == 16) && (i17 < arrayOfString.length))
            str = str + arrayOfString[i17];
          if (this.aL == 4)
            str = str + e.d;
          i11 = locald.a(str) + 2 * i2;
          if (this.aL == 2)
            i11 += locald.a("Ы");
          if (i15 >= i11)
            continue;
          i15 = i11;
        }
        this.aG = i15;
        this.aF = false;
      }
      int i15 = i6;
      int i16 = i5;
      int i17 = 0;
      this.ba = -1;
      if (this.aH != null)
      {
        this.aG = this.aH.getWidth();
        i18 = this.bM - 64 * this.aC.length;
        this.bL -= 64;
        if (this.bL < i18)
          this.bL = i18;
      }
      int i19 = locald.e;
      this.aa = 0;
      int i20 = 1;
      int i22;
      for (int i21 = 0; i21 < this.aC.length; i21++)
      {
        str = this.aC[i21];
        if ((this.aL == 2) && (i21 < arrayOfString.length))
          str = str + arrayOfString[i21];
        if ((this.aL == 16) && (i21 < arrayOfString.length))
          str = str + arrayOfString[i21];
        if (this.aL == 4)
          str = str + e.d;
        i22 = i4 < i8 ? 1 : 0;
        if ((i5 >= i7) && (i5 < a - i3 - locald.b() - 3) && (i22 != 0) && (i5 < a - i3 - 0 - 3 - i9 - 1))
        {
          this.aa += 1;
          i15 = i5;
          i4++;
          if (this.aH != null)
          {
            if ((i10 = this.bL + i21 * 32) < this.bM)
              i10 = this.bM;
            if (i10 > this.bM)
              i20 = 0;
            i10 = -i10 + (e - this.aH.getWidth() >> 1);
            if (i21 == this.au)
            {
              this.ba = i17;
              paramGraphics.drawImage(this.aI, i10, i5, 20);
            }
            paramGraphics.setColor(z);
            locald.a(paramGraphics, str, i10 + (this.aH.getWidth() >> 1), i5 + i1, 17);
          }
          else
          {
            if (paramGraphics != null)
            {
              paramGraphics.setColor(0);
              if ((i.c(0, i5, e, i3)) && (i21 != this.au))
                this.au = i21;
              if (i.b(0, i5, e, i3))
              {
                if (i21 != this.au)
                  this.au = i21;
                this.P = 53;
              }
            }
            if ((i21 == this.au) && (paramGraphics != null))
              if ((i.aQ != null) && (i.aQ.length >= 3) && (i.aQ[1] != null))
              {
                i.b(paramGraphics, 5 + this.aP, f, i5 + i1 + (locald.b() - locald.f >> 1), 3);
              }
              else
              {
                paramGraphics.setColor(0);
                paramGraphics.fillRect(0, i5 - 1, e, i3 + 2);
                paramGraphics.setColor(i.p);
                paramGraphics.fillRect(0, i5, e, i3);
              }
            i10 = e - locald.a(str) >> 1;
            if (this.aL == 5)
              i10 = e - this.aG >> 1;
            if (i10 < 1)
              i10 = 1;
            if (paramGraphics != null)
            {
              paramGraphics.setColor(z);
              locald.a(paramGraphics, str, i10, i5 + i1, 20);
            }
          }
          i17++;
        }
        else
        {
          i14 = 1;
          if (((i17 > 0 ? 1 : 0) & (this.ba == i17 - 1 ? 1 : 0)) != 0)
            this.ba = this.ay;
          if (i21 == this.au)
            if (i5 <= i7)
              this.bA -= 1;
            else
              this.bA += 1;
        }
        i5 += i3 + 4;
      }
      this.aD = (i3 + 4);
      locald.e = i19;
      if ((i14 != 0) && (i20 != 0) && (paramGraphics != null))
      {
        a(paramGraphics, i6 - 3, i13, i6 > i16, false);
        a(paramGraphics, i15 + i3 + 3, i13, i5 - i3 - 4 > i15, true);
        i22 = i6 - 3;
        i23 = i15 + i3 + 3;
        if (i.c(0, i.cL, e, i22 - i.cL))
          a(50);
        if (i.c(0, i23, e, a - i.cK - i23))
          a(56);
      }
      int i23 = locald.b() - locald.f + 2 + 3;
      int i24;
      if (paramGraphics != null)
      {
        paramGraphics.setColor(i.p);
        i24 = (this.aL != 3 ? 1 : 0) & (this.aL != 0 ? 1 : 0);
        i.c(paramGraphics, 0, 0, a, 36);
        if (i24 != 0)
          i.c(paramGraphics, 2, e, a, 40);
      }
      if ((this.bd != null) && (paramGraphics != null))
      {
        i24 = 0;
        if (e <= 132)
          i24 = i23 + 2;
        paramGraphics.drawImage(this.bd, f, a - (i23 >> 1) - i24, 3);
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void c(Graphics paramGraphics)
  {
    if (this.K == null)
      return;
    try
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, e, a);
      int i1 = a - this.K[1].getHeight();
      int i2 = e * i1 / 40;
      int i3 = 0;
      if (this.aA == null)
      {
        this.aA = new int[i2][4];
        i3 = 1;
      }
      Graphics localGraphics = paramGraphics;
      int i5;
      if (this.m != null)
      {
        paramGraphics.drawImage(this.m, 0, 0, 20);
      }
      else
      {
        if (this.l)
        {
          this.m = Image.createImage(e, i1);
          (localGraphics = this.m.getGraphics()).setColor(0);
          localGraphics.fillRect(0, 0, e, i1);
        }
        for (i4 = 0; i4 < i2; i4++)
        {
          int i6;
          int i7;
          int i8;
          if (i3 != 0)
          {
            i5 = i.r() * e / 100;
            i6 = i.r() * i1 / 100;
            if ((i7 = i.r() * 255 / 100) < 32)
              i7 = 32;
            if (i7 > 255)
              i7 = 255;
            if ((i8 = i7 / 120) < 1)
              i8 = 1;
            if (i8 > 2)
              i8 = 2;
            this.aA[i4][0] = i5;
            this.aA[i4][1] = i6;
            this.aA[i4][2] = i7;
            this.aA[i4][3] = i8;
          }
          else
          {
            i5 = this.aA[i4][0];
            i6 = this.aA[i4][1];
            i7 = this.aA[i4][2];
            i8 = this.aA[i4][3];
          }
          localGraphics.setColor(i7, i7, i7);
          if (i8 <= 0)
            continue;
          localGraphics.fillRect(i5, i6, i8, i8);
        }
        if (this.m != null)
          paramGraphics.drawImage(this.m, 0, 0, 20);
      }
      for (int i4 = 0; i4 < this.K.length; i4++)
        if ((i4 == 1) && (this.K[i4] != null))
        {
          while (this.L[i4][0] < -this.K[i4].getWidth())
            this.L[i4][0] += this.K[i4].getWidth();
          while (this.L[i4][0] > 0)
            this.L[i4][0] -= this.K[i4].getWidth();
          i5 = this.L[i4][0];
          do
          {
            if (i5 <= -this.K[i4].getWidth())
              continue;
            paramGraphics.drawImage(this.K[i4], i5, this.L[i4][1], 20);
          }
          while (i5 += this.K[i4].getWidth() < e);
        }
        else
        {
          if ((this.K[i4] == null) || (this.L[i4][0] <= -this.K[i4].getWidth()))
            continue;
          paramGraphics.drawImage(this.K[i4], this.L[i4][0], this.L[i4][1], 20);
        }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void d(Graphics paramGraphics)
  {
    int i1 = 1;
    try
    {
      if ((this.G != null) && (this.K == null))
        paramGraphics.drawImage(this.G, f, b, 3);
      i1 = 0;
    }
    catch (Exception localException1)
    {
    }
    if (this.I != null)
    {
      this.bv = this.I.getHeight();
      if (this.ac)
      {
        if (this.I.getWidth() < e)
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(0, 0, e, this.bv);
        }
        paramGraphics.drawImage(this.I, f, 0, 17);
        this.ac = false;
      }
    }
    d locald = A;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    try
    {
      int i5;
      if ((i5 = a - this.bv) > this.D)
        i5 = this.D;
      int i6 = i5;
      int i7 = e - this.bK - this.bO - 1;
      int i8 = 0;
      int i9 = locald.b() + 1 + 2;
      int i10 = locald.b() - locald.f + 2 + 3;
      if (this.U != null)
        i10 = this.U.getHeight();
      if (i10 < i.cL)
        i10 = i.cL;
      if (i10 < i.cK)
        i10 = i.cK;
      int i11 = (i11 = i10 + 2) + (locald.b() >> 1);
      int i12 = i6 - i11;
      if (this.ag != null)
      {
        i10 = i6 >> 3;
        if (this.ag[2] != null)
        {
          int i13;
          i14 = (i13 = this.ag[2].getHeight() >> 1) << 1;
          if (i10 < i14)
            i10 = i14;
        }
        i12 = i6 - i10;
      }
      if (i11 < i10)
        i11 = i10;
      this.ab = true;
      int i14 = this.aB.length - 1;
      int i15 = 0;
      i10 += 1;
      this.E = (i6 - i10 - i10);
      this.bQ = this.E;
      i10 -= 1;
      int i16 = i12 - i11;
      int i19;
      int i20;
      if (paramGraphics != null)
      {
        if (((this.G == null) || (this.G.getWidth() < e) || (this.G.getHeight() < i6)) && (this.K == null))
          i.c(paramGraphics);
        if ((i1 != 0) && (this.G != null) && (this.K == null))
          paramGraphics.drawImage(this.G, f, b, 3);
        if (this.ag != null)
        {
          if (this.ah[0][0] > 0)
            this.ah[0][0] = 0;
          try
          {
            if ((this.ag[0] != null) && (this.K == null))
              paramGraphics.drawImage(this.ag[0], this.ah[0][0], this.ah[0][1], 20);
            if (this.ah[0][0] < 0)
            {
              if (this.ag[0] != null)
                this.ah[0][0] += (this.ag[0].getWidth() >> 3);
              else
                this.ah[0][0] = 0;
              this.bP = i16;
              return;
            }
          }
          catch (Exception localException2)
          {
          }
          i17 = i16;
          if (this.br)
            i17 = -i16;
          if (this.K != null)
            this.bP -= (i17 >> 4);
          else
            this.bP -= (i17 >> 3);
          i18 = 0;
          if (this.bP > 0)
            return;
          this.bP = 0;
          if (this.ag[1] != null)
          {
            i19 = (i19 = i6 - i16 >> 1) + i16;
            i19 = (i6 - i19 + this.ag[1].getHeight() >> 1) + i19;
            paramGraphics.drawImage(this.ag[1], this.bz, i19, 20);
          }
          if (this.ag[2] != null)
          {
            i19 = this.ag[2].getHeight() >> 1;
            i20 = 2 * i19 + 2;
            this.E = (i16 - 2 * i20);
            i3 = (i2 = i6 - this.E >> 1) - i20 + (i20 - i19 >> 1);
            i4 = i2 + this.E + (i20 - i19 >> 1);
          }
          this.bQ = this.E;
        }
        this.bP = 0;
        if (this.ag == null)
        {
          if (this.U == null)
          {
            paramGraphics.setColor(6, 41, 0);
            i.b(paramGraphics, 0, 0, e, i10, 128, 96);
            if (this.bm != null)
              paramGraphics.drawImage(this.bm, 1, i10 - this.bm.getHeight() >> 1, 20);
            i.b(paramGraphics, 0, i6 - i10, e, i10, 128, 96);
            paramGraphics.setColor(126, 255, 0);
            paramGraphics.drawRect(0, 0, e - 1, i10 - 1);
            paramGraphics.drawRect(0, i6 - i10, e - 1, i10 - 1);
          }
          paramGraphics.setColor(0);
        }
        if (this.ag == null)
        {
          paramGraphics.setColor(z);
          i18 = i10 - (locald.b() - locald.f) >> 1;
          b(paramGraphics, locald, this.aB[0], 1, i18);
          if (this.U == null)
            locald.a(paramGraphics, this.aB[0], 1, i18, 20);
          i19 = 3;
          if (this.aY == 2)
            i19++;
          i18 = i6 - i10 + i18;
          b(paramGraphics, locald, i.l[11][2], 1, i18);
          if (this.U == null)
            locald.a(paramGraphics, i.l[11][2], 1, i18, 20);
          b(paramGraphics, locald, i.l[11][i19], e - 1, i18);
          if (this.U == null)
            locald.a(paramGraphics, i.l[11][i19], e - 1, i18, 24);
        }
      }
      int i17 = i16;
      i.b(paramGraphics);
      i.a(paramGraphics, 0, i11, e, i16);
      int i18 = this.by - i17;
      this.bx = 1;
      if (i18 >= i9)
      {
        i19 = i18 / i9;
        i18 -= i19 * i9;
        this.bx += i19;
      }
      i11 -= i18;
      if (i17 > 0)
        this.ab = (this.bx >= this.aB.length);
      for (i15 = this.bx; i15 < this.aB.length; i15++)
      {
        i8 = this.bz;
        if (paramGraphics != null)
        {
          i19 = 0;
          try
          {
            i19 = this.aB[i15].charAt(0);
          }
          catch (Exception localException3)
          {
          }
          i20 = 4;
          i21 = 1;
          switch (i19)
          {
          case 47:
            i20 = 8;
            i8 = i7 - 1;
            i21 = 0;
            break;
          case 124:
            i20 = 1;
            i8 = (i7 - this.bz >> 1) + this.bz;
            i21 = 0;
          }
          if (i21 != 0)
          {
            if (this.aY == 8)
              a(paramGraphics, locald, this.aB[i15], i8, i11);
            else
              locald.a(paramGraphics, this.aB[i15], i8, i11, 20);
          }
          else
            locald.a(paramGraphics, this.aB[i15], 1, this.aB[i15].length() - 1, i8, i11, i20 | 0x10);
        }
        if (i11 += i9 < i12)
          continue;
        this.ab = false;
        break;
      }
      i.a(paramGraphics);
      i15 = this.by;
      i10 = i6 - this.E >> 1;
      int i21 = i14 * i9;
      int i22 = 0;
      if (i21 <= 0)
      {
        i21 = 1;
        i22 = 1;
      }
      int i23;
      if ((i23 = this.E * i16 / i21) > this.E >> 3)
        i23 = this.E >> 3;
      if (i23 < this.F)
        i23 = this.F;
      if (i23 > this.E)
        i23 = this.E;
      int i24;
      if ((i24 = i21 - i16 + 2 * i17) <= 0)
      {
        i24 = 1;
        i22 = 1;
      }
      int i25;
      int i26 = (i25 = this.bQ - i23) * i15 / i24;
      if (i22 != 0)
      {
        i23 = this.E;
        i26 = 0;
      }
      if (i26 < 0)
        i26 = 0;
      if (i26 > i25)
        i26 = i25;
      if ((this.aY != 2) && (this.K == null))
      {
        paramGraphics.setColor(i.p);
        paramGraphics.fillRect(e - this.bK - this.bO, i10, this.bK - 1, this.E - 1);
        paramGraphics.setColor(40, 85, 158);
        paramGraphics.drawRect(e - this.bK - this.bO, i10, this.bK - 1, this.E - 1);
        paramGraphics.setColor(40, 85, 158);
        paramGraphics.fillRect(e - this.bK - this.bO, i10 + i26 + 1, this.bK, i23 - 2);
        paramGraphics.setColor(40, 85, 158);
        paramGraphics.fillRect(e - this.bK - this.bO + 1, i10 + i26 + 1 + 1, this.bK - 1 - 1, i23 - 2 - 2);
        if (this.ag[2] != null)
        {
          int i27 = e - this.bK - this.bO + (this.bK >> 1) - (this.ag[2].getWidth() >> 1);
          if (this.al)
            i3 -= 2;
          i.a(paramGraphics, 0, i3, e, this.ag[2].getHeight() >> 1);
          paramGraphics.drawImage(this.ag[2], i27, i3, 20);
          if (this.ak)
            i4 += 2;
          i4++;
          i.a(paramGraphics, 0, i4, e, this.ag[2].getHeight() >> 1);
          paramGraphics.drawImage(this.ag[2], i27, i4 - (this.ag[2].getHeight() >> 1), 20);
        }
        i.a(paramGraphics);
      }
      return;
    }
    catch (Exception localException4)
    {
    }
  }

  private final void e(Graphics paramGraphics)
  {
    try
    {
      paramGraphics.setColor(65280);
      int i1;
      if ((i1 = (a >> 1) / this.aX.length) < x.b())
        i1 = x.b();
      int i2 = a / 3;
      int i3 = a - (this.aX.length + 4) * i1 >> 1;
      if (i2 > i3)
        i2 = i3;
      int i4 = i2;
      for (int i5 = 0; i5 < this.aX.length; i5++)
      {
        x.a(paramGraphics, this.aX[i5], e >> 1, i4, 17);
        i4 += i1;
      }
      if (this.aV != null)
        x.a(paramGraphics, this.aV, e >> 1, i4, 17);
      if ((this.aW != null) && (this.aW.length > 0))
      {
        i4 = a - i1;
        if ((this.aW[0] != null) && (this.aW[0].length() > 1) && (this.aV != null) && (this.aV.length() >= this.aU))
          x.a(paramGraphics, this.aW[0], 2, i4, 20);
        if ((this.aW.length > 1) && (this.aW[1] != null) && (this.aW[1].length() > 1))
          x.a(paramGraphics, this.aW[1], e - 2, i4, 24);
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void f(Graphics paramGraphics)
  {
    if (this.bJ > 0)
    {
      d locald;
      int i1;
      int i2 = (i1 = (locald = x).b() - locald.f + 4) - (locald.b() - locald.f) >> 1;
      String str = "";
      if (this.bJ == 1)
        str = i.l[1][8];
      if (this.bJ == 2)
      {
        str = i.l[1][2] + i.l[1][5];
        i.a(paramGraphics, 0, a - i1, e, i1, 0, 190);
        i3 = a - i1;
        locald.a(paramGraphics, i.l[1][3], 2, i3 - 1 + i2, 20);
        locald.a(paramGraphics, i.l[1][4], e - 1 - 2, i3 - 1 + i2, 24);
      }
      int i3 = a - i1 >> 1;
      i.a(paramGraphics, 0, i3, e, i1, 0, 190);
      locald.a(paramGraphics, str, f, i3 - 1 + i2, 17);
    }
  }

  private final void a(Graphics paramGraphics, d paramd, String paramString, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1;
    int i2 = paramInt2 + paramd.b() - paramd.f;
    int i3 = paramString.length();
    int i4 = 0;
    boolean[] arrayOfBoolean = { true };
    int[] arrayOfInt = { paramd.a("28. "), e >> 1 };
    char[] arrayOfChar = { ' ', '*' };
    int i5 = 0;
    for (char c1 = '0'; c1 <= '9'; c1 = (char)(c1 + '\001'))
    {
      if (i5 >= paramd.a(c1))
        continue;
      i5 = paramd.a(c1);
    }
    if (i5 < paramd.a('-'))
      i5 = paramd.a('-');
    int i6 = e - this.bz - this.bK - this.bO - 1 - i5 * 5 - 2;
    int i7 = 0;
    for (int i8 = 0; i8 < 0 + i3; i8++)
    {
      if (paramString.charAt(i8) == '*')
      {
        if (i1 < i6)
          i1 = i6;
        i8++;
        i7 = 1;
      }
      if (i7 != 0)
      {
        paramd.a(paramGraphics, paramString.charAt(i8), i1 + (i5 - paramd.a(paramString.charAt(i8)) >> 1), i2);
        i1 += i5;
      }
      else
      {
        i1 += paramd.a(paramGraphics, paramString.charAt(i8), i1, i2);
      }
      if ((i4 >= arrayOfBoolean.length) || (paramString.charAt(i8) != arrayOfChar[i4]))
        continue;
      if ((arrayOfInt[i4] > 0) && (i1 < arrayOfInt[i4]))
        i1 = arrayOfInt[i4];
      while ((i8 + 1 < paramString.length()) && (paramString.charAt(i8 + 1) == ' '))
        i8++;
      i4++;
    }
  }

  private void a(String paramString)
  {
    int i1 = 0;
    String str = null;
    int i2;
    try
    {
      if (this.aY == 5)
      {
        str = bw;
        bw = null;
      }
      else if (this.aY == 3)
      {
        i2 = 0;
        str = i.l[23][0] + '\r' + i.l[23][1] + this.d;
      }
      else
      {
        str = e.m.d(i.a(this.bR[this.aY]) + paramString);
      }
      if (str == null)
        i1 = 1;
      else if (str.length() < 1)
        i1 = 1;
    }
    catch (Exception localException1)
    {
      i1 = 1;
    }
    if (i1 != 0)
      return;
    if ((this.aL >= 0) && (this.aL < this.ax.length))
      this.ax[this.aL] = (byte)this.au;
    i.b(-1);
    this.Y = 3;
    this.G = null;
    p();
    this.ac = true;
    this.aB = e.m.a(str, A, e - 2 * this.bz - this.bK - this.bO - 1, true);
    this.bx = 1;
    this.by = 0;
    this.am = true;
    this.P = 0;
    this.V = false;
    this.W = false;
    this.C = i.aw;
    this.k = this.j;
    i.aw = false;
    this.j = -1;
    i.n();
    this.bv = 0;
    this.D = a;
    this.I = null;
    if (this.aY == 5)
      m();
    try
    {
      this.ag = new Image[3];
      for (i2 = 0; i2 < this.ag.length; i2++)
      {
        if (this.K != null)
          continue;
        try
        {
          this.ag[i2] = e.a("/c_" + i2 + ".png");
        }
        catch (Exception localException2)
        {
        }
      }
      this.ah = new int[this.ag.length][2];
      if (this.ag[0] != null)
      {
        this.ah[0][0] = (-this.ag[0].getWidth());
        this.ah[0][1] = (a - this.ag[0].getHeight() >> 1);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      this.ag = null;
    }
    this.bP = b;
  }

  final void d()
  {
    a("");
  }

  private void A()
  {
    this.ag = null;
    this.I = null;
    this.aB = null;
    this.am = false;
    this.P = 0;
    this.V = false;
    this.W = false;
    i.aw = this.C;
    this.j = this.k;
    i.n();
    if ((i.aw) && (i.bN))
    {
      this.j = -1;
      this.G = null;
      return;
    }
    a(i.a(this.aE[11]), null);
    if (this.G == null)
      a(i.a(this.aE[14]), null);
    if (this.G == null)
      a(i.a(this.aE[15]), null);
    if (this.G == null)
      a(i.a(this.aE[14]), null);
    if (this.G != null)
      this.j = this.k;
    i.t();
  }

  private final void a(Graphics paramGraphics, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (i.n[2] != null)
    {
      i1 = i.n[2].getWidth();
      int i2 = i.n[2].getHeight() >> 1;
      int i3 = f - (i1 >> 1);
      if (this.aH != null)
        i3 = this.aH.getWidth() * 10 / 166 - (i1 >> 1);
      int i4 = 0;
      Image localImage = i.n[2];
      if (paramBoolean2)
      {
        i4 = i2;
        paramInt1 += this.bB;
        if ((this.S) && (i.n[3] != null))
          localImage = i.n[3];
      }
      else
      {
        paramInt1 = paramInt1 -= i2 - this.bB;
        if ((this.T) && (i.n[3] != null))
          localImage = i.n[3];
      }
      i.b(paramGraphics);
      i.a(paramGraphics, i3, paramInt1, i1, i2);
      paramGraphics.drawImage(localImage, i3, paramInt1 - i4, 20);
      i.a(paramGraphics);
      i3 -= 3;
      i1 += 6;
      i2 += 3;
      if (!paramBoolean2)
        paramInt1 -= 3;
      if ((i.a(i3, paramInt1, i1, i2)) && (i.cs))
      {
        if (paramBoolean2)
          this.P = 56;
        else
          this.P = 50;
        i.i = false;
      }
      return;
    }
    if (paramBoolean1)
      paramGraphics.setColor(10223442);
    else
      paramGraphics.setColor(35346);
    int i1 = paramInt2;
    if (!paramBoolean2)
      paramInt1 -= i1;
    a(paramGraphics, f, paramInt1, paramInt2 << 1, i1, paramBoolean2);
  }

  static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramBoolean)
      paramInt1 -= (paramInt3 >> 1);
    if ((i1 = paramInt3 / paramInt4) < 1)
      i1 = 1;
    if ((i2 = i1 >> 1) < 1)
      i2 = 1;
    int i1 = i2 * 2;
    int i2 = -i2;
    if (paramBoolean)
    {
      i2 = -i2;
      i1 = -i1;
    }
    else
    {
      paramInt3 = 1;
    }
    for (int i3 = paramInt2; i3 < paramInt2 + paramInt4; i3++)
    {
      paramGraphics.drawLine(paramInt1, i3, paramInt1 + paramInt3 - 1, i3);
      paramInt1 += i2;
      paramInt3 += i1;
    }
  }

  private boolean g(Graphics paramGraphics)
  {
    if (!this.bI)
      return false;
    try
    {
      this.bg[0].getHeight();
      int i1 = i.cL;
      int i2 = i.cK;
      int i3 = (a - i2 - i1) / 3;
      x.a(paramGraphics, i.l[3][4], f, i3, 17);
      int i4;
      int i5 = i4 = x.b() - x.f;
      int i6 = 0;
      for (int i7 = 0; i7 < this.bg.length; i7++)
      {
        if (i5 < this.bg[i7].getHeight())
          i5 = this.bg[i7].getHeight();
        if (i6 >= this.bg[i7].getWidth())
          continue;
        i6 = this.bg[i7].getWidth();
      }
      i5 += (i5 >> 1);
      i3 += i5;
      int i8 = 3 + (e >> 4);
      int i9 = x.a("  ");
      for (int i10 = 0; i10 < this.bg.length; i10++)
      {
        paramGraphics.drawImage(this.bg[i10], i8, i3, 20);
        x.a(paramGraphics, i.l[3][(5 + i10)], i8 + i6 + i9, i3 + (this.bg[i10].getHeight() - i4 >> 1), 20);
        i3 += i5;
      }
    }
    catch (Exception localException)
    {
      this.P = 53;
    }
    return true;
  }

  private final void B()
  {
    this.bD = System.currentTimeMillis();
    if (this.bD - this.aQ >= 150L)
    {
      this.aP += 1;
      if (this.aP > 2)
        this.aP = 0;
      this.aQ = this.bD;
    }
    u();
    if ((this.t) && (i.b != null))
      if (i.g())
      {
        i.b(1);
        this.bh = System.currentTimeMillis();
        this.ap = 0;
        this.s = true;
        this.t = false;
      }
      else
      {
        i.b(5);
      }
    if ((this.s) && (i.b != null) && (!l.s) && (System.currentTimeMillis() - this.bh > 177L))
    {
      if ((l.c != null) && (this.ap >= 2))
      {
        if (i.c())
        {
          E();
          this.s = false;
          return;
        }
        i.b(2);
        i.b();
        this.s = false;
      }
      if (l.c != null)
      {
        this.ap += 1;
      }
      else
      {
        i.b(4);
        this.s = false;
      }
    }
    long l1 = System.currentTimeMillis();
    this.q += this.r;
    if (this.q <= 110)
      this.r = Math.abs(this.r);
    if (this.q >= 210)
      this.r = (-Math.abs(this.r));
    if (l1 - this.bE > 180L)
    {
      if ((this.Z > 0) || (!this.aK))
      {
        this.aK = (!this.aK);
        this.Z -= 1;
        this.bE = l1;
      }
      if ((this.Z <= 0) && (l1 - this.bE > 580L))
      {
        this.aK = true;
        this.Z = 3;
        this.bE = l1;
      }
    }
    if (l1 - this.bC > 80L)
    {
      this.bB += this.o;
      if (this.bB < 0)
      {
        this.bB = 1;
        this.o = 1;
      }
      if (this.bB > 2)
      {
        this.bB = 1;
        this.o = -1;
      }
      this.bC = l1;
      if (this.aJ != null)
      {
        this.aT += 1;
        if ((this.aT >= this.aJ.length) || (this.aT < 1) || (this.aJ[this.aT] == null))
          this.aT = 1;
        if (this.aJ[this.aT] != null)
          this.aI = this.aJ[this.aT];
      }
    }
    if (i != null)
      try
      {
        long l2 = System.currentTimeMillis();
        if (!i.aw)
        {
          i.repaint();
          i.serviceRepaints();
        }
        else
        {
          i.a();
        }
        long l3 = System.currentTimeMillis();
        i.o();
        if (!i.aw)
          c();
        long l4 = l3 - l2;
        long l5 = 64L;
        if (this.am)
          l5 = 47L;
        if (l4 < l5)
          Thread.sleep(l5 - l4);
        if (this.am)
        {
          l4 = System.currentTimeMillis() - l2;
          this.aj = (int)(l4 * A.b() / 50L);
          this.ai = (int)(l4 * A.b() / 350);
          if (this.ai < 1)
            this.ai = 1;
          if (this.ai > A.b())
            this.ai = A.b();
          if (this.aj < 1)
            this.aj = 1;
          if (this.bP > 0)
            return;
          int i1 = this.ai;
          this.al = false;
          this.ak = false;
          if (this.P != 0)
          {
            i1 = 0;
            switch (this.P)
            {
            case -1:
            case 50:
              i1 = -this.aj;
              this.al = true;
              break;
            case -2:
            case 56:
              i1 = this.aj;
              this.ak = true;
            }
          }
          if (this.ad != i1)
          {
            int i2;
            if ((i2 = Math.abs(this.ad - i1)) > 1)
              i2 = 1;
            if (this.ad < i1)
              this.ad += i2;
            else
              this.ad -= i2;
          }
          if (i.cr)
          {
            if (i.cs)
            {
              this.bi = i.eH;
            }
            else
            {
              this.ad = (-(i.eH - this.bi));
              this.bi = i.eH;
            }
          }
          else
          {
            if (this.ad < -this.aj)
              this.ad = (-this.aj);
            if (this.ad > this.aj)
              this.ad = this.aj;
          }
          if (this.ad < 0)
          {
            if (this.by > 0)
              this.by += this.ad;
            if (this.by < 0)
              this.by = 0;
          }
          else if (!this.ab)
          {
            this.by += this.ad;
          }
          else
          {
            this.by = 0;
          }
        }
        else
        {
          return;
        }
      }
      catch (Exception localException)
      {
      }
  }

  public final void e()
  {
    this.bj = null;
    this.bk = null;
    this.aq = null;
    this.j = -1;
    this.n = true;
    w = false;
    this.v = false;
    this.bH = false;
    this.ao = an;
    u = false;
    if (an)
    {
      this.P = 0;
      i.aw = false;
      try
      {
        this.at = e;
        this.j = 0;
        this.aq = e.a(i.a(this.aE[0]));
        x();
        this.aq = null;
        Thread.sleep(330L);
      }
      catch (Exception localException1)
      {
      }
      h();
      if (!this.n)
        return;
      if (this.P == 42)
        i.r = false;
      if (this.P == 48)
        i.r = false;
      try
      {
        this.aq = null;
        Thread.sleep(33L);
        this.aq = e.a(i.a(this.aE[1]));
        if (this.aq != null)
        {
          this.at = e;
          this.j = 0;
          x();
          this.aq = null;
          Thread.sleep(330L);
        }
      }
      catch (Exception localException2)
      {
      }
      i();
      i.aw = false;
      e.d = 0;
      q();
    }
    else
    {
      w();
    }
    this.bk = null;
    this.bj = null;
    this.P = 0;
    this.W = false;
    this.V = true;
    this.j = -1;
    this.aq = null;
    if (an)
      o();
    an = false;
    try
    {
      Thread.sleep(33L);
    }
    catch (Exception localException3)
    {
    }
    this.C = i.aw;
    this.k = this.j;
    if (!this.am)
      A();
    i.v();
    if (this.bm == null)
      try
      {
        this.bm = e.a(i.a(this.aE[2]));
      }
      catch (Exception localException4)
      {
      }
    if (this.aH == null)
      try
      {
        this.aH = e.a(i.a(this.aE[3]));
        this.bN = e;
        this.bM = (e - this.aH.getWidth() >> 1);
        this.bL = this.bN;
        this.aI = e.a(i.a(this.aE[4]));
        this.aJ = new Image[5];
        this.aJ[1] = this.aI;
        for (i1 = 2; i1 < this.aJ.length; i1++)
          this.aJ[i1] = e.a(i.a(this.aE[5]) + i1 + i.a(this.aE[6]));
      }
      catch (Exception localException5)
      {
      }
    if (this.U == null)
      try
      {
        this.U = e.a(i.a(this.aE[7]));
      }
      catch (Exception localException6)
      {
      }
    if (this.bd == null)
      try
      {
        this.bd = e.a(i.a(this.aE[8]));
      }
      catch (Exception localException7)
      {
      }
    C();
    u = false;
    int i1 = 0;
    if (this.ao)
      i1 = 3;
    c(i1);
    this.aM = i1;
    this.P = 0;
    this.n = true;
    this.bH = true;
    if (B)
    {
      this.aY = 1;
      d();
      B = false;
    }
    if (bw != null)
    {
      this.aY = 5;
      d();
      bw = null;
    }
    if (this.bd == null)
      try
      {
        this.bd = e.a(i.a(this.aE[8]));
      }
      catch (Exception localException8)
      {
      }
    this.az = true;
    long l1 = 0L;
    while ((this.n) || (this.am))
    {
      if (w)
        return;
      this.T = false;
      this.S = false;
      try
      {
        if (this.P != 0)
        {
          long l2;
          if ((l2 = System.currentTimeMillis() - l1) >= this.bn * 3L)
            this.bn = 0L;
          else
            this.bn = ((this.bn * 3L - l2) / 3L);
          if (!this.am)
            for (int i2 = 0; i2 < this.bn; i2++)
            {
              try
              {
                Thread.sleep(3L);
              }
              catch (Exception localException9)
              {
              }
              if ((this.P == 0) || (this.X))
                break;
            }
          if (this.P != 0)
            s();
          this.bn = this.bp;
          if (this.X)
          {
            this.X = false;
            this.bn = this.bo;
          }
          l1 = System.currentTimeMillis();
        }
        if ((this.n) || (this.am))
          B();
        Thread.sleep(3L);
      }
      catch (Exception localException10)
      {
      }
    }
    if ((i.D) && (f.D != 1L))
    {
      if (af == null)
        af = n();
      i.e();
      i.bn = 0;
      i.cH = true;
      i.dy = true;
      i.q();
    }
    i.a = null;
    this.aB = null;
    this.aC = null;
    this.aq = null;
    this.G = null;
    this.aH = null;
    this.aI = null;
    this.aJ = null;
    this.U = null;
    i.h();
  }

  private final void C()
  {
    bf = false;
  }

  private static void D()
  {
    boolean bool1 = e.k;
    boolean bool2 = e.n;
    boolean bool3 = e.g;
    boolean bool4 = i.cz;
    int i1 = m.v;
    int i2 = e.d;
    e.a();
    e.k = bool1;
    e.n = bool2;
    e.g = bool3;
    i.cz = bool4;
    m.v = i1;
    e.b();
    e.d = i2;
  }

  private final void b(Graphics paramGraphics, d paramd, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramGraphics == null) || (paramString == null) || (paramString.length() <= 1) || (this.U == null))
      return;
    int i1 = 0;
    int i2 = 0;
    if (paramInt2 >= b)
      i2 = a - this.U.getHeight();
    if (paramInt1 >= f)
      i1 = e - paramd.a(paramString + " ");
    else
      i1 = -(this.U.getWidth() - paramd.a(paramString + " "));
    paramGraphics.drawImage(this.U, i1, i2, 20);
  }

  private final void E()
  {
    e.d = i.cb;
    if (e.d < 1)
      e.d = 1;
    m();
  }

  final boolean f()
  {
    if (this.bF < 0)
    {
      this.bF = 0;
      try
      {
        Image localImage;
        Graphics localGraphics;
        (localGraphics = (localImage = Image.createImage(1, 1)).getGraphics()).setColor(16777215);
        localGraphics.fillRect(0, 0, 1, 1);
        i.a(localGraphics, 0, 0, 1, 1, 0, 127);
        int[] arrayOfInt = new int[1];
        localImage.getRGB(arrayOfInt, 0, 1, 0, 0, 1, 1);
        int i1;
        if (((i1 = arrayOfInt[0] & 0xFF) > 96) && (i1 < 160))
          this.bF = 1;
      }
      catch (Exception localException)
      {
      }
    }
    return this.bF > 0;
  }

  private boolean a(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      if (paramArrayOfByte[paramInt] > 0)
        return true;
      if (paramArrayOfByte[paramInt] < 0)
        return false;
      paramArrayOfByte[paramInt] = -1;
      e.a(i.cd, paramArrayOfByte);
      i.p();
      try
      {
        Class.forName("javax.microedition.io.Connector");
        Class.forName("javax.bluetooth.DiscoveryAgent");
        B();
        paramArrayOfByte[paramInt] = 1;
        e.a(i.cd, paramArrayOfByte);
        return true;
      }
      catch (Exception localException1)
      {
        B();
      }
      catch (Throwable localThrowable)
      {
        B();
      }
    }
    catch (Exception localException2)
    {
      return false;
    }
    return false;
  }

  private boolean F()
  {
    return a(e.a, 31);
  }

  private boolean G()
  {
    try
    {
      return i.hasPointerEvents();
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

  private final void H()
  {
    int i1 = this.bA;
    for (int i2 = 0; i2 < 7; i2++)
    {
      try
      {
        b(null);
      }
      catch (Exception localException)
      {
      }
      if (this.bA == i1)
        return;
      i1 = this.bA;
    }
  }

  static final void g()
  {
    e = i.getWidth();
    a = i.getHeight();
    f = e >> 1;
    b = a >> 1;
  }

  private static boolean I()
  {
    return (e.a[9] > 1) || (e.a[8] != 0);
  }

  private static String[] a(String[] paramArrayOfString, boolean[] paramArrayOfBoolean)
  {
    String[] arrayOfString = paramArrayOfString;
    if ((J == null) || (J.length != paramArrayOfString.length))
    {
      J = new int[paramArrayOfString.length];
      for (int i1 = 0; i1 < J.length; i1++)
        J[i1] = i1;
    }
    int[] arrayOfInt = J;
    int i2 = arrayOfString.length;
    for (int i3 = 0; (i3 < paramArrayOfBoolean.length) && (i3 < arrayOfString.length); i3++)
    {
      if (paramArrayOfBoolean[i3] == 0)
        continue;
      i2--;
    }
    paramArrayOfString = new String[i2];
    J = new int[i2];
    int i4 = 0;
    for (int i5 = 0; (i5 < arrayOfString.length) && (i4 < paramArrayOfString.length); i5++)
    {
      if ((i5 < paramArrayOfBoolean.length) && (paramArrayOfBoolean[i5] != 0))
        continue;
      paramArrayOfString[i4] = arrayOfString[i5];
      J[i4] = arrayOfInt[i5];
      i4++;
    }
    return paramArrayOfString;
  }

  private void h(Graphics paramGraphics)
  {
    try
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, e, a);
      if (this.at < e)
      {
        int i1 = (a >> 3) * 3 - (this.aq.getHeight() >> 1);
        if ((this.H == null) && (this.at < 0))
          i1 = a - this.aq.getHeight() >> 1;
        paramGraphics.drawImage(this.aq, (e >> 1) - (this.aq.getWidth() >> 1), i1, 20);
        if (this.at >= 0)
        {
          if (this.H != null)
            paramGraphics.drawImage(this.H, (e >> 1) - (this.H.getWidth() >> 1), a - (a >> 3) - (this.H.getHeight() >> 1), 20);
          paramGraphics.setColor(185, 185, 185);
          paramGraphics.fillRect((e >> 1) - (this.at >> 1) - (this.at >> 2), a - (a >> 4), this.at + (this.at >> 1), 1);
          int i2 = 640 / this.at;
          int i3 = 640 / this.at;
          int i4 = 640 / this.at;
          int i5 = 740;
          int i6 = 740;
          int i7 = 740;
          for (int i8 = 0; i8 < this.at; i8 = (short)(i8 + 1))
          {
            i5 -= i2;
            i6 -= i3;
            i7 -= i4;
            paramGraphics.setColor(i5 >> 2, i6 >> 2, i7 >> 2);
            paramGraphics.fillRect((e >> 1) - (this.at >> 1) - i8 - 1, a - (a >> 4), 1, 1);
            paramGraphics.fillRect((e >> 1) + (this.at >> 1) + i8, a - (a >> 4), 1, 1);
          }
        }
      }
      else
      {
        paramGraphics.drawImage(this.aq, (e >> 1) - (this.aq.getWidth() >> 1), (a >> 1) - (this.aq.getHeight() >> 1), 20);
      }
      if (this.ar > 0)
        i.a(paramGraphics, 0, 0, e, a, this.as, this.ar);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}