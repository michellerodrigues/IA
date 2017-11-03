import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class k
{
  static int a;
  static int b;
  static int c;
  static int d;
  static int e;
  static i f;
  static boolean g;
  int h = 2;
  char[] i;
  boolean j = false;
  static d k;
  static d l;
  static d m;
  static i n;
  boolean o = false;
  int p = 100;
  int q = 2;
  Image r;
  int s = a / 2;
  int t = d / 2;
  int u;
  d v;
  int w = 6;
  int x = 5;
  String y;
  boolean z = false;
  boolean A = false;
  static String B = "";
  int C;
  int D;
  int E;
  static int F;
  static boolean G;
  static boolean H;
  static boolean I;
  static boolean J;
  boolean K = false;
  int L;
  static String M;
  int N;
  int O;
  String P;
  boolean Q;
  int[] R;
  String[] S;
  int T;
  static String U;
  int V;
  static long W;
  static long X;
  static long Y;
  boolean Z = false;
  boolean aa = false;
  static k ab;
  static String[] ac;
  static String[][] ad;
  boolean ae = false;
  static byte[] af;
  int ag = 1;
  int ah;
  int ai = 4;
  static int aj = 0;
  static int ak;
  int al = 3;
  int am = 1;
  int an;
  int ao = 100;

  static
  {
    c = -100;
    W = 7L;
    X = 70L;
    Y = 20L;
    g = false;
    H = false;
    I = false;
    J = false;
    G = false;
    ak = -1;
    U = "rnms";
    af = new byte[256];
  }

  private k(i parami, d paramd)
  {
    n = parami;
    f = parami;
    k = paramd;
    m = paramd;
    l = paramd;
    d = n.getWidth();
    a = n.getHeight();
    e = d >> 1;
    b = a >> 1;
    b();
  }

  private static byte[] a(String paramString)
  {
    HttpConnection localHttpConnection = null;
    InputStream localInputStream = null;
    int i2 = 0;
    byte[] arrayOfByte1 = new byte[2048];
    try
    {
      localInputStream = (localHttpConnection = (HttpConnection)Connector.open(paramString, 1, true)).openInputStream();
      int i1;
      byte[] arrayOfByte2;
      while ((i1 = localInputStream.read()) != -1)
      {
        arrayOfByte1[i2] = (byte)i1;
        i2++;
        if (i2 < arrayOfByte1.length)
          continue;
        arrayOfByte1 = new byte[(arrayOfByte2 = arrayOfByte1).length + 1024];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
      }
      localInputStream.close();
      localHttpConnection.close();
      byte[] arrayOfByte3 = new byte[arrayOfByte2 = i2];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte2);
      return arrayOfByte3;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private final String a(String paramString, boolean paramBoolean, int paramInt)
  {
    String str1 = ac[0];
    String str2 = ac[1];
    if (paramBoolean)
      str2 = ac[2];
    String str3 = ac[3];
    String str4 = ac[4];
    String str5 = ac[5];
    String str6 = ac[6];
    String str7 = str1 + g(new StringBuffer().append(str2).append(10).append(str6).append(str3).append(paramString).append(str6).append(str4).append(paramInt).append(str6).append(str5).append(ad[0][(i.ay - 1)]).toString());
    this.Z = true;
    boolean bool = g;
    g = true;
    try
    {
      byte[] arrayOfByte = a(str7);
      this.Z = false;
      g = bool;
      char[] arrayOfChar = new char[arrayOfByte.length];
      for (int i1 = 0; i1 < arrayOfChar.length; i1++)
      {
        int i2;
        if ((i2 = arrayOfByte[i1]) < 0)
          i2 += 256;
        if (i2 >= 192)
          i2 += 848;
        arrayOfChar[i1] = (char)i2;
      }
      String str8 = new String(arrayOfChar);
      int i3 = 1;
      for (int i4 = 0; i4 < arrayOfChar.length; i4++)
      {
        int i5;
        if ((((i5 = arrayOfChar[i4]) >= '0') && (i5 <= 57)) || ((i5 >= 97) && (i5 <= 102)) || ((i5 >= 65) && (i5 <= 70)))
        {
          i3 = 1;
        }
        else
        {
          if (((i5 <= 102) || (i5 > 122)) && ((i5 <= 70) || (i5 > 90)) && (i5 != 32))
            continue;
          i3 = 0;
          break;
        }
      }
      if (i3 != 0)
        str8 = c(str8);
      return str8;
    }
    catch (Exception localException)
    {
      this.Z = false;
      g = bool;
    }
    return null;
  }

  private final String a(String paramString, boolean paramBoolean)
  {
    int[] arrayOfInt = new int[10];
    int i1 = 0;
    for (int i2 = 0; i2 < arrayOfInt.length; i2++)
    {
      try
      {
        arrayOfInt[i2] = i.c(i2);
      }
      catch (Exception localException)
      {
      }
      i1 += arrayOfInt[i2];
    }
    return a(paramString, paramBoolean, i1);
  }

  private static boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null))
      return (paramString1 == null) && (paramString2 == null);
    if (paramString1.length() != paramString2.length())
      return false;
    for (int i1 = 0; i1 < paramString1.length(); i1++)
      if (paramString1.charAt(i1) != paramString2.charAt(i1))
        return false;
    return true;
  }

  private final void b(String paramString)
  {
    if (paramString == null)
      return;
    int i1 = paramString.length();
    this.i = new char[i1];
    for (int i2 = 0; i2 < paramString.length(); i2++)
      this.i[i2] = paramString.charAt(i2);
  }

  public static k a(i parami, d paramd)
  {
    if ((ab != null) && (n != null))
      return ab;
    k localk = new k(parami, paramd);
    if ((ac == null) || (ad == null))
      localk = null;
    ab = localk;
    return localk;
  }

  private static void b()
  {
    try
    {
      if (ac == null)
        ac = e.m.a(e.m.d("rcd"), l, 10000, false);
      if (ad == null)
        ad = e.m.c("rcd1");
      return;
    }
    catch (Exception localException)
    {
      ac = null;
      ad = null;
    }
  }

  private String c()
  {
    String str1 = null;
    str1 = '\r' + "|" + ad[6][4] + '\r';
    str1 = str1 + '\r';
    String str2 = "";
    try
    {
      if ((ad.length > 7) && (ad[7] != null) && (ad[7].length > 0) && (ad[7][0] != null) && ((str2 = new String(ad[7][i.ay])).length() > 2))
        for (i1 = 2; i1 < str2.length(); i1++)
        {
          if ((str2.charAt(i1) < '0') || (str2.charAt(i1) > '9'))
            continue;
          str2 = str2.substring(0, i1);
          break;
        }
    }
    catch (Exception localException1)
    {
    }
    str1 = str1 + "|" + str2 + '\r' + '\r';
    if (this.o)
      return str1 + "|" + n() + '\r' + '\r' + M;
    int i1 = e;
    try
    {
      i1 = (i1 = a(null, m, "", 0, 0) - this.ai) - m.a("  ");
    }
    catch (Exception localException2)
    {
    }
    int i2 = i1 - m.a("...");
    int[] arrayOfInt;
    String[] arrayOfString = new String[(arrayOfInt = new int[i.k()]).length];
    for (int i3 = 0; i3 < arrayOfInt.length; i3++)
    {
      arrayOfString[i3] = ("" + (i3 + 1) + ". ");
      try
      {
        arrayOfString[i3] = (arrayOfString[i3] + i.e(i3));
      }
      catch (Exception localException3)
      {
      }
      if (arrayOfString[i3] != null)
      {
        i4 = 0;
        if (m.a(arrayOfString[i3]) > i1)
          for (int i5 = 0; i5 < arrayOfString[i3].length(); i5++)
          {
            if (i4 += m.a(arrayOfString[i3].charAt(i5)) < i2)
              continue;
            arrayOfString[i3] = (arrayOfString[i3].substring(0, i5) + "...");
            break;
          }
      }
      try
      {
        if ((arrayOfString[i3] == null) || (arrayOfString[i3].length() <= 0))
          arrayOfString[i3] = i.j();
      }
      catch (Exception localException4)
      {
      }
      if ((arrayOfString[i3] == null) || (arrayOfString[i3].length() <= 0))
        arrayOfString[i3] = "---";
      try
      {
        arrayOfInt[i3] = i.c(i3);
      }
      catch (Exception localException5)
      {
      }
    }
    for (int i4 = 0; i4 < arrayOfInt.length; i4++)
    {
      int i6;
      if ((i6 = i4) < 0)
        continue;
      String str3 = arrayOfString[i6];
      int i7 = arrayOfInt[i6];
      String str4 = "" + i7;
      if (i7 < 10000)
        str4 = "0" + str4;
      if (i7 < 1000)
        str4 = "0" + str4;
      if (i7 < 100)
        str4 = "0" + str4;
      if (i7 < 10)
        str4 = "0" + str4;
      str3 = str3 + " *" + str4;
      str1 = str1 + str3 + '\r';
      arrayOfInt[i6] = -1;
    }
    return str1;
  }

  private static byte[] a(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i1 = 0;
    try
    {
      RecordStore localRecordStore;
      if ((localRecordStore = RecordStore.openRecordStore(paramString, true)).getNumRecords() == 1)
      {
        localRecordStore.getRecord(1, paramArrayOfByte, 0);
        i1 = 1;
      }
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException)
    {
    }
    if ((i1 == 0) && (paramBoolean))
      b(paramString, paramArrayOfByte);
    return paramArrayOfByte;
  }

  private static byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    return a(paramString, paramArrayOfByte, true);
  }

  private static void b(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      RecordStore localRecordStore;
      if ((localRecordStore = RecordStore.openRecordStore(paramString, true)).getNumRecords() == 1)
      {
        localRecordStore.closeRecordStore();
        if (RecordStore.listRecordStores() != null)
          RecordStore.deleteRecordStore(paramString);
        localRecordStore = RecordStore.openRecordStore(paramString, true);
      }
      localRecordStore.addRecord(paramArrayOfByte, 0, paramArrayOfByte.length);
      localRecordStore.closeRecordStore();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void d()
  {
    String str1 = B;
    String str2 = a(str1, true);
    int i1;
    if ((i1 = h(str2)) == 0)
    {
      d(str1);
      M = i(str2);
      this.o = true;
      this.T = 8;
      p();
      s();
      return;
    }
    if (i1 == 1)
      this.P = ('\r' + ad[4][0]);
    else
      this.P = ('\r' + ad[5][0]);
    this.T = 9;
    p();
    s();
  }

  private final void e()
  {
    g = false;
    this.S = null;
    this.Q = false;
    F = 0;
    H = false;
    I = false;
  }

  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if ((paramInt3 <= 0) || (paramInt4 <= 0) || (paramInt6 <= 0))
      return;
    try
    {
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
      if ((paramInt3 > 0) && (paramInt4 > 0) && (paramInt1 >= -paramInt3))
      {
        paramGraphics.setClip(i5, i6, paramInt3, paramInt4);
        int i7 = 0;
        int i8 = 0;
        if (((paramInt1 != paramInt1 >> 1 << 1 ? 1 : 0) ^ (paramInt2 != paramInt2 >> 1 << 1 ? 1 : 0)) != 0)
        {
          i7++;
          i8++;
        }
        int i9;
        if ((i9 = paramInt3) > paramInt4)
          i9 = paramInt4;
        paramGraphics.setColor(paramInt5);
        for (int i10 = paramInt1 + i7; i10 < paramInt1 + paramInt3; i10 += 2)
          paramGraphics.drawLine(i10, paramInt2, i10 + i9, paramInt2 + i9);
        for (int i11 = paramInt2 + i8; i11 < paramInt2 + paramInt4; i11 += 2)
          paramGraphics.drawLine(paramInt1, i11, paramInt1 + i9, i11 + i9);
      }
      paramGraphics.setClip(i1, i2, i3, i4);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private final void f()
  {
    b();
    if (ac == null)
      return;
    this.o = true;
    String str1 = "";
    try
    {
      str1 = n();
    }
    catch (Exception localException)
    {
    }
    if ((str1 != null) && (str1.length() > 0))
    {
      String str2 = a(str1, false);
      int i1;
      if ((i1 = h(str2)) == 0)
      {
        M = i(str2);
        this.o = true;
        this.T = 8;
        p();
        s();
      }
      else
      {
        if (i1 == 1)
          this.P = ('\r' + ad[4][0]);
        else
          this.P = ('\r' + ad[5][0]);
        this.T = 9;
        p();
        s();
        if (i1 == 1)
          d("");
        return;
      }
    }
    else
    {
      i();
    }
  }

  private static String c(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return "";
    char[] arrayOfChar = new char[paramString.length() >> 1];
    int i1 = 0;
    int i2 = 1;
    try
    {
      i1 = (byte)(ac[8].charAt(2) - '0');
      i2 = (byte)(ac[8].charAt(3) - '0');
    }
    catch (Exception localException)
    {
    }
    int i3 = 0;
    for (int i4 = 0; i4 < arrayOfChar.length; i4++)
    {
      int i5 = paramString.charAt(i3);
      i3++;
      int i6 = paramString.charAt(i3);
      i3++;
      int i7 = 0;
      if ((i5 >= 48) && (i5 <= 57))
        i7 = i5 - 48;
      if ((i5 >= 97) && (i5 <= 102))
        i7 = 10 + i5 - 97;
      if ((i5 >= 65) && (i5 <= 70))
        i7 = 10 + i5 - 65;
      int i8 = 0;
      if ((i6 >= 48) && (i6 <= 57))
        i8 = i6 - 48;
      if ((i6 >= 97) && (i6 <= 102))
        i8 = 10 + i6 - 97;
      if ((i6 >= 65) && (i6 <= 70))
        i8 = 10 + i6 - 65;
      int i9;
      if ((i9 = (byte)((byte)(i9 = (i7 << 4) + i8) ^ i1)) < 0)
        i9 += 256;
      arrayOfChar[i4] = (char)i9;
      i1 = (byte)(i1 + i2);
      if (arrayOfChar[i4] < 'À')
        continue;
      int tmp289_287 = i4;
      char[] tmp289_286 = arrayOfChar;
      tmp289_286[tmp289_287] = (char)(tmp289_286[tmp289_287] + '͐');
    }
    String str;
    return str = new String(arrayOfChar);
  }

  private final char b(int paramInt)
  {
    if (paramInt < this.i.length)
      return this.i[paramInt];
    if (paramInt == this.i.length)
      return ' ';
    return '<';
  }

  private final void g()
  {
    this.z = false;
    F = 0;
    if (this.o)
    {
      d();
      return;
    }
    e();
  }

  private final void b(Graphics paramGraphics)
  {
    if (!r())
    {
      i1 = 0;
      try
      {
        Object localObject1 = null;
        Object localObject2 = null;
        f.c(paramGraphics, 0, 0, a, 36);
        f.c(paramGraphics, 4, d, a, 40);
      }
      catch (Exception localException)
      {
      }
    }
    paramGraphics.setClip(0, 0, d, a);
    int i1 = this.t;
    int i2 = this.s;
    int i3 = this.C;
    int i4 = this.v.a('Щ');
    int i5 = this.v.b() - this.v.f + 2;
    i4++;
    if (a < 176)
      i5++;
    int i6 = i5 + i5 + i5 + 4 + 4;
    int i7 = (i1 - 8 - i4) / this.w;
    int i8 = (i2 - i6 - i5 - 4 - i5) / this.x;
    int i9 = i5;
    if (i4 < i7)
      i4 = i7;
    if (i5 < i8)
      i5 = i8;
    int i10 = d - this.w * i4 >> 1;
    if ((i11 = i6 + (a - i6 - i5 - 4 - this.x * i5 >> 1)) < i6)
      i11 = i6;
    int i12 = i4 >> 1;
    int i13 = 1;
    int i14 = i5 - i9 >> 1;
    if (1 < i14)
      i13 = i14;
    int i15 = this.w * i4;
    int i16 = this.x * i5 + i13;
    int i17 = i10;
    int i18;
    int i19 = (i18 = i11) - 3 >> 1;
    int i20 = 0;
    i20 = 1 + f.cL;
    if (i19 < i20 + l.b() + 5)
      i19 = i20 + l.b() + 5;
    a(paramGraphics, this.y, i20, false);
    int i21 = a(paramGraphics, B, i19, true);
    paramGraphics.setClip(0, 0, d, a);
    if (i9 < f.cK)
      i9 = f.cK;
    int i22 = a - i9 - i21 - 4;
    int i23 = this.x;
    int i24;
    if (((i24 = i22 / this.x) < i5) && (i22 < i16))
    {
      i16 = (i23 = i22 / i5) * i5 + i13;
      i24 = i22 / i23;
    }
    if (i24 > i5 + 1)
    {
      i5++;
      if (i24 > i5 + 1)
        i5++;
      if (i24 > i5 + 1)
        i5++;
      i16 = i23 * i5 + i13;
    }
    i17 -= i12;
    i15 += i12 + i12;
    int i11 = (i18 = i24 = i21 + (a - i21 - i9 - 2 - i16 >> 1)) + (i13 >> 1);
    paramGraphics.setColor(40, 85, 158);
    paramGraphics.drawRect(i17, i18, i15 - 1, i16 - 1);
    paramGraphics.setClip(0, 0, d, a);
    int i25 = 0;
    int i26 = 0;
    do
    {
      i25++;
      i26++;
    }
    while ((i26 < 5) && (this.E > i25 + i23 - 1));
    i11 -= i25 * i5;
    i13 = i5 - (l.b() - l.f) >> 1;
    for (int i27 = 0; i27 < this.x; i27++)
      for (int i28 = 0; i28 < this.w; i28++)
      {
        if ((i27 >= i25) && (i27 - i25 < i23))
        {
          int i29 = i10 + i28 * i4;
          int i30 = i11 + i27 * i5;
          int i31 = i4;
          int i32 = i5;
          if (i.b(i29, i30, i31, i32))
          {
            this.D = i28;
            this.E = i27;
            F = 53;
            I = true;
            i.i = false;
          }
          if (((i28 == this.D ? 1 : 0) & (i27 == this.E ? 1 : 0)) != 0)
          {
            paramGraphics.setColor(40, 85, 158);
            paramGraphics.drawRect(i29, i30, i31 - 1, i32 - 1);
            paramGraphics.setColor(40, 85, 158);
            paramGraphics.drawRect(i29 + 1, i30 + 1, i31 - 1 - 2, i32 - 1 - 2);
          }
          char c1;
          if ((c1 = b(i3)) == '<')
            c1 = 'C';
          l.a(paramGraphics, c1, i10 + i28 * i4 + (i4 - (l.a(c1) - l.e) >> 1), i11 + i27 * i5 + i13, 20);
        }
        i3++;
        if (i3 > this.u + 2)
          break;
      }
  }

  private final int a(Graphics paramGraphics, String paramString, int paramInt, boolean paramBoolean)
  {
    int i1;
    if ((i1 = this.v.a(paramString)) < d / 3)
      i1 = d / 3;
    int i2 = d - i1 >> 1;
    int i3 = 1;
    int i4 = this.v.b() - this.v.f + 2;
    if (paramBoolean)
    {
      paramGraphics.setClip(0, 0, d, a);
      i4++;
      if (d >= 240)
        i4++;
      i3 = i4 + 2 - (this.v.b() - this.v.f) >> 1;
      paramGraphics.setColor(40, 85, 158);
      paramGraphics.drawRect(i2 - 5 - 1, paramInt - 1, i1 + 10 - 1 - 1 + 2, i4 + 2 - 1 + 2);
      paramGraphics.setColor(40, 85, 158);
      paramGraphics.drawRect(i2 - 5 - 2, paramInt - 2, i1 + 10 - 1 - 1 + 4, i4 + 2 - 1 + 4);
    }
    else
    {
      i4++;
      if (d >= 240)
        i4++;
    }
    paramGraphics.setColor(255, 255, 255);
    l.a(paramGraphics, paramString, d - this.v.a(paramString) >> 1, paramInt + i3, 20);
    return paramInt + i4 + 4;
  }

  private final void h()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    switch (F)
    {
    case -3:
    case 52:
      this.D -= 1;
      i1 = 1;
      break;
    case -4:
    case 54:
      this.D += 1;
      i2 = 1;
      break;
    case -1:
    case 50:
      this.E -= 1;
      i3 = 1;
      break;
    case -2:
    case 56:
      this.E += 1;
      i4 = 1;
    }
    if (this.D < 0)
      this.D = (this.w - 1);
    if (this.D >= this.w)
      this.D = 0;
    if (this.E < 0)
      this.E = (this.x - 1);
    if (this.E >= this.x)
      this.E = 0;
    int i5;
    if ((i5 = this.C + this.D + this.w * this.E) > this.u + this.h)
    {
      if (i2 != 0)
        this.D = 0;
      if (i4 != 0)
        this.E = 0;
      if (i3 != 0)
        this.E = (this.x - 2);
      if (i1 != 0)
        this.D = (this.u - this.C + this.h - this.w * (this.x - 1));
    }
    if ((F == 53) || (F == -6) || (F == -5))
      if ((i5 <= this.u) || (b(i5) == ' '))
      {
        if ((((!this.A ? 1 : 0) & (B.length() > 0 ? 1 : 0)) != 0) || (b(i5) != ' '))
        {
          int i6 = this.t;
          if ((B != null) && (B.length() > 0) && ((l.a(B + "  ") > i6) || (B.length() >= 22)))
            B = B.substring(0, B.length() - 1);
          B += b(i5);
        }
      }
      else if ((B != null) && (B.length() > 0))
        B = B.substring(0, B.length() - 1);
    if (F != -7)
    {
      if (F != 35);
    }
    else
    {
      while (B.length() > 0)
      {
        if (B.charAt(B.length() - 1) != ' ')
          break;
        B = B.substring(0, B.length() - 1);
      }
      if (B.length() > 0)
        g();
    }
  }

  private final void a(boolean paramBoolean, String paramString)
  {
    this.t = (d - 4 - (d >> 4));
    this.s = (a - 4 - (a >> 4));
    this.v = l;
    this.A = paramBoolean;
    this.z = true;
    if (this.A)
    {
      this.C = 48;
      this.u = 57;
      b(ac[9]);
      this.y = ad[6][0];
      this.C = 0;
      this.u = (this.C + this.i.length - 1);
    }
    else
    {
      this.y = ad[6][1];
      this.C = 65;
      this.u = 90;
      b(ac[7]);
      this.C = 0;
      this.u = (this.C + this.i.length - 1);
    }
    if ((paramString != null) && (paramString.length() > 0))
      this.y = paramString;
    int i1 = this.u - this.C + this.h + 1;
    this.w = d(i1);
    if (this.w < 1)
      this.w = 1;
    int i2 = this.v.a('W') + 2;
    if (this.w * i2 > this.t)
      this.w = (this.t / i2);
    if (this.w < 1)
      this.w = 1;
    this.x = (i1 / this.w);
    this.w = (this.t * this.w * 2 / (this.t + this.s));
    this.x = (this.s * this.x * 2 / (this.t + this.s));
    if (this.w < 1)
      this.w = 1;
    if (this.x < 1)
      this.x = 1;
    for (int i3 = 0; i3 < 3; i3++)
    {
      if (this.x <= 1)
        continue;
      this.w += 1;
      this.x -= 1;
    }
    while (((this.w * this.x > i1 ? 1 : 0) & (this.x > 1 ? 1 : 0)) != 0)
      this.x -= 1;
    while (this.w * this.x < i1)
      this.x += 1;
    this.D = 0;
    this.E = 0;
    B = "";
    F = 0;
    s();
  }

  private final void i()
  {
    a(false, null);
  }

  protected static final boolean a(int paramInt)
  {
    if (q())
    {
      F = paramInt;
      H = false;
      W = 0L;
      J = true;
      G = true;
      return true;
    }
    return false;
  }

  protected static final boolean a()
  {
    if ((q()) && (G))
    {
      if (H)
        F = 0;
      else
        I = true;
      W = 0L;
      J = false;
      return true;
    }
    return false;
  }

  private void j()
  {
    H = true;
    if (this.Q)
    {
      l();
      return;
    }
    if (this.z)
    {
      h();
      return;
    }
  }

  private final void k()
  {
    j();
    switch (F)
    {
    case -7:
    case -6:
    case -5:
    case 35:
    case 53:
      F = 0;
    }
    if ((I) || (!this.Q))
    {
      F = 0;
      I = false;
      W = 0L;
    }
    if ((this.aa) && (!this.Q) && (!f.du))
    {
      F = 0;
      I = false;
      W = 0L;
      this.aa = false;
      i.i = false;
    }
  }

  private final void l()
  {
    switch (F)
    {
    case -1:
    case 50:
      return;
    case -2:
    case 56:
      return;
    case -7:
    case 35:
      return;
    case -6:
    case -5:
    case 53:
      e();
    }
  }

  private final void m()
  {
    try
    {
      if (i.cs)
        this.j = true;
      if (this.j)
      {
        int i1;
        if ((i1 = l.b() + 2) < f.cK)
          i1 = f.cK;
        int i2;
        if ((i2 = l.b() + 2) < f.cL)
          i2 = f.cL;
        if (((this.Q) || (f.du)) && (i.b(0, i2, d, a - i1 - i2)))
          a(k.F = 53);
        if (i.c(0, a - i1, d / 3, i1))
          a(k.F = 53);
        if (i.c(d - d / 3, a - i1, d / 3, i1))
          a(k.F = 35);
      }
      if (i.ct)
      {
        if (H)
          F = 0;
        else
          I = true;
        W = 0L;
        J = false;
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static String c(int paramInt)
  {
    int i1 = 64 + 64 * paramInt;
    af = a(U, af);
    byte[] arrayOfByte = af;
    int i2 = 64;
    for (int i3 = 0; i3 < 64; i3++)
    {
      if (arrayOfByte[(i1 + i3)] != 0)
        continue;
      i2 = i3;
      break;
    }
    if (i2 <= 0)
      return null;
    char[] arrayOfChar = new char[i2];
    for (int i4 = 0; i4 < i2; i4++)
    {
      int i5;
      if ((i5 = arrayOfByte[(i1 + i4)]) < 0)
        i5 += 256;
      if (i5 >= 192)
        i5 += 848;
      arrayOfChar[i4] = (char)i5;
    }
    String str;
    return str = new String(arrayOfChar);
  }

  private static String n()
  {
    return c(i.ay - 1);
  }

  public static boolean a(Graphics paramGraphics)
  {
    if (q())
    {
      try
      {
        if (ab.Z)
        {
          if (ab.r != null)
            paramGraphics.drawImage(ab.r, e, b, 3);
          int i1 = k.b();
          if (ab.r != null)
          {
            int i2 = i1 + 4;
            i.a(paramGraphics, 0, b - (i2 >> 1), d, i2, 0, 128);
          }
          k.a(paramGraphics, ad[6][5], e, b - (i1 >> 1), 17);
          return true;
        }
        if (ab.Q)
          ab.c(paramGraphics);
        if (ab.z)
          ab.b(paramGraphics);
      }
      catch (Exception localException)
      {
      }
      return true;
    }
    return false;
  }

  private final void c(Graphics paramGraphics)
  {
    try
    {
      if (paramGraphics != null)
      {
        if ((this.r != null) && (this.r.getWidth() >= d))
          this.r.getHeight();
        if (this.r != null)
          paramGraphics.drawImage(this.r, e, b, 3);
      }
    }
    catch (Exception localException1)
    {
    }
    d locald = m;
    try
    {
      int i1 = aj;
      int i2 = a;
      if (c > 0)
        i2 = c;
      if (c == 0)
        return;
      if (i1 + i2 > a)
        i2 = a - i1;
      int i3 = d - this.al - this.am - 1;
      int i4 = 0;
      int i5 = locald.b() + 1;
      int i6 = locald.b() - locald.f + 2 + 3;
      int i7 = i2;
      this.K = true;
      int i8 = this.S.length - 1;
      int i9 = 0;
      int i10;
      if ((i10 = i6 + 1) < f.cL + 2)
        i10 = f.cL + 2;
      if (i10 < f.cK + 2)
        i10 = f.cL + 2;
      this.p = (i2 - 2 * i10);
      this.ao = this.p;
      int i11 = i2;
      if (paramGraphics != null)
      {
        paramGraphics.setClip(0, 0, d, a);
        i12 = i11;
        if (this.ae)
          i12 = -i11;
        i13 = i11 - this.an;
        if (this.r != null)
          if (u())
            i.a(paramGraphics, 0, aj + (i2 - i13 >> 1), d, i13, 0, 128);
          else
            a(paramGraphics, 0, aj + (i2 - i13 >> 1), d, i13, 0, 128);
        this.an -= (i12 >> 3);
        if (this.an > 0)
          return;
        this.an = 0;
        this.ao = this.p;
        this.an = 0;
      }
      int i12 = i11;
      paramGraphics.setClip(0, i1 + i10, d, i2 - 2 * i10);
      int i13 = this.ah - i12;
      this.ag = 1;
      int i14;
      if (i13 >= i5)
      {
        i14 = i13 / i5;
        i13 -= i14 * i5;
        this.ag += i14;
      }
      i1 -= i13;
      int i15 = 0;
      if (i12 > 0)
        this.K = (this.ag >= this.S.length);
      int i16 = 0;
      int i17 = 0;
      int i20;
      int i21;
      for (i9 = this.ag; i9 < this.S.length; i9++)
      {
        i4 = this.ai;
        if (paramGraphics != null)
        {
          i14 = 0;
          try
          {
            i14 = this.S[i9].charAt(0);
          }
          catch (Exception localException2)
          {
          }
          i15 = 4;
          i18 = 1;
          switch (i14)
          {
          case 47:
            i15 = 8;
            i4 = i3 - 1;
            i18 = 0;
            break;
          case 124:
            i15 = 1;
            i4 = (i3 - this.ai >> 1) + this.ai;
            i18 = 0;
          }
          i19 = 0;
          if ((this.R != null) && (i16 < this.R.length))
          {
            while ((i16 < this.R.length) && (i9 > this.R[i16]))
              i16++;
            if ((i16 < this.R.length) && (i9 == this.R[i16]))
            {
              paramGraphics.setColor(255, 255, 255);
              i20 = this.ai >> 1;
              i1 += 2;
              i17 += 2;
              i19 = 1;
              i21 = d - this.al - this.am - i20 - 2;
              paramGraphics.setColor(40, 85, 158);
              paramGraphics.fillRect(i20 + 1, i1 - 3, i21, 1);
              paramGraphics.fillRect(i20 + 1, i1 + (locald.b() - locald.f) + 2, i21, 1);
              i16++;
            }
          }
          if (i18 != 0)
          {
            if (this.T == 8)
              a(paramGraphics, locald, this.S[i9], i4, i1);
            else
              locald.a(paramGraphics, this.S[i9], i4, i1, 20);
          }
          else
            locald.a(paramGraphics, this.S[i9], 1, this.S[i9].length() - 1, i4, i1, i15 | 0x10);
          if (i19 != 0)
          {
            i1 += 2;
            i17 += 2;
          }
        }
        if (i1 += i5 < aj + i7)
          continue;
        this.K = false;
        break;
      }
      paramGraphics.setClip(0, 0, d, a);
      i9 = this.ah;
      i6 = aj + (i2 - this.p >> 1);
      int i18 = i8 * i5 + i17;
      int i19 = 0;
      if (i18 <= 0)
      {
        i18 = 1;
        i19 = 1;
      }
      if ((i20 = this.p * i11 / i18) > this.p >> 3)
        i20 = this.p >> 3;
      if (i20 < this.q)
        i20 = this.q;
      if (i20 > this.p)
        i20 = this.p;
      if ((i21 = i18 - i11 + 2 * i12) <= 0)
      {
        i21 = 1;
        i19 = 1;
      }
      int i22;
      int i23 = (i22 = this.ao - i20) * i9 / i21;
      if (i19 != 0)
      {
        i20 = this.p;
        i23 = 0;
      }
      if (i23 < 0)
        i23 = 0;
      if (i23 > i22)
        i23 = i22;
      if (this.T != 2)
      {
        paramGraphics.setColor(255, 255, 255);
        paramGraphics.setColor(40, 85, 158);
        paramGraphics.drawRect(d - this.al - this.am, i6, this.al - 1, this.p - 1);
        paramGraphics.setColor(40, 85, 158);
        paramGraphics.fillRect(d - this.al - this.am, i6 + i23 + 1, this.al, i20 - 2);
        paramGraphics.setColor(40, 85, 158);
        paramGraphics.fillRect(d - this.al - this.am + 1, i6 + i23 + 1 + 1, this.al - 1 - 1, i20 - 2 - 2);
      }
      return;
    }
    catch (Exception localException3)
    {
    }
  }

  private final int a(Graphics paramGraphics, d paramd, String paramString, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1;
    int i2 = paramInt2 + paramd.b() - paramd.f;
    int i3 = paramString.length();
    int i4 = 0;
    boolean[] arrayOfBoolean = { true };
    int[] arrayOfInt = { paramInt1 + paramd.a("28. "), d >> 1 };
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
    int i6 = d - this.ai - this.al - this.am - 1 - i5 * 5 - 2;
    if (paramGraphics == null)
      return i6;
    String str = "...";
    int i7 = paramd.a("... ");
    int i8 = i1;
    for (int i9 = 0; i9 < 0 + i3; i9++)
    {
      if (paramString.charAt(i9) == '*')
        break;
      i8 += paramd.a(paramString.charAt(i9));
    }
    int i10 = i8 >= i6 ? 1 : 0;
    int i11 = 0;
    int i12 = 0;
    for (int i13 = 0; i13 < 0 + i3; i13++)
    {
      if (paramString.charAt(i13) == '*')
      {
        if (i1 < i6)
          i1 = i6;
        i13++;
        i12 = 1;
      }
      if (i12 != 0)
      {
        paramd.a(paramGraphics, paramString.charAt(i13), i1 + (i5 - paramd.a(paramString.charAt(i13)) >> 1), i2);
        i1 += i5;
      }
      else
      {
        if (i11 != 0)
          continue;
        if ((i10 != 0) && (i1 + paramd.a(paramString.charAt(i13)) >= i6 - i7))
        {
          for (int i14 = 0; i14 < str.length(); i14++)
            i1 += paramd.a(paramGraphics, str.charAt(i14), i1, i2);
          i11 = 1;
          continue;
        }
        i1 += paramd.a(paramGraphics, paramString.charAt(i13), i1, i2);
      }
      if ((i4 >= arrayOfBoolean.length) || (paramString.charAt(i13) != arrayOfChar[i4]))
        continue;
      if ((arrayOfInt[i4] > 0) && (i1 < arrayOfInt[i4]))
        i1 = arrayOfInt[i4];
      while ((i13 + 1 < paramString.length()) && (paramString.charAt(i13 + 1) == ' '))
        i13++;
      i4++;
    }
    return i6;
  }

  private void o()
  {
    int i1 = 0;
    String str1 = null;
    try
    {
      if (this.T == 8)
        str1 = c();
      else if (this.T == 9)
        str1 = this.P;
      if (str1 == null)
        i1 = 1;
      else if (str1.length() < 1)
        i1 = 1;
    }
    catch (Exception localException1)
    {
      i1 = 1;
    }
    if (i1 != 0)
      return;
    boolean bool = this.T != 8;
    this.S = e.m.a(str1, m, d - 2 * this.ai - this.al - this.am - 1, bool);
    this.ag = 1;
    this.ah = 0;
    this.Q = true;
    F = 0;
    H = false;
    I = false;
    this.R = null;
    if ((this.T == 8) && (this.o))
      try
      {
        String str2;
        if (((str2 = n()) != null) && (str2.length() > 0))
        {
          this.R = new int[2];
          for (int i2 = 0; i2 < this.R.length; i2++)
            this.R[i2] = -1;
          int i3 = 0;
          for (int i4 = 0; i4 < this.S.length; i4++)
          {
            if (!a(str2, f(this.S[i4])))
              continue;
            this.R[i3] = i4;
            i3++;
            if (i3 >= this.R.length)
              break;
          }
        }
      }
      catch (Exception localException2)
      {
      }
    this.an = b;
  }

  private void p()
  {
    o();
  }

  private static boolean q()
  {
    return (g) && (ab != null);
  }

  private static boolean r()
  {
    return false;
  }

  private final void s()
  {
    m();
    if (f != null)
      try
      {
        long l1 = System.currentTimeMillis();
        boolean bool = g;
        g = true;
        try
        {
          f.repaint();
          f.serviceRepaints();
        }
        catch (Exception localException1)
        {
        }
        g = bool;
        long l2;
        long l3 = (l2 = System.currentTimeMillis()) - l1;
        long l4 = 64L;
        if (this.Q)
          l4 = 47L;
        if (l3 < l4)
          Thread.sleep(l4 - l3);
        if (this.Q)
        {
          l3 = System.currentTimeMillis() - l1;
          this.O = (int)(l3 * m.b() / 50L);
          this.N = (int)(l3 * m.b() / 350);
          if (this.N < 1)
            this.N = 1;
          if (this.N > m.b())
            this.N = m.b();
          if (this.O < 1)
            this.O = 1;
          if (this.an > 0)
            return;
          int i1 = this.N;
          if (F != 0)
          {
            i1 = 0;
            switch (F)
            {
            case -1:
            case 50:
              i1 = -this.O;
              break;
            case -2:
            case 56:
              i1 = this.O;
            }
          }
          if (this.L != i1)
          {
            int i2;
            if ((i2 = Math.abs(this.L - i1)) > 1)
              i2 = 1;
            if (this.L < i1)
              this.L += i2;
            else
              this.L -= i2;
          }
          if (i.cr)
          {
            if (i.cs)
            {
              this.V = i.eH;
            }
            else
            {
              this.L = (-(i.eH - this.V));
              this.V = i.eH;
            }
          }
          else
          {
            if (this.L < -this.O)
              this.L = (-this.O);
            if (this.L > this.O)
              this.L = this.O;
          }
          if (this.L < 0)
          {
            if (this.ah > 0)
              this.ah += this.L;
            if (this.ah < 0)
              this.ah = 0;
          }
          else if (!this.K)
          {
            this.ah += this.L;
          }
          else
          {
            this.ah = 0;
          }
        }
        else
        {
          return;
        }
      }
      catch (Exception localException2)
      {
      }
  }

  private void t()
  {
    this.j = false;
    g = true;
    F = 0;
    I = false;
    G = false;
    long l1 = 0L;
    while (g)
      try
      {
        if (F != 0)
        {
          long l2;
          if ((l2 = System.currentTimeMillis() - l1) >= W * 3L)
            W = 0L;
          else
            W = (W * 3L - l2) / 3L;
          if (!this.Q)
            for (int i1 = 0; i1 < W; i1++)
            {
              try
              {
                Thread.sleep(3L);
              }
              catch (Exception localException1)
              {
              }
              if ((F == 0) || (J))
                break;
            }
          if (F != 0)
            k();
          W = Y;
          if (J)
          {
            J = false;
            W = X;
          }
          l1 = System.currentTimeMillis();
        }
        if (g)
          s();
        Thread.sleep(3L);
      }
      catch (Exception localException2)
      {
      }
    i.a = null;
    this.S = null;
    this.r = null;
    g = false;
  }

  static void a(Image paramImage)
  {
    if (ab == null)
      return;
    ab.r = paramImage;
    ab.f();
    ab.t();
  }

  static void b(Image paramImage)
  {
    if (ab == null)
      return;
    ab.r = paramImage;
    ab.o = false;
    ab.T = 8;
    ab.p();
    ab.t();
  }

  private static void a(String paramString, int paramInt)
  {
    int i1 = 64 + 64 * paramInt;
    byte[] arrayOfByte = af;
    for (int i2 = 0; i2 < 64; i2++)
      if (i2 < paramString.length())
      {
        int i3;
        if ((i3 = paramString.charAt(i2)) >= '͐')
          i3 -= 848;
        arrayOfByte[(i1 + i2)] = (byte)i3;
      }
      else
      {
        arrayOfByte[(i1 + i2)] = 0;
      }
    af = arrayOfByte;
    b(U, af);
  }

  private static void d(String paramString)
  {
    a(paramString, i.ay - 1);
  }

  static final void a(int paramInt1, int paramInt2)
  {
    aj = paramInt1;
    c = paramInt2;
  }

  private static String e(String paramString)
  {
    try
    {
      char[] arrayOfChar = new char[paramString.length()];
      for (int i1 = 0; i1 < arrayOfChar.length; i1++)
      {
        arrayOfChar[i1] = paramString.charAt(i1);
        if ((arrayOfChar[i1] < 'a') || (arrayOfChar[i1] > 'z'))
          continue;
        arrayOfChar[i1] = (char)(arrayOfChar[i1] - 'a' + 65);
      }
      String str;
      return str = new String(arrayOfChar);
    }
    catch (Exception localException)
    {
    }
    return paramString;
  }

  private static int d(int paramInt)
  {
    int i1 = 0;
    for (int i2 = 0; i2 * i2 <= paramInt; i2++)
      i1 = i2;
    return i1;
  }

  private static String f(String paramString)
  {
    String str = paramString;
    if ((paramString == null) || (str.length() <= 0))
      return str;
    int i1;
    if ((((i1 = str.charAt(0)) == '/' ? 1 : 0) | (i1 == 124 ? 1 : 0)) != 0)
      return str.substring(1, str.length());
    int i2 = 0;
    int i3 = str.length();
    for (int i4 = str.length() - 1; i4 >= 0; i4--)
    {
      if ((i1 = str.charAt(i4)) != '*')
        continue;
      i3 = i4;
      if ((i4 <= 0) || (str.charAt(i4 - 1) != ' '))
        break;
      i3 = i4 - 1;
      break;
    }
    for (int i5 = 0; i5 < i3; i5++)
      if ((i1 = str.charAt(i5)) == ' ')
        i2 = 1;
      else if (i2 != 0)
        return str.substring(i5, i3);
    return str;
  }

  private static String g(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return "";
    char[] arrayOfChar = new char[paramString.length() * 2];
    int i1 = 0;
    int i2 = 1;
    try
    {
      i1 = (byte)(ac[8].charAt(0) - '0');
      i2 = (byte)(ac[8].charAt(1) - '0');
    }
    catch (Exception localException)
    {
    }
    int i3 = 0;
    for (int i4 = 0; i4 < paramString.length(); i4++)
    {
      int i5;
      if ((i5 = paramString.charAt(i4)) >= '͐')
        i5 -= 848;
      if (i5 > 255)
        i5 = 255;
      if ((i5 = (byte)((byte)i5 ^ i1)) < 0)
        i5 += 256;
      i1 = (byte)(i1 + i2);
      int i6 = i5 >> 4;
      int i7 = i5 - (i6 << 4);
      if (i6 < 10)
        arrayOfChar[i3] = (char)(48 + i6);
      else
        arrayOfChar[i3] = (char)(65 + (i6 - 10));
      i3++;
      if (i7 < 10)
        arrayOfChar[i3] = (char)(48 + i7);
      else
        arrayOfChar[i3] = (char)(65 + (i7 - 10));
      i3++;
    }
    String str;
    return str = new String(arrayOfChar);
  }

  private static boolean u()
  {
    if (ak < 0)
    {
      ak = 0;
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
          ak = 1;
      }
      catch (Exception localException)
      {
      }
    }
    return ak > 0;
  }

  private final int h(String paramString)
  {
    try
    {
      if ((paramString == null) || (paramString.length() <= 0))
        return -1;
      String str1 = e(paramString);
      String[] arrayOfString = ad[1];
      for (int i1 = 0; i1 < arrayOfString.length; i1++)
      {
        String str2 = arrayOfString[i1];
        int i2 = 1;
        for (int i3 = 0; i3 < str2.length(); i3++)
        {
          if ((i3 < str1.length()) && (str1.charAt(i3) == str2.charAt(i3)))
            continue;
          i2 = 0;
          break;
        }
        if (i2 == 0)
          continue;
        if (i1 == 0)
          return 0;
        if (i1 != 1)
          continue;
        try
        {
          int i4 = str2.length();
          for (int i5 = str2.length(); i5 < str1.length(); i5++)
          {
            if ((str1.charAt(i5) < 'A') || (str1.charAt(i5) > 'Z'))
              continue;
            i4 = i5;
            break;
          }
          arrayOfString = ad[2];
          for (i1 = 0; i1 < arrayOfString.length; i1++)
          {
            str2 = arrayOfString[i1];
            i2 = 1;
            for (int i6 = 0; i6 < str2.length(); i6++)
            {
              if ((i6 + i4 < str1.length()) && (str1.charAt(i6 + i4) == str2.charAt(i6)))
                continue;
              i2 = 0;
              break;
            }
            if (i2 != 0)
              return i1 + 1;
          }
        }
        catch (Exception localException1)
        {
          return 20;
        }
        return 10;
      }
    }
    catch (Exception localException2)
    {
      return -1;
    }
    return 0;
  }

  private static String i(String paramString)
  {
    try
    {
      char[] arrayOfChar = new char[paramString.length()];
      for (int i1 = 0; i1 < arrayOfChar.length; i1++)
      {
        arrayOfChar[i1] = paramString.charAt(i1);
        if (arrayOfChar[i1] != '/')
          continue;
        arrayOfChar[i1] = '\r';
      }
      String str;
      return str = new String(arrayOfChar);
    }
    catch (Exception localException)
    {
    }
    return "";
  }
}