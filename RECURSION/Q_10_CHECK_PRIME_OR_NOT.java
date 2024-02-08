public class Q_10_CHECK_PRIME_OR_NOT {
    public static void main(String[] args) {
        isprime(13);
    }
    static int limit=2;
    public static void isprime(int x)
    {
      if(limit>Math.abs(x))
      {
          System.out.println(false);
          return;
      }
      if(x%limit==0)
      {
          System.out.println(true);
          return;
      }
      isprime(limit++);
    }
}
