public final class c
{
  static short[] a;
  static int b;
  static String[] c;
  static int d;

  static void a(String paramString)
  {
    int i = b;
    if (d >= b)
    {
      for (int j = 0; j < i; j++)
        a[j] = (short)((a[j] + 1) % i);
      c[(d % i)] = new String(paramString);
    }
    else
    {
      c[d] = new String(paramString);
    }
    d += 1;
  }

  private static void a()
  {
    c = null;
    a = null;
  }

  static void a(int paramInt)
  {
    a();
    b = paramInt;
    d = 0;
    int i = b;
    c = new String[b];
    a = new short[b];
    for (int j = 0; j < i; j++)
    {
      c[j] = new String();
      a[j] = (short)j;
    }
  }
}