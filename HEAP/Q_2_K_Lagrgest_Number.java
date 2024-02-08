import java.util.Collections;
import java.util.PriorityQueue;

public class Q_2_K_Lagrgest_Number {
    public static void main(String[] args)
    {
    int ary[]={23,4,56,8,3,52,70,2,58,0};
    int k =4;
    PriorityQueue<Integer> pq
            = new PriorityQueue<Integer>();
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
