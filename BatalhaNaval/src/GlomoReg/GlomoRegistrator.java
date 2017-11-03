package GlomoReg;

import java.io.PrintStream;
import java.util.Date;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;

public final class GlomoRegistrator
{
  private int jdField_a_of_type_Int = 0;
  private String jdField_a_of_type_JavaLangString = "";
  public GlomoConfig cfg;

  public GlomoRegistrator(MIDlet paramMIDlet)
  {
    this.cfg = new GlomoConfig(paramMIDlet);
    this.cfg.readConfig();
    isSubscribed();
  }

  public static String CheckMidletsSecutiry(MIDlet paramMIDlet, String[] paramArrayOfString)
  {
    String str1 = "";
    try
    {
      for (int i = 0; (i < paramArrayOfString.length) && (str1 == ""); i++)
      {
        String str2;
        if ((str2 = paramMIDlet.getAppProperty("MIDlet-" + String.valueOf(i + 1))) == null)
        {
          str1 = str1 + "+midlet1";
        }
        else
        {
          if (str2.trim().compareTo(paramArrayOfString[i].trim()) == 0)
            continue;
          str1 = str1 + "+midlet2";
        }
      }
      if (paramMIDlet.getAppProperty("MIDlet-" + String.valueOf(i + 1)) != null)
        str1 = str1 + "+midlet3";
    }
    catch (Exception localException)
    {
      str1 = str1 + "+midlet4";
    }
    long l1 = GlomoRMS.LastModified();
    long l2 = GlomoRMS.LastModified_current();
    if (GlomoRMS.RunsCount_Update() == 1L)
    {
      GlomoRMS.Platform_Update();
    }
    else
    {
      if (GlomoRMS.RunsCount() > 100000L)
        str1 = str1 + "+runs";
      if (GlomoRMS.Platform().compareTo(System.getProperty("microedition.platform")) != 0)
        str1 = str1 + "+platform";
      if (l2 - l1 > 2000L)
      {
        str1 = str1 + "+lm";
        GlomoRMS.SaveLastModified = false;
        GlomoRMS.LastModified(l1);
        GlomoRMS.EnteredKey("000000");
      }
    }
    return str1;
  }

  public static boolean CheckLastModified()
  {
    long l1 = GlomoRMS.LastModified();
    long l2 = GlomoRMS.LastModified_current();
    return (l1 == 0L) || ((l2 >= l1) && (l2 - l1 < 500L));
  }

  public final boolean setCountry(int paramInt)
  {
    return this.cfg.setCountry(paramInt);
  }

  public final Vector getCountriesList()
  {
    return GlomoCountry.countriesList;
  }

  public final GlomoCountry getCountryInfo()
  {
    return GlomoConfig.countryInfo;
  }

  public final String getActivationKey()
  {
    return getActivationKey("");
  }

  public final String getActivationKey(String paramString)
  {
    if (paramString == null)
      paramString = "";
    if (getRegistrationType() == -1)
      setRegistrationType(0);
    long l = GlomoRMS.ActivationKey();
    System.out.println("== k = " + l);
    String str;
    if ((str = GlomoUtil.generateKeyOfType(0, GlomoConfig.countryInfo.prefix(), l != 0L ? l : GlomoRMS.ActivationKey(GlomoUtil.generateRandomKey(0)))).compareTo("") == 0)
    {
      this.jdField_a_of_type_Int = 1;
      this.jdField_a_of_type_JavaLangString = GlomoConstants.glomo_Errors[this.jdField_a_of_type_Int];
    }
    return (paramString = str + (paramString.compareTo("") == 0 ? "" : new StringBuffer().append(GlomoConfig.distInfo.smsCustomTailSeparator()).append(paramString).toString())).toLowerCase();
  }

  public final String getSubscriptionKey(int paramInt)
  {
    return getSubscriptionKey(paramInt, "");
  }

  public final String getSubscriptionKey(int paramInt, String paramString)
  {
    if (paramString == null)
      paramString = "";
    long l = GlomoRMS.SubscriptionKey();
    return (paramInt += (paramString.compareTo("") == 0 ? "" : new StringBuffer().append(GlomoConfig.distInfo.smsCustomTailSeparator()).append(paramString).toString())).toLowerCase();
  }

  public final boolean requestSerial()
  {
    return requestSerial("");
  }

  public final boolean requestSerial(String paramString)
  {
    setRegistrationType(0);
    return sendSMS(GlomoConfig.countryInfo.srvNumReg(), getActivationKey(paramString));
  }

  public final boolean requestSubscription(int paramInt)
  {
    return requestSubscription(paramInt, "");
  }

  public final boolean requestSubscription(int paramInt, String paramString)
  {
    boolean bool;
    if ((bool = setRegistrationType(paramInt) == paramInt ? 1 : 0) != 0)
      bool = sendSMS(GlomoConfig.countryInfo.srvNumSubscribe(paramInt), getSubscriptionKey(paramInt, paramString));
    return bool;
  }

  public final boolean checkSerial(String paramString)
  {
    return checkSerial(paramString, getRegistrationType());
  }

  public final boolean checkSerial(String paramString, int paramInt)
  {
    boolean bool;
    if ((bool = (!isActivated()) && (paramInt >= 0) && (paramString != null) && (paramString.compareTo("") != 0) ? 1 : 0) != 0)
    {
      GlomoRMS.EnteredKey(paramString);
      if (paramInt == 0)
        bool = isRegistered();
      else if ((paramInt == 5) || (paramInt == 6) || (paramInt == 7) || (paramInt == 8))
      {
        if ((bool = isSubscribed(false)))
          if (SubscribtionMode() == 0)
          {
            paramInt = paramInt;
            paramString = this;
            Date localDate;
            paramInt = paramInt;
            (localDate = new Date()).setTime(localDate.getTime() + Long.parseLong((paramString = paramString).getCountryInfo().durationSubscribe(paramInt)) * 24L * 60L * 60L * 1000L);
            long l;
            GlomoRMS.ExpirationDate(l = localDate.getTime());
          }
          else if (SubscribtionMode() == 1)
          {
            GlomoRMS.SubscriptionKey(0L);
          }
      }
      else
        bool = false;
      if (!bool)
        GlomoRMS.EnteredKey("");
    }
    return bool;
  }

  public final boolean isRegistred()
  {
    return isRegistered();
  }

  public final boolean isRegistered()
  {
    int i = 0;
    try
    {
      i = Long.parseLong(GlomoUtil.decrypt(GlomoRMS.EnteredKey(), 0)) == GlomoRMS.ActivationKey() ? 1 : 0;
    }
    catch (Exception localException)
    {
    }
    return i;
  }

  public final boolean isSubscribed()
  {
    return isSubscribed(true);
  }

  public final boolean isSubscribed(boolean paramBoolean)
  {
    int i = 0;
    try
    {
      i = Long.parseLong(GlomoUtil.decrypt(GlomoRMS.EnteredKey(), 0)) == GlomoRMS.SubscriptionKey() ? 1 : 0;
    }
    catch (Exception localException)
    {
    }
    paramBoolean = (SubscribtionMode() == 1) || (!paramBoolean);
    return paramBoolean = (i != 0) && (paramBoolean) ? 1 : 0;
  }

  public final int SubscribtionMode()
  {
    return GlomoRMS.SubscribtionMode();
  }

  public final int SubscribtionMode(int paramInt)
  {
    return GlomoRMS.SubscribtionMode(paramInt);
  }

  public final boolean isActivated()
  {
    return (isRegistered()) || (isSubscribed());
  }

  public final String getBonusKey(int paramInt)
  {
    return getBonusKey(paramInt, "");
  }

  public final String getBonusKey(int paramInt, String paramString)
  {
    return getBonusKey(paramInt, paramString, GlomoUtil.generateRandomKey(0));
  }

  public final String getBonusKey(int paramInt, String paramString, long paramLong)
  {
    if (paramString == null)
      paramString = "";
    return (paramInt += (paramString.compareTo("") == 0 ? "" : new StringBuffer().append(GlomoConfig.distInfo.smsCustomTailSeparator()).append(paramString).toString())).toLowerCase();
  }

  public final boolean requestBonus(int paramInt)
  {
    return requestBonus(paramInt, false, "");
  }

  public final boolean requestBonus(int paramInt, String paramString)
  {
    return requestBonus(paramInt, false, paramString);
  }

  public final boolean requestBonus(int paramInt, boolean paramBoolean)
  {
    return requestBonus(paramInt, paramBoolean, "");
  }

  public final boolean requestBonus(int paramInt, boolean paramBoolean, String paramString)
  {
    long l1 = GlomoUtil.generateRandomKey(0);
    long l2 = l1;
    String str = paramString;
    paramString = paramBoolean;
    paramBoolean = paramInt;
    paramInt = this;
    str = getBonusKey(paramBoolean, str, l2);
    if (paramInt.sendSMS(GlomoConfig.countryInfo.srvNumBonus(paramBoolean), str))
    {
      if (paramString != 0)
        GlomoRMS.RememberBonus(l2, paramBoolean);
      return true;
    }
    return false;
  }

  public final boolean checkBonus(String paramString)
  {
    return GlomoRMS.CheckBonus(Long.parseLong(paramString)) != 0L;
  }

  public final int checkBonusAndType(String paramString)
  {
    return (int)(GlomoRMS.CheckBonus(Long.parseLong(paramString)) % 10L);
  }

  public final boolean sendSMS(String paramString1, String paramString2)
  {
    boolean bool = false;
    try
    {
      if (paramString2.compareTo("") == 0)
      {
        this.jdField_a_of_type_Int = 1;
        this.jdField_a_of_type_JavaLangString = GlomoConstants.glomo_Errors[this.jdField_a_of_type_Int];
      }
      else
      {
        bool = GlomoSMS.send(paramString1, paramString2);
      }
    }
    catch (Exception localException)
    {
      bool = false;
    }
    return bool;
  }

  public final String getGameLink()
  {
    return GlomoConfig.distInfo.gameLink();
  }

  public final String getGameLinkTitle()
  {
    return GlomoConfig.distInfo.gameLinkTitle();
  }

  public final String getMoreGamesTitle()
  {
    return GlomoConfig.distInfo.moreGamesTitle();
  }

  public final String getMoreGamesLink()
  {
    return GlomoConfig.distInfo.moreGamesLink();
  }

  public final boolean sendFriendSms(String paramString)
  {
    return sendFriendSms(paramString, false);
  }

  public final boolean sendFriendSms(String paramString, boolean paramBoolean)
  {
    try
    {
      if (((paramString = GlomoSMS.send(paramString, getGameLink()))) && (paramBoolean))
        GlomoRMS.IncreaseSendFriendAttemptCounter();
    }
    catch (Exception localException)
    {
      paramString = 0;
    }
    return paramString;
  }

  public final int getSendFriendSmsAttemptsCounter()
  {
    return GlomoRMS.SendFriendAttemptsCounter();
  }

  public final long getExpirationDate()
  {
    return GlomoRMS.ExpirationDate();
  }

  public final int getRegistrationType()
  {
    return GlomoRMS.RegistrationType();
  }

  public final int setRegistrationType(int paramInt)
  {
    return GlomoRMS.RegistrationType(paramInt);
  }

  public final int getActivationKeySize()
  {
    return Integer.parseInt(GlomoConfig.distInfo.keySize_Register());
  }

  public final int getBonusKeySize()
  {
    return Integer.parseInt(GlomoConfig.distInfo.keySize_Bonus());
  }

  public final int getCurrentSubscribtionKeySize()
  {
    return getSubscribtionKeySize(getRegistrationType());
  }

  public final int getSubscribtionKeySize(int paramInt)
  {
    String str = String.valueOf(getActivationKeySize());
    if (paramInt == 5)
      str = GlomoConfig.distInfo.keySize_SubscribtionType1();
    else if (paramInt == 6)
      str = GlomoConfig.distInfo.keySize_SubscribtionType2();
    else if (paramInt == 7)
      str = GlomoConfig.distInfo.keySize_SubscribtionType3();
    else if (paramInt == 8)
      str = GlomoConfig.distInfo.keySize_SubscribtionType4();
    return Integer.parseInt(str);
  }

  public static final String getRegistratorVersion()
  {
    return "1";
  }

  public final String getConfigVersion()
  {
    return GlomoConfig.version();
  }

  public final String getSmsCodeVersion()
  {
    return GlomoConfig.sms_key_version();
  }

  public final int getDemoModeElapsed()
  {
    return GlomoRMS.DemoModeElapsed();
  }

  public final int setDemoModeElapsed(int paramInt)
  {
    return GlomoRMS.DemoModeElapsed(paramInt);
  }

  public final int getErrorCode()
  {
    return this.jdField_a_of_type_Int;
  }

  public final String getErrorText()
  {
    return this.jdField_a_of_type_JavaLangString;
  }
}