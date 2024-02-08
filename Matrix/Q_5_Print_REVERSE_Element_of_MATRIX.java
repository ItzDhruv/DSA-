public class Q_5_Print_REVERSE_Element_of_MATRIX {
    public static void main(String[] args) {
        int ary[][]={{1,2,3},{4,5,6},{7,8,9},{0,1,1}};
        for(int i=ary.length-1;i>=0;i--)
        {
            for(int j=ary[0].length-1;j>=0;j--)
            {
                System.out.print(" "+ary[i][j]);
            }
            System.out.println("\n");
        }
    }
}
