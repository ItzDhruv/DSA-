public class Q_18_Shortest_path_to_reach_from_00_to_nn {
    public static void main(String[] args) {
        int mat[][] = { { 1,     3,     4,      5,     72 },
                         {        82,      9,     10,   -122,    14 },
                {       15,      16,    17,     19,    20 } };
int raw=mat.length;
int col=mat[0].length;
for(int r=0;r<raw;r++)
{
    for(int c=0;c<col;c++)
    {
        if(r==0   &&   c==0)
        {
            continue;
        }
        else if(r==0)
        {
            mat[r][c]=mat[r][c]+mat[r][c-1];
        }
        else if(c==0)
        {
            mat[r][c]=mat[r][c]+mat[r-1][c];
        }
        else{
            mat[r][c]=mat[r][c]+Math.min(mat[r-1][c],mat[r][c-1]);
        }
    }
}
        System.out.println(mat[raw-1][col-1]);
    }
}
