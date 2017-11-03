import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

final class j
  implements DiscoveryListener
{
  public ServiceRecord a;

  public j(l paraml)
  {
  }

  public final void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass)
  {
  }

  public final void inquiryCompleted(int paramInt)
  {
  }

  public final void serviceSearchCompleted(int paramInt1, int paramInt2)
  {
    synchronized (this)
    {
      notify();
      return;
    }
  }

  public final void servicesDiscovered(int paramInt, ServiceRecord[] paramArrayOfServiceRecord)
  {
    this.a = paramArrayOfServiceRecord[0];
  }
}