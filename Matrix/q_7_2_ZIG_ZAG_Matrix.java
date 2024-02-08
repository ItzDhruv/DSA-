public class q_7_2_ZIG_ZAG_Matrix {
    public static void main(String[] args) {
        int ary[][]={{1,2,3},{4,5,6},{7,8,9}};
        int colum=ary.length;
        int raw=ary[0].length;
        for (int i=0;i<colum;i++)
        {

                if(i%2==0)
                {
                    for(int j=0;j<raw;j++) {
                        System.out.print("   "+ary[i][j]);
                    }
                }

                else {
                    for(int j=raw-1;j>=0;j--)
                    {
                        System.out.print("   "+ary[i][j]);
                    }
                }
            System.out.println("\n");
        }
    }
}
