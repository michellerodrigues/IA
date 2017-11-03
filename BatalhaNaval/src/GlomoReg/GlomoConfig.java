package GlomoReg;

import javax.management.loading.MLet;

public class GlomoConfig
  implements GlomoConstants
{
  private static String jdField_a_of_type_JavaLangString = "0";
  public static GlomoDistributer distInfo = new GlomoDistributer();
  public static GlomoCountry countryInfo = new GlomoCountry();
  public static final int cfgScheme = 1;
  private static MLet jdField_a_of_type_JavaxMicroeditionMidletMIDlet;
  private static String[] jdField_a_of_type_ArrayOfJavaLangString;
  private static int jdField_a_of_type_Int = 0;

  public GlomoConfig(MLet paramMIDlet)
  {
    jdField_a_of_type_JavaxMicroeditionMidletMIDlet = paramMIDlet;
    distInfo.init(paramMIDlet);
    countryInfo.init(paramMIDlet);
  }

  public static String version()
  {
    return jdField_a_of_type_JavaLangString;
  }

  public static int versionInt()
  {
    return Integer.parseInt(jdField_a_of_type_JavaLangString);
  }

  public static boolean version_is(String paramString)
  {
    return paramString.compareTo(jdField_a_of_type_JavaLangString) == 0;
  }

  public static String sms_key_version()
  {
    return distInfo.smsKeyVersion();
  }

  public static String[] cfgContents()
  {
    if (jdField_a_of_type_ArrayOfJavaLangString == null)
    {
      jdField_a_of_type_ArrayOfJavaLangString = GlomoUtil.readResourceAsArr(jdField_a_of_type_JavaxMicroeditionMidletMIDlet, "/glomo.cfg");
      jdField_a_of_type_Int = 0;
    }
    jdField_a_of_type_Int += 1;
    return jdField_a_of_type_ArrayOfJavaLangString;
  }

  public static void release_cfgContents()
  {
    if (jdField_a_of_type_ArrayOfJavaLangString != null)
      jdField_a_of_type_Int -= 1;
    if (jdField_a_of_type_Int == 0)
    {
      jdField_a_of_type_ArrayOfJavaLangString = null;
      jdField_a_of_type_Int = 0;
    }
  }

  public final boolean setCountry(int paramInt)
  {
    if (paramInt < 0)
      return false;
    paramInt = countryInfo.readCountry_by_id(cfgContents(), GlomoCountry.readCountry_ID_by_NUM(paramInt));
    release_cfgContents();
    GlomoRMS.CurrentCountry((paramInt = paramInt) == null ? -1 : GlomoCountry.readCountry_NUM_by_ID(paramInt.id_int()));
    if (paramInt != null)
      countryInfo = paramInt;
    else
      countryInfo.id("-1");
    return GlomoRMS.CurrentCountry() != -1;
  }

  public final boolean readConfig()
  {
    return readConfig(GlomoRMS.CurrentCountry());
  }

  private static String a()
  {
    jdField_a_of_type_JavaLangString = GlomoUtil.split(";", cfgContents()[0])[0];
    release_cfgContents();
    return jdField_a_of_type_JavaLangString;
  }

  public final boolean readConfig(int paramInt)
  {
    String[] arrayOfString = cfgContents();
    a();
    distInfo.readConfig_from_CFG(arrayOfString);
    if (countryInfo.readCountriesList(arrayOfString) <= paramInt)
      paramInt = -1;
    release_cfgContents();
    return setCountry(paramInt);
  }

  public static final boolean is_JAD_config()
  {
    return (GlomoUtil.JAD(jdField_a_of_type_JavaxMicroeditionMidletMIDlet, "c_0_code").compareTo("") != 0) || (GlomoUtil.JAD(jdField_a_of_type_JavaxMicroeditionMidletMIDlet, "c_0_name").compareTo("") != 0);
  }
}