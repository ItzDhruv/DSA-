import java.util.Collections;
import java.util.PriorityQueue;

public class Q_1_K_Smallest_Element {
    public static void main(String[] args) {
        int ary[]={23,4,56,8,3,56,7,2,58,0};
        int k =4;
        PriorityQueue<Integer> pq
                = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        for (int i : ary)
        {
            pq.add(i);
            if(pq.size()>k)
            {
              pq.remove();
            }
        }
        System.out.println(pq.peek());
    }
}
