import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class m
  implements Runnable
{
  static int a;
  static boolean b;
  static i c;
  static boolean d;
  static int e;
  static boolean f;
  static boolean g;
  static String h;
  static boolean i = false;
  static Player[] j;
  static int k;
  static boolean l = true;
  static boolean m;
  static m n;
  static int o;
  static int p;
  static int q;
  static String r;
  static String s;
  static Thread t;
  static long u;
  static int v;
  static boolean w;

  static
  {
    g = false;
    f = true;
    b = false;
    m = true;
    p = -1;
    v = 100;
    a = -1;
    d = true;
    w = false;
    h = "/mm";
    e = -1;
    k = -1;
    r = "";
    s = "";
    q = -1;
    u = 0L;
  }

  private m(i parami)
  {
    c = parami;
    if (f)
      i.bm = 6;
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

  private static void a(String paramString, int paramInt)
  {
    if ((r != null) && (paramInt != 3) && (paramInt != i.bm))
      paramString = new String(r + paramString);
    j[paramInt] = null;
    InputStream localInputStream = null;
    try
    {
      paramString = paramString.substring(0, paramString.length() - 4) + ".mp3";
    }
    catch (Exception localException1)
    {
    }
    try
    {
      try
      {
        if (a(paramString) > 0)
          localInputStream = c.getClass().getResourceAsStream(paramString);
      }
      catch (Exception localException2)
      {
      }
      try
      {
        if ((localInputStream == null) && (!paramString.endsWith(".mp3")) && (a(paramString = paramString.substring(0, paramString.length() - 4) + ".mp3") > 0))
          localInputStream = c.getClass().getResourceAsStream(paramString);
      }
      catch (Exception localException3)
      {
      }
      try
      {
        if ((localInputStream == null) && (!paramString.endsWith(".wav")) && (a(paramString = paramString.substring(0, paramString.length() - 4) + ".wav") > 0))
          localInputStream = c.getClass().getResourceAsStream(paramString);
      }
      catch (Exception localException4)
      {
      }
      try
      {
        if ((localInputStream == null) && (!paramString.endsWith(".amr")) && (a(paramString = paramString.substring(0, paramString.length() - 4) + ".amr") > 0))
          localInputStream = c.getClass().getResourceAsStream(paramString);
      }
      catch (Exception localException5)
      {
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
    }
    int i1 = 1;
    int i2 = 0;
    do
    {
      i2++;
      try
      {
        try
        {
          if ((localInputStream == null) && (!paramString.endsWith(".mid")))
          {
            i1 = 0;
            if (a(paramString = paramString.substring(0, paramString.length() - 4) + ".mid") > 0)
              localInputStream = c.getClass().getResourceAsStream(paramString);
          }
        }
        catch (Exception localException6)
        {
        }
        try
        {
          String str = "audio/midi";
          if (paramString.endsWith(".amr"))
            str = "audio/amr";
          if (paramString.endsWith(".wav"))
            if (w)
              str = "audio/x-wav";
            else
              str = "audio/wav";
          if (paramString.endsWith(".mp3"))
            str = "audio/mpeg";
          j[paramInt] = Manager.createPlayer(localInputStream, str);
          j[paramInt].realize();
          if (!g)
            j[paramInt].prefetch();
          i1 = 0;
        }
        catch (Exception localException7)
        {
          localInputStream = null;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
      }
    }
    while ((i1 != 0) && (i2 <= 3));
  }

  private static void c(int paramInt)
  {
    if (f)
      i.bm = 6;
    if (j == null)
      j = new Player[i.bm + 1];
    if ((j[paramInt] != null) && (j[paramInt].getState() != 0))
      return;
    String str = "/" + paramInt + ".mp3";
    if (paramInt == i.bm)
      str = "/mm.mid";
    a(str, paramInt);
  }

  public static void a()
  {
    if (n == null)
      a(NET_Lizard.c);
    i();
    if (j == null)
      f();
    if (m)
    {
      d = true;
      if (t == null)
      {
        t = new Thread(n);
        t.start();
      }
      if (t.getPriority() != 1)
        t.setPriority(1);
    }
  }

  private static void f()
  {
    if (j == null)
      j = new Player[i.bm + 1];
    for (int i1 = 0; i1 < j.length; i1++)
    {
      if (j[i1] != null)
        continue;
      c(i1);
    }
    s = r;
  }

  private static int a(String paramString)
  {
    int i1 = 0;
    int i2 = -1;
    try
    {
      InputStream localInputStream;
      if ((localInputStream = c.getClass().getResourceAsStream(paramString)) == null)
        return -1;
      do
      {
        i1 = localInputStream.read();
        i2++;
      }
      while (i1 != -1);
      localInputStream.close();
    }
    catch (Exception localException)
    {
      i2 = -1;
    }
    return i2;
  }

  private static final int g()
  {
    if (e < 0)
    {
      e = 0;
      while ((e.m.b(h + e + ".mid") > 0) || (e.m.b(h + e + ".amr") > 0) || (e.m.b(h + e + ".mp3") > 0) || (e.m.b(h + e + ".wav") > 0))
        e += 1;
    }
    return e;
  }

  static final void a(int paramInt)
  {
    if (j == null)
      a();
    g();
    if (paramInt < 0)
      paramInt = 0;
    d();
    if (e > 0)
    {
      while (paramInt >= e)
        paramInt -= e;
      e(i.bm);
      a(h + paramInt + ".mid", i.bm);
      k = i.bm;
    }
    d(i.bm);
  }

  public final void run()
  {
    if (j == null)
      f();
    int i1 = -1;
    while (d)
    {
      if ((p >= 0) && (i1 >= 0) && (i1 != p) && (!h()))
      {
        a(p, false);
        q = i1 = p;
      }
      if ((g) && (b) && (p < 0) && (i1 >= 0) && (!h()))
      {
        f(i1);
        i1 = -1;
      }
      try
      {
        Thread.sleep(3L);
      }
      catch (Exception localException1)
      {
      }
      if (o >= 0)
      {
        d(o);
        i1 = o;
        o = -1;
      }
      try
      {
        Thread.sleep(17L);
      }
      catch (Exception localException2)
      {
      }
    }
  }

  public static final void b()
  {
    if (h())
      try
      {
        ((VolumeControl)j[q].getControl("VolumeControl")).setLevel(v);
        return;
      }
      catch (Exception localException)
      {
      }
  }

  public static final void b(int paramInt)
  {
    if (j == null)
      a();
    if (paramInt == k)
    {
      e(paramInt);
      c(paramInt);
      k = -1;
    }
    if (m)
    {
      o = paramInt;
      return;
    }
    d(paramInt);
  }

  private static void d(int paramInt)
  {
    if (j == null)
      a();
    a(paramInt, true);
  }

  private static void e(int paramInt)
  {
    try
    {
      if (j[paramInt].getState() == 400)
        j[paramInt].stop();
      j[paramInt].close();
    }
    catch (Exception localException)
    {
    }
    j[paramInt] = null;
  }

  public static void c()
  {
    o = -1;
    p = -1;
    if (m)
    {
      d = false;
      try
      {
        Thread.sleep(33L);
      }
      catch (Exception localException1)
      {
      }
      t = null;
    }
    if (j != null)
      try
      {
        for (int i1 = 0; i1 < j.length; i1++)
          e(i1);
      }
      catch (Exception localException2)
      {
      }
    j = null;
  }

  private static void f(int paramInt)
  {
    try
    {
      if ((j[paramInt] != null) && (j[paramInt].getState() == 300))
        j[paramInt].deallocate();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void g(int paramInt)
  {
    try
    {
      if (j[paramInt] == null)
        c(paramInt);
      if (j[paramInt] != null)
      {
        if (j[paramInt].getState() == 0)
          c(paramInt);
        if (j[paramInt].getState() == 100)
          j[paramInt].realize();
        if (j[paramInt].getState() == 200)
          j[paramInt].prefetch();
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void a(int paramInt, boolean paramBoolean)
  {
    int i1;
    if (!a(r, s))
    {
      try
      {
        d();
        for (i1 = 0; i1 < i.bm; i1++)
          e(i1);
        f();
      }
      catch (Exception localException1)
      {
      }
      s = r;
    }
    if ((i) && (h()) && (paramInt == q))
      return;
    if ((l) && (h()) && (paramInt < q) && (q != i.bm) && (q != 3) && (q != 4))
      return;
    d();
    if ((g) && (paramInt != q))
      f(q);
    g(paramInt);
    try
    {
      j[paramInt].setMediaTime(-1L);
    }
    catch (Exception localException2)
    {
    }
    if (paramBoolean)
      try
      {
        i1 = 1;
        if (paramInt == i.bm)
          i1 = 3;
        if ((paramInt == a) || (paramInt == k))
          i1 = 100;
        j[paramInt].setLoopCount(i1);
      }
      catch (Exception localException3)
      {
      }
    try
    {
      ((VolumeControl)j[paramInt].getControl("VolumeControl")).setLevel(v);
    }
    catch (Exception localException4)
    {
    }
    try
    {
      if (paramBoolean)
        j[paramInt].start();
      q = paramInt;
      return;
    }
    catch (Exception localException5)
    {
    }
  }

  public static final void a(i parami)
  {
    n = new m(parami);
    if (f)
      i.bm = 6;
  }

  private static boolean h()
  {
    try
    {
      return (q >= 0) && (j[q] != null) && (j[q].getState() == 400);
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private static void h(int paramInt)
  {
    if ((paramInt >= 0) && (j[paramInt] != null))
      try
      {
        if (j[paramInt].getState() == 400)
          j[paramInt].stop();
        return;
      }
      catch (Exception localException)
      {
      }
  }

  public static void d()
  {
    if (j != null)
      try
      {
        for (int i1 = 0; i1 < j.length; i1++)
          h(i1);
        return;
      }
      catch (Exception localException)
      {
      }
  }

  private static void i()
  {
    try
    {
      String[] arrayOfString = Manager.getSupportedContentTypes(null);
      w = false;
      for (int i1 = 0; i1 < arrayOfString.length; i1++)
      {
        if (!arrayOfString[i1].equals("audio/x-wav"))
          continue;
        w = true;
        return;
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void i(int paramInt)
  {
    long l1;
    if ((l1 = System.currentTimeMillis()) < u)
      return;
    try
    {
      Display.getDisplay(NET_Lizard.a).vibrate(paramInt);
    }
    catch (Exception localException)
    {
    }
    u = l1 + paramInt + 7L;
  }

  public static void e()
  {
    i(110);
  }
}