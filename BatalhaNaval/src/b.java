import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

final class b
  implements DiscoveryListener
{
  public Vector a = new Vector();

  public b(l paraml)
  {
  }

  public final void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass)
  {
    paramDeviceClass.getMajorDeviceClass();
    if (!this.a.contains(paramRemoteDevice))
      this.a.addElement(paramRemoteDevice);
  }

  public final void inquiryCompleted(int paramInt)
  {
    synchronized (this)
    {
      notify();
      return;
    }
  }

  public final void serviceSearchCompleted(int paramInt1, int paramInt2)
  {
  }

  public final void servicesDiscovered(int paramInt, ServiceRecord[] paramArrayOfServiceRecord)
  {
  }
}