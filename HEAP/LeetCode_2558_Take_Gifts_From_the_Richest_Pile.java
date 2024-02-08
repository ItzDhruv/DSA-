import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode_2558_Take_Gifts_From_the_Richest_Pile {
    public static void main(String[] args) {
        int nums[]={25,64,9,4,100};
        int k=4;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
for(long i :nums)
{
    pq.add(i);
}
long sum=0;
     while(k!=0)
     {
         long x = pq.remove();
         pq.add((long)Math.sqrt(x));
         k--;
     }
     while(!pq.isEmpty())
     {
         sum+=pq.remove();
     }
        System.out.println(sum);
    }
}
