import java.util.LinkedList;
import java.util.Queue;

public class Q_3_Stack_by_using_2_Queues {
   static Queue<Integer> q1 = new LinkedList<>();
static  Queue<Integer> q2 = new LinkedList<>();
public static void push(int val)
{
    q1.add(val);
    while(!q2.isEmpty())
    {
        q1.add(q2.remove());
    }
    Queue<Integer> temp_q = q1;
    q1=q2;
    q2=temp_q;
}
public static void pop()
{
    if(q2.isEmpty())
    {
        System.out.println("Why you pop,Stack is already empty");
        return;
    }
    q2.remove();
}
public static int peek()
{
return q2.peek();
}
public static void get_stack()
{
    System.out.println(q2);
}
public static boolean isempty()
{
    if(q2.isEmpty())
    {
        return true;
    }
    return false;
}
    public static void main(String[] args) {
push(10);
push(20);
push(30);
push(40);
push(50);
get_stack();
pop();
pop();
        System.out.println("After deleting : ");
get_stack();
        System.out.println("peek : ");
    System.out.println(peek());
        System.out.println(isempty());
        pop();
        pop();
        pop();
        pop();
        System.out.println(isempty());

    }
}
