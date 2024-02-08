import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode_506_Relative_Ranks {
    public static void main(String[] args) {
        int score[] = {5,4,3,2,1};
        String medal[] = {"Gold Medal","Silver Medal","Bronze Medal"};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        String []ans =new String[score.length];
        for(int i : score)
        {
            pq.add(i);
        }
        int meadalIndex = 0;
        while (!pq.isEmpty())
        {
            int x= pq.remove();
            if(meadalIndex<3)
            {
//                ans[]
                meadalIndex++;
            }
        }
    }
}
