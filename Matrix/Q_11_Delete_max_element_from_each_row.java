public class Q_11_Delete_max_element_from_each_row {
    public static void main(String[] args) {
        int ary[][]={  {1,32,3},
                       {4,51,6},
                       {7,8,9}};
        int raw=ary.length;
        int colum=ary[0].length;
        for(int i=0;i<raw;i++)
        {
int index=0;
            int max =ary[i][0];
            for(int j=0;j<colum;j++)
            {
                if(ary[i][j]>max)
                {
                    max=ary[i][j];
                    index=j;
                }
            }
            for(int k=index;k<colum-1;k++)
            {
                ary[i][index]=ary[i][index+1];
                index++;
            }
        }
        for(int i=0;i<raw;i++) {
            for (int j = 0; j < colum-1; j++) {
                System.out.print("  "+ary[i][j]);
            }
            System.out.println("\n");
        }
    }
}
