import java.util.Stack;

public class Q_4_Queue_By_Using_2_Stackes {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void push(int value)
    {
while(!s1.isEmpty())
{
    s2.push(s1.pop());
}
s1.push(value);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    public static void pop()
    {
        s1.pop();
    }
   public static void get_Queue()
    {
        System.out.println(s1);
    }
    public static void top()
    {
        System.out.println(s1.peek());
    }
    public static void size()
    {
        System.out.println("Queue size is : "+s1.size());
    }
    public static void isempty()
    {
        System.out.println("Queue  is empty : "+s1.isEmpty());
    }
    public static void main(String[] args) {
push(10);
push(30);
push(20);
push(50);
pop();
get_Queue();
top();
size();
isempty();
    }
}
