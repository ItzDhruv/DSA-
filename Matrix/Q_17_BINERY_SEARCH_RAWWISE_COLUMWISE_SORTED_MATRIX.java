import java.util.Arrays;

public class Q_17_BINERY_SEARCH_RAWWISE_COLUMWISE_SORTED_MATRIX {
    public static void main(String[] args) {
        int mat[][] = { { 1,     3,     4,      5,     7 },
                {        8,      9,     10,     12,    14 },
                {       15,      16,    17,     19,    20 } };
        int v = 100;
        int raw = mat.length;
        int col = mat[0].length;
        int ans[] = new int[2];
        int r=0;
        int c=col-1;
        while(r<raw && c>=0)
        {
            if(mat[r][c]==v)
            {
                ans[0]=r;
                ans[1]=c;
                System.out.println(Arrays.toString(ans));
                return;
            }
            else if(mat[r][c]>v)
            {
                c--;
            }
            else{
                r++;
            }
        }
        System.out.println("Not present.");
    }
}
