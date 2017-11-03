import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class e
{
  static byte[] a;
  static int[] b;
  static int c;
  static int d;
  static int e;
  static int f;
  static boolean g;
  static int[] h;
  static boolean i;
  static boolean j;
  private static String p;
  static boolean k;
  static int l;
  public static e m;
  static boolean n;
  static int o = 100;

  static
  {
    c = i.bs;
    p = i.cd;
    e = 1;
    k = false;
    n = true;
    g = true;
    d = 1;
    f = 0;
    a = new byte[c];
    j = false;
    i = true;
    b = new int[] { 1668246830, 1852795753, 1630432617, 1680766313, 776369516, 1816355182, 1986097920 };
    h = new int[] { 779120231 };
    l = 0;
  }

  private static final void e()
  {
    e = 1;
    n = true;
    d = 1;
    i.W = i.X;
    i.cW = 1;
    f = 0;
    i.dm = false;
  }

  static final Image a(String paramString)
  {
    byte[] arrayOfByte = m.a(paramString, -1);
    try
    {
      return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
    }
    catch (Exception localException1)
    {
      try
      {
        return Image.createImage(a(arrayOfByte, o), 0, arrayOfByte.length);
      }
      catch (Exception localException2)
      {
        a(arrayOfByte, o);
      }
    }
    return Image.createImage(b(arrayOfByte, arrayOfByte[2] - 3), 3, arrayOfByte.length - 3);
  }

  private static int[] a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    int i1 = paramInt3;
    int i2 = paramInt4;
    Image localImage1 = paramImage;
    if (!paramImage.isMutable())
    {
      (localObject1 = (localImage1 = Image.createImage(i1, i2)).getGraphics()).setColor(0);
      ((Graphics)localObject1).fillRect(0, 0, i1, i2);
      ((Graphics)localObject1).drawImage(paramImage, -paramInt1, -paramInt2, 20);
    }
    Object localObject1 = new int[i1 * i2];
    localImage1.getRGB(localObject1, 0, i1, 0, 0, i1, i2);
    int i6;
    if ((paramBoolean) && (!paramImage.isMutable()))
    {
      Image localImage2;
      Graphics localGraphics;
      (localGraphics = (localImage2 = Image.createImage(i1, i2)).getGraphics()).setColor(16777215);
      localGraphics.fillRect(0, 0, i1, i2);
      localGraphics.drawImage(paramImage, -paramInt1, -paramInt2, 20);
      int[] arrayOfInt = new int[i1 * i2];
      localImage2.getRGB(arrayOfInt, 0, i1, 0, 0, i1, i2);
      for (i6 = 0; i6 < localObject1.length; i6++)
        if (((localObject1[i6] & 0xFF) <= 32) && ((arrayOfInt[i6] & 0xFF) >= 223))
          localObject1[i6] = 0;
        else
          localObject1[i6] |= -16777216;
    }
    Object localObject2 = localObject1;
    int i4;
    int i5;
    int i3;
    int i7;
    if (paramInt5 == 1)
    {
      i6 = paramInt4 - 1;
      for (i4 = 0; i4 < paramInt4; i4++)
      {
        i5 = paramInt3 - 1;
        for (i3 = 0; i3 < paramInt3; i3++)
        {
          if (i6 * paramInt3 + i5 <= i4 * paramInt3 + i3)
            break;
          i7 = localObject2[(i6 * paramInt3 + i5)];
          localObject2[(i6 * paramInt3 + i5)] = localObject2[(i4 * paramInt3 + i3)];
          localObject2[(i4 * paramInt3 + i3)] = i7;
          i5--;
        }
        i6--;
      }
      return localObject2;
    }
    if (paramInt5 == 2)
    {
      i6 = 0;
      for (i4 = 0; i4 < paramInt4; i4++)
      {
        i5 = paramInt3 - 1;
        for (i3 = 0; i3 < paramInt3; i3++)
        {
          if (i5 <= i3)
            break;
          i7 = localObject2[(i6 * paramInt3 + i5)];
          localObject2[(i6 * paramInt3 + i5)] = localObject2[(i4 * paramInt3 + i3)];
          localObject2[(i4 * paramInt3 + i3)] = i7;
          i5--;
        }
        i6++;
      }
      return localObject2;
    }
    return (I)localObject2;
  }

  static final byte[] a(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i1 = 0;
    try
    {
      RecordStore localRecordStore;
      if ((localRecordStore = RecordStore.openRecordStore(paramString, true)).getNumRecords() == 1)
      {
        localRecordStore.getRecord(1, paramArrayOfByte, 0);
        i1 = 1;
      }
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException)
    {
    }
    if ((i1 == 0) && (paramBoolean))
      a(paramString, paramArrayOfByte);
    return paramArrayOfByte;
  }

  private static byte[] b(String paramString, byte[] paramArrayOfByte)
  {
    int i1 = 0;
    try
    {
      RecordStore localRecordStore;
      if ((localRecordStore = RecordStore.openRecordStore(paramString, true)).getNumRecords() == 1)
      {
        localRecordStore.getRecord(1, paramArrayOfByte, 0);
        i1 = 1;
      }
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException)
    {
    }
    if (i1 == 0)
    {
      e();
      paramArrayOfByte = c(paramArrayOfByte);
      a(paramString, paramArrayOfByte);
    }
    return paramArrayOfByte;
  }

  static final void a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      RecordStore localRecordStore;
      if ((localRecordStore = RecordStore.openRecordStore(paramString, true)).getNumRecords() == 1)
      {
        localRecordStore.closeRecordStore();
        if (RecordStore.listRecordStores() != null)
          RecordStore.deleteRecordStore(paramString);
        localRecordStore = RecordStore.openRecordStore(paramString, true);
      }
      localRecordStore.addRecord(paramArrayOfByte, 0, paramArrayOfByte.length);
      localRecordStore.closeRecordStore();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static final byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = paramArrayOfByte.length;
    int i3 = (byte)paramInt;
    for (int i2 = 0; i2 < i1; i2++)
    {
      paramArrayOfByte[i2] = (byte)(paramArrayOfByte[i2] ^ i3);
      i3 = (byte)(i3 + 1);
    }
    return paramArrayOfByte;
  }

  public static final byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = paramArrayOfByte.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      paramArrayOfByte[i2] = (byte)(paramArrayOfByte[i2] ^ paramInt);
      paramInt++;
      if (paramInt <= 255)
        continue;
      paramInt = 0;
    }
    return paramArrayOfByte;
  }

  private static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 / paramInt2;
  }

  private static String e(String paramString)
  {
    try
    {
      if (paramString.length() > 0)
      {
        if (paramString.charAt(0) != '/')
          paramString = new String('/' + paramString);
      }
      else
        paramString = new String('/' + paramString);
      int i1 = 1;
      for (int i2 = 0; i2 < paramString.length(); i2++)
      {
        if (paramString.charAt(i2) != '.')
          continue;
        i1 = 0;
      }
      if (i1 != 0)
        paramString = paramString + a(h);
    }
    catch (Exception localException)
    {
    }
    return paramString;
  }

  static final void a()
  {
    if (i)
      a = b(p, a);
    i = false;
    a = a(a);
  }

  static final void b()
  {
    a = c(a);
    if (j)
      a(p, a);
    j = false;
  }

  protected final int b(String paramString)
  {
    paramString = e(paramString);
    int i1 = 0;
    int i2 = -1;
    try
    {
      InputStream localInputStream;
      if ((localInputStream = getClass().getResourceAsStream(paramString)) == null)
        return -1;
      do
      {
        i1 = localInputStream.read();
        i2++;
      }
      while (i1 != -1);
      localInputStream.close();
    }
    catch (Exception localException)
    {
      i2 = -1;
    }
    return i2;
  }

  private static String a(int[] paramArrayOfInt)
  {
    String str = new String();
    i1 = 0;
    break label174;
  }

  private String[][] b(String paramString, int paramInt)
  {
    String[] arrayOfString1 = null;
    Object localObject = new String[(arrayOfString1 = a(localObject = d(paramString), null, 0, false, false)).length][];
    for (int i1 = 0; i1 < localObject.length; i1++)
    {
      if (arrayOfString1[i1] == null)
        continue;
      String str;
      int i2;
      if ((i2 = (str = arrayOfString1[i1]).length()) > 256)
        i2 = 256;
      String[] arrayOfString2 = new String[i2];
      int i3 = 0;
      int i4 = 0;
      for (int i5 = 0; i5 <= str.length(); i5++)
      {
        int i6 = paramInt;
        if (i5 < str.length())
          i6 = str.charAt(i5);
        if ((i6 != paramInt) || (i3 >= i2))
          continue;
        arrayOfString2[i3] = str.substring(i4, i5);
        i4 = i5 + 1;
        i3++;
      }
      localObject[i1] = new String[i3];
      System.arraycopy(arrayOfString2, 0, localObject[i1], 0, i3);
    }
    return (String)localObject;
  }

  public final String[][] c(String paramString)
  {
    return b(paramString, 61);
  }

  protected final byte[] a(String paramString, int paramInt)
  {
    if (paramInt < 0)
      paramInt = b(paramString);
    paramString = e(paramString);
    if (paramInt <= 0)
      return null;
    byte[] arrayOfByte;
    try
    {
      Class.forName(a(b));
      return c(paramString, paramInt);
    }
    catch (Exception localException1)
    {
      arrayOfByte = new byte[paramInt];
      try
      {
        InputStream localInputStream;
        (localInputStream = getClass().getResourceAsStream(paramString)).read(arrayOfByte);
        localInputStream.close();
      }
      catch (Exception localException2)
      {
      }
    }
    return arrayOfByte;
  }

  private final byte[] c(String paramString, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    try
    {
      InputStream localInputStream;
      if ((localInputStream = getClass().getResourceAsStream(paramString)) == null)
        return arrayOfByte;
      DataInputStream localDataInputStream = new DataInputStream(localInputStream);
      int i1 = 0;
      int i2 = 0;
      while (true)
      {
        i1 = localDataInputStream.read(arrayOfByte, i2, arrayOfByte.length - i2);
        i2 += i1;
        if ((i1 == -1) || (i2 >= arrayOfByte.length))
          break;
      }
      localDataInputStream.close();
    }
    catch (Exception localException)
    {
    }
    return arrayOfByte;
  }

  private String a(String paramString, char paramChar)
  {
    int i1 = b(paramString);
    String str = new String();
    byte[] arrayOfByte;
    if (((arrayOfByte = a(paramString, i1)) == null) || (arrayOfByte.length <= 0))
      return null;
    if ((arrayOfByte.length > 1) && (arrayOfByte[0] == 59) && (arrayOfByte[1] == 67))
      arrayOfByte = a(arrayOfByte, o);
    else if ((arrayOfByte.length > 1) && (arrayOfByte[0] == -101) && (arrayOfByte[1] == -101))
      arrayOfByte = a(arrayOfByte, o);
    int i2 = 0;
    if ((arrayOfByte.length >= 1) && (arrayOfByte[0] == 95))
      i2 = 2;
    if ((arrayOfByte.length >= 2) && (arrayOfByte[0] == -1) && (arrayOfByte[1] == -2))
      return b(arrayOfByte);
    int i3 = i2;
    char c1 = '\000';
    int i4;
    int i5 = (i4 = arrayOfByte.length - i2) + i2;
    for (int i6 = i2; i6 < i5; i6++)
    {
      if (arrayOfByte[i6] != 0)
        continue;
      i4 = i6 - i2;
      i1 = i6;
      break;
    }
    char[] arrayOfChar = new char[i4];
    for (int i7 = 0; i7 < i4; i7++)
    {
      if ((c1 = arrayOfByte[(i7 + i2)]) < 0)
        c1 += 'Ā';
      arrayOfChar[i7] = (char)c1;
    }
    while (i3 < i1)
    {
      if ((c1 = arrayOfByte[i3]) < 0)
        c1 = 'Ā' + c1;
      if (c1 == 0)
        break;
      if (c1 == paramChar)
        arrayOfChar[(i3 - i2)] = ' ';
      if (c1 < '\n')
        arrayOfChar[(i3 - i2)] = ' ';
      if ((c1 >= 'À') && (c1 <= 'ÿ'))
      {
        c1 += '͐';
        arrayOfChar[(i3 - i2)] = (char)c1;
      }
      i3++;
    }
    try
    {
      str = new String(arrayOfChar);
    }
    catch (Exception localException)
    {
    }
    return str;
  }

  public final String d(String paramString)
  {
    return a(paramString, ' ');
  }

  static final Image a(Image paramImage)
  {
    if (paramImage == null)
      return null;
    try
    {
      Image localImage;
      Graphics localGraphics;
      (localGraphics = (localImage = Image.createImage(paramImage.getWidth(), paramImage.getHeight())).getGraphics()).setClip(0, 0, paramImage.getWidth(), paramImage.getHeight());
      localGraphics.setColor(0);
      localGraphics.fillRect(0, 0, paramImage.getWidth(), paramImage.getHeight());
      localGraphics.drawImage(paramImage, 0, 0, 20);
      paramImage = null;
      return localImage;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
    }
    return paramImage;
  }

  private static final byte[] a(byte[] paramArrayOfByte)
  {
    if (!i.ca)
    {
      e = paramArrayOfByte[0];
      d = paramArrayOfByte[4];
      f = paramArrayOfByte[9];
      i.cW = paramArrayOfByte[11];
    }
    n = paramArrayOfByte[2] > 0;
    i.W = paramArrayOfByte[5];
    if (i.W < 0)
      i.W = 0;
    if (i.W > i.X)
      i.W = i.X;
    if (!i.ca)
      g = paramArrayOfByte[6] > 0;
    i.dm = paramArrayOfByte[10] > 0;
    m.v = paramArrayOfByte[13];
    i.cz = paramArrayOfByte[14] > 0;
    return paramArrayOfByte;
  }

  static final Image a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2, int paramInt8)
  {
    boolean bool = false;
    if (paramImage.isMutable())
      paramBoolean1 = false;
    if (paramBoolean1)
      try
      {
        bool = f();
      }
      catch (Exception localException)
      {
      }
    int[] arrayOfInt = a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt7, paramBoolean1);
    if ((paramInt5 != paramInt3) || (paramInt6 != paramInt4))
      arrayOfInt = a(arrayOfInt, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean2, paramBoolean1, true);
    if ((paramBoolean1) && (!bool) && (paramBoolean2))
      for (int i1 = 0; i1 < arrayOfInt.length; i1++)
      {
        int i2;
        if (((i2 = arrayOfInt[i1] >> 24 & 0xFF) <= 0) || (i2 >= 255))
          continue;
        if (paramInt8 < 0)
        {
          if (i2 <= 64)
            arrayOfInt[i1] = 0;
          else
            arrayOfInt[i1] = (0xFF000000 | arrayOfInt[i1]);
        }
        else
        {
          int i3 = 256 - i2;
          int i4 = i2;
          long l1 = (paramInt8 >> 16 & 0xFF) * i3;
          long l2 = (paramInt8 >> 8 & 0xFF) * i3;
          long l3 = (paramInt8 & 0xFF) * i3;
          int i5;
          long l4 = ((i5 = arrayOfInt[i1]) >> 16 & 0xFF) * i4;
          long l5 = (i5 >> 8 & 0xFF) * i4;
          long l6 = (i5 & 0xFF) * i4;
          int i6 = (int)(l1 + l4 >> 8);
          int i7 = (int)(l2 + l5 >> 8);
          int i8 = (int)(l3 + l6 >> 8);
          if (i2 < 8)
            arrayOfInt[i1] = 0;
          else
            arrayOfInt[i1] = (0xFF000000 | i6 << 16 | i7 << 8 | i8);
        }
      }
    return Image.createRGBImage(arrayOfInt, paramInt5, paramInt6, paramBoolean1);
  }

  static final Image a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean1, paramBoolean2, -1);
  }

  private static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramInt3 == paramInt1) && (paramInt4 == paramInt2))
      return paramArrayOfInt;
    if (paramArrayOfInt == null)
      return paramArrayOfInt;
    int i1 = paramInt3;
    int i2 = paramInt2;
    int[] arrayOfInt1 = null;
    int i5;
    int i8;
    int i9;
    int i10;
    int i13;
    int i14;
    int i15;
    int i16;
    int i17;
    int i18;
    if ((i1 == paramInt1) && (i2 == paramInt2))
    {
      arrayOfInt1 = paramArrayOfInt;
    }
    else
    {
      arrayOfInt1 = new int[i1 * i2];
      for (int i3 = 0; i3 < i2; i3++)
      {
        i4 = -1;
        i5 = i1 - 1;
        int i7 = 0;
        for (i8 = 0; i8 < i1; i8++)
        {
          if ((i9 = a((i8 + 1) * paramInt1, i1) - 1) < 0)
            i9 = 0;
          if (i8 == i5)
            i9 = paramInt1 - 1;
          if (i9 >= paramInt1)
            i9 = paramInt1 - 1;
          i10 = i9 - i4;
          if (paramBoolean1)
          {
            long l1 = 0L;
            long l3 = 0L;
            long l5 = 0L;
            long l7 = 0L;
            int i12;
            if ((i10 <= 1) || ((i10 == 2) && (i7 > 0)))
            {
              i7 = i13 = (i12 = a(256 * (i8 + 1) * paramInt1, i1)) & 0xFF;
              i14 = i9;
              i15 = paramInt1 * i3 + i14;
              i16 = paramArrayOfInt[i15];
              if (i14 < paramInt1 - 1)
                i14++;
              i15 = paramInt1 * i3 + i14;
              i17 = paramArrayOfInt[i15];
              arrayOfInt1[(i3 * i1 + i8)] = a(i16, i17, i13, paramBoolean2, paramBoolean3);
            }
            else
            {
              for (i12 = i4 + 1; i12 <= i9; i12++)
              {
                i13 = paramInt1 * i3 + i12;
                i14 = paramArrayOfInt[i13];
                if ((i12 == i4 + 1) && (i7 > 0))
                {
                  i16 = paramArrayOfInt[i13];
                  if (i12 < paramInt1 - 1)
                    i12++;
                  i13 = paramInt1 * i3 + i12;
                  i17 = paramArrayOfInt[i13];
                  i14 = a(i16, i17, 256, paramBoolean2, paramBoolean3);
                  i18 = 1;
                  if (paramBoolean2)
                  {
                    i18 = i14 >> 24 & 0xFF;
                    l7 += i18;
                  }
                  l1 += (i14 >> 16 & 0xFF) * i18;
                  l3 += (i14 >> 8 & 0xFF) * i18;
                  l5 += (i14 & 0xFF) * i18;
                }
                if (i12 == i9)
                {
                  i7 = i16 = (i15 = a(256 * (i8 + 1) * paramInt1, i1)) & 0xFF;
                  i17 = paramArrayOfInt[i13];
                  if (i12 < paramInt1 - 1)
                    i12++;
                  i13 = paramInt1 * i3 + i12;
                  i18 = paramArrayOfInt[i13];
                  i14 = a(i17, i18, i16, paramBoolean2, paramBoolean3);
                }
                i15 = 1;
                if (paramBoolean2)
                {
                  i15 = i14 >> 24 & 0xFF;
                  l7 += i15;
                }
                l1 += (i14 >> 16 & 0xFF) * i15;
                l3 += (i14 >> 8 & 0xFF) * i15;
                l5 += (i14 & 0xFF) * i15;
              }
              if ((i10 == 2) && (!paramBoolean2))
              {
                if (paramBoolean2)
                  l7 >>= 1;
                l1 >>= 1;
                l3 >>= 1;
                l5 >>= 1;
              }
              else if (i10 <= 0)
              {
                l7 = 0L;
              }
              else if (paramBoolean2)
              {
                if (l7 > 0L)
                {
                  l1 /= l7;
                  l3 /= l7;
                  l5 /= l7;
                }
                l7 /= i10;
              }
              else
              {
                l1 /= i10;
                l3 /= i10;
                l5 /= i10;
              }
              if (paramBoolean3)
                arrayOfInt1[(i3 * i1 + i8)] = (int)(l7 << 24 | l1 << 16 | l3 << 8 | l5);
              else if ((l7 < 128L) && (paramBoolean2))
                arrayOfInt1[(i3 * i1 + i8)] = 0;
              else
                arrayOfInt1[(i3 * i1 + i8)] = (int)(0xFF000000 | l1 << 16 | l3 << 8 | l5);
            }
          }
          else
          {
            arrayOfInt1[(i3 * i1 + i8)] = paramArrayOfInt[(i3 * paramInt1 + i9)];
          }
          i4 = i9;
        }
      }
    }
    if ((paramInt3 == i1) && (paramInt4 == i2))
      return arrayOfInt1;
    int[] arrayOfInt2 = new int[paramInt3 * paramInt4];
    for (int i4 = 0; i4 < paramInt3; i4++)
    {
      i5 = -1;
      int i6 = paramInt4 - 1;
      i8 = 0;
      for (i9 = 0; i9 < paramInt4; i9++)
      {
        if ((i10 = a((i9 + 1) * i2, paramInt4) - 1) < 0)
          i10 = 0;
        if (i9 == i6)
          i10 = i2 - 1;
        if (i10 >= i2)
          i10 = i2 - 1;
        int i11 = i10 - i5;
        if (paramBoolean1)
        {
          long l2 = 0L;
          long l4 = 0L;
          long l6 = 0L;
          long l8 = 0L;
          if ((i11 <= 1) || ((i11 == 2) && (i8 > 0)))
          {
            i8 = i14 = (i13 = a(256 * (i9 + 1) * i2, paramInt4)) & 0xFF;
            i15 = i10;
            i16 = i1 * i15 + i4;
            i17 = arrayOfInt1[i16];
            if (i15 < i2 - 1)
              i15++;
            i16 = i1 * i15 + i4;
            i18 = arrayOfInt1[i16];
            arrayOfInt2[(i9 * paramInt3 + i4)] = a(i17, i18, i14, paramBoolean2, paramBoolean3);
          }
          else
          {
            for (i13 = i5 + 1; i13 <= i10; i13++)
            {
              i14 = i1 * i13 + i4;
              i15 = arrayOfInt1[i14];
              int i19;
              if ((i13 == i5 + 1) && (i8 > 0))
              {
                i17 = arrayOfInt1[i14];
                if (i13 < i2 - 1)
                  i13++;
                i14 = i1 * i13 + i4;
                i18 = arrayOfInt1[i14];
                i15 = a(i17, i18, 256, paramBoolean2, paramBoolean3);
                i19 = 1;
                if (paramBoolean2)
                {
                  i19 = i15 >> 24 & 0xFF;
                  l8 += i19;
                }
                l2 += (i15 >> 16 & 0xFF) * i19;
                l4 += (i15 >> 8 & 0xFF) * i19;
                l6 += (i15 & 0xFF) * i19;
              }
              if (i13 == i10)
              {
                i8 = i17 = (i16 = a(256 * (i9 + 1) * i2, paramInt4)) & 0xFF;
                i18 = arrayOfInt1[i14];
                if (i13 < i2 - 1)
                  i13++;
                i14 = i1 * i13 + i4;
                i19 = arrayOfInt1[i14];
                i15 = a(i18, i19, i17, paramBoolean2, paramBoolean3);
              }
              i16 = 1;
              if (paramBoolean2)
              {
                i16 = i15 >> 24 & 0xFF;
                l8 += i16;
              }
              l2 += (i15 >> 16 & 0xFF) * i16;
              l4 += (i15 >> 8 & 0xFF) * i16;
              l6 += (i15 & 0xFF) * i16;
            }
            if ((i11 == 2) && (!paramBoolean2))
            {
              if (paramBoolean2)
                l8 >>= 1;
              l2 >>= 1;
              l4 >>= 1;
              l6 >>= 1;
            }
            else if (i11 <= 0)
            {
              l8 = 0L;
            }
            else if (paramBoolean2)
            {
              if (l8 > 0L)
              {
                l2 /= l8;
                l4 /= l8;
                l6 /= l8;
              }
              l8 /= i11;
            }
            else
            {
              l2 /= i11;
              l4 /= i11;
              l6 /= i11;
            }
            if (paramBoolean3)
              arrayOfInt2[(i9 * paramInt3 + i4)] = (int)(l8 << 24 | l2 << 16 | l4 << 8 | l6);
            else if ((l8 < 128L) && (paramBoolean2))
              arrayOfInt2[(i9 * paramInt3 + i4)] = 0;
            else
              arrayOfInt2[(i9 * paramInt3 + i4)] = (int)(0xFF000000 | l2 << 16 | l4 << 8 | l6);
          }
        }
        else
        {
          arrayOfInt2[(i9 * paramInt3 + i4)] = arrayOfInt1[(i10 * i1 + i4)];
        }
        i5 = i10;
      }
    }
    return arrayOfInt2;
  }

  private static String[] a(String paramString, d paramd, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1;
    String[] arrayOfString1 = new String[i1 = paramString.length()];
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 1;
    int i10 = 0;
    char c2 = '\000';
    for (int i11 = 0; i11 < i1 + 1; i11++)
    {
      char c1;
      if (i11 >= i1)
        c1 = '\n';
      else
        c1 = paramString.charAt(i11);
      i5 = c1;
      if (paramBoolean1)
        i2 = paramd.a(c1);
      else
        i2 = 5;
      if ((c1 != '\n') && (c1 != '\r'))
      {
        i4 += i2;
        i3 += i2;
      }
      switch (i5)
      {
      case 32:
        i9 = i11 + 1;
        i3 = 0;
        break;
      case 10:
      case 13:
        i9 = i11;
        i4 = paramInt + 1;
        i3 = 0;
        if (i11 < i1)
        {
          i11++;
          if (i11 < i1)
          {
            c2 = c1;
            if ((((c1 = paramString.charAt(i11)) == '\n') || (c1 == '\r')) && (c1 != c2))
              i11++;
          }
          i10 = i11;
          i11--;
        }
        else
        {
          i10 = i1;
        }
        c1 = '\n';
      }
      if (((i4 <= paramInt) || (!paramBoolean1)) && (c1 != '\n'))
      {
        i6++;
      }
      else
      {
        if ((i9 == i8) && (i6 > 0))
        {
          i9 = i8 + i6;
          i3 = 0;
          if ((i11 < i1) && (i11 + 1 > i9))
            i3 = paramd.a(paramString.substring(i9, i11 + 1));
        }
        if (i9 > i8)
          arrayOfString1[i7] = paramString.substring(i8, i9);
        else
          arrayOfString1[i7] = "";
        if ((i8 = i9) < i10)
          i8 = i10;
        i9 = i8;
        i4 = i3;
        i6 = i11 - i9 + 1;
        if ((paramBoolean2) && (arrayOfString1[i7] != null) && (arrayOfString1[i7].length() > 0))
          while ((arrayOfString1[i7].length() > 0) && (arrayOfString1[i7].charAt(arrayOfString1[i7].length() - 1) == ' '))
            arrayOfString1[i7] = arrayOfString1[i7].substring(0, arrayOfString1[i7].length() - 1);
        i7++;
      }
    }
    int i12 = i7;
    String[] arrayOfString2 = null;
    arrayOfString2 = new String[i12];
    System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, i12);
    return arrayOfString2;
  }

  final String[] a(String paramString, d paramd, int paramInt, boolean paramBoolean)
  {
    return a(paramString, paramd, paramInt, paramBoolean, true);
  }

  private static boolean f()
  {
    if (l == 0)
    {
      int[] arrayOfInt1 = new int[4];
      for (int i1 = 0; i1 < arrayOfInt1.length; i1++)
        arrayOfInt1[i1] = -2130706433;
      Image localImage1 = Image.createRGBImage(arrayOfInt1, 2, 2, true);
      Image localImage2;
      Graphics localGraphics;
      (localGraphics = (localImage2 = Image.createImage(2, 2)).getGraphics()).setClip(0, 0, 2, 2);
      localGraphics.setColor(0);
      localGraphics.fillRect(0, 0, 2, 2);
      localGraphics.drawImage(localImage1, 0, 0, 20);
      int[] arrayOfInt2 = new int[4];
      localImage2.getRGB(arrayOfInt2, 0, 2, 0, 0, 2, 2);
      try
      {
        if (((arrayOfInt2[0] & 0xFF) > 16) && ((arrayOfInt2[0] & 0xFF) < 224) && (Display.getDisplay(NET_Lizard.a).numAlphaLevels() > 2))
          l = 1;
        else
          l = -1;
      }
      catch (Exception localException)
      {
        l = -1;
      }
    }
    return l > 0;
  }

  private static String b(byte[] paramArrayOfByte)
  {
    int i1 = 0;
    if ((paramArrayOfByte.length >= 2) && (paramArrayOfByte[0] == -1) && (paramArrayOfByte[1] == -2))
      i1 = 2;
    int i2 = 0;
    for (int i3 = i1; i3 < paramArrayOfByte.length; i3 += 2)
    {
      if ((paramArrayOfByte[i3] == 0) && ((i3 + 1 >= paramArrayOfByte.length) || (paramArrayOfByte[(i3 + 1)] == 0)))
        break;
      i2++;
    }
    char[] arrayOfChar = new char[i2];
    int i6 = i1;
    for (int i7 = 0; i7 < i2; i7++)
    {
      int i4;
      if ((i4 = paramArrayOfByte[i6]) < 0)
        i4 += 256;
      i6++;
      int i5;
      if ((i5 = paramArrayOfByte[i6]) < 0)
        i5 += 256;
      i6++;
      arrayOfChar[i7] = (char)(i5 * 256 + i4);
    }
    String str;
    if (((str = new String(arrayOfChar)).length() >= 2) && (str.charAt(0) == '_') && (str.charAt(1) == '&'))
      str = str.substring(2, str.length());
    return str;
  }

  public static final void c()
  {
    m = null;
  }

  public static final void d()
  {
    m = new e();
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramInt1 == paramInt2)
      return paramInt1;
    int i1 = 256 - paramInt3;
    int i2 = paramInt3;
    if (i1 == 0)
      return paramInt2;
    if (i2 == 0)
      return paramInt1;
    long l1 = 0L;
    long l2 = 0L;
    long l3 = 0L;
    long l4 = 0L;
    long l5 = 0L;
    long l6 = 0L;
    long l7 = 0L;
    long l8 = 0L;
    long l9 = 0L;
    long l10 = 0L;
    long l11 = 0L;
    long l12 = 0L;
    if (paramBoolean1)
      l8 = paramInt1 >> 24 & 0xFF;
    l5 = (paramInt1 >> 16 & 0xFF) * i1;
    l6 = (paramInt1 >> 8 & 0xFF) * i1;
    l7 = (paramInt1 & 0xFF) * i1;
    if (paramBoolean1)
      l12 = paramInt2 >> 24 & 0xFF;
    l9 = (paramInt2 >> 16 & 0xFF) * i2;
    l10 = (paramInt2 >> 8 & 0xFF) * i2;
    l11 = (paramInt2 & 0xFF) * i2;
    long l13 = 0L;
    if ((paramBoolean1) && ((l8 < 255L) || (l12 < 255L)))
      l13 = l8 * i1 + l12 * i2;
    if (paramBoolean1)
      l4 = l8 * i1 + l12 * i2 >> 8;
    if (l4 < 0L)
      l4 = 0L;
    if (l4 > 255L)
      l4 = 255L;
    if (l13 > 0L)
    {
      if ((l1 = (l5 * l8 + l9 * l12) / l13) < 0L)
        l1 = 0L;
      if (l1 > 255L)
        l1 = 255L;
      if ((l2 = (l6 * l8 + l10 * l12) / l13) < 0L)
        l2 = 0L;
      if (l2 > 255L)
        l2 = 255L;
      if ((l3 = (l7 * l8 + l11 * l12) / l13) < 0L)
        l3 = 0L;
      if (l3 > 255L)
        l3 = 255L;
    }
    else
    {
      if ((l1 = l5 + l9 >> 8) < 0L)
        l1 = 0L;
      if (l1 > 255L)
        l1 = 255L;
      if ((l2 = l6 + l10 >> 8) < 0L)
        l2 = 0L;
      if (l2 > 255L)
        l2 = 255L;
      if ((l3 = l7 + l11 >> 8) < 0L)
        l3 = 0L;
      if (l3 > 255L)
        l3 = 255L;
    }
    if (paramBoolean2)
      return (int)(l4 << 24 | l1 << 16 | l2 << 8 | l3);
    if ((l4 < 128L) && (paramBoolean1))
      return 0;
    return (int)(0xFF000000 | l1 << 16 | l2 << 8 | l3);
  }

  private static final byte[] c(byte[] paramArrayOfByte)
  {
    if (!i.ca)
    {
      paramArrayOfByte[0] = (byte)e;
      d = (i.eg | i.by) + 1;
      if (d > 0)
        paramArrayOfByte[4] = (byte)d;
      paramArrayOfByte[9] = (byte)f;
      paramArrayOfByte[11] = i.cW;
      paramArrayOfByte[15] = (byte)i.cX;
    }
    paramArrayOfByte[2] = 0;
    if (n)
      paramArrayOfByte[2] = 1;
    paramArrayOfByte[5] = i.W;
    if (!i.ca)
      paramArrayOfByte[6] = 0;
    if (g)
      paramArrayOfByte[6] = 1;
    paramArrayOfByte[10] = 0;
    if (i.dm)
      paramArrayOfByte[10] = 1;
    paramArrayOfByte[13] = (byte)m.v;
    paramArrayOfByte[14] = 0;
    if (i.cz)
      paramArrayOfByte[14] = 1;
    return paramArrayOfByte;
  }
}