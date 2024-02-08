public class q_7_1_ZIG_ZAG_Matrix_EASY {
    public static void main(String[] args) {
        int ary[][]={{1,2,3},{4,5,6},{7,8,9}};
        int colum=ary.length;
        int raw=ary[0].length;
        for (int i=0;i<colum;i++)
        {
            for(int j=0;j<raw;j++)
            {
                if(i%2==0)
                {
                    System.out.print("   "+ary[i][j]);
                }
                else {
                    System.out.print("   "+ary[i][raw-1-j]);
                }
            }
            System.out.println("\n");
        }
    }
}
