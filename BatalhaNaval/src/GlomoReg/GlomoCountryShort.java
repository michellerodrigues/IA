package GlomoReg;

public final class GlomoCountryShort
{
  private int jdField_a_of_type_Int = -1;
  private int jdField_b_of_type_Int = -1;
  private String jdField_a_of_type_JavaLangString = "";
  private String jdField_b_of_type_JavaLangString = "";

  public GlomoCountryShort(int paramInt, String paramString1, String paramString2)
  {
    this.jdField_a_of_type_Int = paramInt;
    this.jdField_b_of_type_Int = paramInt;
    this.jdField_a_of_type_JavaLangString = paramString1;
    this.jdField_b_of_type_JavaLangString = paramString2;
  }

  public final String name()
  {
    if (this.jdField_a_of_type_JavaLangString == "")
      return this.jdField_b_of_type_JavaLangString;
    return this.jdField_a_of_type_JavaLangString;
  }

  public final String code()
  {
    return this.jdField_b_of_type_JavaLangString;
  }

  public final String name(String paramString)
  {
    return this.jdField_a_of_type_JavaLangString = paramString;
  }

  public final String code(String paramString)
  {
    return this.jdField_b_of_type_JavaLangString = paramString;
  }

  public final int id()
  {
    return this.jdField_a_of_type_Int;
  }

  public final int sec_id()
  {
    return this.jdField_b_of_type_Int;
  }

  public final int sec_id(int paramInt)
  {
    return this.jdField_b_of_type_Int = paramInt;
  }
}