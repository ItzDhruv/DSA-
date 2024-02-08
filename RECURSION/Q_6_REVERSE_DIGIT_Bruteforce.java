public class Q_6_REVERSE_DIGIT_Bruteforce {
    public static void main(String[] args) {
revdigit(12345);
    }
        static int rev=0;
     static int rem;
    public static void revdigit(int x)
    {
        if(x==0) {
            System.out.println(rev);
            return;
        }
        rem=x%10;
        rev=rev*10+rem;
        revdigit(x/10);
    }

}
