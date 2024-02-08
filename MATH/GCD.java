public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(24,8));
    }
    public static int gcd(int x,int y)
    {
        if(x == 0) return y;
        return gcd(y%x,x);
    }
}
