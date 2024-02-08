public class Q_11_print_nth_number_of_fibonaci_series {
    public static void main(String[] args) {
        System.out.println( nthfibonacinumber(7));       // 0 1 1 2 3 5 8
    }
   static int breakpoint=0;
    static int a=0;
    static int b=1;
    static int c;
    public static int nthfibonacinumber(int x)
    {
if(breakpoint==x-1)
{

    return a;
}
c=a+b;
a=b;
b=c;
breakpoint++;
return nthfibonacinumber(x);
    }
}
