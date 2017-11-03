package GlomoReg;

import java.util.Hashtable;
import javax.microedition.midlet.MIDlet;

public class GlomoInfoObject
  implements GlomoConstants
{
  public final Hashtable infoHash = new Hashtable(12);
  protected MIDlet a;

  public final String info(String paramString)
  {
    return (String)this.infoHash.get(paramString);
  }

  public final String info(String paramString1, String paramString2)
  {
    this.infoHash.put(paramString1, paramString2);
    return paramString2;
  }

  public final boolean flag(String paramString)
  {
    return ((paramString = info(paramString)).compareTo("0") != 0) && (paramString.compareTo("") != 0);
  }

  public final boolean flag(String paramString, boolean paramBoolean)
  {
    this.infoHash.put(paramString, paramBoolean ? "1" : "0");
    return paramBoolean;
  }

  public final int infoInt(String paramString)
  {
    paramString = info(paramString);
    try
    {
      if (paramString == "")
        return 0;
      return Integer.parseInt(paramString);
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public final int infoInt(String paramString, int paramInt)
  {
    this.infoHash.put(paramString, String.valueOf(paramInt));
    return paramInt;
  }

  public final void init(MIDlet paramMIDlet)
  {
    this.a = paramMIDlet;
  }

  public final String JAD(String paramString)
  {
    return GlomoUtil.JAD(this.a, paramString);
  }

  public final void readFieldsFromArray(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    for (int i = 0; (i < paramArrayOfString2.length) && (i < paramArrayOfString1.length); i++)
    {
      if (paramArrayOfString1[i].compareTo("") == 0)
        continue;
      info(paramArrayOfString1[i], paramArrayOfString2[i]);
    }
  }
}