public class Q_6_REVERSE_DIGIT {
    public static void main(String[] args) {
        reversenum(12345);
    }
static int rev=0;
    private static void reversenum(int x) {
        if(x==0)
        {
            System.out.println(rev);
            return;
        }
        rev=rev+(int)(Math.pow(10,(int)Math.log10(x)))*(x%10) ;
        reversenum(x/10);
    }

}
