package GlomoReg;

import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Vector;

public class GlomoCountry extends GlomoInfoObject
{
  public static final Vector countriesList = new Vector(0);
  public static final Hashtable countriesIdList = new Hashtable(0);
  public static final Hashtable countriesNamesList = new Hashtable(0);
  public static final Hashtable countriesCodesList = new Hashtable(0);
  public static final Hashtable CntryFieldsOrder = new Hashtable(4);

  public GlomoCountry()
  {
    String[] arrayOfString1 = { "name", "prefix", "numReg", "priceReg", "prefix_bonus1", "numBonus1", "priceBonus1", "prefix_spec", "numSpec", "priceSpec", "prefix_subscribe_type1", "numSubscribeType1", "priceSubscribeType1", "durationSubscribeType1", "prefix_subscribe_type2", "numSubscribeType2", "priceSubscribeType2", "durationSubscribeType2", "prefix_subscribe_type3", "numSubscribeType3", "priceSubscribeType3", "durationSubscribeType3", "prefix_subscribe_type4", "numSubscribeType4", "priceSubscribeType4", "durationSubscribeType4", "specParam1", "specParam2", "specParam3", "specParam4" };
    String str1 = "name,pfxReg,snReg,priceReg,pfxBns1,snBns1,priceBns1,pfxSpec,snSpec,priceSpec,pfxSub1,snSub1,priceSub1,prmSub1,pfxSub2,snSub2,priceSub2,prmSub2,pfxSub3,snSub3,priceSub3,prmSub3,pfxSub4,snSub4,priceSub4,prmSub4,param1,param2,param3,param4";
    String[] arrayOfString2 = { "name", "code", "prefix", "numReg", "priceReg", "paramReg", "prefix_bonus1", "numBonus1", "priceBonus1", "paramBonus1", "prefix_bonus2", "numBonus2", "priceBonus2", "paramBonus2", "prefix_bonus3", "numBonus3", "priceBonus3", "paramBonus3", "prefix_bonus4", "numBonus4", "priceBonus4", "paramBonus4", "prefix_subscribe_type1", "numSubscribeType1", "priceSubscribeType1", "durationSubscribeType1", "prefix_subscribe_type2", "numSubscribeType2", "priceSubscribeType2", "durationSubscribeType2", "prefix_subscribe_type3", "numSubscribeType3", "priceSubscribeType3", "durationSubscribeType3", "prefix_subscribe_type4", "numSubscribeType4", "priceSubscribeType4", "durationSubscribeType4", "prefix_spec", "numSpec", "priceSpec", "paramSpec", "specParam1", "specParam2", "specParam3", "specParam4" };
    String str2 = "name,code,pfxReg,snReg,priceReg,prmReg,pfxBns1,snBns1,priceBns1,prmBns1,pfxBns2,snBns2,priceBns2,prmBns2,pfxBns3,snBns3,priceBns3,prmBns3,pfxBns4,snBns4,priceBns4,prmBns4,pfxSub1,snSub1,priceSub1,prmSub1,pfxSub2,snSub2,priceSub2,prmSub2,pfxSub3,snSub3,priceSub3,prmSub3,pfxSub4,snSub4,priceSub4,prmSub4,pfxSpec,snSpec,priceSpec,prmSpec,param1,param2,param3,param4";
    if (!CntryFieldsOrder.contains("CFG_1"))
      CntryFieldsOrder.put("CFG_1", arrayOfString1);
    if (!CntryFieldsOrder.contains("JAD_1"))
      CntryFieldsOrder.put("JAD_1", GlomoUtil.split(",", str1));
    if (!CntryFieldsOrder.contains("CFG_2"))
      CntryFieldsOrder.put("CFG_2", arrayOfString2);
    if (!CntryFieldsOrder.contains("JAD_2"))
      CntryFieldsOrder.put("JAD_2", GlomoUtil.split(",", str2));
    id("-1");
    name("Russia");
    code("");
    prefix("BOMB");
    srvNumReg("1132");
    priceReg("94.00 RUR ex. VAT");
    paramReg("");
    prefix_bonus(1, "BOMB");
    srvNumBonus(1, "1132");
    priceBonus(1, "7.50 RUR ex. VAT");
    paramBonus(1, "");
    prefix_spec("SPEC");
    srvNumSpec("1136");
    priceSpec("50 RUR ex.VAT");
    paramSpec("");
    prefix_subscribe(5, "SUB1");
    srvNumSubscribe(5, "1133");
    priceSubscribe(5, "5.00 RUR ex. VAT");
    durationSubscribe(5, "1");
    prefix_subscribe(6, "SUB2");
    srvNumSubscribe(6, "1134");
    priceSubscribe(6, "25.00 RUR ex. VAT");
    durationSubscribe(6, "7");
    prefix_subscribe(7, "SUB3");
    srvNumSubscribe(7, "1135");
    priceSubscribe(7, "50.00 RUR ex. VAT");
    durationSubscribe(7, "14");
    prefix_subscribe(8, "SUB4");
    srvNumSubscribe(8, "1137");
    priceSubscribe(8, "100.00 RUR ex. VAT");
    durationSubscribe(8, "30");
    specParam1("");
    specParam2("");
    specParam3("");
    specParam4("");
  }

  public final String id()
  {
    return info("id");
  }

  public final int id_int()
  {
    return infoInt("id");
  }

  public final String name()
  {
    return info("name");
  }

  public final String code()
  {
    return info("code");
  }

  public final String prefix()
  {
    return info("prefix");
  }

  public final String prefix_bonus()
  {
    return prefix_bonus(1);
  }

  public final String prefix_bonus(int paramInt)
  {
    return info(paramInt == 4 ? "prefix_bonus4" : paramInt == 3 ? "prefix_bonus3" : paramInt == 2 ? "prefix_bonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "prefix_bonus1" : "prefix_bonus1");
  }

  public final String prefix_spec()
  {
    return info("prefix_spec");
  }

  public final String prefix_subscribe(int paramInt)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "prefix_subscribe_type4" : paramInt == 7 ? "prefix_subscribe_type3" : paramInt == 6 ? "prefix_subscribe_type2" : "prefix_subscribe_type1");
  }

  public final String srvNumReg()
  {
    return info("numReg");
  }

  public final String srvNumBonus()
  {
    return srvNumBonus(1);
  }

  public final String srvNumBonus(int paramInt)
  {
    return info(paramInt == 4 ? "numBonus4" : paramInt == 3 ? "numBonus3" : paramInt == 2 ? "numBonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "numBonus1" : "numBonus1");
  }

  public final String srvNumSubscribe(int paramInt)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "numSubscribeType4" : paramInt == 7 ? "numSubscribeType3" : paramInt == 6 ? "numSubscribeType2" : "numSubscribeType1");
  }

  public final String srvNumSpec()
  {
    return info("numSpec");
  }

  public final String priceReg()
  {
    return info("priceReg");
  }

  public final String priceBonus()
  {
    return priceBonus(1);
  }

  public final String priceBonus(int paramInt)
  {
    return info(paramInt == 4 ? "priceBonus4" : paramInt == 3 ? "priceBonus3" : paramInt == 2 ? "priceBonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "priceBonus1" : "priceBonus1");
  }

  public final String priceSubscribe(int paramInt)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "priceSubscribeType4" : paramInt == 7 ? "priceSubscribeType3" : paramInt == 6 ? "priceSubscribeType2" : "priceSubscribeType1");
  }

  public final String priceSpec()
  {
    return info("priceSpec");
  }

  public final String durationSubscribe(int paramInt)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "durationSubscribeType4" : paramInt == 7 ? "durationSubscribeType3" : paramInt == 6 ? "durationSubscribeType2" : "durationSubscribeType1");
  }

  public final String paramReg()
  {
    return info("paramReg");
  }

  public final String paramBonus(int paramInt)
  {
    return info(paramInt == 4 ? "paramBonus4" : paramInt == 3 ? "paramBonus3" : paramInt == 2 ? "paramBonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "paramBonus1" : "paramBonus1");
  }

  public final String paramSpec()
  {
    return info("paramSpec");
  }

  public final String specParam1()
  {
    return info("specParam1");
  }

  public final String specParam2()
  {
    return info("specParam2");
  }

  public final String specParam3()
  {
    return info("specParam3");
  }

  public final String specParam4()
  {
    return info("specParam4");
  }

  public final String id(String paramString)
  {
    return info("id", paramString);
  }

  public final String name(String paramString)
  {
    return info("name", paramString);
  }

  public final String code(String paramString)
  {
    return info("code", paramString);
  }

  public final String prefix(String paramString)
  {
    return info("prefix", paramString);
  }

  public final String prefix_spec(String paramString)
  {
    return info("prefix_spec", paramString);
  }

  public final String prefix_bonus(int paramInt, String paramString)
  {
    return info(paramInt == 4 ? "prefix_bonus4" : paramInt == 3 ? "prefix_bonus3" : paramInt == 2 ? "prefix_bonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "prefix_bonus1" : "prefix_bonus1", paramString);
  }

  public final String prefix_subscribe(int paramInt, String paramString)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "prefix_subscribe_type4" : paramInt == 7 ? "prefix_subscribe_type3" : paramInt == 6 ? "prefix_subscribe_type2" : "prefix_subscribe_type1", paramString);
  }

  public final String srvNumReg(String paramString)
  {
    return info("numReg", paramString);
  }

  public final String srvNumBonus(int paramInt, String paramString)
  {
    return info(paramInt == 4 ? "numBonus4" : paramInt == 3 ? "numBonus3" : paramInt == 2 ? "numBonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "numBonus1" : "numBonus1", paramString);
  }

  public final String srvNumSpec(String paramString)
  {
    return info("numSpec", paramString);
  }

  public final String srvNumSubscribe(int paramInt, String paramString)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "numSubscribeType4" : paramInt == 7 ? "numSubscribeType3" : paramInt == 6 ? "numSubscribeType2" : "numSubscribeType1", paramString);
  }

  public final String priceReg(String paramString)
  {
    return info("priceReg", paramString);
  }

  public final String priceBonus(int paramInt, String paramString)
  {
    return info(paramInt == 4 ? "priceBonus4" : paramInt == 3 ? "priceBonus3" : paramInt == 2 ? "priceBonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "priceBonus1" : "priceBonus1", paramString);
  }

  public final String priceSpec(String paramString)
  {
    return info("priceSpec", paramString);
  }

  public final String priceSubscribe(int paramInt, String paramString)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "priceSubscribeType4" : paramInt == 7 ? "priceSubscribeType3" : paramInt == 6 ? "priceSubscribeType2" : "priceSubscribeType1", paramString);
  }

  public final String durationSubscribe(int paramInt, String paramString)
  {
    if (paramInt != 5);
    return info(paramInt == 8 ? "durationSubscribeType4" : paramInt == 7 ? "durationSubscribeType3" : paramInt == 6 ? "durationSubscribeType2" : "durationSubscribeType1", paramString);
  }

  public final String paramReg(String paramString)
  {
    return info("paramReg", paramString);
  }

  public final String paramBonus(int paramInt, String paramString)
  {
    return info(paramInt == 4 ? "paramBonus4" : paramInt == 3 ? "paramBonus3" : paramInt == 2 ? "paramBonus2" : (GlomoConfig.version_is("1")) || (paramInt == 1) ? "paramBonus1" : "paramBonus1", paramString);
  }

  public final String paramSpec(String paramString)
  {
    return info("paramSpec", paramString);
  }

  public final String specParam1(String paramString)
  {
    return info("specParam1", paramString);
  }

  public final String specParam2(String paramString)
  {
    return info("specParam2", paramString);
  }

  public final String specParam3(String paramString)
  {
    return info("specParam3", paramString);
  }

  public final String specParam4(String paramString)
  {
    return info("specParam4", paramString);
  }

  public final int addCountry(GlomoCountry paramGlomoCountry, int paramInt)
  {
    return addCountry(paramGlomoCountry.id_int(), paramInt, paramGlomoCountry.name(), paramGlomoCountry.code());
  }

  public final int addCountry(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    int i = countriesList.size();
    countriesList.setSize(i + 1);
    countriesList.setElementAt(new GlomoCountryShort(paramInt1, paramString1, paramString2), i);
    countriesIdList.put(new Integer(GlomoConfig.is_JAD_config() ? paramInt2 : paramInt1), new Integer(i));
    return i;
  }

  public final int mapCountry(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < countriesList.size()))
    {
      GlomoCountryShort localGlomoCountryShort = (GlomoCountryShort)countriesList.elementAt(paramInt);
      countriesNamesList.put(localGlomoCountryShort.name(), new Integer(localGlomoCountryShort.id()));
      countriesCodesList.put(localGlomoCountryShort.code(), new Integer(localGlomoCountryShort.id()));
      return paramInt;
    }
    return -1;
  }

  public final GlomoCountry readFromArray(int paramInt, String[] paramArrayOfString)
  {
    id(String.valueOf(paramInt));
    readFieldsFromArray((String[])CntryFieldsOrder.get("CFG_" + GlomoConfig.version()), paramArrayOfString);
    return this;
  }

  public final int readCountriesList_from_JAD(String[] paramArrayOfString)
  {
    readCountriesList_from_CFG(paramArrayOfString);
    clearCountries();
    Object localObject1;
    Object localObject2;
    for (int i = 0; ((localObject1 = JAD("c_" + String.valueOf(i) + "_code")) + (localObject2 = JAD("c_" + String.valueOf(i) + "_name"))).compareTo("") != 0; i++)
    {
      int j = -1;
      GlomoCountry localGlomoCountry;
      if (null != (localGlomoCountry = findMappedCountry_in_CFG(paramArrayOfString, (String)localObject2, (String)localObject1)))
        j = localGlomoCountry.id_int();
      if (((String)localObject2).compareTo("") == 0)
        localObject2 = localGlomoCountry != null ? localGlomoCountry.name() : localObject1;
      else if (((String)localObject1).compareTo("") == 0)
        localObject1 = localGlomoCountry != null ? localGlomoCountry.code() : localObject2;
      System.out.println("name = " + (String)localObject2 + " code = " + (String)localObject1);
      ((GlomoCountryShort)countriesList.elementAt(addCountry(i, j, (String)localObject2, (String)localObject1))).sec_id(j);
    }
    return countriesList.size();
  }

  public final int readCountriesList_from_CFG(String[] paramArrayOfString)
  {
    GlomoCountry localGlomoCountry = new GlomoCountry();
    clearCountries();
    clearMaps();
    for (int i = 1; i < paramArrayOfString.length; i++)
    {
      String[] arrayOfString = GlomoUtil.split(";", paramArrayOfString[i]);
      localGlomoCountry.readFromArray(i, arrayOfString);
      if (arrayOfString.length <= 1)
        continue;
      mapCountry(addCountry(localGlomoCountry, localGlomoCountry.id_int()));
    }
    return countriesList.size();
  }

  public final int readCountriesList(String[] paramArrayOfString)
  {
    if (GlomoConfig.is_JAD_config())
      return readCountriesList_from_JAD(paramArrayOfString);
    return readCountriesList_from_CFG(paramArrayOfString);
  }

  public final GlomoCountry findMappedCountry_in_CFG(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    int i = -1;
    if ((paramString2.compareTo("") != 0) && (countriesCodesList.containsKey(paramString2)))
      i = ((Integer)countriesCodesList.get(paramString2)).intValue();
    else if ((paramString1.compareTo("") != 0) && (countriesNamesList.containsKey(paramString1)))
      i = ((Integer)countriesNamesList.get(paramString1)).intValue();
    if (i >= 0)
      return readCountry_from_CFG(paramArrayOfString, i);
    return null;
  }

  public final GlomoCountryShort getCountry_from_countriesList_by_id(int paramInt)
  {
    return (GlomoCountryShort)countriesList.elementAt(((Integer)countriesIdList.get(new Integer(paramInt))).intValue());
  }

  public final GlomoCountry readCountry_from_CFG(String[] paramArrayOfString, int paramInt)
  {
    if ((paramInt >= paramArrayOfString.length) || (paramInt < 0))
      return null;
    GlomoCountry localGlomoCountry;
    (localGlomoCountry = new GlomoCountry()).init(this.a);
    localGlomoCountry.readFromArray(paramInt, GlomoUtil.split(";", paramArrayOfString[paramInt]));
    return localGlomoCountry;
  }

  public final GlomoCountry readCountry_by_id(String[] paramArrayOfString, int paramInt)
  {
    if (GlomoConfig.is_JAD_config())
    {
      int i = paramInt;
      paramInt = paramArrayOfString;
      paramArrayOfString = this;
      if (i < 0)
        return null;
      paramInt = paramArrayOfString.readCountry_from_CFG(paramInt, paramArrayOfString.getCountry_from_countriesList_by_id(i).sec_id());
      String[] arrayOfString1 = (String[])CntryFieldsOrder.get("JAD_" + GlomoConfig.version());
      String[] arrayOfString2 = (String[])CntryFieldsOrder.get("CFG_" + GlomoConfig.version());
      for (int j = 0; j < arrayOfString1.length; j++)
      {
        String str;
        if ((str = paramArrayOfString.JAD("c_" + String.valueOf(((Integer)countriesIdList.get(new Integer(i))).intValue()) + "_" + arrayOfString1[j])).compareTo("") == 0)
          continue;
        paramInt.info(arrayOfString2[j], str);
      }
      return paramInt;
    }
    return readCountry_from_CFG(paramArrayOfString, paramInt);
  }

  public static final int readCountry_ID_by_NUM(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= countriesList.size()))
      return -1;
    if (GlomoConfig.is_JAD_config())
      return ((GlomoCountryShort)countriesList.elementAt(paramInt)).sec_id();
    return ((GlomoCountryShort)countriesList.elementAt(paramInt)).id();
  }

  public static final int readCountry_NUM_by_ID(int paramInt)
  {
    if ((paramInt = (Integer)countriesIdList.get(new Integer(paramInt))) == null)
      return -1;
    return paramInt.intValue();
  }

  public final void clearCountries()
  {
    countriesList.setSize(0);
    countriesIdList.clear();
  }

  public final void clearMaps()
  {
    countriesCodesList.clear();
    countriesNamesList.clear();
  }
}