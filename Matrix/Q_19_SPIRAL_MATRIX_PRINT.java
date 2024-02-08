import java.util.ArrayList;

public class Q_19_SPIRAL_MATRIX_PRINT {

    public static void main(String[] args) {
        int mat[][] = { { 1,     3,     4,      5,     72 },
                {        82,      9,     10,   -122,    14 },
                {       15,      16,    17,     19,    20 } };
        int raw= mat.length;
        int colum=mat[0].length;
        ArrayList<Integer> list = new ArrayList<>();

        int top=0;
        int bottom= raw-1;
        int left=0;
        int right=colum-1;
        while(top<=bottom && left<=right)
        {
for(int i=left;i<=right;i++)
{

    list.add(mat[top][i]);

}
top++;
for(int i=top;i<=bottom;i++)
{
    list.add(mat[i][right]);
}
right--;
if(top<=bottom) {
    for (int i = right; i >= left; i--) {
        list.add(mat[bottom][i]);
    }
    bottom--;
}
if(left<=right) {
    for (int i = bottom; i >= top; i--) {
        list.add(mat[i][left]);
    }
    left++;
}
        }
        System.out.println(list);
    }
}
