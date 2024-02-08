public class Q_10_Find_Highest_SUM_among_all_Columns {
    public static void main(String[] args) {
        int ary[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int raw=ary.length;
        int colum=ary[0].length;
        int sum=0,cursum=Integer.MIN_VALUE;
        for(int i=0;i<colum;i++)
        {
            sum=0;
            for(int j=0;j<raw;j++)
            {
                sum=sum+ary[j][i];
            }
            if(cursum<sum)
            {
                cursum=sum;
            }
        }
        System.out.println(cursum);
    }
}
