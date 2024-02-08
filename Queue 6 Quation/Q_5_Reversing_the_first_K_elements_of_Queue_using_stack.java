import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q_5_Reversing_the_first_K_elements_of_Queue_using_stack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        int k=5;
        int last_elements=q.size()-k;
        System.out.println("before : "+q);

        Stack<Integer> s = new Stack<>();
        for(int i=1;i<=k;i++)
        {
            s.push(q.remove());
        }
        while (!s.isEmpty())
        {
            q.add(s.pop());
        }
        for(int i=0;i<last_elements;i++)
        {
            q.add(q.remove());
        }
        System.out.println("After : "+q);
    }
}
