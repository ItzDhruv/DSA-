public class Q_4_PRINT_ARRAY_by_recursion {
    public static void main(String[] args) {
        int ary[] = {1,2,3,4,5};
        printary(ary,ary.length-1);
    }

    public static void printary(int ary[],int n) {
        if(n==0)
        {
            System.out.println(ary[n]+" ");
        return;
        }

        printary(ary,n-1);
        System.out.println(ary[n]);
    }
}
