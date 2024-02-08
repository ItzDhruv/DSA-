public class Q_12_Delete_max_element_from_each_COLUM {
    public static void main(String[] args) {
        int mat[][]={  {1,22,45},
                {23,45,67},
                {12,456,90}};
        int raw=mat.length;
        int colum=mat[0].length;
        for(int i=0;i<colum;i++)
        {
            int index=0;
            int max=mat[i][0];
            for(int j=0;j<raw;j++)
            {
                if(mat[j][i]>max)
                {
                    max=mat[j][i];
                    index=j;
                }
            }
            for(int k=index;index<raw-1;k++)
            {
                mat[index][i]=mat[index+1][i];
                index++;
            }
        }
        for(int i=0;i<raw-1;i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("  "+mat[i][j]);
            }
            System.out.println("\n");
        }
    }
}
