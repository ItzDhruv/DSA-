import java.util.Stack;

public class Min_Stack_OPTIMAL_SOLUTION {
    static Stack<Integer> stack = new Stack<>();
    static int min;
    public static void main(String[] args) {
        push(20);
        push(-12);
        push(0);
        peek();
        push(-18);
        push(55);
        getmin();
        push(-23);


    }
    public static void push(int val)
    {
        if(stack.isEmpty())
        {
            min=val;
            stack.push(val);
        }
        else if(min>val)
        {
            stack.push((2*val)-min);
            min=val;
        }
        else {
            stack.push(val);
        }
    }
    public static void pop()
    {
        int curentval=stack.peek();
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty!");
        }
        else if(min>curentval)
        {
            min=2*min-curentval;
        }
        stack.pop();
    }
    public static void peek()
    {
        if(stack.isEmpty())
        {
            System.out.println("empty");
            return;
        }
        if(min> stack.peek())
        {
            System.out.println("Peek : "+min);
        }
        else {
            System.out.println("Peek : "+stack.peek());
        }
    }
    public static void getmin()
    {
        System.out.println("Min : "+min);
    }
}
