package GlomoReg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.microedition.midlet.MIDlet;

public class GlomoUtil
{
  private static Random jdField_a_of_type_JavaUtilRandom = new Random();
  private static String jdField_a_of_type_JavaLangString = "0123456789ABCDEF";
  private static String b = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public static final String[] split(String paramString1, String paramString2)
  {
    int i = 1;
    int k = 0;
    int j = 0;
    while ((j = paramString2.indexOf(paramString1, j) + 1) > 0)
      i++;
    String[] arrayOfString = new String[i];
    i = 0;
    j = 0;
    while ((j = paramString2.indexOf(paramString1, j) + 1) > 0)
    {
      arrayOfString[i] = paramString2.substring(k, j - 1);
      i++;
      k = j - 1 + paramString1.length();
    }
    arrayOfString[i] = paramString2.substring(k);
    return arrayOfString;
  }

  public static final String format(String paramString, String[] paramArrayOfString)
  {
    return format(paramString, paramArrayOfString, '%');
  }

  public static final String format(String paramString, String[] paramArrayOfString, char paramChar)
  {
    StringBuffer localStringBuffer = new StringBuffer("");
    int i = 0;
    for (int j = 0; j < paramString.length(); j++)
    {
      char c;
      if ((c = paramString.charAt(j)) == paramChar)
      {
        if ((j + 1 < paramString.length()) && (paramString.charAt(j + 1) == paramChar))
        {
          localStringBuffer.append(c);
          j++;
        }
        else
        {
          localStringBuffer.append(paramArrayOfString[(i++)]);
        }
      }
      else
        localStringBuffer.append(c);
    }
    return localStringBuffer.toString();
  }

  public static final String[] format(String[] paramArrayOfString, String[][] paramArrayOfString1)
  {
    String[] arrayOfString = new String[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
      arrayOfString[i] = format(paramArrayOfString[i], paramArrayOfString1[i]);
    return arrayOfString;
  }

  public static final int getCheckSum(String paramString)
  {
    return getCheckSum(paramString, 0, 0);
  }

  public static final int getCheckSum(String paramString, int paramInt)
  {
    return getCheckSum(paramString, paramInt, 0);
  }

  public static final int getCheckSum(String paramString, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (paramInt2 == 0)
      for (paramInt1 = paramInt1; paramInt1 < paramString.length(); paramInt1++)
        i = ((i << 1 | (i & 0x80) >> 7) & 0xFF ^ paramString.charAt(paramInt1) & 0xFF) & 0xFF;
    return i;
  }

  public static final String extractCheckSum(String paramString1, String paramString2)
  {
    if ((paramString1 = paramString2.indexOf(paramString1)) >= 0)
      return paramString2.substring(0, paramString1 - 1);
    return paramString2;
  }

  public static String[] readResourceAsArr(MIDlet paramMIDlet, String paramString)
  {
    return readResourceAsArr(paramMIDlet, paramString, true);
  }

  public static String[] readResourceAsArr(MIDlet paramMIDlet, String paramString, boolean paramBoolean)
  {
    return split("\n", readResource(paramMIDlet, paramString, paramBoolean));
  }

  public static String readResource(MIDlet paramMIDlet, String paramString)
  {
    return readResource(paramMIDlet, paramString, true);
  }

  public static String readResource(MIDlet paramMIDlet, String paramString, boolean paramBoolean)
  {
    try
    {
      paramString = new char[(paramMIDlet = paramMIDlet.getClass().getResourceAsStream(paramString)).available() / 2 - 1];
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      int i;
      while ((i = paramMIDlet.read()) != -1)
        localByteArrayOutputStream.write(i);
      paramMIDlet = new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
      DataInputStream localDataInputStream;
      (localDataInputStream = new DataInputStream(paramMIDlet)).readChar();
      for (int j = 0; j < paramString.length; j++)
        paramString[j] = localDataInputStream.readChar();
      localDataInputStream.close();
      paramMIDlet.close();
      localByteArrayOutputStream.close();
      decrypt(paramMIDlet = new String(paramString), 0);
      if (paramBoolean)
        return decrypt(paramMIDlet, 0);
      return paramMIDlet;
    }
    catch (Exception localException)
    {
      (paramMIDlet = localException).printStackTrace();
    }
    return null;
  }

  public static final int rnd(int paramInt1, int paramInt2)
  {
    int i;
    return (i = Math.abs(jdField_a_of_type_JavaUtilRandom.nextInt())) % (paramInt2 - paramInt1) + paramInt1;
  }

  public static final long generateRandomKey(int paramInt)
  {
    if (paramInt == 0)
    {
      Integer.parseInt(GlomoConfig.distInfo.smsKeyVersion());
      paramInt = 1;
      int i = 9;
      for (int j = 0; j < 5; j++)
      {
        paramInt *= 10;
        i = i * 10 + 9;
      }
      return rnd(paramInt, i);
    }
    return 0L;
  }

  public static final String generateKeyOfType(int paramInt, String paramString, long paramLong)
  {
    int i = 0;
    if (GlomoConfig.versionInt() > 1)
    {
      int j = Integer.parseInt(GlomoConfig.distInfo.smsKeyVersion());
      String str3 = (str2 = GlomoConfig.distInfo.channelId()).substring(0, 2);
      String str2 = str2.substring(2, 5);
      paramInt = encryptLight(toBase36((paramLong != 0L ? paramLong : generateRandomKey(0)) * 10000L + Long.parseLong(str2) * 10L + paramInt % 10, 7), 2);
      try
      {
        i = Long.parseLong(paramInt) == 0L ? 1 : 0;
      }
      catch (Exception localException1)
      {
      }
      if (i != 0)
        return "";
      return paramString + str3 + paramInt + GlomoConfig.sms_key_version().substring(0, 1);
    }
    String str1 = encryptLight(toBase36((paramLong != 0L ? paramLong : generateRandomKey(0)) * 10000L + Long.parseLong(GlomoConfig.distInfo.id()) * 10L + paramInt % 10, 7), 2);
    try
    {
      i = Long.parseLong(str1) == 0L ? 1 : 0;
    }
    catch (Exception localException2)
    {
    }
    if (i != 0)
      return "";
    return paramString + str1 + GlomoConfig.sms_key_version().substring(0, 1);
  }

  public static byte[] encryptLightByte(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    if (paramInt == 0)
    {
      for (paramInt = 0; paramInt < paramArrayOfByte.length; paramInt++)
        arrayOfByte[((paramInt + 5) % paramArrayOfByte.length)] = (byte)(0x25 ^ paramArrayOfByte[paramInt]);
      for (paramInt = 0; paramInt < paramArrayOfByte.length; paramInt++)
        arrayOfByte[paramInt] = (byte)(arrayOfByte[paramInt] ^ arrayOfByte[((paramInt + 2) % paramArrayOfByte.length)]);
    }
    return arrayOfByte;
  }

  public static byte[] decryptLightByte(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    if (paramInt == 0)
    {
      for (paramInt = paramArrayOfByte.length - 1; paramInt >= 0; paramInt--)
        paramArrayOfByte[paramInt] = (byte)(paramArrayOfByte[paramInt] ^ paramArrayOfByte[((paramInt + 2) % paramArrayOfByte.length)]);
      for (paramInt = 0; paramInt < paramArrayOfByte.length; paramInt++)
        arrayOfByte[paramInt] = (byte)(0x25 ^ paramArrayOfByte[((paramInt + 5) % paramArrayOfByte.length)]);
    }
    return arrayOfByte;
  }

  public static byte[] packDigits(String paramString)
  {
    if (paramString.length() % 2 == 1)
      paramString = paramString + "0";
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    for (int i = 0; i < arrayOfByte.length; i++)
      arrayOfByte[i] = (byte)(Byte.parseByte(paramString.substring(i << 1, (i << 1) + 1)) + (byte)(Byte.parseByte(paramString.substring((i << 1) + 1, (i << 1) + 2)) << 4));
    return arrayOfByte;
  }

  public static String unpackDigits(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer("");
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      localStringBuffer.append(String.valueOf(jdField_a_of_type_JavaLangString.charAt(paramArrayOfByte[i] & 0xF)));
      localStringBuffer.append(String.valueOf(jdField_a_of_type_JavaLangString.charAt(paramArrayOfByte[i] >> 4 & 0xF)));
    }
    return localStringBuffer.toString();
  }

  public static String encryptLight(String paramString, int paramInt)
  {
    if (paramString.length() == 0)
      return paramString;
    if (paramInt == 0)
      return new String(encryptLightByte(paramString.getBytes(), paramInt));
    if (paramInt == 1)
      return unpackDigits(encryptLightByte(packDigits(paramString), 0));
    if ((paramInt == 2) && (paramString.length() > 2))
    {
      paramInt = new StringBuffer(paramString.substring(0, 2));
      for (int i = 0; i < paramString.length() - 2; i++)
        paramInt.append(paramString.charAt(2 + (i + b.indexOf(paramString.charAt(1))) % (paramString.length() - 2)));
      return paramInt.toString();
    }
    return paramString;
  }

  public static String decryptLight(String paramString, int paramInt)
  {
    if (paramInt == 0)
      return new String(decryptLightByte(paramString.getBytes(), paramInt));
    if (paramInt == 1)
      return unpackDigits(decryptLightByte(packDigits(paramString), 0));
    if ((paramInt == 2) && (paramString.length() > 2))
    {
      paramInt = new StringBuffer(paramString.substring(0, 2));
      int i = paramString.length() - 2;
      for (int j = 0; j < i; j++)
        paramInt.append(paramString.charAt(2 + (j + i - b.indexOf(paramString.charAt(1)) % i) % i));
      return paramInt.toString();
    }
    return paramString;
  }

  public static String toBase36(long paramLong, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer("");
    while (paramLong > 0L)
    {
      localStringBuffer.append(b.charAt((int)(paramLong % 36L)));
      paramLong /= 36L;
    }
    while (localStringBuffer.length() < paramInt)
      localStringBuffer.append("0");
    return localStringBuffer.toString();
  }

  public static long fromBase36(String paramString)
  {
    long l1 = 0L;
    long l2 = 1L;
    int i = 0;
    while (i < paramString.length())
    {
      l1 += l2 * b.indexOf(paramString.charAt(i));
      i++;
      l2 *= 36L;
    }
    return l1;
  }

  public static String decrypt(String paramString, int paramInt)
  {
    paramInt = new char[(paramString = paramString.toCharArray()).length];
    int j = paramString.length + 1;
    for (int m = 1; m < j; m++)
      paramInt[(m - 1)] = paramString[(m - 1)];
    for (int k = 1; k < j; k = k << 1 | 0x1);
    k >>= 1;
    int i5 = j - k;
    while (i5 > 0)
    {
      int i4 = 0;
      for (int i3 = 4; i3 <= k + 1 << 1; i3 += 2)
      {
        int i6;
        int i2 = i6 = m = 0;
        int n = 1;
        int i1 = k + 1 >> 1;
        while (m <= i4)
        {
          int tmp195_194 = (i5 + (i3 >> 1) - 3);
          int tmp195_185 = paramInt;
          int i;
          i6 = (m < i4) || ((i3 >> 1) - 2 + (i4 << 1) - i6 - (k >> 1) > 0) ? i2 += (((i3 >> 1) - 2 & n) == 0 ? 1 : -1) * (i1 >> 1) + 2 : (tmp195_185[tmp195_194] = (char)(tmp195_185[tmp195_194] + (paramInt[(i5 - 1 - (i4 << 1) + i6 + (k >> 1))] - (paramInt[(i5 - 1 - (i4 << 1) + i6 + (k >> 1))] = paramInt[(i5 + (i3 >> 1) - 3)])))) + (paramInt[(i5 + (i3 >> 1) - 3)] = (char)(((i = paramInt[(i5 + (i3 >> 1) - 3)] + '') % 10 + 10 + (i5 - 3) % 10) % 10 + i / 10 * 10 - 142)) + (paramInt[(i5 - 1 - (i4 << 1) + i6 + (k >> 1))] = (char)(((i = paramInt[(i5 - 1 - (i4 << 1) + i6 + (k >> 1))] + '') % 10 + 10 + (i5 - 3) % 10) % 10 + i / 10 * 10 - 142));
          m++;
          n <<= 1;
          i1 >>= 1;
        }
        i4 += (i3 >> 1 == 2 << i4 ? 1 : 0);
      }
      i5 -= paramString.length - k + (paramString.length - k > 0 ? 0 : 1);
    }
    for (m = 1; m < j; m++)
      paramString[(m - 1)] = paramInt[(m - 1)];
    return new String(paramString);
  }

  public static String dateToString(Date paramDate)
  {
    Calendar localCalendar;
    (localCalendar = Calendar.getInstance()).setTime(paramDate);
    paramDate = localCalendar.get(1);
    int j = localCalendar.get(2) + 1;
    int k = localCalendar.get(5);
    int m = localCalendar.get(11);
    int n = localCalendar.get(12);
    int i1 = localCalendar.get(13);
    int i = localCalendar.get(14);
    return paramDate + "-" + (j <= 10 ? "0" : "") + j + "-" + (k <= 10 ? "0" : "") + k + " " + (m <= 10 ? "0" : "") + m + ":" + (n <= 10 ? "0" : "") + n + ":" + (i1 <= 10 ? "0" : "") + i1 + "." + i;
  }

  public static final String JAD(MIDlet paramMIDlet, String paramString)
  {
    try
    {
      if ((paramMIDlet = paramMIDlet.getAppProperty(paramString) == null ? "" : paramMIDlet.getAppProperty(paramString)).charAt(paramMIDlet.length() - 1) == ';')
        paramMIDlet = paramMIDlet.substring(0, paramMIDlet.length() - 1);
      return paramMIDlet;
    }
    catch (Exception localException)
    {
    }
    return "";
  }
}