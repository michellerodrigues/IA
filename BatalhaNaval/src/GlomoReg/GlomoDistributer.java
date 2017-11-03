package GlomoReg;

import java.util.Hashtable;

public class GlomoDistributer extends GlomoInfoObject
{
  public Hashtable DistrFieldsOrder = new Hashtable(4);

  public GlomoDistributer()
  {
    String[] arrayOfString1 = { "", "DistID", "SubDistID", "DistName", "DistWWW", "DistWWWTitle", "DistMoreGamesLink", "DistMoreGamesTitle", "DistLetter", "DistFlags", "RegisterSizeKey", "BonusSizeKey", "RegisterSizeKeyType1", "RegisterSizeKeyType2", "RegisterSizeKeyType3", "RegisterSizeKeyType4", "TailSeparator", "SmsKeyVersion" };
    String[] arrayOfString2 = GlomoUtil.split(",", ",id,chId,name,glink,glinkTtl,mglink,mglinkTtl,pflag,gflag,kszReg,kszBns,kszSub1,kszSub2,kszSub3,kszSub4,tailSepar,smsKeyVer");
    this.DistrFieldsOrder.put("CFG_1", arrayOfString1);
    this.DistrFieldsOrder.put("JAD_1", arrayOfString2);
    this.DistrFieldsOrder.put("CFG_2", arrayOfString1);
    this.DistrFieldsOrder.put("JAD_2", arrayOfString2);
    id("0001");
    channelId("00");
    name("GlowingMobile");
    gameLink("www.glowingmobile.com");
    gameLinkTitle("Game link title");
    moreGamesLink("www.glomogames.com");
    moreGamesTitle("More games");
    partnerFlags("A");
    gameFlags("FLAG");
    keySize_Register("6");
    keySize_Bonus("4");
    keySize_SubscribeType1("6");
    keySize_SubscribeType2("6");
    keySize_SubscribeType3("6");
    keySize_SubscribeType4("6");
    smsCustomTailSeparator("#");
    smsKeyVersion("0");
  }

  public final String id()
  {
    return info("DistID");
  }

  public final String channelId()
  {
    for (String str = info("SubDistID"); str.length() < (GlomoConfig.versionInt() > 1 ? 5 : 2); str = "0" + str);
    return str;
  }

  public final String name()
  {
    return info("DistName");
  }

  public final String gameLink()
  {
    return info("DistWWW");
  }

  public final String gameLinkTitle()
  {
    return info("DistWWWTitle");
  }

  public final String moreGamesLink()
  {
    return info("DistMoreGamesLink");
  }

  public final String moreGamesTitle()
  {
    return info("DistMoreGamesTitle");
  }

  public final String partnerFlags()
  {
    return info("DistLetter");
  }

  public final String gameFlags()
  {
    return info("DistFlags");
  }

  public final String keySize_Register()
  {
    return info("RegisterSizeKey");
  }

  public final String keySize_Bonus()
  {
    return info("BonusSizeKey");
  }

  public final String keySize_SubscribtionType1()
  {
    return info("RegisterSizeKeyType1");
  }

  public final String keySize_SubscribtionType2()
  {
    return info("RegisterSizeKeyType2");
  }

  public final String keySize_SubscribtionType3()
  {
    return info("RegisterSizeKeyType3");
  }

  public final String keySize_SubscribtionType4()
  {
    return info("RegisterSizeKeyType4");
  }

  public final String smsCustomTailSeparator()
  {
    return info("TailSeparator");
  }

  public final String smsKeyVersion()
  {
    return info("SmsKeyVersion");
  }

  public final String id(String paramString)
  {
    return info("DistID", paramString);
  }

  public final String channelId(String paramString)
  {
    return info("SubDistID", paramString);
  }

  public final String name(String paramString)
  {
    return info("DistName", paramString);
  }

  public final String gameLinkTitle(String paramString)
  {
    return info("DistWWWTitle", paramString);
  }

  public final String gameLink(String paramString)
  {
    return info("DistWWW", paramString);
  }

  public final String moreGamesLink(String paramString)
  {
    return info("DistMoreGamesLink", paramString);
  }

  public final String moreGamesTitle(String paramString)
  {
    return info("DistMoreGamesTitle", paramString);
  }

  public final String partnerFlags(String paramString)
  {
    return info("DistLetter", paramString);
  }

  public final String gameFlags(String paramString)
  {
    return info("DistFlags", paramString);
  }

  public final String keySize_Register(String paramString)
  {
    return info("RegisterSizeKey", paramString);
  }

  public final String keySize_Bonus(String paramString)
  {
    return info("BonusSizeKey", paramString);
  }

  public final String keySize_SubscribeType1(String paramString)
  {
    return info("RegisterSizeKeyType1", paramString);
  }

  public final String keySize_SubscribeType2(String paramString)
  {
    return info("RegisterSizeKeyType2", paramString);
  }

  public final String keySize_SubscribeType3(String paramString)
  {
    return info("RegisterSizeKeyType3", paramString);
  }

  public final String keySize_SubscribeType4(String paramString)
  {
    return info("RegisterSizeKeyType4", paramString);
  }

  public final String smsCustomTailSeparator(String paramString)
  {
    return info("TailSeparator", paramString);
  }

  public final String smsKeyVersion(String paramString)
  {
    return info("SmsKeyVersion", paramString);
  }

  public final boolean checkGameFlag(String paramString)
  {
    return (gameFlags().indexOf(paramString) >= 0) || (flag(paramString));
  }

  public final void readFromArray(String[] paramArrayOfString)
  {
    readConfig_from_JAD(paramArrayOfString);
    readFieldsFromArray((String[])this.DistrFieldsOrder.get("CFG_" + GlomoConfig.version()), paramArrayOfString);
  }

  public final String[] readConfig_from_JAD(String[] paramArrayOfString)
  {
    String[] arrayOfString = (String[])this.DistrFieldsOrder.get("JAD_" + GlomoConfig.version());
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if ((i >= paramArrayOfString.length) || (arrayOfString[i].compareTo("") == 0) || (JAD("dst_" + arrayOfString[i]).compareTo("") == 0))
        continue;
      paramArrayOfString[i] = JAD("dst_" + arrayOfString[i]);
    }
    return paramArrayOfString;
  }

  public final void readConfig_from_CFG(String[] paramArrayOfString)
  {
    readConfig_from_CFG(paramArrayOfString, 0, 1);
  }

  public final void readConfig_from_CFG(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; (i < paramInt2) && (i < paramArrayOfString.length); i++)
    {
      if ((paramInt1 = GlomoUtil.split(";", paramArrayOfString[i])).length <= 1)
        continue;
      readFromArray(paramInt1);
    }
  }
}