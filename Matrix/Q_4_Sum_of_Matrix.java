public class Q_4_Sum_of_Matrix {
    public static void main(String[] args) {
        int ary[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<ary.length;i++)
        {
            for(int j=0;j<ary[0].length;j++)
            {
                sum=sum+ary[i][j];
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
