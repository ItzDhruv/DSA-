import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {

int matrix[][]={{3,7,8},{9,11,13},{15,16,17}};
        ArrayList<Integer> ans=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;

        for(int r=0;r<row;++r)
        {
            int columTobeSearch=0;
            int value=matrix[r][0];
            for(int c=1;c<col;++c)
            {
                if(value>matrix[r][c])
                {
                    columTobeSearch=c;
                    value=matrix[r][c];
                }
            }
            int p=0;
            for(int i=0;i<row;++i)
            {
                if(matrix[i][columTobeSearch]>value)
                {
                    p=1;
                    break;
                }
            }
            if(p==1)
            {
                continue;
            }
            ans.add(value);
        }
        System.out.println(ans);
    }
}