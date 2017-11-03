import javax.microedition.midlet.MIDlet;

public final class NET_Lizard extends MIDlet
{
  static NET_Lizard a;
  static int b = 0;
  static i c;
  static boolean d = true;

  public NET_Lizard()
  {
    a = this;
    if (e.m == null)
      e.d();
    if (c == null)
      c = new i();
  }

  public final void destroyApp(boolean paramBoolean)
  {
    if (d)
    {
      try
      {
        c.D = false;
      }
      catch (Exception localException1)
      {
      }
      try
      {
        c.bO.n = false;
      }
      catch (Exception localException2)
      {
      }
      try
      {
        m.c();
      }
      catch (Exception localException3)
      {
      }
      try
      {
        if ((i.b != null) && (l.g))
          c.b();
      }
      catch (Exception localException4)
      {
      }
    }
    e.c();
    try
    {
      c.dC = null;
    }
    catch (Exception localException5)
    {
    }
    c = null;
    b = 0;
    notifyDestroyed();
  }

  public final void pauseApp()
  {
    b = 2;
    notifyPaused();
  }

  public static void a()
  {
    d = false;
    a.destroyApp(true);
    a.notifyDestroyed();
    a = null;
  }

  public final void startApp()
  {
    if (b == 0)
    {
      i.bN = true;
      c.i();
    }
    b = 1;
    d = true;
  }
}