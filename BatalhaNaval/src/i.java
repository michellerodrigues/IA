import com.nokia.mid.ui.DeviceControl;
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class i extends a
  implements Runnable
{
  static l b;
  int c = getHeight();
  int d;
  int e;
  int f;
  int g = getWidth();
  int h = this.g >> 1;
  static boolean i;
  int j;
  boolean k;
  static String[][] l;
  Image m;
  Image[] n;
  static boolean o;
  static int p;
  Image[] q;
  static boolean r;
  boolean s;
  String[] t;
  Image[] u;
  int v;
  int w;
  int x;
  int y;
  static byte[] z;
  byte[] A;
  boolean B = true;
  boolean C = false;
  boolean D;
  int E;
  long F;
  short[][] G;
  int H;
  int I;
  static byte[] J;
  int K;
  boolean L = false;
  boolean M;
  boolean N;
  static int O;
  static int P;
  short[][] Q;
  int R;
  boolean S;
  int T;
  int U;
  Image V;
  static byte W;
  static byte X;
  static boolean Y;
  int[] Z;
  int[] aa;
  int[] ab;
  int[] ac;
  int[] ad;
  int[] ae;
  Image af;
  boolean ag = false;
  boolean ah = false;
  boolean ai = false;
  boolean aj = false;
  boolean ak;
  int al;
  int am;
  boolean an;
  int ao;
  byte[][] ap;
  boolean aq;
  static boolean ar;
  d as;
  static d at;
  static byte[] au;
  boolean av = false;
  boolean aw;
  static i ax;
  static int ay;
  Image[] az;
  static boolean aA;
  int aB;
  int aC;
  int aD;
  boolean aE;
  boolean aF;
  String[] aG;
  int aH;
  int aI;
  int aJ;
  int aK;
  int aL;
  int aM;
  int aN;
  int aO;
  int aP;
  Image[] aQ;
  boolean aR;
  boolean aS;
  int aT;
  int aU;
  int aV;
  int aW;
  int aX;
  int aY;
  int aZ;
  int ba;
  int bb;
  boolean bc;
  boolean bd;
  int be;
  int[] bf;
  int[] bg;
  int[] bh;
  int bi;
  int bj;
  int bk;
  int bl;
  static int bm;
  int bn;
  int bo;
  int bp;
  boolean bq;
  long br;
  static int bs;
  static int bt;
  static String[][] bu;
  long bv;
  long bw;
  int bx;
  static byte by;
  int bz;
  int bA;
  byte[][] bB;
  byte[][] bC;
  byte[][] bD;
  byte[][] bE;
  boolean[] bF;
  boolean[] bG;
  boolean[] bH;
  byte[][] bI;
  byte[][] bJ;
  static int bK;
  int bL = 0;
  int bM = 0;
  static boolean bN;
  h bO;
  boolean bP;
  int bQ;
  int bR;
  int bS;
  int bT;
  int bU;
  int bV;
  long bW;
  boolean bX;
  boolean bY;
  boolean bZ;
  static boolean ca;
  private Random eR = new Random();
  static byte cb;
  int cc;
  static String cd;
  String ce;
  String cf;
  static boolean cg;
  static final boolean[] ch;
  static boolean ci;
  static final boolean[] cj;
  int ck;
  static boolean cl;
  int cm;
  long cn;
  long co;
  boolean cp;
  boolean cq;
  static boolean cr;
  static boolean cs;
  static boolean ct;
  int cu;
  int cv;
  static int cw;
  static int cx;
  static boolean cy;
  static boolean cz;
  int[] cA;
  static int cB;
  int[] cC;
  boolean cD;
  boolean cE;
  boolean cF;
  static boolean cG;
  boolean cH;
  boolean cI;
  static boolean cJ;
  int cK;
  int cL;
  static boolean cM;
  boolean cN;
  boolean cO = false;
  boolean cP;
  long cQ;
  long cR;
  int cS;
  int cT;
  int cU;
  int cV;
  static byte cW;
  static int cX;
  long cY;
  boolean cZ;
  int da;
  int db;
  int dc = this.de;
  Image[][] dd;
  int de = 20;
  Image[][] df;
  static int dg;
  static int dh;
  static int di;
  static int dj;
  int dk;
  int dl;
  static boolean dm;
  long dn;
  boolean jdField_do;
  int dp;
  Image dq;
  boolean dr;
  boolean ds;
  int dt;
  boolean du;
  static boolean dv = true;
  int[] dw;
  static boolean dx;
  boolean dy;
  boolean dz;
  boolean dA;
  static boolean dB;
  Thread dC;
  long dD;
  long dE;
  long dF;
  long dG;
  static long dH;
  static long dI;
  String[][] dJ;
  long dK;
  long dL;
  long dM;
  static long dN;
  long dO;
  int dP;
  static int dQ;
  int dR;
  boolean dS;
  Image[] dT;
  long dU;
  static boolean dV;
  int dW;
  String dX;
  int dY;
  int dZ;
  boolean ea;
  boolean eb;
  int ec;
  int ed;
  int ee;
  boolean ef = false;
  static byte eg;
  Image eh;
  long ei;
  long ej;
  long ek;
  int el = 0;
  int em;
  int en = this.eo;
  int eo = this.g / this.de;
  int ep = 9;
  static int eq;
  static int er;
  int es = 0;
  int et;
  int eu;
  int ev;
  int ew;
  int ex;
  int ey;
  int ez;
  int eA = 0;
  int eB;
  int eC;
  int eD = this.eE;
  int eE = this.c / this.dc;
  int eF = 9;
  static int eG;
  static int eH;
  static int eI;
  int eJ = 0;
  int eK;
  int eL;
  int eM;
  int eN;
  int eO;
  int eP;
  int eQ;

  static
  {
    cG = true;
    cy = false;
    cz = false;
    dV = true;
    r = true;
    cM = true;
    ci = true;
    dm = false;
    cW = 1;
    Y = false;
    ca = false;
    X = 1;
    dB = false;
    cg = true;
    aA = false;
    bs = 1024;
    cd = "SWMc";
    bm = 8;
    bt = 15;
    W = X;
    bN = false;
    dQ = 0;
    ar = false;
    eG = 0;
    dx = true;
    cj = new boolean[] { false, false, true, true, true, true, true, true, true };
    ch = new boolean[] { false, false, true, true, true, true, true, true, false };
    o = false;
    p = 15330811;
    au = new byte[''];
    z = new byte[bs];
    i = false;
    cl = false;
    cJ = false;
    cs = false;
    ct = false;
    cr = false;
    cB = 256;
    P = cB;
    O = cB;
    J = new byte[1024];
    ay = 1;
  }

  public i()
  {
    Runtime.getRuntime();
    this.eC = 0;
    this.aw = false;
    this.D = false;
    this.n = new Image[4];
    new int[] { 1296389185, 759778886, 793592142, 1229342035 }[4] = 1412320582;
    new int[] { 1399874915, 1768319331, 1635019119 }[3] = 1845493760;
    new int[] { 1296647248 }[1] = 758263344;
    new int[1][0] = 1684368640;
    new int[1][0] = 1819934720;
    this.ap = new byte[][] { { 99, 102, 50 }, { 102, 110, 116, 50 }, { 50 }, { 115, 116 }, { 116, 108, 107 }, { 110, 109 }, { 47, 97, 114, 46, 112, 110, 103 }, { 47, 97, 114 }, { 46, 112, 110, 103 }, { 47, 122, 118, 122, 46, 112, 110, 103 }, { 46, 106, 112, 103 }, { 47, 108 }, { 47, 117 }, { 99, 99, 51 }, { 99, 117, 51 }, { 109, 117, 97 }, { 47, 105, 108, 49, 46, 112, 110, 103 }, { 47, 105, 108, 50, 46, 112, 110, 103 }, { 47, 105, 108, 51, 46, 112, 110, 103 }, { 47, 105, 108, 108, 46, 112, 110, 103 }, { 47, 105, 108, 119, 46, 112, 110, 103 }, { 47, 101, 108, 48, 46, 112, 110, 103 }, { 47, 101, 108, 49, 46, 112, 110, 103 }, { 47, 105, 108, 108, 119, 46, 112, 110, 103 } };
    this.N = false;
    this.bk = 8;
    this.K = 0;
    this.H = 11;
    this.T = 0;
    this.U = 0;
    this.M = true;
    this.bz = 255;
    this.dL = 0L;
    this.al = 0;
    this.am = 0;
    this.bP = false;
    this.aB = this.c;
    this.dy = false;
    this.cH = false;
    this.cE = false;
    this.cq = false;
    this.cp = false;
    this.s = false;
    this.aq = false;
    this.dY = 0;
    this.dZ = 3;
    this.ea = false;
    this.ei = 0L;
    this.eb = false;
    this.ej = 0L;
    this.bA = 0;
    this.ek = 0L;
    this.cc = 1;
    this.ao = 0;
    this.ab = new int[] { -1, -1 };
    this.ad = new int[] { -1, -1 };
    this.ac = new int[] { 0, 0 };
    this.ae = new int[] { 0, 0 };
    this.Z = new int[] { 0, 0 };
    this.aa = new int[] { 0, 0 };
    this.an = false;
    this.cZ = false;
    this.bY = false;
    this.bZ = false;
    this.R = 2;
    this.S = false;
    this.ak = true;
    this.dU = 0L;
    this.cD = false;
    this.cN = true;
    this.bb = 4;
    this.d = (this.c >> 1);
    this.bx = 500;
    this.ez = 5;
    this.ec = (this.g - 2 * this.ez);
    this.ed = 0;
    this.ee = 0;
    this.bn = 0;
    this.dF = 1700L;
    this.f = 0;
    this.bj = 3;
    this.cL = 0;
    this.cK = 0;
    this.aI = 2;
    this.aH = 2;
    this.aP = 3;
    this.aK = 3;
    this.aF = false;
    this.aE = false;
    this.ds = false;
    this.cf = (cd + "s");
    this.dw = new int[32];
    this.du = false;
    this.dt = 0;
    this.dp = 4;
    this.aC = 0;
    this.aD = this.c;
    this.bf = new int[4];
    this.bh = new int[4];
    this.bg = new int[4];
    this.be = 4;
    this.bi = 7;
    this.dl = 8;
    this.bl = 32;
    this.da = -1;
    this.db = -1;
    this.ce = (cd + "m");
    this.bX = false;
    this.jdField_do = false;
    this.dP = -1;
    this.e = 35;
    this.aS = false;
    this.aT = 0;
    this.aU = 0;
    this.bG = new boolean[64];
    this.bH = new boolean[this.bG.length];
    this.bF = new boolean[this.bG.length];
    this.bc = true;
    this.bd = false;
    this.aR = false;
    this.j = 0;
    this.bo = 0;
    this.w = 2;
    this.bp = -1;
    dx = true;
    h.a();
    h.e = this.g;
    h.a = this.c;
  }

  private boolean y()
  {
    return l.b ^ this.aR;
  }

  final void a()
  {
    this.dD = System.currentTimeMillis();
    if (this.bP)
      try
      {
        Thread.sleep(33L);
        return;
      }
      catch (Exception localException1)
      {
        return;
      }
    as();
    if (this.dD - this.bW >= 150L)
    {
      this.bV += 1;
      if (this.bV > 2)
        this.bV = 0;
      this.bW = this.dD;
    }
    this.F += 1L;
    aK();
    aI();
    ay();
    if (this.aw)
    {
      aE();
      P();
    }
    Y();
    if (this.ag)
    {
      repaint();
      serviceRepaints();
      return;
    }
    long l1 = System.currentTimeMillis();
    aH();
    if ((this.aw) && (ca))
      ad();
    if (this.aw)
    {
      aw();
      aC();
      z();
    }
    if (this.aw)
    {
      au();
      aj();
      aA();
    }
    az();
    int i1 = this.bL;
    int i2 = this.bM;
    if (this.dY > 0)
    {
      this.bL += this.eR.nextInt() % this.dZ;
      this.bM += this.eR.nextInt() % this.dZ;
      this.dY -= 1;
    }
    aB();
    repaint();
    serviceRepaints();
    o();
    if (this.aw)
      af();
    this.bL = i1;
    this.bM = i2;
    ah();
    ai();
    ak();
    System.currentTimeMillis();
    long l2;
    long l3 = (l2 = System.currentTimeMillis()) - l1;
    long l4;
    long l5;
    if ((l5 = l4 = 70L) < this.cn)
      l5 = this.cn;
    if (l3 < l5)
      try
      {
        Thread.sleep(l5 - l3);
        return;
      }
      catch (Exception localException2)
      {
      }
  }

  private final boolean b(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte;
    int i1 = (arrayOfByte = J).length;
    try
    {
      if (this.j + paramArrayOfByte.length <= i1)
      {
        int i2 = this.j;
        for (int i3 = 0; i3 < paramArrayOfByte.length; i3++)
        {
          arrayOfByte[i2] = paramArrayOfByte[i3];
          i2++;
        }
        this.j += paramArrayOfByte.length;
      }
      else
      {
        return false;
      }
    }
    catch (Exception localException)
    {
    }
    return true;
  }

  private final boolean c(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1;
    int i1 = (arrayOfByte1 = J).length;
    try
    {
      if (this.j + paramArrayOfByte.length <= i1)
      {
        byte[] arrayOfByte2 = new byte[i1];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramArrayOfByte.length, i1 - paramArrayOfByte.length);
        for (int i2 = 0; i2 < paramArrayOfByte.length; i2++)
          arrayOfByte2[i2] = paramArrayOfByte[i2];
        J = arrayOfByte2;
        this.j += paramArrayOfByte.length;
      }
      else
      {
        return false;
      }
    }
    catch (Exception localException)
    {
    }
    return true;
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == paramInt2)
      return paramInt1;
    if ((paramInt3 = Math.abs(paramInt3)) > Math.abs(paramInt1 - paramInt2))
      paramInt3 = Math.abs(paramInt1 - paramInt2);
    if (paramInt1 < paramInt2)
      paramInt1 += paramInt3;
    if (paramInt1 > paramInt2)
      paramInt1 -= paramInt3;
    return paramInt1;
  }

  private final void z()
  {
    int i1;
    if ((i1 = this.g >> 3) < 1)
      i1 = 1;
    int i2;
    if ((i2 = this.aV >> 3) < 1)
      i2 = 1;
    this.ew = a(this.ew, this.ev, i1);
    this.eN = a(this.eN, this.eM, i1);
    this.ey = a(this.ey, this.ex, i1);
    this.eP = a(this.eP, this.eO, i1);
    this.aY = a(this.aY, this.aX, i2);
    this.ba = a(this.ba, this.aZ, i2);
    this.eu = a(this.eu, this.et, i1);
    this.eL = a(this.eL, this.eK, i1);
  }

  private static int a(byte paramByte)
  {
    int i1 = paramByte;
    if (paramByte < 0)
      i1 = 256 + paramByte;
    return i1;
  }

  private void a(Graphics paramGraphics, d paramd)
  {
    boolean bool = l.g;
    c(paramGraphics);
    int i1;
    int i2;
    if ((this.t != null) && (this.t.length > 0) && (((this.bp != 5) && (this.bp != 6)) || (b == null) || (l.s)))
    {
      bool = true;
      i1 = 1 + this.cL;
      for (i2 = 0; i2 < this.t.length; i2++)
      {
        if (this.t[i2] != null)
          paramd.a(paramGraphics, this.t[i2], 1, i1, 20);
        i1 += paramd.b();
      }
    }
    if ((this.u != null) && (this.u[0] != null) && (this.u[1] != null) && (bool))
    {
      i1 = 0;
      if (b != null)
        if (l.g)
        {
          i1 = 1;
        }
        else if (((this.bp == 1) || (this.bp == 0)) && (l.s))
        {
          this.v += 1;
          if (this.v > 3)
          {
            this.v = 0;
            this.x += 1;
            if (this.x > 1)
              this.x = 0;
          }
          i1 = this.x;
        }
      i2 = this.g - this.u[i1].getWidth();
      if ((i1 == 0) && (this.bp == 5))
      {
        this.y += this.w;
        if (this.y >= this.u[i1].getWidth())
        {
          this.w = (-Math.abs(this.w));
          this.y += this.w;
        }
        if (this.y < 0)
        {
          this.w = Math.abs(this.w);
          this.y += this.w;
        }
        i2 += this.y;
      }
      if (i2 < this.g)
        paramGraphics.drawImage(this.u[i1], i2, 0, 20);
    }
  }

  private final void A()
  {
    byte[] arrayOfByte;
    int i1 = (arrayOfByte = J).length;
    if (this.j < i1)
    {
      int i2 = this.j - 1;
      int i3 = -1;
      do
      {
        arrayOfByte[i2] = 0;
        i2++;
        if (i2 >= i1)
          break;
        i3++;
      }
      while (i3 < 8);
    }
  }

  final void b()
  {
    if (!ca)
      return;
    int i1 = 0;
    if ((b != null) && (l.g) && (!l.b))
    {
      long l1 = System.currentTimeMillis();
      while (l.g)
      {
        if ((l.r) && (l.g))
        {
          b.i[0] = 125;
          l.r = false;
          i1 = 1;
        }
        try
        {
          Thread.sleep(7L);
        }
        catch (Exception localException)
        {
        }
        if (System.currentTimeMillis() - l1 > 777L)
          break;
      }
    }
    if (b != null)
    {
      b.h[0] = 0;
      b.i[0] = 0;
    }
    B();
    if (i1 != 0)
      b(-1);
  }

  private void B()
  {
    if (l.g)
      b(3);
    b.a();
    b.v = null;
    l.c = null;
  }

  private final void C()
  {
    this.dA = false;
    this.ab[0] = -1;
    this.ad[0] = -1;
    this.ac[0] = -1;
    this.ae[0] = -1;
    this.Z[0] = 0;
    this.aa[0] = 0;
    this.ab[1] = -1;
    this.ad[1] = -1;
    this.ac[1] = -1;
    this.ae[1] = -1;
    this.Z[1] = 0;
    this.aa[1] = 0;
    if (!ca)
      this.an = false;
  }

  private final void D()
  {
    this.ew = (this.h >> 1);
    this.eN = (this.d >> 1);
    this.ey = (this.h >> 1);
    this.eP = (this.d >> 1);
    this.aY = 0;
    this.ba = 0;
  }

  private final void d(Graphics paramGraphics)
  {
    int i1 = getWidth();
    int i2 = getHeight();
    d locald = h.A;
    String str1 = l[5][0];
    int i7 = 0;
    int i8 = l[2].length;
    int i4;
    if (this.T <= 0)
    {
      i7 = 1;
      for (i3 = 0; i3 < i8; i3++)
      {
        if ((i4 = locald.a(l[2][i3])) <= this.T)
          continue;
        this.T = i4;
      }
      if ((i4 = locald.a(str1)) > this.T)
        this.T = i4;
    }
    if (this.U == 0)
      this.U = this.T;
    if (i7 != 0)
    {
      if ((i4 = locald.a(l[11][0] + l[11][1] + "  ")) > this.T)
        this.T = i4;
      i9 = locald.a("   ");
      if (this.T + i9 < i1 - (i9 >> 1))
        this.T += i9;
    }
    int i9 = 0;
    int i10 = locald.b() - locald.f + 4;
    if ((this.aQ != null) && (this.aQ.length > 2) && (this.aQ[1] != null))
    {
      i11 = this.G[3][5];
      if (i10 < i11)
        i10 = i11;
      i9 = 1;
    }
    int i11 = this.H;
    int i12;
    if ((i12 = cj.length) < i11)
      i12 = i11;
    if (i12 < ch.length)
      i12 = ch.length;
    if (i12 < i11)
      i12 = i11;
    boolean[] arrayOfBoolean = new boolean[i12];
    if (!cM)
      arrayOfBoolean[6] = true;
    if (X < 1)
      arrayOfBoolean[3] = true;
    if (ci)
      arrayOfBoolean[2] = true;
    if (cW > 1)
      arrayOfBoolean[5] = true;
    for (int i3 = 0; i3 < arrayOfBoolean.length; i3++)
    {
      if ((ca) && (i3 < cj.length) && (cj[i3] != 0))
        arrayOfBoolean[i3] = true;
      if ((i3 < ch.length) && (ch[i3] != 0))
        arrayOfBoolean[i3] = true;
      if (arrayOfBoolean[i3] == 0)
        continue;
      i11--;
    }
    if (this.N)
      i11 = 1;
    int i13 = i2 >> 4;
    int i14 = i2 >> 1;
    int i15 = i2;
    int i16 = 5;
    if ((this.n != null) && (this.n[2] != null))
      i16 = this.n[2].getHeight() >> 1;
    if (i15 -= i16 * 4 > i2 - 2 * i13 - i16 * 4)
      i15 = i2 - 2 * i13 - i16 * 4;
    if (i15 > i14)
      i15 = i14;
    int i17;
    if ((i17 = i15 / i10) < 2)
      i17 = 2;
    if (this.bk > i17)
      this.bk = i17;
    if (i11 > this.bk)
      i11 = this.bk;
    int i18 = i10 * i11;
    if ((i9 == 0) && (i18 >= i2))
      i18 = (i10 = locald.b() + 2) * i11;
    i18 += 0;
    int i19 = this.eC + (i2 - i18) / 2;
    paramGraphics.setFont(h.y);
    int i20 = paramGraphics.getColor();
    if ((this.n != null) && (this.n[2] != null))
      this.n[2].getHeight();
    if (!this.N)
    {
      a(paramGraphics, i19 - 7 - 1, 5, false, false);
      a(paramGraphics, i19 - 7 + i18 + 7 + 7 - 1 + 1, 5, false, true);
      int i21 = i19 - 7 - 1;
      int i22 = i19 - 7 + i18 + 7 + 7 - 1 + 1;
      if (c(0, this.cL, i1, i21 - this.cL))
        keyPressed(50);
      if (c(0, i22, i1, i2 - this.cK - i22))
        keyPressed(56);
    }
    paramGraphics.setColor(h.z);
    i19 += (i10 - (locald.b() - locald.f) >> 1);
    if (!this.N)
    {
      if (this.dk > this.K)
        this.dk = this.K;
      this.dk -= 1;
      i23 = 0;
      do
      {
        this.dk += 1;
        i24 = 0;
        for (i3 = this.dk; (i3 < this.H) && (i24 < i11); i3++)
        {
          if (i3 == this.K)
            break;
          if ((i3 >= 0) && (i3 <= arrayOfBoolean.length) && (arrayOfBoolean[i3] != 0))
            continue;
          i24++;
        }
      }
      while (this.dk < this.H);
    }
    int i23 = 0;
    int i24 = this.dk;
    if (this.N)
      i24 = 0;
    for (i3 = i24; (i3 < this.H) && (i23 < i11); i3++)
    {
      if ((i3 >= 0) && (i3 <= arrayOfBoolean.length) && (arrayOfBoolean[i3] != 0))
        continue;
      i23++;
      i4 = i3;
      String str3 = "";
      if ((i3 == 1) && (!e.k))
        i4 = i8 - 1 - 4;
      if ((i3 == 2) && (!e.g))
        i4 = i8 - 2 - 4;
      if ((i3 == 5) && (Y))
        i4 = i8 - 3 - 4;
      paramGraphics.setColor(0);
      str2 = l[2][i4] + str3;
      if (this.N)
        str2 = str1;
      if ((i3 == 3) && (W > 0))
        str2 = l[2][(i8 - 1 - 2 + W)];
      if ((this.M) && (this.C))
        for (int i6 = -1; i6 <= 1; i6++)
          for (int i5 = -1; i5 <= 1; i5++)
          {
            if (((i5 == 0) && (i6 == 0)) || ((this.B) && (i5 != 0) && (i6 != 0)))
              continue;
            locald.a(paramGraphics, str2, this.h - (locald.a(str2) >> 1) + i5, i19 + i6, 20);
          }
      if ((i3 == this.K) || (this.N))
        if (i9 != 0)
        {
          b(paramGraphics, 5 + this.bV, this.h, i19 + (locald.b() - locald.f >> 1), 3);
        }
        else
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(0, i19 - 3 + 1, i1, locald.b() - locald.f + 6);
          paramGraphics.setColor(p);
          paramGraphics.fillRect(0, i19 - 2 + 1, i1, locald.b() - locald.f + 4);
        }
      if ((a(0, i19 - 2 + 1, i1, i10)) && (i3 != this.K) && (!this.N))
        this.K = i3;
      if (b(0, i19 - 2 + 1, i1, i10))
      {
        if ((i3 != this.K) && (!this.N))
          this.K = i3;
        n(53);
      }
      paramGraphics.setColor(h.z);
      locald.a(paramGraphics, str2, this.h - (locald.a(str2) >> 1), i19, 20);
      i19 += i10;
    }
    String str2 = null;
    paramGraphics.setColor(i20);
    this.M = false;
  }

  final boolean c()
  {
    if (!ca)
      return false;
    if ((!l.s) && (l.c != null))
    {
      l.b = false;
      b.m = 0;
      b.b();
      if (!l.b)
      {
        if ((bN) && (this.bO != null))
        {
          this.bO.P = 0;
          this.bO.V = true;
          this.bO.W = false;
        }
        else
        {
          R();
        }
        while (true)
        {
          try
          {
            Thread.sleep(7L);
          }
          catch (Exception localException)
          {
          }
          if (b.m == 1)
            break;
          int i1 = this.aT;
          if ((bN) && (this.bO != null))
            i1 = this.bO.P;
          if ((i1 == 35) || (i1 == -7))
          {
            b();
            b(-1);
            return false;
          }
          if (b.m == -1)
            return false;
        }
        if ((bN) && (this.bO != null))
        {
          this.bO.P = 0;
          this.bO.V = true;
          this.bO.W = false;
        }
        else
        {
          R();
        }
      }
    }
    return l.g;
  }

  private static int f(int paramInt)
  {
    return paramInt;
  }

  private final void E()
  {
    if (!ca)
      return;
    if (!l.b)
    {
      for (int i2 = 0; i2 <= this.eF; i2++)
        for (int i3 = 0; i3 <= this.ep; i3++)
        {
          int i1 = this.bB[i3][i2];
          this.bB[i3][i2] = this.bC[i3][i2];
          this.bC[i3][i2] = i1;
          i1 = this.bI[i3][i2];
          this.bI[i3][i2] = this.bJ[i3][i2];
          this.bJ[i3][i2] = i1;
        }
      this.S = false;
      boolean bool = this.bY;
      this.bY = this.bZ;
      this.bZ = bool;
    }
    this.an = (!l.b);
    if (!this.bZ)
    {
      this.f = 1;
      this.R = 2;
      return;
    }
    this.f = 0;
    this.R = 1;
  }

  private final void F()
  {
    if (this.q != null)
      return;
    if (this.q == null)
      this.q = new Image[12];
    for (int i1 = 0; i1 < this.q.length; i1++)
      try
      {
        try
        {
          if (this.q[i1] == null)
          {
            this.q[i1] = e.a("/f" + i1 + ".png");
            if ((i1 <= 4) || (i1 >= 8))
              this.q[i1] = e.a(this.q[i1]);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError1)
        {
          this.q[i1] = null;
        }
      }
      catch (Exception localException1)
      {
      }
    try
    {
      try
      {
        if ((this.q[4] != null) && (this.q[4].getWidth() < this.g))
          this.q[4] = e.a(this.q[4], 0, 0, this.q[4].getWidth(), this.q[4].getHeight(), this.g, this.q[4].getHeight(), 0, false, true);
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
        return;
      }
    }
    catch (Exception localException2)
    {
    }
  }

  final void b(int paramInt)
  {
    if (this.u == null)
    {
      this.u = new Image[2];
      for (i1 = 0; i1 < this.u.length; i1++)
        try
        {
          this.u[i1] = e.a("/bt" + i1 + ".png");
        }
        catch (Exception localException1)
        {
        }
    }
    this.bp = paramInt;
    if (paramInt < 0)
    {
      this.t = null;
      return;
    }
    int i1 = paramInt + 60;
    try
    {
      int i2 = this.g - 4;
      if ((this.u != null) && (this.u[0] != null))
        i2 -= this.u[0].getWidth();
      this.t = e.m.a(l[i1][0], h.x, i2 - 4, true);
      return;
    }
    catch (Exception localException2)
    {
      this.t = null;
    }
  }

  private final void G()
  {
    if (this.G != null)
      return;
    byte[] arrayOfByte;
    int i1 = (arrayOfByte = e.m.a("cm", -1)).length / 7 + 10;
    this.G = new short[7][i1];
    int i2 = 0;
    try
    {
      int i3 = 0;
      while (true)
      {
        int i4 = 0;
        while (true)
        {
          this.G[i4][i3] = (short)arrayOfByte[i2];
          if ((i4 >= 0) && (i4 <= 3) && (this.G[i4][i3] < 0))
          {
            int tmp102_100 = i3;
            short[] tmp102_99 = this.G[i4];
            tmp102_99[tmp102_100] = (short)(tmp102_99[tmp102_100] + 256);
          }
          i2++;
          if (i2 < arrayOfByte.length)
          {
            i4++;
            if (i4 < 7)
              continue;
            i3++;
            if (i3 < i1)
              break;
            return;
          }
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  private final void H()
  {
    if (this.Q != null)
      return;
    byte[] arrayOfByte;
    int i1 = (arrayOfByte = e.m.a("cu", -1)).length / 7 + 10;
    this.Q = new short[7][i1];
    int i2 = 0;
    try
    {
      int i3 = 0;
      while (true)
      {
        int i4 = 0;
        while (true)
        {
          this.Q[i4][i3] = (short)arrayOfByte[i2];
          if ((i4 >= 0) && (i4 <= 3) && (this.Q[i4][i3] < 0))
          {
            int tmp102_100 = i3;
            short[] tmp102_99 = this.Q[i4];
            tmp102_99[tmp102_100] = (short)(tmp102_99[tmp102_100] + 256);
          }
          i2++;
          if (i2 < arrayOfByte.length)
          {
            i4++;
            if (i4 < 7)
              continue;
            i3++;
            if (i3 < i1)
              break;
            return;
          }
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  private final void I()
  {
    if (this.az != null)
      return;
    int i1 = this.f;
    Image localImage = null;
    try
    {
      try
      {
        localImage = e.a(localImage = e.a("/f_g.png"));
      }
      catch (Exception localException)
      {
      }
      if (localImage == null)
        return;
      this.az = new Image[this.bj];
      this.cA = new int[3];
      this.f = 0;
      aw();
      this.cA[0] = this.aX;
      int i2 = k(this.aX * (this.ep + 1));
      this.az[0] = e.a(localImage, 0, 0, localImage.getWidth(), localImage.getHeight(), i2, i2, 0, false, true);
      for (int i3 = 0; i3 < 10; i3++)
        q();
      this.f = 1;
      aw();
      i2 = k(this.aX * (this.ep + 1));
      this.az[1] = e.a(localImage, 0, 0, localImage.getWidth(), localImage.getHeight(), i2, i2, 0, false, true);
      for (int i4 = 0; i4 < 10; i4++)
        q();
      i2 = k(this.aZ * (this.ep + 1));
      this.az[2] = e.a(localImage, 0, 0, localImage.getWidth(), localImage.getHeight(), i2, i2, 0, false, true);
      this.cA[1] = this.aX;
      this.cA[2] = this.aZ;
      for (int i5 = 0; i5 < 10; i5++)
        q();
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      this.az = null;
    }
    this.f = i1;
    aw();
  }

  private final void J()
  {
    try
    {
      if (this.as == null)
        this.as = h.x;
      if (this.dJ == null)
        this.dJ = e.m.c("tlk.png");
      this.aL = this.g;
      int i1 = 3;
      if ((this.n != null) && (this.n[2] != null))
      {
        i1 = this.n[2].getWidth();
        this.n[2].getHeight();
      }
      int i2 = this.aL - 2 - 2 * this.as.a(' ') - i1;
      this.aK = 4;
      this.aP = 2;
      String str = "";
      for (int i3 = 0; i3 < this.dJ[0].length; i3++)
      {
        str = str + this.dJ[0][i3];
        if (i3 >= this.dJ[0].length - 1)
          continue;
        str = str + '\r';
      }
      this.aG = e.m.a(str, this.as, i2, true);
      if (this.aK > this.aG.length)
        this.aK = this.aG.length;
      this.aJ = (this.as.b() * this.aK + 4 * this.aP);
      this.aN = (this.c - this.cK - this.aJ);
      this.aO = 0;
      this.aH = (this.as.b() / 3);
      if (this.aH < 1)
        this.aH = 1;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void a(String paramString)
  {
    if ((b == null) || (paramString == null) || (paramString.length() <= 0))
      return;
    char[] arrayOfChar = new char[paramString.length()];
    for (int i1 = 0; i1 < arrayOfChar.length; i1++)
    {
      int i2;
      if ((i2 = paramString.charAt(i1)) < '0')
        i2 = 48;
      if ((i2 >= 65) && (i2 <= 70))
        i2 = i2 - 65 + 97;
      if (i2 > 102)
        i2 = 102;
      if ((i2 > 57) && (i2 < 97))
        i2 = 97;
      arrayOfChar[i1] = (char)i2;
    }
    String str;
    if ((str = new String(arrayOfChar)).length() > 32)
      str = str.substring(0, 32);
    b.a = (b.a.substring(0, b.a.length() - str.length()) + str);
  }

  final void d()
  {
    a("99");
  }

  final void e()
  {
    this.ez = 0;
    this.ec = this.g;
    try
    {
      if (this.q[6] != null)
        this.ec = (this.g - this.q[6].getWidth());
    }
    catch (Exception localException)
    {
    }
    this.ee = -10;
    this.ed = 0;
    this.bn = 0;
    int i1 = 0;
    this.bn = 0;
    i1 = 0;
    if (this.az == null)
      i1 = 0 + this.bj * 10;
    if (this.dT == null)
      i1 += this.bb;
    if (this.df == null)
      i1 += this.bl;
    if (i1 < this.h)
      i1 = this.h;
    this.bx = i1;
    this.dy = true;
    this.dn = System.currentTimeMillis();
  }

  private void K()
  {
    G();
    if (this.aQ == null)
      this.aQ = new Image[8];
    for (int i1 = 0; i1 < this.aQ.length; i1++)
      try
      {
        if (this.aQ[i1] == null)
          this.aQ[i1] = e.a("/imn" + i1 + ".png");
      }
      catch (Exception localException)
      {
      }
  }

  private final void L()
  {
    if ((this.df != null) || (this.Q == null) || (this.dT == null))
      return;
    int i1 = this.f;
    this.f = 1;
    aw();
    int i2;
    long l1 = i2 = 1 << 18;
    int i3 = this.Q[2][35] + this.Q[2][15] + 2 * this.Q[2][17] + this.Q[2][19] + 5;
    int i4 = this.Q[3][35] * 4 + 5;
    long l2 = i2 * this.bR / i3;
    long l3 = i2 * this.bQ / i4;
    if (l2 > l3)
      l2 = l3;
    if (l1 > l2)
      l1 = l2;
    if (l1 < l2 >> 1)
      l1 = l2;
    this.df = new Image[this.bl][];
    for (i3 = 0; i3 < this.bl; i3++)
    {
      i4 = 2;
      if (i3 >= 4)
        i4 = 1;
      this.df[i3] = new Image[i4];
      for (int i5 = 0; i5 < this.df[i3].length; i5++)
      {
        int i6 = this.aX;
        if (i5 == 1)
          i6 = this.aZ;
        i6 = i(i6);
        int i7 = i3 + this.dl;
        if ((i6 <= 0) || (i7 >= this.Q[0].length) || (this.Q[2][i7] <= 0) || (this.Q[3][i7] <= 0) || (this.dT[this.Q[6][i7]] == null))
          continue;
        int i8 = i6;
        int i9 = i6;
        if (i7 >= 12)
        {
          i8 = (int)(this.Q[2][i7] * l1 >> 18);
          i9 = (int)(this.Q[3][i7] * l1 >> 18);
        }
        this.df[i3][i5] = e.a(this.dT[this.Q[6][i7]], this.Q[0][i7], this.Q[1][i7], this.Q[2][i7], this.Q[3][i7], i8, i9, 0, true, true, p);
      }
      if (this.du)
        continue;
      q();
    }
    this.f = i1;
    aw();
  }

  final void f()
  {
    this.ds = bN;
    this.du = true;
    if (this.dq == null)
    {
      al();
      H();
      M();
      int i1 = h.x.b() - h.x.f + 2;
      this.dq = e.a(this.dT[this.Q[6][1]], this.Q[0][1], this.Q[1][1], this.Q[2][1], this.Q[3][1], i1, i1, 0, true, true, p);
      this.dT = null;
    }
    if (this.as == null)
      this.as = h.x;
    if (this.dJ == null)
      this.dJ = e.m.c("tlk.png");
    this.dt = 0;
    this.dp = (h.x.b() / 2);
    if (this.dp < 1)
      this.dp = 1;
  }

  private final void M()
  {
    H();
    if (this.dT != null)
      return;
    this.dT = new Image[this.bb];
    for (int i1 = 0; i1 < this.bb; i1++)
    {
      try
      {
        this.dT[i1] = e.a("/u" + i1 + ".png");
      }
      catch (Exception localException)
      {
      }
      q();
    }
    int i2;
    int i3;
    if ((this.dT[0] != null) && (this.Q != null))
    {
      i2 = (short)this.dT[0].getHeight();
      for (i3 = 1; i3 <= 6; i3++)
      {
        this.Q[2][i3] = i2;
        this.Q[3][i3] = i2;
        if (i3 < 2)
          continue;
        this.Q[0][i3] = (short)(i2 * (i3 - 1));
      }
    }
    if ((this.dT[1] != null) && (this.Q != null))
    {
      i2 = (short)this.dT[1].getHeight();
      for (i3 = 8; i3 <= 10; i3++)
      {
        this.Q[2][i3] = i2;
        this.Q[3][i3] = i2;
        if (i3 < 8)
          continue;
        this.Q[0][i3] = (short)(i2 * (i3 - 8));
      }
    }
  }

  private final void N()
  {
    this.eh = null;
    try
    {
      try
      {
        String str = "/ils";
        if (this.dA)
          str = "/iwn";
        Image localImage = null;
        int i1 = 0;
        do
        {
          try
          {
            localImage = e.a("" + str + this.ck + ".png");
            this.ck += 1;
          }
          catch (Exception localException1)
          {
            this.ck = 0;
            i1 = 7;
          }
          if (localImage != null)
            break;
          i1++;
        }
        while (i1 <= 8);
        if (localImage.getWidth() == this.g)
        {
          this.eh = localImage;
        }
        else
        {
          int i2 = localImage.getHeight() * this.g / localImage.getWidth();
          this.eh = e.a(localImage, 0, 0, localImage.getWidth(), localImage.getHeight(), this.g, i2, 0, true, true, p);
        }
      }
      catch (Exception localException2)
      {
      }
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      if ((this.dT != null) || (this.az != null))
      {
        this.dT = null;
        this.az = null;
        N();
      }
    }
  }

  private final void O()
  {
    if ((this.el >= 0) && (this.el <= this.ep) && (this.eA >= 0) && (this.eA <= this.eF))
    {
      if ((this.R == 1) && (this.f == 0))
        if (this.S)
        {
          int i1 = this.cT;
          boolean bool1 = false;
          if (i1 < this.cS)
          {
            i1 = this.cS;
            bool1 = true;
          }
          boolean bool2 = false;
          if (((this.dD - this.cR < 380L) || (this.F - this.cQ <= 3L)) && (this.el == this.cU) && (this.eA == this.cV))
          {
            int i3;
            if ((i3 = Math.abs(cw)) < Math.abs(cx))
              i3 = Math.abs(cx);
            int i4 = i3;
            int i5 = i3;
            if (bool1)
              i4 = -i4;
            else
              i5 = -i5;
            if (!(bool2 = a(i1, this.bB, this.el + i4, this.eA + i5, !bool1)))
            {
              int i6 = this.el + i4;
              int i7 = this.eA + i5;
              int i8 = this.el - cw;
              int i9 = this.eA - cx;
              int i10 = i1 - 1;
              int i11 = 0;
              do
              {
                if (bool1)
                {
                  if ((!bool2) && (i6 - i11 >= i8 - i10) && (i6 - i11 <= i8))
                    bool2 = a(i1, this.bB, i6 - i11, i7, !bool1);
                  if ((!bool2) && (i6 + i11 >= i8 - i10) && (i6 + i11 <= i8))
                    bool2 = a(i1, this.bB, i6 + i11, i7, !bool1);
                }
                else
                {
                  if ((!bool2) && (i7 - i11 >= i9 - i10) && (i7 - i11 <= i9))
                    bool2 = a(i1, this.bB, i6, i7 - i11, !bool1);
                  if ((!bool2) && (i7 + i11 >= i9 - i10) && (i7 + i11 <= i9))
                    bool2 = a(i1, this.bB, i6, i7 + i11, !bool1);
                }
                if (bool2)
                  break;
                i11++;
              }
              while (i11 <= i10);
            }
          }
          if (!bool2)
            bool2 = a(i1, this.bB, this.el, this.eA, bool1);
          if ((bool2) && ((cw != 0) || (cx != 0)))
          {
            this.el -= cw;
            this.eA -= cx;
            cw = 0;
            cx = 0;
          }
          if (!bool2)
            a(this.cU, this.cV, this.cT, this.cS, true, 1);
          if (bool2)
            this.da = 6;
          this.S = false;
        }
        else
        {
          int[] arrayOfInt;
          if ((arrayOfInt = b(this.el, this.eA, 1)) != null)
          {
            cw = arrayOfInt[0] - this.el;
            cx = arrayOfInt[1] - this.eA;
            this.el = arrayOfInt[0];
            this.eA = arrayOfInt[1];
            this.cT = arrayOfInt[2];
            this.cS = arrayOfInt[3];
            this.S = true;
            this.cU = arrayOfInt[0];
            this.cV = arrayOfInt[1];
            a(this.cU, this.cV, this.cT, this.cS, false, 1);
            this.cR = this.dD;
            this.cQ = this.F;
          }
        }
      if ((this.an) || (this.cZ))
        return;
      if ((ca) && ((this.bY) || (this.bZ)))
        return;
      if ((this.f == 1) && (this.R == 2) && (this.bJ[this.el][this.eA] == 0))
      {
        c(this.el, this.eA, 2);
        this.dw[12] += 1;
        if (this.bC[this.el][this.eA] <= 0)
        {
          this.an = true;
          this.dw[14] += 1;
        }
        else
        {
          this.dw[13] += 1;
        }
        this.cZ = true;
        this.cY = this.dD;
        if (ca)
        {
          d(28, this.el, this.eA, 0);
          int i2 = 0;
          if (this.an)
            i2 = 1;
          d(29, i2, 0, 0);
        }
      }
    }
  }

  static final String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length];
    for (int i1 = 0; i1 < arrayOfChar.length; i1++)
      arrayOfChar[i1] = (char)paramArrayOfByte[i1];
    return new String(arrayOfChar);
  }

  private final void e(Graphics paramGraphics)
  {
    int i1 = getHeight();
    paramGraphics.setColor(0);
    try
    {
      if (this.af == null)
      {
        this.dT = null;
        try
        {
          try
          {
            String str1 = "ils";
            if (this.ef)
              str1 = "iwn";
            this.af = e.a("/" + str1 + ".png");
          }
          catch (Exception localException1)
          {
            this.af = null;
            this.af = Image.createImage(1, 1);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          this.af = null;
          this.af = Image.createImage(1, 1);
        }
        this.am = (i1 - (i1 >> 2));
        this.al = 0;
        if (!this.av)
          paramGraphics.fillRect(0, 0, this.g, i1);
        if (!this.av)
          this.cE = false;
      }
      int i2 = 0;
      int i3 = this.h;
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, this.g, i1);
      if ((this.af != null) && (this.af.getWidth() > 1))
        paramGraphics.drawImage(this.af, this.h, i1 >> 1, 3);
      paramGraphics.setColor(178, 1, 1);
      if (this.ef)
        paramGraphics.setColor(1, 89, 198);
      d locald;
      int i4 = (locald = h.x).b() - locald.f + 4;
      if ((this.bO != null) && (this.bO.f()) && (this.bz > 0))
      {
        if ((this.bz > 0) && (this.bz <= 255))
          a.a(paramGraphics, 0, 0, this.g, i1, 0, this.bz);
        this.bz -= 16;
      }
      else
      {
        this.al += 2;
      }
      if (this.al > i4)
      {
        this.al = i4;
        if (!this.ai)
          this.dL = System.currentTimeMillis();
        this.ai = true;
        this.cE = true;
      }
      int i5 = this.am - (this.al >> 1);
      if (this.al > 0)
      {
        paramGraphics.setColor(0, 247, 255);
        i6 = 0;
        paramGraphics.fillRect(0, i5 - 1, this.g, 1);
        paramGraphics.fillRect(0, i5 + this.al, this.g, 1);
        a.a(paramGraphics, 0, i5, this.g, this.al, 0, 128);
      }
      int i6 = 0;
      if (this.ef)
      {
        i6 = 1;
        if (this.av)
          i6++;
      }
      String str2 = l[3][i6];
      int i7 = 4 + locald.a(str2);
      i3 -= (i7 >> 1);
      paramGraphics.setColor(0);
      paramGraphics.setFont(h.y);
      if (this.al > locald.b() - locald.f)
        locald.a(paramGraphics, str2, i3 + 2, this.am - 1 - (locald.b() - locald.f >> 1), 20);
      return;
    }
    catch (Exception localException2)
    {
    }
  }

  private final void P()
  {
    if ((!o) && (!this.an))
      return;
    if ((this.cZ) || (this.f != 1))
      return;
    if ((this.an) && (ca))
      return;
    if ((this.aY != this.aX) || (this.ba != this.aZ))
      return;
    byte[][] arrayOfByte1 = this.bB;
    byte[][] arrayOfByte2 = this.bI;
    int i1 = 1;
    if (!this.an)
    {
      arrayOfByte1 = this.bC;
      arrayOfByte2 = this.bJ;
      i1 = 2;
    }
    int i2 = 0;
    if (!this.an)
      i2 = 1;
    int i3 = this.ab[i2];
    int i4 = this.ad[i2];
    int i5 = this.ac[i2];
    int i6 = this.ae[i2];
    int i7 = this.Z[i2];
    int i8 = this.aa[i2];
    int i9 = -1;
    int i10 = -1;
    int i11 = this.ao;
    int i12;
    int i13;
    int i16;
    if ((i3 >= 0) && (i3 >= 0) && (arrayOfByte1[i3][i4] > 0) && ((arrayOfByte1[i3][i4] & 0x4) == 0))
    {
      i12 = 0;
      i13 = 0;
      int[] arrayOfInt1 = { -1, 0, 1, 0 };
      int[] arrayOfInt2 = { 0, -1, 0, 1 };
      i16 = r() < Math.abs(i11) ? 1 : 0;
      int i17 = 1;
      if (i11 < 0)
        i17 = 0;
      for (int i18 = 0; i18 < 16; i18++)
      {
        int i19;
        if ((i19 = Math.abs(this.eR.nextInt() % arrayOfInt1.length)) >= arrayOfInt1.length)
          i19 = arrayOfInt1.length - 1;
        i12 = i3 + arrayOfInt1[i19];
        i13 = i4 + arrayOfInt2[i19];
        int i20 = 0;
        int i21 = 0;
        if ((i7 != 0) || (i8 != 0))
        {
          if (i18 == 0)
          {
            i12 = i3 + i7;
            i13 = i4 + i8;
            i20 = 1;
          }
          if ((i18 == 1) && (i5 >= 0) && (i6 >= 0))
          {
            i12 = i5 - i7;
            i13 = i6 - i8;
            i3 = i5;
            i4 = i6;
            i21 = 1;
          }
        }
        if ((i12 < 0) || (i13 < 0) || (i12 > this.ep) || (i13 > this.eF))
          continue;
        if (i12 < 0)
          i12 = 0;
        if (i13 < 0)
          i13 = 0;
        if (i12 > this.ep)
          i12 = this.ep;
        if (i13 > this.eF)
          i13 = this.eF;
        if (arrayOfByte2[i12][i13] > 0)
          continue;
        i9 = i12;
        i10 = i13;
        if ((i20 != 0) || (i21 != 0) || (i16 == 0) || ((arrayOfByte1[i12][i13] & 0x1) == i17))
          break;
      }
    }
    if ((i9 < 0) || (i10 < 0))
    {
      i12 = r() < Math.abs(i11) ? 1 : 0;
      i13 = 1;
      if (i11 < 0)
        i13 = 0;
      for (int i14 = 0; i14 < 32; i14++)
      {
        int i15 = Math.abs(this.eR.nextInt() % (this.ep + 1));
        i16 = Math.abs(this.eR.nextInt() % (this.eF + 1));
        if (i15 > this.ep)
          i15 = this.ep;
        if (i16 > this.eF)
          i16 = this.eF;
        if (arrayOfByte2[i15][i16] > 0)
          continue;
        i9 = i15;
        i10 = i16;
        if ((i12 == 0) || ((arrayOfByte1[i15][i16] & 0x1) == i13))
          break;
      }
    }
    if ((i9 >= 0) && (i10 >= 0) && (arrayOfByte2[i9][i10] <= 0))
    {
      c(i9, i10, i1);
      if (arrayOfByte1[i9][i10] > 0)
      {
        if ((arrayOfByte1[i9][i10] & 0x4) == 0)
        {
          i12 = i9 - i3;
          i13 = i10 - i4;
          if ((i3 >= 0) && (i4 >= 0) && ((i12 == 0) || (i13 == 0)) && ((Math.abs(i12) == 1) || (Math.abs(i13) == 1)))
          {
            i7 = i12;
            i8 = i13;
          }
          i3 = i9;
          i4 = i10;
          if ((i5 < 0) || (i6 < 0))
          {
            i5 = i3;
            i6 = i4;
          }
        }
        else
        {
          i7 = 0;
          i8 = 0;
          i5 = -1;
          i6 = -1;
          i3 = -1;
          i4 = -1;
        }
      }
      else
      {
        i3 = i5;
        i4 = i6;
        this.an = (!this.an);
      }
      this.cZ = true;
      this.cY = this.dD;
    }
    this.ab[i2] = i3;
    this.ad[i2] = i4;
    this.ac[i2] = i5;
    this.ae[i2] = i6;
    this.Z[i2] = i7;
    this.aa[i2] = i8;
  }

  private void Q()
  {
    this.du = false;
    if (this.ds)
      bN = true;
  }

  private final int[] b(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[][] arrayOfByte = null;
    if (paramInt3 == 1)
      arrayOfByte = this.bB;
    else
      arrayOfByte = this.bC;
    if (arrayOfByte[paramInt1][paramInt2] <= 0)
      return null;
    int i1 = paramInt1;
    int i2 = paramInt2;
    for (int i3 = paramInt1; i3 >= 0; i3--)
    {
      if (arrayOfByte[i3][paramInt2] <= 0)
        break;
      i1 = i3;
    }
    for (int i4 = paramInt2; i4 >= 0; i4--)
    {
      if (arrayOfByte[i1][i4] <= 0)
        break;
      i2 = i4;
    }
    int i5 = i1;
    int i6 = i2;
    for (int i7 = i1; i7 <= this.ep; i7++)
    {
      if (arrayOfByte[i7][i2] <= 0)
        break;
      i5 = i7;
    }
    for (int i8 = i2; i8 <= this.eF; i8++)
    {
      if (arrayOfByte[i1][i8] <= 0)
        break;
      i6 = i8;
    }
    return new int[] { i1, i2, i5 - i1 + 1, i6 - i2 + 1 };
  }

  static final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i1 = paramInt4 >> 1;
    int i2;
    int i3 = (i2 = paramGraphics.getColor()) >> 16 & 0xFF;
    int i4 = i2 >> 8 & 0xFF;
    int i5 = i2 & 0xFF;
    int i6 = 0;
    int i7 = 1;
    for (int i12 = paramInt2; i12 < paramInt2 + paramInt4; i12++)
    {
      int i8 = (i8 = i6 * paramInt5 / i1) + paramInt6;
      int i9;
      if ((i9 = i3 * i8 >> 7) > 255)
        i9 = 255;
      int i10;
      if ((i10 = i4 * i8 >> 7) > 255)
        i10 = 255;
      int i11;
      if ((i11 = i5 * i8 >> 7) > 255)
        i11 = 255;
      paramGraphics.setColor(i9, i10, i11);
      paramGraphics.fillRect(paramInt1, i12, paramInt3, 1);
      if (i6 += i7 < i1)
        continue;
      i7 = -1;
    }
  }

  final boolean g()
  {
    if (!ca)
      return false;
    if (!l.s)
    {
      b(1);
      l.b = false;
      b.v = null;
      l.c = null;
      b.l = true;
      b.b();
      return true;
    }
    b(5);
    return false;
  }

  final void h()
  {
    a.a = null;
    this.dT = null;
    bN = false;
    this.K = 0;
    this.aq = false;
    n();
  }

  final void i()
  {
    Display.getDisplay(NET_Lizard.a).setCurrent(this);
    ax = NET_Lizard.c;
    this.D = true;
    if (this.dC == null)
      this.dC = new Thread(this);
    this.dC.start();
    if (this.dC.getPriority() != 10)
      this.dC.setPriority(10);
  }

  public final void hideNotify()
  {
    if (!ca)
      this.bP = true;
    this.aT = 0;
    this.bc = true;
    this.bd = false;
    try
    {
      this.bO.P = 0;
      this.bO.V = true;
      this.bO.W = false;
    }
    catch (Exception localException)
    {
    }
    s();
    super.hideNotify();
  }

  static final String j()
  {
    return "aaaaaaaa";
  }

  static final int c(int paramInt)
  {
    int i1 = ay - 1;
    int i2 = 0;
    i2 = 64 + i1 * 20 + paramInt * 2;
    int i3;
    if ((i3 = e.a[i2]) < 0)
      i3 += 256;
    int i4;
    if ((i4 = e.a[(i2 + 1)]) < 0)
      i4 += 256;
    return i3 * 256 + i4;
  }

  static final String a(int[] paramArrayOfInt)
  {
    char[] arrayOfChar = new char[paramArrayOfInt.length];
    for (int i1 = 0; i1 < arrayOfChar.length; i1++)
      arrayOfChar[i1] = (char)paramArrayOfInt[i1];
    return new String(arrayOfChar);
  }

  private static byte g(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt > 127)
      i1 = paramInt - 256;
    return (byte)i1;
  }

  private final int h(int paramInt)
  {
    if (paramInt == -1)
      paramInt = 50;
    if (paramInt == -2)
      paramInt = 56;
    if (paramInt == -3)
      paramInt = 52;
    if (paramInt == -4)
      paramInt = 54;
    if ((paramInt == -6) || (paramInt == -5))
      paramInt = 53;
    if (paramInt == -7)
      paramInt = this.e;
    return paramInt;
  }

  protected final void keyPressed(int paramInt)
  {
    paramInt = a.a(paramInt);
    this.bP = false;
    if (f.a(paramInt))
      return;
    if (k.a(paramInt))
      return;
    if (bN)
    {
      if (this.bO != null)
        this.bO.a(paramInt);
      return;
    }
    this.aU = paramInt;
    if (paramInt == -1)
      paramInt = 50;
    if (paramInt == -2)
      paramInt = 56;
    if (paramInt == -3)
      paramInt = 52;
    if (paramInt == -4)
      paramInt = 54;
    if ((paramInt == -6) || (paramInt == -5))
      paramInt = 53;
    if (paramInt == -7)
      paramInt = this.e;
    if ((paramInt == 53) || (paramInt == 42) || (paramInt == this.e) || (paramInt == 48))
      this.aS = false;
    else
      this.aS = true;
    a(paramInt, this.bG);
    a(paramInt, this.bF);
    this.co = System.currentTimeMillis();
    this.bc = false;
    this.aT = paramInt;
  }

  protected final void keyReleased(int paramInt)
  {
    paramInt = a.a(paramInt);
    if (f.b())
      return;
    if (k.a())
      return;
    if (bN)
    {
      if (this.bO != null)
        this.bO.b();
      return;
    }
    a(paramInt, this.bH);
    if (this.bc)
    {
      this.aT = 0;
      this.aU = 0;
      return;
    }
    this.bd = true;
  }

  private final void R()
  {
    this.aT = 0;
    this.bc = true;
    this.bd = false;
    W();
  }

  private final void S()
  {
    this.aw = false;
    if ((!this.N) || ((this.aT != 50) && (this.aT != 56)))
      switch (this.aT)
      {
      case 50:
        this.K -= 1;
        do
        {
          this.K -= 1;
          if ((!ca) || (this.K < 0) || (this.K >= cj.length))
            break;
        }
        while (cj[this.K] != 0);
        while ((this.K >= 0) && (this.K < ch.length) && (ch[this.K] != 0))
          this.K -= 1;
        if ((this.K == 6) && (!cM))
          this.K -= 1;
        if ((this.K == 5) && (cW > 1))
          this.K -= 1;
        if ((this.K == 3) && (X < 1))
          this.K -= 1;
        if ((this.K == 2) && (ci))
          this.K -= 1;
        if (this.K >= 0)
          break;
        this.K = (this.H - 1);
        return;
      case 56:
        this.K += 1;
        do
        {
          this.K += 1;
          if ((!ca) || (this.K < 0) || (this.K >= cj.length))
            break;
        }
        while (cj[this.K] != 0);
        while ((this.K >= 0) && (this.K < ch.length) && (ch[this.K] != 0))
          this.K += 1;
        if ((this.K == 2) && (ci))
          this.K += 1;
        if ((this.K == 3) && (X < 1))
          this.K += 1;
        if ((this.K == 5) && (cW > 1))
          this.K += 1;
        if ((this.K == 6) && (!cM))
          this.K += 1;
        if (this.K < this.H)
          break;
        this.K = 0;
        return;
      case 52:
      case 53:
      case 54:
        this.cN = true;
        switch (this.K)
        {
        case 0:
          this.L = false;
          break;
        case 1:
          e.k = !e.k;
          if (!e.k)
            s();
          else if (cz)
            j(e.d - 1);
          aq();
          break;
        case 2:
          e.g = !e.g;
          aq();
          break;
        case 3:
          W = (byte)(W + 1);
          if (this.aT == 52)
            W = (byte)(W - 2);
          if (W > X)
            W = 0;
          if (W < 0)
            W = X;
          this.dT = null;
          e();
          M();
          aq();
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          if (this.N)
          {
            this.L = false;
            this.N = false;
            al();
            ao();
          }
          else
          {
            this.N = true;
          }
          break;
        case 7:
          if (this.N)
          {
            this.L = false;
            this.N = false;
            a(false, false);
          }
          else
          {
            this.N = true;
          }
          break;
        case 8:
          if (this.N)
          {
            this.L = false;
            this.N = false;
            al();
            aq();
            a(true, false);
          }
          else
          {
            this.N = true;
          }
          break;
        case 9:
          if (this.N)
          {
            al();
            ao();
            this.cD = false;
            this.L = false;
            this.aw = true;
            ag();
            b(-1);
          }
          else
          {
            this.N = true;
          }
          break;
        case 10:
          if (this.N)
          {
            ao();
            this.D = false;
            return;
          }
          this.N = true;
          return;
        }
        this.cE = true;
      case 51:
      case 55:
      }
  }

  private final void T()
  {
    try
    {
      switch (this.aT)
      {
      case 50:
        if (this.aO <= 0)
          break;
        this.aO -= this.aH;
        break;
      case 56:
        if (this.aO >= this.as.b() * (this.aG.length - this.aK))
          break;
        this.aO += this.aH;
        break;
      case 35:
        this.aG = null;
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void U()
  {
    this.bc = true;
    this.bv = this.dD;
    if ((dB) && (this.aT == 53))
    {
      this.cc += 1;
      a(false, true);
    }
    if (this.du)
    {
      d(this.aT);
      return;
    }
    if ((this.aT == this.e) && (this.L))
    {
      this.L = false;
      this.N = false;
      return;
    }
    if (this.L)
    {
      S();
      return;
    }
    if (this.ah)
    {
      if ((this.aj) && ((this.aT == 53) || (this.aT == this.e)))
        if (this.ef)
        {
          if (this.cD)
          {
            a(true, true);
          }
          else
          {
            ag();
            if (this.av)
            {
              this.bO.aY = 1;
              this.bO.d();
            }
            return;
          }
        }
        else
        {
          if (!this.cD)
          {
            ag();
            return;
          }
          a(true, false);
        }
      return;
    }
    if (this.f == 5)
    {
      if ((this.dD >= this.dK) && ((this.aT == 53) || (this.aT == this.e)))
      {
        this.bX = false;
        if (this.aT == 53)
        {
          a(true, false);
          return;
        }
        al();
        ao();
        ag();
      }
      return;
    }
    if (this.aG != null)
    {
      T();
      return;
    }
    if ((this.aT == 53) && (this.aU == -6) && (this.f == 0))
    {
      a(this.bB);
      this.da = 6;
      return;
    }
    if (this.aT == this.e)
      if (this.S)
      {
        O();
      }
      else if (this.f == 0)
      {
        this.f = 1;
        this.R = 2;
        if (ca)
          aG();
      }
      else
      {
        if (this.cO)
        {
          this.cO = false;
          return;
        }
        if (this.L)
        {
          if ((this.L) && (this.N))
          {
            this.N = false;
            return;
          }
          this.L = false;
          this.cE = true;
          return;
        }
        this.L = true;
        this.N = false;
      }
    if (this.L)
    {
      S();
      return;
    }
    this.cE = true;
    if ((aA) && (this.aT == 51) && (!ca))
      o = !o;
    if ((aA) && (this.f == 1) && ((this.aT == 55) || (this.aT == 57)))
    {
      byte[][] arrayOfByte1 = this.bB;
      byte[][] arrayOfByte2 = this.bI;
      i3 = 1;
      if (this.aT == 57)
      {
        arrayOfByte1 = this.bC;
        arrayOfByte2 = this.bJ;
        i3 = 2;
      }
      for (i4 = 0; i4 <= this.eF; i4++)
        for (i5 = 0; i5 <= this.ep; i5++)
        {
          if ((arrayOfByte1[i5][i4] <= 0) || (arrayOfByte2[i5][i4] > 0))
            continue;
          c(i5, i4, i3);
          if (!ca)
            continue;
          d(28, i5, i4, i3);
        }
    }
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    switch (this.aT)
    {
    case 49:
      i1 = 1;
      i3 = 1;
      break;
    case 50:
      i3 = 1;
      break;
    case 51:
      i2 = 1;
      i3 = 1;
      break;
    case 52:
      i1 = 1;
      break;
    case 54:
      i2 = 1;
      break;
    case 55:
      i1 = 1;
      i4 = 1;
      break;
    case 56:
      i4 = 1;
      break;
    case 57:
      i2 = 1;
      i4 = 1;
    case 53:
    }
    if (p(50))
      i3 = 1;
    if (p(56))
      i4 = 1;
    if (p(52))
      i1 = 1;
    if (p(54))
      i2 = 1;
    int i5 = 0;
    if (i1 != 0)
    {
      this.el -= 1;
      if (this.el < 0)
        this.el = this.ep;
    }
    if (i2 != 0)
    {
      this.el += 1;
      if (this.el > this.ep)
        this.el = 0;
    }
    if (i3 != 0)
    {
      this.eA -= 1;
      if (this.eA < 0)
        this.eA = this.eF;
    }
    if (i4 != 0)
    {
      this.eA += 1;
      if (this.eA > this.eF)
        this.eA = 0;
    }
    if (this.aT == 53)
      O();
  }

  private final void V()
  {
    U();
    if (this.bd)
    {
      this.aT = 0;
      this.aU = 0;
      this.bd = false;
    }
  }

  private final void W()
  {
    boolean[] arrayOfBoolean1 = this.bG;
    boolean[] arrayOfBoolean2 = this.bH;
    boolean[] arrayOfBoolean3 = this.bF;
    for (int i1 = 0; i1 < arrayOfBoolean2.length; i1++)
    {
      arrayOfBoolean3[i1] = false;
      arrayOfBoolean1[i1] = false;
      arrayOfBoolean2[i1] = false;
    }
  }

  private final void X()
  {
    if (aJ())
    {
      V();
      if (!this.aS)
        this.aT = 0;
    }
    boolean[] arrayOfBoolean1 = this.bG;
    boolean[] arrayOfBoolean2 = this.bH;
    boolean[] arrayOfBoolean3 = this.bF;
    long l1;
    int i1 = (l1 = System.currentTimeMillis()) - this.dG < 50L ? 1 : 0;
    for (int i2 = 0; i2 < arrayOfBoolean2.length; i2++)
    {
      if (arrayOfBoolean1[i2] != 0)
        if ((l1 - this.co < 230L) || (i1 != 0))
          arrayOfBoolean3[i2] = false;
        else
          arrayOfBoolean3[i2] = true;
      if (arrayOfBoolean2[i2] == 0)
        continue;
      arrayOfBoolean3[i2] = false;
      arrayOfBoolean1[i2] = false;
      arrayOfBoolean2[i2] = false;
    }
    if (i1 == 0)
      this.dG = l1;
  }

  private final void Y()
  {
    try
    {
      if (cs)
        this.aq = true;
      if (this.aq)
      {
        int i1;
        if ((i1 = h.x.b() + 2) < this.cK)
          i1 = this.cK;
        if ((this.aG != null) || (this.du))
        {
          int i2 = 0;
          if (cr)
            if (cs)
            {
              this.cm = eH;
            }
            else
            {
              i2 = -(eH - this.cm);
              Math.abs(eH - this.cm);
              this.cm = eH;
            }
          if (this.aG != null)
          {
            this.aO += i2;
            this.aF = (i2 > 0);
            this.aE = (i2 < 0);
            if (this.aO < 0)
              this.aO = 0;
            if (this.aO > this.as.b() * (this.aG.length - this.aK))
              this.aO = (this.as.b() * (this.aG.length - this.aK));
          }
        }
        if (c(0, this.c - i1, this.g / 3, i1))
        {
          keyPressed(this.aT = 53);
          this.aU = -6;
        }
        if (c(this.g - this.g / 3, this.c - i1, this.g / 3, i1))
        {
          keyPressed(this.aT = 35);
          this.aU = -7;
        }
      }
      if (ct)
      {
        if (this.bc)
          this.aT = 0;
        else
          this.bd = true;
        R();
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  final void d(int paramInt)
  {
    if ((paramInt == 53) || (paramInt == this.e) || (paramInt == -6) || (paramInt == -7) || (paramInt == -5))
    {
      Q();
      return;
    }
    switch (paramInt)
    {
    case -1:
    case 50:
      if (this.dt > 0)
        this.dt -= this.dp;
      if (this.dt >= 0)
        break;
      this.dt = 0;
      return;
    case -2:
    case 56:
      if (!this.dr)
        break;
      this.dt += this.dp;
    }
  }

  static final int k()
  {
    return 3;
  }

  private final void Z()
  {
    if (this.el < 0)
      this.el = 0;
    if (this.el > this.ep)
      this.el = this.ep;
    if (this.eA < 0)
      this.eA = 0;
    if (this.eA > this.eF)
      this.eA = this.eF;
  }

  static final void a(Graphics paramGraphics)
  {
    paramGraphics.setClip(dg, dh, di, dj);
  }

  private void aa()
  {
    z = e.a(this.ce, z, false);
  }

  static void l()
  {
    byte[] arrayOfByte;
    e.d = (arrayOfByte = z)[9];
  }

  private void ab()
  {
    au = e.a(this.cf, au, false);
    int i1 = 0;
    for (int i2 = 0; i2 < this.dw.length; i2++)
    {
      int i3 = 0;
      for (int i4 = 0; i4 < 4; i4++)
      {
        int i5;
        if ((i5 = au[i1]) < 0)
          i5 += 256;
        i5 <<= 8 * i4;
        i3 += i5;
        i1++;
      }
      this.dw[i2] = i3;
    }
  }

  private final boolean d(byte[] paramArrayOfByte)
  {
    try
    {
      if (paramArrayOfByte == null)
        return true;
      eg = paramArrayOfByte[17];
      by = paramArrayOfByte[18];
      if ((paramArrayOfByte[9] < 1) || (paramArrayOfByte[8] == 0) || (cg))
        return true;
      int i1 = 112;
      this.el = paramArrayOfByte[112];
      i1++;
      this.eA = paramArrayOfByte[113];
      i1++;
      this.R = paramArrayOfByte[114];
      i1++;
      this.an = (paramArrayOfByte[115] > 0);
      i1++;
      int i2;
      for (int i3 = 0; i3 <= this.eF; i3++)
        for (i2 = 0; i2 <= this.ep; i2++)
        {
          this.bB[i2][i3] = paramArrayOfByte[i1];
          i1++;
        }
      for (i3 = 0; i3 <= this.eF; i3++)
        for (i2 = 0; i2 <= this.ep; i2++)
        {
          this.bC[i2][i3] = paramArrayOfByte[i1];
          i1++;
        }
      for (i3 = 0; i3 <= this.eF; i3++)
        for (i2 = 0; i2 <= this.ep; i2++)
        {
          this.bI[i2][i3] = paramArrayOfByte[i1];
          i1++;
        }
      for (i3 = 0; i3 <= this.eF; i3++)
        for (i2 = 0; i2 <= this.ep; i2++)
        {
          this.bJ[i2][i3] = paramArrayOfByte[i1];
          i1++;
        }
      cW = paramArrayOfByte[i1];
      i1++;
      this.cU = paramArrayOfByte[i1];
      i1++;
      this.cV = paramArrayOfByte[i1];
      i1++;
      this.cT = paramArrayOfByte[i1];
      i1++;
      this.cS = paramArrayOfByte[i1];
      i1++;
      this.S = (paramArrayOfByte[i1] > 0);
      i1++;
      this.f = paramArrayOfByte[i1];
      i1++;
      this.bY = (paramArrayOfByte[i1] > 0);
      i1++;
      this.bZ = (paramArrayOfByte[i1] > 0);
      i1++;
      eg = paramArrayOfByte[i1];
      i1++;
      by = paramArrayOfByte[i1];
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private final boolean ac()
  {
    e.a();
    byte[] arrayOfByte = e.a;
    if (ca)
      if (this.bX)
        arrayOfByte = z;
      else
        arrayOfByte = null;
    return d(arrayOfByte);
  }

  private void ad()
  {
    if (!ca)
      return;
    if ((this.aw) && (this.cE) && (!l.g))
    {
      ap();
      ag();
      b(3);
    }
    if ((l.r) && (l.g))
    {
      if ((b.h[0] == 125) && (l.b))
      {
        b();
        return;
      }
      byte[] arrayOfByte1;
      byte[] arrayOfByte3;
      byte[] arrayOfByte4;
      int i2;
      int i3;
      byte[] arrayOfByte5;
      try
      {
        int i1;
        if ((i1 = (arrayOfByte1 = b.h).length) > O)
          i1 = O;
        for (arrayOfByte3 = 0; arrayOfByte3 < i1; arrayOfByte3++)
        {
          if ((arrayOfByte4 = arrayOfByte1[arrayOfByte3]) == 0)
            break;
          if (arrayOfByte4 >= 120)
            break;
          arrayOfByte3++;
          i2 = arrayOfByte1[arrayOfByte3];
          arrayOfByte3++;
          i3 = arrayOfByte1[arrayOfByte3];
          arrayOfByte3++;
          arrayOfByte5 = arrayOfByte1[arrayOfByte3];
          arrayOfByte3++;
          Object localObject = null;
          byte[] arrayOfByte7 = this.A;
          if (arrayOfByte4 == 1)
            localObject = this.bC;
          if (arrayOfByte4 == 2)
            localObject = this.bB;
          if (arrayOfByte4 == 3)
            localObject = this.bJ;
          if (arrayOfByte4 == 4)
            localObject = this.bI;
          if (arrayOfByte4 == 22)
          {
            (localObject = new byte[1][])[0] = this.A;
            if (i3 < 0)
              i3 += 256;
            if (i2 < 0)
              i2 += 256;
            if (i2 > 0)
              i3 += i2 * 256;
          }
          if (arrayOfByte4 == 6)
            this.cn = a((byte)i2, (byte)i3);
          if (arrayOfByte4 == 20)
            P = a((byte)i2, (byte)i3);
          int i4;
          if (arrayOfByte4 == 21)
          {
            this.aR = true;
            this.j = 0;
            this.bo = 0;
            if (!y())
            {
              arrayOfByte8 = J;
              for (i4 = 0; i4 < arrayOfByte8.length; i4++)
                arrayOfByte8[i4] = 0;
            }
          }
          byte[] arrayOfByte8 = arrayOfByte3;
          if ((arrayOfByte4 < 20) && ((localObject != null) || (arrayOfByte7 != null)))
          {
            if (i2 < 0)
              i2 += 256;
            if (i3 < 0)
              i3 += 256;
            if (arrayOfByte5 < 0)
              arrayOfByte5 += 256;
            while (arrayOfByte3 < arrayOfByte8 + arrayOfByte5)
            {
              i4 = i3 + arrayOfByte3 - arrayOfByte8;
              if (localObject != null)
                localObject[i4][i2] = arrayOfByte1[arrayOfByte3];
              if (arrayOfByte7 != null)
                arrayOfByte7[i4] = arrayOfByte1[arrayOfByte3];
              arrayOfByte3++;
            }
          }
          if (arrayOfByte4 == 23)
          {
            this.cF = (i2 == 0);
            if (this.cF)
              this.A = new byte[bs];
            if (!this.cF)
            {
              i4 = this.el;
              int i5 = this.em;
              int i6 = this.eA;
              int i7 = this.eB;
              d(this.A);
              this.A = null;
              E();
              byte b1 = eg;
              eg = by;
              by = b1;
              this.el = i4;
              this.em = i5;
              this.eA = i6;
              this.eB = i7;
            }
          }
          if (arrayOfByte4 == 22)
            while (arrayOfByte3 < arrayOfByte8 + arrayOfByte5)
            {
              localObject[0][(i3 + arrayOfByte3 - arrayOfByte8)] = arrayOfByte1[arrayOfByte3];
              arrayOfByte3++;
            }
          if (arrayOfByte4 == 27)
            this.bY = (i2 > 0);
          if (arrayOfByte4 == 28)
            if (arrayOfByte5 == 1)
              c(i2, i3, 2);
            else
              c(i2, i3, 1);
          if (arrayOfByte4 == 29)
            this.an = (i2 == 0);
          arrayOfByte3--;
        }
      }
      catch (Exception localException1)
      {
      }
      try
      {
        A();
      }
      catch (Exception localException2)
      {
      }
      try
      {
        arrayOfByte1 = b.i;
        byte[] arrayOfByte2 = J;
        arrayOfByte3 = 0;
        if ((arrayOfByte4 = arrayOfByte1.length) > P)
          arrayOfByte4 = P;
        if ((i2 = arrayOfByte2.length) == arrayOfByte4)
        {
          arrayOfByte3 = arrayOfByte4;
          for (i3 = 0; i3 < arrayOfByte4; i3++)
            arrayOfByte1[i3] = arrayOfByte2[i3];
        }
        else
        {
          i3 = 0;
          for (arrayOfByte5 = 0; arrayOfByte5 < arrayOfByte4; arrayOfByte5++)
          {
            if (i3 == 0)
            {
              if ((arrayOfByte2[arrayOfByte5] == 0) || (arrayOfByte2[arrayOfByte5] >= 120))
              {
                arrayOfByte3 = arrayOfByte5;
                break;
              }
              if (((arrayOfByte2[arrayOfByte5] >= 1) && (arrayOfByte2[arrayOfByte5] <= 4)) || ((arrayOfByte2[arrayOfByte5] == 22) && (arrayOfByte5 + 3 < arrayOfByte4)))
                i3 += arrayOfByte2[(arrayOfByte5 + 3)];
              i3 += 4;
              if (arrayOfByte5 + i3 > arrayOfByte4)
              {
                arrayOfByte3 = arrayOfByte5;
                break;
              }
              arrayOfByte3 = arrayOfByte5 + i3;
            }
            arrayOfByte1[arrayOfByte5] = arrayOfByte2[arrayOfByte5];
            i3--;
          }
        }
        i3 = -1;
        arrayOfByte5 = arrayOfByte3;
        do
        {
          arrayOfByte1[arrayOfByte5] = 0;
          arrayOfByte5++;
          if (arrayOfByte5 >= arrayOfByte4)
            break;
          i3++;
        }
        while (i3 < 8);
        if ((i3 = this.j - arrayOfByte3) > 0)
        {
          byte[] arrayOfByte6 = new byte[i2];
          System.arraycopy(arrayOfByte2, arrayOfByte3, arrayOfByte6, 0, i3);
          J = arrayOfByte6;
        }
        if (arrayOfByte3 == 0)
        {
          this.j = 0;
          this.bo = 0;
        }
        this.j -= arrayOfByte3;
        if (this.j < 0)
          this.j = 0;
        this.bo -= arrayOfByte3;
        if (this.bo < 0)
          this.bo = 0;
      }
      catch (Exception localException3)
      {
      }
      l.r = false;
    }
  }

  private void ae()
  {
    if (this.df == null)
      this.dT = null;
    this.j = 0;
    this.bo = 0;
    P = cB;
    O = cB;
    this.aR = false;
    this.cF = false;
    this.aw = false;
    this.bz = 255;
    this.af = null;
    this.cD = false;
    this.cN = true;
    this.ah = false;
    this.ai = false;
    this.aj = false;
    this.ef = false;
    this.av = false;
    this.al = 0;
    this.am = 0;
    this.dL = 0L;
    this.af = null;
    this.m = null;
    this.V = null;
    this.cE = false;
    this.bB = new byte[this.ep + 1][this.eF + 1];
    this.bC = new byte[this.ep + 1][this.eF + 1];
    this.bI = new byte[this.ep + 1][this.eF + 1];
    this.bJ = new byte[this.ep + 1][this.eF + 1];
    this.bD = new byte[this.ep + 1][this.eF + 1];
    this.bE = new byte[this.ep + 1][this.eF + 1];
    e();
    at();
    I();
    H();
    M();
    L();
    this.dT[3] = null;
    C();
    D();
    this.R = 1;
    this.f = 0;
    this.S = false;
    if (ca)
    {
      this.dP = -1;
      this.bY = true;
      this.bZ = true;
      this.an = (!l.b);
    }
    if ((!dB) && (ac()))
      av();
    E();
    if (this.m == null)
      try
      {
        this.m = e.a("/ar.png");
      }
      catch (Exception localException1)
      {
      }
    if (this.V == null)
      try
      {
        this.V = e.a("/d.png");
      }
      catch (Exception localException2)
      {
      }
    if (this.bx <= 0)
    {
      this.bn = 0;
      this.bx = this.g;
    }
    while (this.bn < this.bx)
      q();
    if (ca)
    {
      this.cH = true;
      ax();
      this.cH = false;
    }
    if ((ca) && ((!l.g) || (!this.jdField_do)))
    {
      ag();
      return;
    }
    b(-1);
    this.aT = 0;
    R();
    this.dU = (System.currentTimeMillis() + 999L);
    au();
    cg = false;
    this.cE = true;
  }

  private final void af()
  {
    for (int i1 = 0; i1 <= this.eF; i1++)
      for (int i2 = 0; i2 <= this.ep; i2++)
      {
        byte[][] arrayOfByte = this.bD;
        for (int i3 = 0; i3 < 2; i3++)
        {
          if (i3 == 1)
            arrayOfByte = this.bE;
          if ((arrayOfByte[i2][i1] == 0) || (arrayOfByte[i2][i1] <= 0))
            continue;
          int tmp52_51 = i1;
          byte[] tmp52_50 = arrayOfByte[i2];
          tmp52_50[tmp52_51] = (byte)(tmp52_50[tmp52_51] + 1);
          if (arrayOfByte[i2][i1] < 4)
            continue;
          arrayOfByte[i2][i1] = 0;
        }
      }
  }

  private final void ag()
  {
    n();
    this.L = false;
    this.az = null;
    this.dT = null;
    this.m = null;
    this.V = null;
    a.a = null;
    if ((b != null) && (l.g))
      b();
    if (this.cN)
      aq();
    if (this.bO == null)
      this.bO = new h(this);
    else
      h.g();
    bN = true;
    this.aw = false;
  }

  private static int i(int paramInt)
  {
    return paramInt + 1;
  }

  private final void ah()
  {
    long l1;
    if ((l1 = System.currentTimeMillis()) < this.ei + 533L)
      return;
    this.ei = l1;
    this.ea = (true ^ this.ea);
  }

  private final void ai()
  {
    long l1;
    if ((l1 = System.currentTimeMillis()) < this.ej + 133L)
      return;
    this.ej = l1;
    this.eb = (true ^ this.eb);
  }

  private final void aj()
  {
    for (int i1 = 0; i1 < this.bf.length; i1++)
    {
      if (this.bf[i1] == this.bh[i1])
        continue;
      if (this.bf[i1] < this.bh[i1])
        this.dw[i1] += 1;
      this.bh[i1] = this.bf[i1];
      this.bg[i1] = 7;
      this.dM = this.dD;
    }
    if (this.dD - this.dM > 150L)
    {
      this.dM = this.dD;
      for (int i2 = 0; i2 < this.bf.length; i2++)
      {
        if (this.bg[i2] <= 0)
          continue;
        this.bg[i2] -= 1;
      }
    }
  }

  private final void ak()
  {
    long l1;
    if ((l1 = System.currentTimeMillis()) < this.ek + 533L)
      return;
    this.ek = l1;
    this.E += 1;
    if (this.E > 2)
    {
      this.E = 0;
      this.bA += 1;
      if (this.bA > 2)
      {
        this.bA = 0;
        this.k = (!this.k);
      }
    }
  }

  public static final void m()
  {
    try
    {
      j(Math.abs(NET_Lizard.c.eR.nextInt() % 16));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  static final String e(int paramInt)
  {
    return l[7][paramInt];
  }

  static final void n()
  {
    if (ct)
      cr = false;
    cs = false;
    ct = false;
    cl = true;
    if (cJ)
      i = false;
  }

  private final void c(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[][] arrayOfByte1 = null;
    byte[][] arrayOfByte2 = null;
    byte[][] arrayOfByte3 = null;
    if (paramInt3 == 1)
    {
      arrayOfByte1 = this.bB;
      arrayOfByte2 = this.bI;
      arrayOfByte3 = this.bD;
    }
    else
    {
      arrayOfByte1 = this.bC;
      arrayOfByte2 = this.bJ;
      arrayOfByte3 = this.bE;
    }
    arrayOfByte2[paramInt1][paramInt2] = 1;
    arrayOfByte3[paramInt1][paramInt2] = 1;
    int i1 = 1;
    if (arrayOfByte1[paramInt1][paramInt2] > 0)
    {
      int i2 = paramInt1;
      int i3 = paramInt1;
      int i4 = paramInt2;
      int i5 = paramInt2;
      for (int i6 = 1; i6 <= 7; i6++)
      {
        i7 = 0;
        if ((i2 >= 0) && (i2 <= this.ep) && (paramInt2 >= 0) && (paramInt2 <= this.eF) && (arrayOfByte1[i2][paramInt2] > 0))
        {
          i2 = paramInt1 - i6;
          i7 = 1;
        }
        if ((i3 >= 0) && (i3 <= this.ep) && (paramInt2 >= 0) && (paramInt2 <= this.eF) && (arrayOfByte1[i3][paramInt2] > 0))
        {
          i3 = paramInt1 + i6;
          i7 = 1;
        }
        if ((paramInt1 >= 0) && (paramInt1 <= this.ep) && (i4 >= 0) && (i4 <= this.eF) && (arrayOfByte1[paramInt1][i4] > 0))
        {
          i4 = paramInt2 - i6;
          i7 = 1;
        }
        if ((paramInt1 >= 0) && (paramInt1 <= this.ep) && (i5 >= 0) && (i5 <= this.eF) && (arrayOfByte1[paramInt1][i5] > 0))
        {
          i5 = paramInt2 + i6;
          i7 = 1;
        }
        if (i7 == 0)
          break;
      }
      int i7 = 0;
      int i8 = 0;
      int i10;
      for (int i9 = i4 + 1; i9 < i5; i9++)
        for (i10 = i2 + 1; i10 < i3; i10++)
        {
          if ((i10 < 0) || (i10 > this.ep) || (i9 < 0) || (i9 > this.eF) || (arrayOfByte1[i10][i9] <= 0))
            continue;
          i7++;
          if (arrayOfByte2[i10][i9] <= 0)
            continue;
          i8++;
        }
      if (i8 >= i7)
      {
        for (i10 = i4; i10 <= i5; i10++)
          for (int i11 = i2; tmp474_472 <= i3; tmp474_472++)
          {
            if ((i11 < 0) || (i11 > this.ep) || (i10 < 0) || (i10 > this.eF))
              continue;
            arrayOfByte2[i11][i10] = 1;
            if (arrayOfByte1[i11][i10] <= 0)
              continue;
            int tmp474_472 = i10;
            byte[] tmp474_471 = arrayOfByte1[i11];
            tmp474_471[tmp474_472] = (byte)(tmp474_471[tmp474_472] | 0x4);
          }
        i1 = 5;
      }
      else
      {
        i1 = 2;
      }
      if (paramInt3 == 1)
        x();
    }
    this.da = i1;
  }

  public final void paint(Graphics paramGraphics)
  {
    if (dx)
      return;
    this.s = false;
    paramGraphics.setClip(0, 0, this.g, this.c);
    g(paramGraphics);
    c(paramGraphics);
    f(paramGraphics);
    n();
    if (ca)
      try
      {
        a(paramGraphics, h.x);
        return;
      }
      catch (Exception localException)
      {
      }
  }

  private void f(Graphics paramGraphics)
  {
    if (f.a(paramGraphics))
      return;
    if (k.a(paramGraphics))
      return;
    try
    {
      if ((this.dy) || (this.cq) || (this.cp))
      {
        try
        {
          if (this.cp)
          {
            try
            {
              c(paramGraphics);
            }
            catch (Exception localException1)
            {
            }
            h.a(paramGraphics, l[3][3], false);
          }
          if ((this.dy) || (this.cq))
            c(paramGraphics);
          if (this.dy)
            h.a(paramGraphics);
          if (this.cq)
            h.a(paramGraphics, l[1][6], false);
        }
        catch (Exception localException2)
        {
        }
        this.dy = false;
        this.cq = false;
        this.cp = false;
        if (!this.cH)
          return;
      }
      if (this.cH)
      {
        i(paramGraphics);
        return;
      }
      if (this.du)
      {
        j(paramGraphics);
        return;
      }
      if ((bN) && (!this.aw))
        try
        {
          this.bO.b(paramGraphics);
          return;
        }
        catch (Exception localException3)
        {
          return;
        }
      if (this.ag)
        return;
      if (this.cE)
        h(paramGraphics);
      if (this.L)
        d(paramGraphics);
      m(paramGraphics);
      if (this.ah)
        e(paramGraphics);
      if (this.aj)
        k(paramGraphics);
    }
    catch (Exception localException4)
    {
    }
    if ((bN) && (this.aw))
      try
      {
        this.bO.b(paramGraphics);
        return;
      }
      catch (Exception localException5)
      {
      }
  }

  private final void g(Graphics paramGraphics)
  {
    this.aB = (this.c - eG);
    if (eG < 0)
      eG = 0;
    if ((eG > 0) && (this.q[8] != null) && (this.q[9] != null))
    {
      int i1 = this.q[8].getHeight();
      int i2 = this.q[9].getHeight();
      int i3 = eG - i1 - i2;
      paramGraphics.setClip(0, i3, this.g, this.c - i3);
      a(paramGraphics, this.q[8], 0, i3, this.g);
      a(paramGraphics, this.q[9], 0, i3 + i1, this.g);
    }
    paramGraphics.setClip(0, eG, this.g, this.aB);
  }

  static final void o()
  {
    long l1;
    if ((l1 = System.currentTimeMillis()) - dN >= 72L)
    {
      dN = l1;
      if (eG > 0)
      {
        int i1;
        if ((i1 = NET_Lizard.c.c >> 2) < 1)
          i1 = 1;
        if (eG > NET_Lizard.c.c)
          eG = NET_Lizard.c.c;
        if (eG > 0)
          eG -= i1;
        if (eG < 0)
          eG = 0;
      }
    }
  }

  final void p()
  {
    this.cp = true;
    repaint();
    serviceRepaints();
  }

  private void al()
  {
    this.cq = true;
    repaint();
    serviceRepaints();
  }

  private static void j(int paramInt)
  {
    if (!e.k)
      return;
    if (m.n == null)
    {
      boolean bool = bN;
      bN = false;
      ax.al();
      bN = bool;
      m.a(NET_Lizard.c);
      if (m.j == null)
        m.a();
    }
    m.a(paramInt);
  }

  protected final void pointerDragged(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, false, false, true);
  }

  protected final void pointerPressed(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, true, false, false);
  }

  protected final void pointerReleased(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, false, true, false);
  }

  private static int k(int paramInt)
  {
    return paramInt + 1;
  }

  private final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.bX = false;
      if (ca)
        z[8] = 0;
      else
        e.a[8] = 0;
    }
    if (paramBoolean2)
    {
      this.cE = false;
      this.aw = false;
    }
    ae();
  }

  private final void h(Graphics paramGraphics)
  {
    c(paramGraphics);
    if (this.L)
      return;
    if ((this.f == 0) && (this.dX != null))
    {
      if ((i1 = this.cL + (this.eM - this.cL - (h.x.b() - h.x.f) >> 1)) < this.cL + 2)
        i1 = this.cL + 2;
      h.x.a(paramGraphics, this.dX, this.h, i1, 17);
    }
    int i1 = 0;
    boolean bool2 = (this.f == 0) || ((this.f == 1) && (!this.an) && (!this.cZ));
    if ((this.f != 5) || (this.dD < this.dK))
    {
      boolean bool1;
      if (this.aY > 0)
      {
        if (((bool1 = a(paramGraphics, this.bB, this.bI, this.bD, this.ew, this.eN, this.aY, bool2, this.R == 1, true))) && (this.R == 1))
        {
          this.el = (this.cu + cw);
          this.eA = (this.cv + cx);
          Z();
          if (cs)
            O();
        }
        if ((this.S) && (ct))
          O();
      }
      if (this.ba > 0)
        if (((bool1 = a(paramGraphics, this.bC, this.bJ, this.bE, this.ey, this.eP, this.ba, bool2, this.R == 2, false))) && (this.R == 2))
        {
          this.el = (this.cu + cw);
          this.eA = (this.cv + cx);
          Z();
          if (cs)
            O();
        }
    }
    if (((this.f == 1) || ((this.f == 5) && (this.dD < this.dK))) && (this.aY == this.aX) && (this.ew == this.ev) && (this.eN == this.eM) && ((this.ba == this.aZ) || (ca)) && (this.ey == this.ex) && (this.eP == this.eO))
      d(paramGraphics, this.bS, this.bT, this.bR, this.bQ);
    if (this.f != 5)
      l(paramGraphics);
    if (this.f == 5)
    {
      int i2 = 0;
      if ((this.f == 5) && (this.eh != null) && (this.dD >= this.dK))
      {
        b(paramGraphics);
        int i3 = this.cL;
        int i4 = this.cK;
        a(paramGraphics, 0, i3, this.g, this.c - i4 - i3);
        i2 = this.c - this.eh.getHeight() >> 1;
        paramGraphics.drawImage(this.eh, this.g - this.eh.getWidth() >> 1, this.c - this.eh.getHeight() >> 1, 20);
        a(paramGraphics);
      }
      String str = l[3][0];
      if (this.dA)
        str = l[3][1];
      d locald;
      int i5 = (locald = h.x).a(str);
      int i6 = locald.b();
      int i7 = this.h - (locald.a(str) >> 1);
      int i8 = this.cL;
      if ((i8 = (i2 - i8 - i6 >> 1) + i8) < this.cL + 2)
        i8 = this.cL + 2;
      i2 = this.d;
      if (this.eh != null)
        i2 = this.c - (this.eh.getHeight() - this.eh.getHeight() >> 2) >> 1;
      if ((i8 + i6 < i2) && (this.aY == 0) && (this.ba == 0) && (i7 >= 0 - i5) && (i8 >= 0 - i6) && (i7 < this.g) && (i8 < this.c))
      {
        locald.a(paramGraphics, str, i7, i8, 20);
        if ((a(0, i8 - 2, this.g, i6 + 4)) && (cs))
        {
          n(53);
          i = false;
        }
      }
    }
  }

  private final void am()
  {
    for (int i1 = 0; (i1 < 3) && (!this.cF) && (l.g); i1++)
    {
      d(33, 0, 0, 0);
      while ((this.j > 0) && (l.g))
      {
        this.bo = 1;
        ad();
        try
        {
          Thread.sleep(3L);
        }
        catch (Exception localException1)
        {
        }
      }
    }
    if ((this.cF) && (l.g))
      al();
    while ((this.cF) && (l.g))
    {
      d(33, 0, 0, 0);
      while ((this.j > 0) && (l.g))
      {
        this.bo = 1;
        ad();
        try
        {
          Thread.sleep(3L);
        }
        catch (Exception localException2)
        {
        }
      }
    }
  }

  private final void an()
  {
    if (dB)
      return;
    long l1;
    if (((l1 = System.currentTimeMillis()) - this.dU < 777L) || (this.L) || (this.ah) || (this.ag))
      return;
    this.dU = l1;
  }

  private final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.n[2] != null)
    {
      i1 = this.n[2].getWidth();
      int i2 = this.n[2].getHeight() >> 1;
      paramInt1 -= (i1 >> 1);
      int i3 = 0;
      Image localImage = this.n[2];
      if (paramBoolean2)
      {
        i3 = i2;
        paramInt2 += 0;
      }
      else
      {
        paramInt2 = paramInt2 -= i2 - 0;
      }
      b(paramGraphics);
      a(paramGraphics, paramInt1, paramInt2, i1, i2);
      paramGraphics.drawImage(localImage, paramInt1, paramInt2 - i3, 20);
      a(paramGraphics);
      paramInt1 -= 3;
      i1 += 6;
      i2 += 3;
      if (!paramBoolean2)
        paramInt2 -= 3;
      int i4 = paramInt1;
      int i5 = i1;
      int i6 = paramInt2;
      int i7 = i2;
      if ((a(i4, i6, i5, i7)) && (cs))
      {
        if (paramBoolean2)
          n(56);
        else
          n(50);
        i = false;
      }
      return;
    }
    if (paramBoolean1)
      paramGraphics.setColor(10223442);
    else
      paramGraphics.setColor(35346);
    int i1 = paramInt3;
    if (!paramBoolean2)
      paramInt2 -= i1;
    h.a(paramGraphics, this.h, paramInt2, paramInt3 << 1, i1, paramBoolean2);
  }

  private final void a(Graphics paramGraphics, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramGraphics, this.h, paramInt1, paramInt2, paramBoolean1, paramBoolean2);
  }

  private final void d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      int i1 = this.df[(35 - this.dl)][0].getHeight();
      int i2 = paramInt4 - 4 * i1;
      int i3 = this.df[(35 - this.dl)][0].getWidth() + this.df[(15 - this.dl)][0].getWidth() + this.df[(17 - this.dl)][0].getWidth() + this.df[(18 - this.dl)][0].getWidth() + this.df[(23 - this.dl)][0].getWidth();
      int i4;
      int i5 = i4 = paramInt3 - i3;
      int i6 = i4 /= 5;
      if (!this.cP)
      {
        i4 = i5 / 4;
        i6 = 0;
      }
      d locald = h.x;
      int i7 = paramInt1 + paramInt3;
      int i8 = this.ex + this.aZ * (this.ep + 1);
      if ((!this.cP) && (i7 >= i8) && (i7 - i8 < i5) && (this.ev == this.ex))
      {
        i4 = (i4 = (paramInt3 = i8 - paramInt1) - i3) / 4;
        i6 = 0;
      }
      i2 /= 5;
      int i9 = paramInt1 + i4;
      int i11 = i10 = paramInt2 + i2;
      for (int i12 = 0; i12 < 4; i12++)
      {
        if (this.bg[i12] == this.bg[i12] >> 1 << 1)
        {
          paramGraphics.drawImage(this.df[(32 - this.dl + i12)][0], i9, i10, 20);
          i13 = 12 - this.dl + this.bf[i12];
          paramGraphics.drawImage(this.df[i13][0], i9 + this.df[(35 - this.dl)][0].getWidth() + i4, i10 + (this.df[(32 - this.dl + i12)][0].getHeight() - this.df[i13][0].getHeight() >> 1), 20);
        }
        i10 += i1 + i2;
      }
      i9 += this.df[(35 - this.dl)][0].getWidth() + i4 + this.df[(15 - this.dl)][0].getWidth() + i4;
      int i13 = 31;
      if (!ca)
        i13 = 27;
      int i14;
      if ((i14 = (i14 = (i14 = paramInt4 - (this.df[(i13 - this.dl)][0].getHeight() + this.df[(17 - this.dl)][0].getHeight() + 2)) - (locald.b() + 1)) / 4) < 1)
        i14 = 1;
      int i15 = 18 - this.dl;
      if (ca)
        i15--;
      int i16 = i9;
      int i17 = this.c;
      int i10 = paramInt2 + paramInt4 - i14;
      paramGraphics.drawImage(this.df[i15][0], i9, i10 - this.df[i15][0].getHeight(), 20);
      int i18 = 24 - this.dl + this.eQ;
      if (ca)
        i18 = 28 - this.dl + this.eQ;
      if (this.dR == 0)
      {
        paramGraphics.drawImage(this.df[i18][0], i9 + (this.df[i15][0].getWidth() - this.df[i18][0].getWidth() >> 1), i10 - this.df[i15][0].getHeight() - 1 - this.df[i18][0].getHeight(), 20);
        i17 = i10 - this.df[i15][0].getHeight() - 1 - this.df[i18][0].getHeight();
      }
      int i19 = i9 + this.df[i15][0].getWidth();
      i15 = 17 - this.dl;
      int i20 = i9 = paramInt1 + paramInt3 - i6;
      i9 -= this.df[i15][0].getWidth();
      paramGraphics.drawImage(this.df[i15][0], i9, i10 - this.df[i15][0].getHeight(), 20);
      int i21 = this.c;
      if (this.dR == 4)
      {
        paramGraphics.drawImage(this.df[i18][0], i9 + (this.df[i15][0].getWidth() - this.df[i18][0].getWidth() >> 1), i10 - this.df[i15][0].getHeight() - 1 - this.df[i18][0].getHeight(), 20);
        i21 = i10 - this.df[i15][0].getHeight() - 1 - this.df[i18][0].getHeight();
      }
      i9 = i19 + (i9 - i19 >> 1);
      i15 = 19 - this.dl + this.dR;
      paramGraphics.drawImage(this.df[i15][0], i9 - (this.df[i15][0].getWidth() >> 1), i10 - this.df[i15][0].getHeight(), 20);
      int i22;
      if ((i22 = i17) < i21)
        i22 = i21;
      String str1 = "" + a(by);
      String str2 = "" + a(eg);
      String str3 = ":";
      int i23;
      int i24;
      if ((i24 = (i23 = locald.a(str1 + str3 + str2) - 3 * locald.e) + 2 * (locald.a(" ") - locald.e)) < i20 - i16)
      {
        i25 = i20 - i16 - i24 >> 1;
        i16 += i25;
        i20 -= i25;
      }
      locald.a(paramGraphics, str1, i16, i11, 20);
      int i25 = i16 + locald.a(str1) - locald.e;
      int i26;
      if ((i26 = i20 - locald.a(str2)) < i25 + locald.e + locald.a(str3))
        i26 = i25 + locald.e + locald.a(str3);
      locald.a(paramGraphics, str2, i26, i11, 20);
      int i27 = (i27 = i25 + (i26 - i25 >> 1)) - (locald.a(str3) - locald.e >> 1);
      locald.a(paramGraphics, str3, i27, i11, 20);
      int i28;
      if ((i28 = i11 + locald.b()) < i22)
      {
        paramGraphics.setColor(41, 85, 156);
        paramGraphics.fillRect(i16, i28, i20 - i16, 1);
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  final void q()
  {
    try
    {
      if (this.bx != 0)
        this.ed = (this.bn * this.ec / this.bx);
      else
        this.ed = 0;
      int i1 = 4;
      if (this.g < 176)
        i1 = 2;
      if ((this.ed >= this.ee + i1) || (this.bn >= this.bx - 1))
      {
        this.cH = true;
        repaint();
        serviceRepaints();
        this.cH = false;
        try
        {
          Thread.sleep(1L);
        }
        catch (Exception localException1)
        {
        }
        try
        {
          long l1;
          if ((l1 = System.currentTimeMillis()) - this.br > 100L)
          {
            this.bq = (!this.bq);
            this.br = l1;
          }
          if (this.bn == 0)
          {
            this.dn = l1;
          }
          else
          {
            long l2 = l1 - this.dn;
            long l3 = this.bn * this.dF / this.bx;
            if (l2 < l3)
              Thread.sleep(l3 - l2);
          }
        }
        catch (Exception localException2)
        {
        }
        this.ee = this.ed;
      }
      if (this.bn < this.bx)
        this.bn += 1;
    }
    catch (Exception localException3)
    {
    }
    o();
  }

  private void i(Graphics paramGraphics)
  {
    try
    {
      c(paramGraphics);
      int i1 = this.cL + ((this.c - this.cL - this.cK) * 7 >> 4);
      if (this.q[3] != null)
        i1 = i1 / this.q[3].getHeight() * this.q[3].getHeight();
      int i2 = i1;
      if (this.q[4] != null)
      {
        paramGraphics.drawImage(this.q[4], 0, i1, 20);
        i2 += this.q[4].getHeight();
      }
      int i3 = this.cL + (i1 - this.cL >> 1);
      if (this.q[6] != null)
      {
        int i4 = 6;
        if ((this.bq) && (this.q[7] != null))
          i4 = 7;
        paramGraphics.drawImage(this.q[i4], this.ed, i1 - this.q[i4].getHeight(), 20);
        i3 = this.cL + (i1 - this.q[i4].getHeight() - this.cL >> 1);
      }
      i2 += (this.q[3].getHeight() >> 1);
      d locald = h.x;
      int i5;
      if ((i5 = this.bx) > 1)
        i5--;
      int i6;
      if ((i6 = this.bn * 100 / i5) < 0)
        i6 = 0;
      if (i6 > 100)
        i6 = 100;
      String str = "" + i6 + "%";
      locald.a(paramGraphics, str, this.g - locald.a(str) >> 1, i2, 20);
      int i7 = i2 += locald.b() + (this.c - this.cK - i2 >> 1);
      str = l[0][11] + l[7][cW];
      if (!ca)
        locald.a(paramGraphics, str, this.g - locald.a(str) >> 1, i7 - (locald.b() >> 1), 20);
      str = l[1][0];
      if (this.cI)
        str = l[1][6];
      locald.a(paramGraphics, str, this.g - locald.a(str) >> 1, i3 - (locald.b() >> 1), 20);
      if (this.cI)
        c(paramGraphics, 8, this.g, this.c, 40);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final boolean e(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      if ((this.dd == null) || (this.cC == null))
        return false;
      for (int i1 = 0; i1 < this.be; i1++)
      {
        if ((this.cC[i1] != paramInt2) || (this.dd[i1][paramInt1] == null) || (this.dd[i1][paramInt1].getWidth() != i(paramInt2)))
          continue;
        paramGraphics.drawImage(this.dd[i1][paramInt1], paramInt3, paramInt4, 20);
        return true;
      }
    }
    catch (Exception localException)
    {
    }
    if (paramInt1 == 5)
      return e(paramGraphics, 2, paramInt2, paramInt3, paramInt4);
    if (paramInt1 == 6)
      return e(paramGraphics, 5, paramInt2, paramInt3, paramInt4);
    return false;
  }

  private final boolean f(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      int i1 = 0;
      if (paramInt2 == this.aZ)
        i1 = 1;
      paramGraphics.drawImage(this.df[(paramInt1 - this.dl)][i1], paramInt3, paramInt4, 20);
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private final void j(Graphics paramGraphics)
  {
    this.dr = false;
    if (paramGraphics != null)
      b(paramGraphics);
    a(paramGraphics, 0, this.cL + 2, this.g, this.c - this.cK - this.cL - 4);
    this.aD = (this.c - this.cK - this.cL - 4);
    int i1 = this.c - this.cK - this.cL;
    int i2 = this.dq.getHeight();
    int i3 = this.dJ[1].length;
    d locald = h.x;
    int i4;
    if ((i4 = (i1 -= 4 * i2 + (i3 + 2) * (locald.b() - locald.f)) / (4 + i3 + 3 + 4)) < 2)
      i4 = 2;
    if (i4 > 10)
      i4 = 10;
    int i5 = this.cL + i4 - this.dt;
    int i6 = 0;
    int i7 = this.cL - this.dt;
    int i8;
    if ((i8 = this.g >> 5) < 2)
      i8 = 2;
    locald.a(paramGraphics, this.dJ[2][0], this.h, i5, 17);
    i5 = i5 += i4 + (locald.b() - locald.f) + i4;
    locald.a(paramGraphics, this.dJ[2][1], 3, i5, 20);
    i5 += i4 + (locald.b() - locald.f);
    for (int i9 = 0; i9 < 4; i9++)
    {
      i6 = i8;
      if (paramGraphics != null)
      {
        for (int i10 = 0; i10 < i9 + 1; i10++)
        {
          paramGraphics.drawImage(this.dq, i6, i5, 20);
          i6 += this.dq.getWidth() - 1;
        }
        locald.a(paramGraphics, " x" + this.dw[i9], i6 + i8, i5 + 1 + (this.dq.getHeight() - (locald.b() - locald.f) >> 1), 20);
      }
      i5 += i4 + i2;
    }
    i5 += i4;
    i6 = i8;
    String[] arrayOfString = new String[i3];
    String str1 = "" + this.dw[6];
    String str2 = "" + this.dw[7];
    if (this.dw[7] < 10)
      str2 = "0" + this.dw[7];
    String str3 = "" + this.dw[8];
    if (this.dw[8] < 10)
      str3 = "0" + this.dw[8];
    arrayOfString[0] = (str1 + ":" + str2 + ":" + str3);
    for (int i11 = 0; i11 < i3; i11++)
      locald.a(this.dJ[1][i11]);
    int i12 = locald.a(arrayOfString[0]);
    for (int i13 = 1; i13 < i3; i13++)
    {
      if (i13 > 0)
        arrayOfString[i13] = ("" + this.dw[(i13 + 8)]);
      i14 = locald.a(arrayOfString[i13]);
      if (i12 >= i14)
        continue;
      i12 = i14;
    }
    for (int i14 = 0; i14 < i3; i14++)
    {
      String str4 = this.dJ[1][i14];
      if (paramGraphics != null)
      {
        locald.a(paramGraphics, str4, i6 + i8, i5, 20);
        int i15 = i6 + i8 + locald.a(str4 + " ");
        int i16 = this.g - i8 - i12;
        int i17 = this.g - i8 - locald.a(arrayOfString[i14]);
        if (i16 < i15)
          i16 = i15;
        if (i16 > i17)
          i16 = i17;
        locald.a(paramGraphics, arrayOfString[i14], i16, i5, 20);
      }
      i5 += i4 + (locald.b() - locald.f);
      if ((i14 != 0) && (i14 != 3))
        continue;
      i5 += i4;
    }
    this.aC = (i5 - i7);
    i5 -= i4;
    this.dr = (i5 >= this.c - this.cK - 2);
    a(paramGraphics);
  }

  final int r()
  {
    return Math.abs(this.eR.nextInt() % 100);
  }

  private final void a(byte[][] paramArrayOfByte)
  {
    for (int i1 = 0; i1 <= this.eF; i1++)
      for (i2 = 0; i2 <= this.ep; i2++)
        paramArrayOfByte[i2][i1] = 0;
    int i2 = 1;
    int i5;
    for (int i3 = 4; i3 >= 1; i3--)
    {
      for (i4 = 0; i4 < i2; i4++)
      {
        int i6 = 0;
        int i8;
        int i9;
        int i10;
        do
        {
          i7 = r() < 50 ? 1 : 0;
          i8 = this.ep + 1;
          i9 = this.eF + 1;
          if (i7 != 0)
            i9 -= i3 - 1;
          else
            i8 -= i3 - 1;
          i10 = Math.abs(this.eR.nextInt() % i8);
          int i11 = Math.abs(this.eR.nextInt() % i9);
          i5 = a(i3, paramArrayOfByte, i10, i11, i7);
          i6++;
        }
        while (((i6 <= 256) || (i5 != 0)) && (i5 == 0));
        if (i5 != 0)
          continue;
        for (int i7 = 0; i7 <= this.eF; i7++)
          for (i8 = 0; i8 <= this.ep; i8++)
          {
            i9 = 1;
            if (i3 > 1)
              i9 = 2;
            for (i10 = 0; i10 < i9; i10++)
              if ((i5 = a(i3, paramArrayOfByte, i8, i7, i10 > 0)))
                break;
          }
      }
      i2++;
    }
    for (int i4 = 0; i4 <= this.eF; i4++)
      for (i5 = 0; i5 <= this.ep; i5++)
      {
        if (paramArrayOfByte[i5][i4] >= 0)
          continue;
        paramArrayOfByte[i5][i4] = 0;
      }
  }

  private static byte[] l(int paramInt)
  {
    byte[] arrayOfByte = new byte[2];
    int i1 = paramInt / 256;
    int i2 = paramInt - 256 * i1;
    arrayOfByte[0] = g(i1);
    arrayOfByte[1] = g(i2);
    return arrayOfByte;
  }

  private static int a(byte paramByte1, byte paramByte2)
  {
    return 256 * a(paramByte1) + a(paramByte2);
  }

  public final void run()
  {
    this.D = true;
    ar = false;
    if (aD())
      m.g = true;
    f.a(this, h.x);
    h.p = f.b(h.p);
    if (f.a())
    {
      NET_Lizard.a();
      return;
    }
    k.a(this, h.x);
    try
    {
      l = e.m.c(a(this.ap[3]));
      ci = false;
    }
    catch (Exception localException1)
    {
    }
    try
    {
      bu = e.m.c(a(this.ap[5]));
    }
    catch (Exception localException2)
    {
      bu = null;
    }
    if (this.m == null)
      try
      {
        this.m = e.a(a(this.ap[6]));
      }
      catch (Exception localException3)
      {
      }
    for (int i1 = 0; i1 < this.n.length; i1++)
      try
      {
        this.n[i1] = e.a(a(this.ap[7]) + i1 + a(this.ap[8]));
      }
      catch (Exception localException4)
      {
      }
    e.a();
    cX = e.a[15];
    if (e.a[12] == 7)
      h.p = false;
    this.aw = false;
    dx = false;
    ab();
    aa();
    try
    {
      e.a(a(this.ap[9]));
    }
    catch (Exception localException5)
    {
    }
    F();
    K();
    if ((e.m.b(a(this.ap[0])) > 0) && (e.m.b(a(this.ap[1])) > 0))
      at = d.a(a(this.ap[2]), a(this.ap[2]));
    dx = false;
    h.an = true;
    if (this.bO == null)
      this.bO = new h(this);
    if (bN)
    {
      this.cN = false;
      ag();
      this.cN = true;
      this.bO.e();
    }
    boolean bool = bN;
    long l1 = 7L;
    int i2 = 0;
    int i3 = 0;
    long l2 = 0L;
    while (this.D)
    {
      if (e.d >= 0)
        ae();
      while (this.D)
      {
        if ((h.p) && (f.a(bN)))
          ag();
        if (f.e())
        {
          repaint();
          serviceRepaints();
          try
          {
            Thread.sleep(7L);
          }
          catch (Exception localException6)
          {
          }
        }
        else
        {
          if (ar)
            return;
          if (bN)
          {
            bool = bN;
            this.bO.e();
          }
          else
          {
            if (bN != bool)
            {
              bool = bN;
              break;
            }
            try
            {
              Thread.sleep(l1);
            }
            catch (Exception localException7)
            {
            }
            l1 = 7L;
            X();
            i2 = 0;
            if ((!bN) && ((this.L) || (this.aG != null)))
              i2 = 1;
            if (i2 != i3)
            {
              if (i2 != 0)
                l2 = System.currentTimeMillis() - f.D;
              else
                f.D = System.currentTimeMillis() - l2;
              i3 = i2;
            }
            if (i2 != 0)
              f.D = 0L;
            if (f.d())
              continue;
            if ((e.d > 0) && (f.ai == null))
              an();
            this.aw = (0x1 ^ ((bN) || ((this.L) && (!ca)) || (this.du) || (this.cO) || (this.ag) || (this.ah) || (this.ai) || (this.aj) ? 1 : 0));
            if (this.ai)
            {
              this.aw = false;
              if ((!this.aj) && (System.currentTimeMillis() > this.dL + 1777L))
                this.aj = true;
            }
            if (this.ag)
              break;
            if ((e.d < 0) || (f.ai != null))
            {
              long l3 = System.currentTimeMillis();
              repaint();
              serviceRepaints();
              if (this.bO != null)
                this.bO.c();
              long l4;
              long l5 = (l4 = System.currentTimeMillis()) - l3;
              long l6 = 88L;
              if (l5 < l6)
                try
                {
                  Thread.sleep(l6 - l5);
                }
                catch (Exception localException8)
                {
                }
            }
            else
            {
              a();
            }
          }
        }
      }
      if (this.ag)
        break;
    }
    this.dy = false;
    if (ar)
      return;
    al();
    try
    {
      Thread.sleep(7L);
    }
    catch (Exception localException9)
    {
    }
    if ((b != null) && (l.g))
      b();
    try
    {
      e.j = true;
      e.b();
      e.a(this.ce, z);
      ar();
    }
    catch (Exception localException10)
    {
    }
    NET_Lizard.a();
  }

  private final void e(byte[] paramArrayOfByte)
  {
    this.cN = false;
    if (paramArrayOfByte == null)
      return;
    try
    {
      for (int i1 = 112; i1 < paramArrayOfByte.length; i1++)
        paramArrayOfByte[i1] = 0;
      paramArrayOfByte[8] = 1;
      if (this.f == 5)
        paramArrayOfByte[8] = 0;
      e.d = (eg | by) + 1;
      paramArrayOfByte[9] = (byte)e.d;
      paramArrayOfByte[17] = eg;
      paramArrayOfByte[18] = by;
      int i2 = 112;
      paramArrayOfByte[112] = (byte)this.el;
      i2++;
      paramArrayOfByte[113] = (byte)this.eA;
      i2++;
      paramArrayOfByte[114] = (byte)this.R;
      i2++;
      paramArrayOfByte[115] = 0;
      if (this.an)
        paramArrayOfByte[115] = 1;
      i2++;
      int i3;
      for (int i4 = 0; i4 <= this.eF; i4++)
        for (i3 = 0; i3 <= this.ep; i3++)
        {
          paramArrayOfByte[i2] = this.bB[i3][i4];
          i2++;
        }
      for (i4 = 0; i4 <= this.eF; i4++)
        for (i3 = 0; i3 <= this.ep; i3++)
        {
          paramArrayOfByte[i2] = this.bC[i3][i4];
          i2++;
        }
      for (i4 = 0; i4 <= this.eF; i4++)
        for (i3 = 0; i3 <= this.ep; i3++)
        {
          paramArrayOfByte[i2] = this.bI[i3][i4];
          i2++;
        }
      for (i4 = 0; i4 <= this.eF; i4++)
        for (i3 = 0; i3 <= this.ep; i3++)
        {
          paramArrayOfByte[i2] = this.bJ[i3][i4];
          i2++;
        }
      paramArrayOfByte[i2] = cW;
      i2++;
      e.f = e.d;
      paramArrayOfByte[i2] = (byte)this.cU;
      i2++;
      paramArrayOfByte[i2] = (byte)this.cV;
      i2++;
      paramArrayOfByte[i2] = (byte)this.cT;
      i2++;
      paramArrayOfByte[i2] = (byte)this.cS;
      i2++;
      paramArrayOfByte[i2] = 0;
      if (this.S)
        paramArrayOfByte[i2] = 1;
      i2++;
      paramArrayOfByte[i2] = (byte)this.f;
      i2++;
      paramArrayOfByte[i2] = 0;
      if (this.bY)
        paramArrayOfByte[i2] = 1;
      i2++;
      paramArrayOfByte[i2] = 0;
      if (this.bZ)
        paramArrayOfByte[i2] = 1;
      i2++;
      paramArrayOfByte[i2] = eg;
      i2++;
      paramArrayOfByte[i2] = by;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void ao()
  {
    if ((ca) && (!this.ah))
    {
      ap();
      return;
    }
    byte[] arrayOfByte = e.a;
    if (ca)
      arrayOfByte = null;
    e(arrayOfByte);
    e.b();
  }

  private void ap()
  {
    byte[] arrayOfByte = z;
    if (!l.b)
      arrayOfByte = null;
    e(arrayOfByte);
    if (arrayOfByte != null)
      e.a(this.ce, arrayOfByte);
  }

  private final void aq()
  {
    e.b();
  }

  static final void b(Graphics paramGraphics)
  {
    dg = paramGraphics.getClipX();
    dh = paramGraphics.getClipY();
    di = paramGraphics.getClipWidth();
    dj = paramGraphics.getClipHeight();
  }

  private static void a(int paramInt1, int paramInt2)
  {
    int i1 = ay - 1;
    int i2 = 0;
    i2 = 64 + i1 * 20 + paramInt1 * 2;
    int i3 = paramInt2 >> 8;
    int i4 = paramInt2 - i3 * 256;
    e.a[i2] = (byte)i3;
    e.a[(i2 + 1)] = (byte)i4;
  }

  private final void m(int paramInt)
  {
    int i1 = cW;
    int i2 = 0;
    int i3;
    if ((i2 = i3 = i1) >= 0)
      a(i2, paramInt);
  }

  private void ar()
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.dw.length; i2++)
    {
      int i3 = this.dw[i2];
      for (int i4 = 0; i4 < 4; i4++)
      {
        int i5 = i3 & 0xFF;
        au[i1] = (byte)i5;
        i3 >>= 8;
        i1++;
      }
    }
    e.a(this.cf, au);
  }

  private final int b(int paramInt1, int paramInt2)
  {
    int i1;
    if ((i1 = paramInt1 * (10 + (cW - 1) * 2) - (paramInt2 * (10 + (cW - 1) * 2) >> 2)) < 0)
      i1 = 0;
    if (i1 > 0)
      m(i1);
    return i1;
  }

  private final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (!ca)
      return true;
    Object localObject = null;
    if (paramInt1 == 1)
      localObject = this.bB;
    if (paramInt1 == 2)
      localObject = this.bC;
    if (paramInt1 == 3)
      localObject = this.bI;
    if (paramInt1 == 4)
      localObject = this.bJ;
    if (paramInt1 == 22)
    {
      (localObject = new byte[1][])[0] = z;
      if (paramInt3 >= 256)
        paramInt2 = paramInt3 / 256;
    }
    byte[] arrayOfByte1 = null;
    if (paramInt4 >= 0)
      arrayOfByte1 = new byte[4 + paramInt4];
    else
      arrayOfByte1 = new byte[4];
    if (paramInt1 == 11)
      arrayOfByte1 = new byte[4];
    if (((paramInt1 < 1) || (paramInt1 > 4)) && (paramInt1 != 22))
      arrayOfByte1 = new byte[4];
    if (paramInt1 == 20)
    {
      byte[] arrayOfByte2;
      paramInt2 = (arrayOfByte2 = l(O))[0];
      paramInt3 = arrayOfByte2[1];
    }
    arrayOfByte1[0] = (byte)paramInt1;
    arrayOfByte1[1] = (byte)paramInt2;
    arrayOfByte1[2] = (byte)paramInt3;
    arrayOfByte1[3] = (byte)paramInt4;
    int i1;
    if ((paramInt1 < 10) && (localObject != null))
      for (i1 = 0; i1 < paramInt4; i1++)
        arrayOfByte1[(4 + i1)] = localObject[(paramInt3 + i1)][paramInt2];
    if (paramInt1 == 22)
      for (i1 = 0; i1 < paramInt4; i1++)
        arrayOfByte1[(4 + i1)] = localObject[0][(paramInt3 + i1)];
    if (paramBoolean)
      return c(arrayOfByte1);
    return b(arrayOfByte1);
  }

  private final boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, paramInt4, false);
  }

  static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = dg;
    int i2 = dh;
    int i3 = di;
    int i4 = dj;
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
    paramGraphics.setClip(i5, i6, paramInt3, paramInt4);
  }

  private final void as()
  {
    if (this.dD - this.bw >= 4700L)
    {
      if (this.dD - this.bv < 60000L)
        try
        {
          try
          {
            Class.forName("com.nokia.mid.ui.FullCanvas");
            DeviceControl.setLights(0, 100);
          }
          catch (Exception localException)
          {
          }
        }
        catch (Throwable localThrowable)
        {
        }
      this.bw = this.dD;
    }
  }

  private final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, byte[][] paramArrayOfByte)
  {
    int i1 = 0;
    if (paramBoolean)
      i1 = 1;
    int i2 = 1;
    int i3 = paramInt4 > paramInt3 ? 1 : 0;
    int i4 = paramInt3;
    if (i3 != 0)
      i4 = paramInt4;
    int i5 = paramInt1 + paramInt3 - 1;
    int i6 = paramInt2 + paramInt4 - 1;
    for (int i7 = paramInt2; i7 < paramInt2 + paramInt4; i7++)
      for (int i8 = paramInt1; i8 < paramInt1 + paramInt3; i8++)
      {
        paramArrayOfByte[i8][i7] = i1;
        if (((this.ak) && ((i8 != i5) || (i7 != i6))) || (i2 == 0) || (i1 <= 0))
          continue;
        int tmp114_112 = i7;
        byte[] tmp114_111 = paramArrayOfByte[i8];
        tmp114_111[tmp114_112] = (byte)(tmp114_111[tmp114_112] | 0x2);
        if (i3 != 0)
        {
          int tmp132_130 = i7;
          byte[] tmp132_129 = paramArrayOfByte[i8];
          tmp132_129[tmp132_130] = (byte)(tmp132_129[tmp132_130] | 0x8);
        }
        int tmp146_144 = i7;
        byte[] tmp146_143 = paramArrayOfByte[i8];
        tmp146_143[tmp146_144] = (byte)(tmp146_143[tmp146_144] | i4 << 4);
        i2 = 0;
      }
  }

  private final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
  {
    byte[][] arrayOfByte = null;
    if (paramInt5 == 1)
      arrayOfByte = this.bB;
    else
      arrayOfByte = this.bC;
    a(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, arrayOfByte);
  }

  private final void at()
  {
    this.ao = 0;
    if (cW == 0)
      this.ao = -20;
    if (cW == 2)
      this.ao = 20;
    this.ao += this.eR.nextInt() % 3;
  }

  private final void a(int paramInt, boolean[] paramArrayOfBoolean)
  {
    if (((paramInt = h(paramInt)) >= 0) && (paramArrayOfBoolean != null) && (paramInt < paramArrayOfBoolean.length))
      paramArrayOfBoolean[paramInt] = true;
  }

  private final void au()
  {
    for (int i1 = 0; i1 < this.bf.length; i1++)
      this.bf[i1] = 0;
    if ((ca) && (this.bY))
      return;
    byte[][] arrayOfByte = this.bC;
    for (int i2 = 0; i2 <= this.eF; i2++)
      for (int i3 = 0; i3 <= this.ep; i3++)
      {
        int i4;
        if ((arrayOfByte[i3][i2] <= 0) || (((i4 = arrayOfByte[i3][i2]) & 0x2) == 0) || ((i4 & 0x4) != 0))
          continue;
        int i5 = i4 >> 4 & 0x7;
        this.bf[(i5 - 1)] += 1;
      }
  }

  private final void av()
  {
    a(this.bB);
    a(this.bC);
    this.da = 6;
    if (eg + by == 0)
      J();
  }

  private final void aw()
  {
    int i1 = 0;
    int i2 = 0;
    i2 = this.cL;
    i1 = this.cK;
    int i3 = this.c - i2 - i1;
    boolean bool = this.g > i3;
    int i4;
    if ((i4 = this.g) > i3)
      i4 = i3;
    int i5;
    if ((i5 = i3) < this.g)
      i5 = this.g;
    this.cP = bool;
    if (this.aW <= 0)
      this.aW = ((i4 - 2 >> 1) / (this.ep + 1));
    if (this.aV <= 0)
      this.aV = ((i4 - 2) / (this.ep + 1));
    this.aW = f(this.aW);
    this.aV = f(this.aV);
    int i6 = i4 - 2;
    int i7 = i5 - 3 - i6;
    int i8 = 5;
    if (bool)
      i8 = 6;
    if (bool)
    {
      i9 = (i9 = this.g - 4 >> 1) / 10;
      i9--;
      if (this.g >= 240)
        i9--;
      if (i8 < i9)
        i8 = i9;
    }
    int i9 = (this.ep + 1) * i8;
    if (i7 > i4 - 2 >> 1)
      i7 = i4 - 2 >> 1;
    if (i7 < i9)
    {
      i6 -= i9 - i7;
      i7 = i9;
    }
    while (i7 < i6 >> 2)
    {
      i7 += 2;
      i6 -= 2;
    }
    this.aX = (i7 / (this.ep + 1));
    this.aX = f(this.aX);
    i7 = (this.ep + 1) * this.aX;
    this.aZ = (i6 / (this.ep + 1));
    this.aZ = f(this.aZ);
    i6 = (this.ep + 1) * this.aZ;
    this.aZ = 0;
    this.ev = 0;
    this.eM = (i2 + 1);
    this.ex = 0;
    this.eO = (i2 + 1);
    this.bR = ((this.ep + 1) * this.aX);
    this.bQ = ((this.eF + 1) * this.aX);
    if (bool)
    {
      this.ev = 1;
      if (i7 < (i3 >> 1) - 2)
        this.eM = (i2 + ((i3 >> 1) - i7 >> 1));
      if (this.eM > (i3 >> 4) + i2)
        this.eM = ((i3 >> 4) + i2);
      if (this.eM < 1 + i2)
        this.eM = (1 + i2);
      this.ex = (this.ev + (this.ep + 1) * this.aX + 1);
      this.bS = this.ev;
      this.bT = (this.eM + (this.eF + 1) * this.aX + 1);
      this.bQ = (this.c - i1 - (this.eM - i2) - this.bT);
    }
    else
    {
      this.eO = (this.eM + (this.eF + 1) * this.aX + 1);
      this.ev = 1;
      if (i7 < this.h - 2)
        this.ev = (this.h - i7 >> 1);
      if (this.ev > this.g >> 4)
        this.ev = (this.g >> 4);
      if (this.ev < 1)
        this.ev = 1;
      this.bS = (this.ev + (this.ep + 1) * this.aX + 1);
      this.bT = this.eM;
      this.bR = (this.g - this.bS - this.ev);
    }
    int i10 = this.g - this.ex;
    int i11 = this.c - i1 - this.eO;
    this.aZ = (i6 / (this.ep + 1));
    this.aZ = f(this.aZ);
    this.ex += (i10 - (this.ep + 1) * this.aZ >> 1);
    this.eO += (i11 - (this.eF + 1) * this.aZ >> 1);
    if (bool)
    {
      if (this.eM > this.eO)
      {
        this.eM = this.eO;
        this.bT = (this.eM + (this.eF + 1) * this.aX + 1);
        this.bQ = (this.c - i1 - (this.eM - i2) - this.bT);
      }
    }
    else if (this.ev > this.ex)
    {
      this.ev = this.ex;
      this.bS = (this.ev + (this.ep + 1) * this.aX + 1);
      this.bR = (this.g - this.bS - this.ev);
    }
    if ((ca) && ((this.bY) || (this.bZ)))
      this.aZ = 0;
    if (this.f == 0)
    {
      d locald = h.x;
      int i12 = i3;
      this.dX = null;
      String str = l[0][10];
      if (locald.a(str + " ") < this.g)
      {
        i12 -= locald.b() - locald.f + 2;
        this.dX = str;
      }
      int i13;
      if ((i13 = this.g) > i12)
        i13 = i12;
      this.aX = ((i13 - 2) / (this.ep + 1));
      this.aX = f(this.aX);
      this.aZ = 0;
      this.ev = (this.g - (this.ep + 1) * this.aX >> 1);
      this.eM = (i2 + (i3 - i12) + (i12 - ((this.eF + 1) * this.aX + 1) >> 1));
    }
    if (this.f == 5)
    {
      this.et = this.h;
      this.eK = this.d;
      return;
    }
    this.et = this.h;
    this.eK = (this.c + h.x.b() * 2);
  }

  private void n(int paramInt)
  {
    a(paramInt, this.bG);
    a(paramInt, this.bF);
    this.co = this.dD;
    a(paramInt, this.bH);
    this.aT = paramInt;
    this.aU = paramInt;
  }

  private final boolean a(int paramInt1, byte[][] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1 = 1;
    int i2;
    int i3;
    int i4;
    if (paramBoolean)
      for (i2 = paramInt2 - 1; i2 <= paramInt2 + 1; i2++)
        for (i3 = paramInt3 - 1; i3 <= paramInt3 + paramInt1; i3++)
        {
          if (((i4 = (i2 >= 0) && (i2 <= this.ep) && (i3 >= 0) && (i3 <= this.eF) ? 1 : 0) != 0) && (paramArrayOfByte[i2][i3] > 0))
          {
            i1 = 0;
            break;
          }
          if ((i4 != 0) || (i2 != paramInt2) || (i3 < paramInt3) || (i3 >= paramInt3 + paramInt1))
            continue;
          i1 = 0;
          break;
        }
    else
      for (i2 = paramInt3 - 1; i2 <= paramInt3 + 1; i2++)
        for (i3 = paramInt2 - 1; i3 <= paramInt2 + paramInt1; i3++)
        {
          if (((i4 = (i3 >= 0) && (i3 <= this.ep) && (i2 >= 0) && (i2 <= this.eF) ? 1 : 0) != 0) && (paramArrayOfByte[i3][i2] > 0))
          {
            i1 = 0;
            break;
          }
          if ((i4 != 0) || (i2 != paramInt3) || (i3 < paramInt2) || (i3 >= paramInt2 + paramInt1))
            continue;
          i1 = 0;
          break;
        }
    if (i1 != 0)
    {
      i2 = 1;
      i3 = 1;
      if (paramBoolean)
        i3 = paramInt1;
      else
        i2 = paramInt1;
      a(paramInt2, paramInt3, i2, i3, true, paramArrayOfByte);
      return true;
    }
    return false;
  }

  public final void showNotify()
  {
    super.showNotify();
    this.bP = false;
    if ((bN) && (this.bO != null))
      m();
    if (this.L)
      this.cE = true;
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void ax()
  {
    this.jdField_do = false;
    if ((bN) && (this.bO != null))
    {
      this.bO.P = 0;
      this.bO.V = true;
      this.bO.W = false;
    }
    else
    {
      R();
    }
    while ((!l.g) || (!this.jdField_do))
    {
      i1 = this.aT;
      if ((bN) && (this.bO != null))
        i1 = this.bO.P;
      if ((i1 == 35) || (i1 == -7) || (!l.s))
      {
        if (!l.s)
        {
          b(3);
          break;
        }
        b(-1);
        break;
      }
      if ((this.ah) && (!l.g))
        break;
      if ((l.g) && (l.r) && (l.g))
      {
        for (i2 = 0; i2 < J.length; i2++)
          J[i2] = 0;
        for (i3 = 0; i3 < b.i.length; i3++)
          b.i[i3] = 0;
        b.i[0] = 127;
        for (int i4 = 0; i4 < b.i.length; i4++)
          b.i[i4] = 127;
        if (b.h[0] == 127)
        {
          this.jdField_do = true;
          O = b.h.length;
          for (int i5 = 0; i5 < b.h.length; i5++)
          {
            if (b.h[i5] == 127)
              continue;
            O = i5;
            break;
          }
        }
        if ((l.g) && (b.h[0] == 125) && (l.b))
        {
          b();
          break;
        }
        l.r = false;
      }
      Y();
      if ((!l.g) || (!this.jdField_do))
        this.cI = true;
      repaint();
      serviceRepaints();
      this.cI = false;
      try
      {
        Thread.sleep(7L);
      }
      catch (Exception localException1)
      {
      }
    }
    if ((bN) && (this.bO != null))
    {
      this.bO.P = 0;
      this.bO.V = true;
      this.bO.W = false;
    }
    else
    {
      R();
    }
    b.h[0] = 0;
    for (int i1 = 0; i1 < b.h.length; i1++)
      b.h[i1] = 0;
    J[0] = 0;
    for (int i2 = 0; i2 < J.length; i2++)
      J[i2] = 0;
    if ((l.g) && (O < cB) && (!this.ah))
    {
      d(20, 0, 0, 0);
      if (!l.b)
      {
        d(21, 0, 0, 0);
        this.aR = true;
      }
      this.bo = 1;
    }
    if ((l.g) && (!this.ah))
    {
      while ((this.j > 0) && (l.g))
      {
        this.bo = 1;
        ad();
        try
        {
          Thread.sleep(3L);
        }
        catch (Exception localException2)
        {
        }
      }
      d(19, this.de, 0, 0);
      while ((this.j > 0) && (l.g))
      {
        this.bo = 1;
        ad();
        try
        {
          Thread.sleep(3L);
        }
        catch (Exception localException3)
        {
        }
      }
    }
    if ((l.g) && (!this.ah) && (this.bX))
      aF();
    if ((l.g) && (!this.ah) && (!this.bX) && (!l.b))
      am();
    int i3 = 0;
    try
    {
      Thread.sleep(47L);
      return;
    }
    catch (Exception localException4)
    {
    }
  }

  private final void ay()
  {
    if (!this.cZ)
      return;
    long l1 = System.currentTimeMillis();
    this.I += 1;
    int i1 = 27;
    long l2 = 1200L;
    if (!e.k)
    {
      i1 = 10;
      l2 = 500L;
    }
    if (!this.an)
    {
      i1 = 7;
      l2 = 220L;
    }
    if ((o) && (!e.k))
    {
      i1 = 3;
      l2 = 100L;
    }
    if ((this.dS) && ((l1 - this.cY > l2) || (this.I > i1)))
    {
      this.I = 0;
      this.cZ = false;
    }
  }

  private void az()
  {
    if ((this.da >= 0) && (this.dD - this.dO >= 580L))
    {
      if ((this.f == 1) || (this.f == 0))
      {
        m.l = this.dD - this.dO < 900L;
        o(this.da);
      }
      this.da = -1;
      this.dO = this.dD;
    }
    if ((this.db >= 0) && (this.f == 5) && (this.dD - this.dO >= 360L) && (this.dD >= this.dK))
    {
      s();
      o(this.db);
      this.db = -1;
      this.dO = this.dD;
    }
  }

  private static void a(int paramInt, boolean paramBoolean)
  {
    if ((e.d < 1) && (paramInt < bm))
      return;
    if ((!paramBoolean) && (paramInt >= bm))
      return;
    if (e.k)
    {
      if (m.n == null)
      {
        boolean bool = bN;
        bN = false;
        ax.al();
        bN = bool;
        m.a(ax);
      }
      if (paramBoolean)
        paramInt = bm;
      m.b(paramInt);
    }
  }

  private static void o(int paramInt)
  {
    if ((cz) && (paramInt != 0) && (paramInt != 3) && (paramInt != 4) && (paramInt < bm))
      return;
    a(paramInt, false);
  }

  public static void s()
  {
    m.d();
  }

  private final void aA()
  {
    if ((this.Q == null) || (this.dT == null) || (!this.aw))
      return;
    if (this.dd == null)
      this.dd = new Image[this.be][];
    if (this.cC == null)
      this.cC = new int[this.be];
    int[] arrayOfInt = { this.aX, this.aZ, this.aY, this.ba };
    for (int i1 = 0; i1 < this.be; i1++)
    {
      if ((i1 >= arrayOfInt.length) || (arrayOfInt[i1] <= 0) || ((this.cC[i1] == arrayOfInt[i1]) && (this.dd[i1] != null)))
        continue;
      if (this.dd[i1] == null)
        this.dd[i1] = new Image[this.bi];
      int i2 = 0;
      while (true)
        if ((i1 < 2) || (i2 < 4))
        {
          if ((this.dT[this.Q[6][i2]] != null) && (this.Q[2][i2] > 0) && (this.Q[3][i2] > 0) && ((this.dd[i1][i2] == null) || (this.dd[i1][i2].getWidth() != i(arrayOfInt[i1]))))
          {
            int i3;
            if (((i3 = i1 < 2 ? 1 : 0) != 0) && (i(arrayOfInt[i1]) == 12) && (i2 == 1))
              this.dd[i1][i2] = null;
            this.dd[i1][i2] = null;
            this.dd[i1][i2] = e.a(this.dT[this.Q[6][i2]], this.Q[0][i2], this.Q[1][i2], this.Q[2][i2], this.Q[3][i2], i(arrayOfInt[i1]), i(arrayOfInt[i1]), 0, true, i1 < 2 ? 1 : false, p);
            if (i3 != 0)
            {
              i1 = 1;
              break;
            }
          }
          i2++;
          if (i2 < this.bi)
            continue;
        }
        else
        {
          this.cC[i1] = arrayOfInt[i1];
        }
    }
  }

  static final void t()
  {
    if (eG > 0)
      return;
    dN = System.currentTimeMillis();
    eG = NET_Lizard.c.c - NET_Lizard.c.cK;
  }

  final void u()
  {
    if (!ca)
      return;
    if (!l.s)
    {
      b(0);
      l.b = true;
      b.b();
      return;
    }
    b(5);
  }

  static final void v()
  {
    dN = System.currentTimeMillis();
    eG = 0;
  }

  private final void aB()
  {
    if (!bN)
    {
      int i1 = 1;
      if ((this.f == 5) && (this.dD >= this.dK))
        i1 = 2;
      if (bN)
        i1 = 16;
      if (i1 != this.bU)
      {
        this.bU = i1;
        if (this.f == 5)
          t();
      }
    }
  }

  private final void aC()
  {
    if (this.f != 1)
      return;
    byte[][] arrayOfByte1 = this.bB;
    byte[][] arrayOfByte2 = this.bI;
    if (this.dz)
    {
      arrayOfByte1 = this.bC;
      arrayOfByte2 = this.bJ;
    }
    int i1 = 1;
    for (int i2 = 0; i2 <= this.eF; i2++)
      for (int i3 = 0; i3 <= this.ep; i3++)
      {
        if ((arrayOfByte1[i3][i2] <= 0) || (arrayOfByte2[i3][i2] > 0))
          continue;
        i1 = 0;
        break;
      }
    if (i1 != 0)
    {
      this.f = 5;
      if (this.dz)
      {
        this.dA = true;
        eg = (byte)(eg + 1);
        this.db = 3;
      }
      else
      {
        by = (byte)(by + 1);
        this.db = 4;
      }
      this.dw[9] += 1;
      if (this.dz)
        this.dw[10] += 1;
      else
        this.dw[11] += 1;
      N();
      if (!ca)
        b(eg, by);
      ao();
      this.dK = (this.dD + 1000L);
    }
    this.dz = (!this.dz);
  }

  private static boolean aD()
  {
    if (dQ == 0)
    {
      dQ = 60;
      try
      {
        try
        {
          Class.forName("com.nokia.mid.ui.DirectUtils");
          Class.forName("com.nokia.mid.ui.DirectGraphics");
          Image localImage;
          Graphics localGraphics;
          (localGraphics = (localImage = Image.createImage(1, 1)).getGraphics()).setColor(16777215);
          localGraphics.fillRect(0, 0, 1, 1);
          DirectUtils.getDirectGraphics(localGraphics).setARGBColor(2130706432);
          localGraphics.fillRect(0, 0, 1, 1);
          int[] arrayOfInt = new int[1];
          localImage.getRGB(arrayOfInt, 0, 1, 0, 0, 1, 1);
          int i1;
          if (((i1 = arrayOfInt[0] & 0xFF) > 96) && (i1 < 160))
            dQ = 40;
        }
        catch (Exception localException)
        {
        }
      }
      catch (Throwable localThrowable)
      {
      }
    }
    return dQ == 40;
  }

  static final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (i) && (eq >= paramInt1) && (eq < paramInt1 + paramInt3) && (eH >= paramInt2) && (eH < paramInt2 + paramInt4);
  }

  static final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (ct) && (er >= paramInt1) && (er < paramInt1 + paramInt3) && (eI >= paramInt2) && (eI < paramInt2 + paramInt4) && (eq >= paramInt1) && (eq < paramInt1 + paramInt3) && (eH >= paramInt2) && (eH < paramInt2 + paramInt4) && (Math.abs(eq - er) <= 10) && (Math.abs(eH - eI) <= 10) && (dI - dH <= 410L);
  }

  static final boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (i) && (cs) && (er >= paramInt1) && (er < paramInt1 + paramInt3) && (eI >= paramInt2) && (eI < paramInt2 + paramInt4);
  }

  private void aE()
  {
    long l1;
    if ((l1 = this.dD - this.dE) > 1800L)
    {
      l1 = 0L;
      this.dE = this.dD;
    }
    if (l1 >= 1000L)
    {
      this.dE += 1000L;
      this.dw[8] += 1;
      if (this.dw[8] >= 60)
      {
        this.dw[8] -= 60;
        this.dw[7] += 1;
        if (this.dw[7] >= 60)
        {
          this.dw[7] -= 60;
          this.dw[6] += 1;
        }
      }
    }
  }

  private static final void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramBoolean1) || (paramBoolean3))
    {
      if (!cr)
        paramBoolean1 = true;
      cr = true;
      eq = paramInt1;
      eH = paramInt2 + cX;
      if (eH < 0)
      {
        cX += -eH;
        eH = paramInt2 + cX;
      }
      try
      {
        NET_Lizard.c.bv = NET_Lizard.c.dD;
      }
      catch (Exception localException1)
      {
      }
      try
      {
        int i1;
        if (((i1 = NET_Lizard.c.c - 1) > 0) && (eH > i1))
        {
          cX -= eH - i1;
          eH = paramInt2 + cX;
        }
      }
      catch (Exception localException2)
      {
      }
      if (paramBoolean1)
      {
        i = true;
        cl = false;
        cJ = false;
        cs = true;
        cw = 0;
        cx = 0;
      }
      if (paramBoolean1)
      {
        er = eq;
        eI = eH;
        dH = System.currentTimeMillis();
      }
    }
    if (paramBoolean2)
    {
      ct = true;
      dI = System.currentTimeMillis();
      if (cl)
      {
        i = false;
        return;
      }
      cJ = true;
    }
  }

  private final void k(Graphics paramGraphics)
  {
    if (this.m != null)
    {
      a.a(paramGraphics, 0, getHeight() - this.m.getHeight(), this.g, this.m.getHeight(), 0, 192);
      paramGraphics.drawImage(this.m, -(this.m.getWidth() >> 1), getHeight() - this.m.getHeight(), 20);
    }
  }

  private final void aF()
  {
    al();
    d(23, 0, 0, 0);
    int i1 = 0;
    do
    {
      int i2 = 32;
      if (i1 + 32 > z.length)
        i2 = z.length - i1;
      if (!d(22, 0, i1, i2))
      {
        while ((this.j > 0) && (l.g))
        {
          this.bo = 1;
          ad();
          try
          {
            Thread.sleep(3L);
          }
          catch (Exception localException1)
          {
          }
        }
        d(22, 0, i1, i2);
      }
      i1 += 32;
      if (i1 >= z.length)
        break;
    }
    while (l.g);
    while ((this.j > 0) && (l.g))
    {
      this.bo = 1;
      ad();
      try
      {
        Thread.sleep(3L);
      }
      catch (Exception localException2)
      {
      }
    }
    d(23, 1, 0, 0);
    while ((this.j > 0) && (l.g))
    {
      this.bo = 1;
      ad();
      try
      {
        Thread.sleep(3L);
      }
      catch (Exception localException3)
      {
      }
    }
    try
    {
      Thread.sleep(47L);
      return;
    }
    catch (Exception localException4)
    {
    }
  }

  private final void aG()
  {
    this.dP = 0;
    this.bZ = true;
  }

  private final void aH()
  {
    if ((!ca) || (this.dP < 0))
      return;
    int i1 = 1;
    if ((this.dP >= 0) && (this.dP <= this.eF))
    {
      int i2 = this.dP;
      if (!d(1, i2, 0, this.ep + 1))
        i1 = 0;
    }
    else if (this.dP == this.eF + 1)
    {
      if (!d(27, 0, 0, 0))
        i1 = 0;
    }
    else if (this.dP > this.eF + 1)
    {
      i1 = 0;
      this.bZ = false;
    }
    if (i1 != 0)
      this.dP += 1;
  }

  private final void aI()
  {
    int i1 = 0;
    if (!this.an)
      i1 = 4;
    if ((ca) && (l.g) && ((this.bY) || (this.bZ)))
      i1 = 0;
    this.dS = (this.dR == i1);
    if (this.dR < i1)
      this.dR += 1;
    if (this.dR > i1)
      this.dR -= 1;
    this.dS = (this.dR == i1);
  }

  static boolean w()
  {
    byte[] arrayOfByte = z;
    int i1;
    return i1 = (i1 = !cg ? 1 : 0) & ((arrayOfByte[9] > 1) || (arrayOfByte[8] > 0) ? 1 : 0);
  }

  private final boolean aJ()
  {
    boolean[] arrayOfBoolean;
    if ((arrayOfBoolean = this.bF) != null)
      for (int i1 = 0; i1 < arrayOfBoolean.length; i1++)
        if (arrayOfBoolean[i1] != 0)
          return true;
    return false;
  }

  private final boolean p(int paramInt)
  {
    return ((paramInt = h(paramInt)) >= 0) && (this.bF != null) && (paramInt < this.bF.length) && (this.bF[paramInt] != 0);
  }

  static void x()
  {
    if ((e.n) && (dV))
      try
      {
        m.e();
        return;
      }
      catch (Exception localException)
      {
      }
  }

  private void a(Graphics paramGraphics, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.q != null) && (this.q[0] != null) && (this.q[0].getWidth() >= this.g) && (this.q[0].getHeight() >= this.c))
    {
      paramGraphics.drawImage(this.q[0], 0, 0, 20);
    }
    else
    {
      int i1;
      int i2;
      if ((this.q != null) && (this.q.length >= 4) && (this.q[3] != null))
      {
        i1 = 0;
        while (i1 < this.c)
        {
          i2 = 0;
          while (i2 < this.g)
          {
            paramGraphics.drawImage(this.q[3], i2, i1, 20);
            i2 += this.q[3].getWidth();
          }
          i1 += this.q[3].getHeight();
        }
      }
      else
      {
        i1 = p;
        paramGraphics.setColor(i1);
        paramGraphics.fillRect(0, 0, this.g, this.c);
        paramGraphics.setColor(12570879);
        i2 = 0;
        int i3 = 0;
        while (i3 < this.g)
        {
          paramGraphics.fillRect(i3, 0, 1, this.c);
          i3 += 12;
        }
        int i4 = 0;
        while (i4 < this.c)
        {
          paramGraphics.fillRect(0, i4, this.g, 1);
          i4 += 12;
        }
      }
    }
    if ((this.g == 176) && (this.c < 208))
      paramBoolean1 = false;
    if ((this.g == 220) && (this.c < 208))
      paramBoolean1 = false;
    this.cL = 0;
    this.cK = 0;
    if (this.q != null)
    {
      if ((this.q[1] != null) && (paramBoolean1))
      {
        a(paramGraphics, this.q[1], 0, 0, this.g);
        this.cL = this.q[1].getHeight();
      }
      if ((this.q[2] != null) && (paramBoolean2))
      {
        a(paramGraphics, this.q[2], 0, this.c - this.q[2].getHeight(), this.g);
        this.cK = this.q[2].getHeight();
      }
    }
  }

  final void c(Graphics paramGraphics)
  {
    if (this.s)
      return;
    this.s = true;
    a(paramGraphics, true, true);
  }

  private final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    for (int i1 = 0; i1 < paramInt4; i1++)
      for (int i2 = 0; i2 < paramInt3; i2++)
        e(paramGraphics, 1, paramInt5, paramInt1 + i2 * paramInt5, paramInt2 + i1 * paramInt5);
  }

  private final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    int i1 = 1;
    int i2 = 1;
    if (paramBoolean)
      i2 = paramInt3;
    else
      i1 = paramInt3;
    a(paramGraphics, paramInt1, paramInt2, i1, i2, paramInt4);
  }

  private final void l(Graphics paramGraphics)
  {
    if ((this.aG == null) || (this.aG.length == 0) || (this.as == null))
      return;
    b(paramGraphics);
    if (((this.q[8] != null) && (this.q[9] != null)) || (this.q[10] != null))
    {
      i1 = this.aN;
      this.q[3].getWidth();
      i2 = 0;
      if (this.q[10] != null)
        i2 = this.q[10].getWidth();
      else
        i2 = this.q[8].getWidth();
      if (this.q[10] != null)
        i1 -= this.q[10].getHeight();
      else
        i1 -= this.q[8].getHeight() - this.q[9].getHeight();
      i3 = this.aM;
      while (i3 < this.aM + this.aL)
      {
        if (this.q[10] != null)
        {
          paramGraphics.drawImage(this.q[10], i3, i1, 20);
        }
        else
        {
          paramGraphics.drawImage(this.q[8], i3, i1, 20);
          paramGraphics.drawImage(this.q[9], i3, i1 + this.q[8].getHeight(), 20);
        }
        i3 += i2;
      }
    }
    a(paramGraphics, this.aM, this.aN, this.aL, this.aJ);
    if ((this.q != null) && (this.q[3] != null))
    {
      i1 = this.aN;
      while (i1 <= this.aN + this.aJ)
      {
        i2 = this.aM;
        while (i2 < this.aM + this.aL)
        {
          paramGraphics.drawImage(this.q[3], i2, i1, 20);
          i2 += this.q[3].getWidth();
        }
        i1 += this.q[3].getHeight();
      }
    }
    else
    {
      paramGraphics.setColor(p);
      paramGraphics.fillRect(this.aM, this.aN, this.aL, this.aJ);
    }
    int i1 = 3;
    int i2 = 3;
    if ((this.n != null) && (this.n[2] != null))
    {
      i1 = this.n[2].getWidth();
      i2 = this.n[2].getHeight();
    }
    int i3 = i1 >> 1;
    int i4 = i1 >> 2;
    int i5 = i2 >> 1;
    int i6 = this.aM + 1 + this.as.a(' ');
    int i7 = this.aN + 2 * this.aP;
    a(paramGraphics, this.aM, this.aN + this.aP, this.aL, this.aJ - 2 * this.aP);
    i7 -= this.aO;
    for (int i8 = 0; i8 < this.aG.length; i8++)
    {
      if ((this.aG[i8] != null) && (i7 >= this.aN - this.as.b()) && (i7 < this.aN + this.aJ))
        this.as.a(paramGraphics, this.aG[i8], i6, i7, 20);
      i7 += this.as.b();
    }
    a(paramGraphics);
    int i9 = 0;
    int i10 = 0;
    if ((this.aT == 50) || (this.aF))
      i9 = this.aI;
    if ((this.aT == 56) || (this.aE))
      i10 = this.aI;
    a(paramGraphics, this.g - i3 - i4, this.aN + i5 + this.aI + 1 - i9, 5, false, false);
    a(paramGraphics, this.g - i3 - i4, this.aN + this.aJ - i5 - this.aI - 1 + i10, 5, false, true);
  }

  private static void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramImage == null)
      return;
    int i1 = paramInt1;
    while (i1 < paramInt1 + paramInt3)
    {
      paramGraphics.drawImage(paramImage, i1, paramInt2, 20);
      i1 += paramImage.getWidth();
    }
  }

  private static void a(Graphics paramGraphics, Image[] paramArrayOfImage, short[][] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramGraphics == null)
      return;
    int i1 = paramGraphics.getClipX();
    int i2 = paramGraphics.getClipY();
    int i3 = paramGraphics.getClipWidth();
    int i4 = paramGraphics.getClipHeight();
    try
    {
      if ((paramInt4 & 0x8) != 0)
        paramInt2 -= paramArrayOfShort[2][paramInt1];
      if ((paramInt4 & 0x20) != 0)
        paramInt3 -= paramArrayOfShort[3][paramInt1];
      if ((paramInt4 & 0x1) != 0)
        paramInt2 -= (paramArrayOfShort[2][paramInt1] >> 1);
      if ((paramInt4 & 0x2) != 0)
        paramInt3 -= (paramArrayOfShort[3][paramInt1] >> 1);
      paramInt2 += paramArrayOfShort[4][paramInt1];
      paramInt3 += paramArrayOfShort[5][paramInt1];
      int i5 = paramArrayOfShort[2][paramInt1];
      int i6 = paramArrayOfShort[3][paramInt1];
      int i7 = paramInt2;
      int i8 = paramInt3;
      if (i7 < i1)
      {
        i5 -= i1 - i7;
        i7 = i1;
      }
      if (i8 < i2)
      {
        i6 -= i2 - i8;
        i8 = i2;
      }
      if (i7 + i5 > i1 + i3)
        i5 = i1 + i3 - i7;
      if (i8 + i6 > i2 + i4)
        i6 = i2 + i4 - i8;
      if ((i5 > 0) && (i6 > 0) && (paramInt2 >= -i5))
      {
        paramGraphics.setClip(i7, i8, i5, i6);
        paramGraphics.drawImage(paramArrayOfImage[paramArrayOfShort[6][paramInt1]], paramInt2 - paramArrayOfShort[0][paramInt1], paramInt3 - paramArrayOfShort[1][paramInt1], 20);
      }
    }
    catch (Exception localException)
    {
    }
    paramGraphics.setClip(i1, i2, i3, i4);
  }

  final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramGraphics, this.aQ, this.G, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  private final void m(Graphics paramGraphics)
  {
    this.dW = 4;
    if ((this.f == 1) && (!this.L))
      this.dW = 7;
    if (this.L)
      this.dW = 2;
    if ((this.L) && (this.N))
    {
      c(paramGraphics, 5, 0, this.c, 36);
      this.dW = 6;
    }
    if ((this.aw) && (this.f == 0) && (!this.L))
      if (this.aG == null)
        c(paramGraphics, 3, 0, this.c, 36);
      else
        this.dW = 9;
    if ((this.f == 5) && (!this.L))
    {
      c(paramGraphics, 4, 0, this.c, 36);
      this.dW = 7;
    }
    if ((this.f == 0) && (!this.L) && (this.aG != null))
      this.dW = 9;
    n(paramGraphics);
  }

  final void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      if ((at == null) || (this.aQ == null) || (this.aQ[3] == null) || (this.cK == 0))
      {
        localObject = new int[] { 0, 1, 2, 3, 0, 0, 2, 1, 1, 0 };
        if (paramInt1 < localObject.length)
          paramInt1 = localObject[paramInt1];
        a(paramGraphics, this.aQ, this.G, paramInt1 + 10, paramInt2, paramInt3, paramInt4);
        return;
      }
      Object localObject = l[0][paramInt1];
      int i1 = at.a((String)localObject) - at.e;
      int i2 = 16;
      int[] arrayOfInt = { 0, 2, 3, 1, 0, 1, 2, 3, 2, 0 };
      if (paramInt1 < arrayOfInt.length)
        i2 = 16 + 3 * arrayOfInt[paramInt1];
      int i3 = this.G[2][i2] + i1 + this.G[2][(i2 + 2)];
      if ((paramInt4 & 0x20) != 0)
        paramInt3 -= this.G[3][(i2 + 1)];
      if ((paramInt4 & 0x8) != 0)
        paramInt2 -= i3;
      a(paramGraphics, this.aQ, this.G, i2, paramInt2, paramInt3, 20);
      int i4 = paramInt2 += this.G[2][i2];
      while (paramInt2 + this.G[2][(i2 + 1)] <= i4 + i1)
      {
        a(paramGraphics, this.aQ, this.G, i2 + 1, paramInt2, paramInt3, 20);
        paramInt2 += this.G[2][(i2 + 1)];
      }
      paramInt2 = i4 + i1 - this.G[2][(i2 + 1)];
      a(paramGraphics, this.aQ, this.G, i2 + 1, paramInt2, paramInt3, 20);
      paramInt2 = i4 + i1;
      a(paramGraphics, this.aQ, this.G, i2 + 2, paramInt2, paramInt3, 20);
      paramInt3 += (this.G[3][(i2 + 1)] - (at.b() - at.f) >> 1);
      at.a(paramGraphics, (String)localObject, i4, paramInt3, 20);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void n(Graphics paramGraphics)
  {
    int i1 = this.dW;
    try
    {
      c(paramGraphics, i1, this.g, this.c, 40);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final boolean a(Graphics paramGraphics, byte[][] paramArrayOfByte1, byte[][] paramArrayOfByte2, byte[][] paramArrayOfByte3, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i1 = 15330811;
    paramGraphics.setColor(i1);
    int i2 = paramInt3 * (this.ep + 1);
    int i3 = 1;
    if (this.az != null)
      for (i4 = 0; i4 < this.az.length; i4++)
      {
        if ((this.az[i4] == null) || (this.az[i4].getWidth() != k((this.ep + 1) * paramInt3)))
          continue;
        paramGraphics.drawImage(this.az[i4], paramInt1, paramInt2, 20);
        i3 = 0;
        break;
      }
    int i6;
    if (i3 != 0)
    {
      paramGraphics.fillRect(paramInt1, paramInt2, i2, i2);
      paramGraphics.setColor(12570879);
      for (i4 = 0; i4 <= this.ep + 1; i4++)
      {
        i5 = paramInt1 + i4 * paramInt3;
        paramGraphics.fillRect(i5, paramInt2, 1, i2);
      }
      for (i5 = 0; i5 <= this.eF + 1; i5++)
      {
        i6 = paramInt2 + i5 * paramInt3;
        paramGraphics.fillRect(paramInt1, i6, i2, 1);
      }
    }
    int i4 = 0;
    int i7;
    int i8;
    int i9;
    int i10;
    for (int i5 = 0; i5 <= this.eF; i5++)
    {
      for (i6 = 0; i6 <= this.ep; i6++)
      {
        i7 = paramInt1 + i6 * paramInt3;
        i8 = paramInt2 + i5 * paramInt3;
        if ((i7 <= -paramInt3) || (i8 <= -paramInt3) || (i7 >= this.g) || (i8 >= this.c))
          continue;
        if ((paramArrayOfByte2 == null) || (paramArrayOfByte2[i6][i5] > 0) || (paramBoolean3))
        {
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2[i6][i5] > 0))
          {
            if (paramArrayOfByte1[i6][i5] > 0)
            {
              i9 = 3;
            }
            else
            {
              i9 = 2;
              if (paramBoolean3)
                i9 = 5;
            }
            if (paramArrayOfByte3[i6][i5] > 0)
            {
              if ((i10 = paramArrayOfByte3[i6][i5] - 1) < 0)
                i10 = 0;
              f(paramGraphics, i10 + this.dl, paramInt3, i7, i8);
            }
            else
            {
              e(paramGraphics, i9, paramInt3, i7, i8);
            }
          }
          if ((paramArrayOfByte1[i6][i5] > 0) && (((i10 = paramArrayOfByte1[i6][i5]) & 0x2) != 0) && (((i10 & 0x4) != 0) || (paramBoolean3)))
          {
            int i11 = i10 >> 4 & 0x7;
            boolean bool = (i10 & 0x8) != 0;
            int i12 = 0;
            int i13 = 0;
            if (this.ak)
              if (bool)
                i13 = (i11 - 1) * paramInt3;
              else
                i12 = (i11 - 1) * paramInt3;
            a(paramGraphics, i7 - i12, i8 - i13, i11, bool, paramInt3);
          }
        }
        if ((!paramBoolean1) || (this.L) || (!a(i7, i8, paramInt3, paramInt3)))
          continue;
        i4 = 1;
        this.cu = i6;
        this.cv = i5;
        if (paramBoolean2)
        {
          this.el = (i6 + cw);
          this.eA = (i5 + cx);
          Z();
        }
        a.a(paramGraphics, i7, i8, paramInt3 - 1, paramInt3 - 1, 32512, 127);
      }
      paramGraphics.setColor(40, 85, 158);
      paramGraphics.fillRect(paramInt1, paramInt2, 1, i2);
      paramGraphics.fillRect(paramInt1 + (this.ep + 1) * paramInt3, paramInt2, 1, i2 + 1);
      paramGraphics.fillRect(paramInt1, paramInt2, i2, 1);
      paramGraphics.fillRect(paramInt1, paramInt2 + (this.eF + 1) * paramInt3, i2 + 1, 1);
    }
    if (paramBoolean2)
    {
      i8 = 1;
      i9 = 1;
      if (this.S)
      {
        if (this.el > this.ep + 1 - this.cT)
          this.el = (this.ep + 1 - this.cT);
        if (this.eA > this.eF + 1 - this.cS)
          this.eA = (this.eF + 1 - this.cS);
        i10 = -1;
        if (this.eb)
          i10 = 1;
        i8 = this.cT;
        i9 = this.cS;
        a(paramGraphics, paramInt1 + this.el * paramInt3, paramInt2 + this.eA * paramInt3 + i10, i8, i9, paramInt3);
        i8 = 0;
      }
      i6 = paramInt1 + this.el * paramInt3;
      i7 = paramInt2 + this.eA * paramInt3;
      if ((i8 == 1) && (i9 == 1))
        e(paramGraphics, 4, paramInt3, i6, i7);
    }
    return i4;
  }

  private final void aK()
  {
    if (!this.dS)
      return;
    this.eQ += 1;
    if (this.eQ >= 4)
      this.eQ = 0;
  }
}