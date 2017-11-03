import java.util.Enumeration;
import java.util.Vector;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DataElement;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.L2CAPConnectionNotifier;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;

public final class l
  implements Runnable
{
  String a = "1020304050d0708093a1b121d1e1f105";
  static boolean b;
  static String c;
  int[] d = new int[1];
  String e;
  L2CAPConnection f;
  static boolean g;
  byte[] h;
  byte[] i;
  Enumeration j;
  DiscoveryAgent k;
  boolean l;
  byte m;
  b n;
  LocalDevice o;
  LocalDevice p;
  String q;
  static boolean r;
  static boolean s = false;
  j t;
  L2CAPConnectionNotifier u;
  String v;
  ServiceRecord w;
  Thread x;

  public l(int paramInt)
  {
    this.d[0] = 256;
    this.f = null;
    this.u = null;
    this.e = null;
    this.w = null;
    this.o = null;
    this.n = null;
    this.t = null;
    this.p = null;
    this.k = null;
    this.j = null;
    this.x = null;
    c = null;
    r = false;
    this.l = false;
    this.h = new byte[paramInt];
    this.i = new byte[paramInt];
    this.q = "server";
  }

  private void c()
  {
    c.a("Starting client...");
    c.a("Starting DiscoveryAgent...");
    try
    {
      this.p = LocalDevice.getLocalDevice();
      this.k = this.p.getDiscoveryAgent();
      this.n = new b(this);
      this.p.setDiscoverable(10390323);
      synchronized (this.n)
      {
        this.k.startInquiry(10390323, this.n);
        try
        {
          this.n.wait();
        }
        catch (InterruptedException localInterruptedException1)
        {
          c.a("DiscoveryAgent feild");
          g = false;
          return;
        }
      }
      c.a("SearchServices...");
      this.j = this.n.a.elements();
      UUID[] arrayOfUUID = { new UUID(this.a, false) };
      int[] arrayOfInt = { 256 };
      this.t = new j(this);
      while (this.j.hasMoreElements())
        synchronized (this.t)
        {
          this.k.searchServices(arrayOfInt, arrayOfUUID, (RemoteDevice)this.j.nextElement(), this.t);
          try
          {
            this.t.wait();
          }
          catch (InterruptedException localInterruptedException2)
          {
            c.a("serv_listener feild");
            g = false;
            return;
          }
        }
    }
    catch (BluetoothStateException localBluetoothStateException)
    {
      c.a("SearchServices feild");
      g = false;
      return;
    }
    if (this.t.a != null)
    {
      try
      {
        this.v = this.t.a.getHostDevice().getFriendlyName(true);
        ??? = LocalDevice.getLocalDevice().getFriendlyName();
        c = this.t.a.getConnectionURL(0, false);
        c.a("Client name:" + (String)???);
        c.a("Server name:" + this.v);
        c.a("Connect to url:" + c);
        this.f = ((L2CAPConnection)Connector.open(c));
        g = true;
      }
      catch (Exception localException)
      {
        g = false;
        return;
      }
    }
    else
    {
      c.a("Service not find");
      g = false;
      return;
    }
  }

  private void d()
  {
    try
    {
      c.a("Starting server...");
      this.o = LocalDevice.getLocalDevice();
      this.o.setDiscoverable(10390323);
      this.u = ((L2CAPConnectionNotifier)Connector.open("btl2cap://localhost:" + this.a));
      this.w = this.o.getRecord(this.u);
      this.q = (this.e == null ? this.o.getFriendlyName() : this.e);
      this.w.setAttributeValue(this.d[0], new DataElement(32, this.q));
      c.a("wait for client...");
      c = this.w.getConnectionURL(0, true).substring(10, this.w.getConnectionURL(0, true).length());
      c = c.substring(0, c.indexOf(";"));
      c.a("I:" + c);
      this.f = this.u.acceptAndOpen();
      this.u.close();
      h();
      c.a("Wait...");
      g = true;
      return;
    }
    catch (Exception localException)
    {
      g = false;
    }
  }

  private void e()
  {
    try
    {
      this.f = ((L2CAPConnection)Connector.open(c));
      g = true;
    }
    catch (Exception localException)
    {
      g = false;
    }
    g();
  }

  private void f()
  {
    c.a("Starting client...");
    c.a("Starting DiscoveryAgent...");
    try
    {
      this.p = LocalDevice.getLocalDevice();
      this.k = this.p.getDiscoveryAgent();
      this.n = new b(this);
      this.p.setDiscoverable(10390323);
      synchronized (this.n)
      {
        this.k.startInquiry(10390323, this.n);
        try
        {
          this.n.wait();
        }
        catch (InterruptedException localInterruptedException1)
        {
          c.a("DiscoveryAgent feild");
          g = false;
          return;
        }
      }
      c.a("SearchServices...");
      this.j = this.n.a.elements();
      UUID[] arrayOfUUID = { new UUID(this.a, false) };
      int[] arrayOfInt = { 256 };
      this.t = new j(this);
      while (this.j.hasMoreElements())
        synchronized (this.t)
        {
          this.k.searchServices(arrayOfInt, arrayOfUUID, (RemoteDevice)this.j.nextElement(), this.t);
          try
          {
            this.t.wait();
          }
          catch (InterruptedException localInterruptedException2)
          {
            c.a("serv_listener feild");
            g = false;
            return;
          }
        }
    }
    catch (BluetoothStateException localBluetoothStateException)
    {
      c.a("SearchServices feild");
      g = false;
      return;
    }
    if (this.t.a != null)
    {
      try
      {
        this.v = this.t.a.getHostDevice().getFriendlyName(true);
        ??? = LocalDevice.getLocalDevice().getFriendlyName();
        c = this.t.a.getConnectionURL(0, false);
        c.a("Client name:" + (String)???);
        c.a("Server name:" + this.v);
        c.a("url:" + c);
      }
      catch (Exception localException)
      {
        c.a("Service not find");
        return;
      }
    }
    else
    {
      c.a("Service not find");
      return;
    }
  }

  final void a()
  {
    try
    {
      this.f.close();
    }
    catch (Exception localException1)
    {
    }
    try
    {
      this.u.close();
    }
    catch (Exception localException2)
    {
    }
    g = false;
    if ((this.l) && (s))
      try
      {
        if (this.k != null)
          this.k.cancelInquiry(this.n);
      }
      catch (Exception localException3)
      {
      }
    this.u = null;
  }

  private void g()
  {
    r = false;
    try
    {
      this.f.receive(this.h);
      i.cb = this.h[0];
      i.bK = this.h[1];
      this.m = 1;
      return;
    }
    catch (Exception localException)
    {
      i();
      this.m = -1;
    }
  }

  public final void run()
  {
    s = true;
    if (this.l)
    {
      f();
    }
    else
    {
      if (b)
        d();
      else if (c == null)
        c();
      else
        e();
      if (g)
      {
        c.a("connect ok");
        byte[] arrayOfByte1 = this.h;
        byte[] arrayOfByte2 = this.i;
        r = false;
        while (g)
        {
          try
          {
            Thread.sleep(3L);
          }
          catch (Exception localException1)
          {
            i();
            continue;
          }
          if (r)
            continue;
          System.currentTimeMillis();
          if (b)
            try
            {
              this.f.send(arrayOfByte2);
              this.f.receive(arrayOfByte1);
              r = true;
            }
            catch (Exception localException2)
            {
              i();
              continue;
            }
          else
            try
            {
              this.f.receive(arrayOfByte1);
              this.f.send(arrayOfByte2);
              r = true;
            }
            catch (Exception localException3)
            {
              i();
              continue;
            }
          System.currentTimeMillis();
        }
      }
      else
      {
        c.a("error: creat connect fail");
      }
      try
      {
        this.f.close();
      }
      catch (Exception localException4)
      {
      }
      this.f = null;
      r = false;
      this.u = null;
      this.e = null;
      this.w = null;
      this.o = null;
      this.n = null;
      this.t = null;
      this.p = null;
      this.k = null;
      this.j = null;
      c = null;
      g = false;
      this.l = false;
    }
    c.a("RUN --- OK");
    this.l = false;
    s = false;
  }

  private void h()
  {
    r = false;
    this.i[0] = i.cb;
    this.i[1] = (byte)i.bK;
    try
    {
      this.f.send(this.i);
      return;
    }
    catch (Exception localException)
    {
      i();
    }
  }

  public final void b()
  {
    this.x = null;
    g = false;
    this.x = new Thread(this);
    this.x.start();
    s = true;
  }

  private void i()
  {
    g = false;
    try
    {
      this.f.close();
    }
    catch (Exception localException)
    {
    }
    this.f = null;
    this.l = false;
    r = false;
    this.u = null;
    this.e = null;
    this.w = null;
    this.o = null;
    this.n = null;
    this.t = null;
    this.p = null;
    this.k = null;
    this.j = null;
    c = null;
    c.a("Disconnect");
  }
}