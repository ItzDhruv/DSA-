import java.util.Stack;

public class Min_Stack_1_BRUTEFORCE {
       static Stack<Integer> stack = new Stack<>();
       static int minvalue=Integer.MAX_VALUE;
    public static void main(String[] args) {
        push(15);
        push(4);
        getMinvalue();
        push(-12);
        getMinvalue();
        pop();
        getMinvalue();
        push(43);
        push(23);
    }
    public static void push(int value)
    {
        stack.push(value);
        if(minvalue>value)
        {
            stack.push(value);
            minvalue=value;
        }
        else
        {
            stack.push(value);
        }
    }
    public static int pop()
    {
        stack.pop();
        return stack.pop();
    }
    public static void getMinvalue()
    {
        System.out.println("Minvalue : "+stack.peek());
    }
}
