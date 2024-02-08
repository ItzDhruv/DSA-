public class Q_9_Find_Highest_SUM_among_all_RAWS {
    public static void main(String[] args) {
        int ary[][]={{1,2,3},{4,5,6},{7,8,9}};
        int raw=ary.length;
        int colum=ary[0].length;
        int sum=0;
        int curentsum=0;
        int x=0;
        for(int i=0;i<raw;i++)
        {
            sum=0;
            for(int j=0;j<colum;j++) {
                sum=sum+ary[i][j];
            }
            if(curentsum<sum)
            {
                x=i;
                curentsum=sum;
            }
        }
        System.out.println(curentsum+" "+x);

    }
}
