import java.util.ArrayList;
import java.util.List;
//                 1
//            1    2    1
//        1      3   3       1
//    1      4      6      4     1
public class Q_20_PASCAL_MATRIX {
    public static void main(String[] args) {
        int x = 5;
        List<List<Integer>> l = new ArrayList<>();
        for(int i=1;i<=x;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                {
                    row.add(1);
                }
                else {
                    row.add(l.get(i-2).get(j) + l.get(i-2).get(j-1));
                }
            }
            l.add(row);

        }
        System.out.println(l.get(3));
    }
}
