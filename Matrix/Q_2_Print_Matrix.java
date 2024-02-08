public class Q_2_Print_Matrix {
    public static void main(String[] args) {
int ary[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

int colum=ary.length;
int raw=ary[0].length;
        for(int i=0;i<colum;i++)

{
    for(int j=0;j<raw;j++)
    {
        System.out.print("  " + ary[i][j]);
    }
    System.out.println("\n");
}

    }
}
