public class Q_9_finid_largest_element_in_array {
    public static void main(String[] args) {
        int ary[]={2,10,5,7,8,32,4};
        largeelement(ary,ary.length);

        }
    static int max=Integer.MIN_VALUE;
    static int index=0;
    public static void largeelement(int ary[],int x)
    {
if(index== ary.length)
{
    System.out.println(max);
    return;
}
if(max<ary[index])
{
    max=ary[index];
}

largeelement(ary,index++);
    }
}
