public class Q_3_SUM_OF_1_to_N {
    public static void main(String[] args) {
        System.out.println( nthsum(5));
    }

    public static int nthsum(int n) {
        if(n==1) return 1;
        return n+nthsum(n-1);
    }
}
