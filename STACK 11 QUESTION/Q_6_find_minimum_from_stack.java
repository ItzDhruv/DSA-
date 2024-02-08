import java.util.Stack;

public class Q_6_find_minimum_from_stack {
 static Stack<Integer> stack = new Stack<>();
  static   Stack<Integer> minstack = new Stack<>();
    public static void main(String[] args) {

       push(10);
       push(20);
       push(50);
       push(7);
       getmin();
       pop();
       pop();
       pop();

       getmin();
    }

    private static void pop() {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
stack.pop();
        if(stack.peek()>=minstack.peek())
        {
            minstack.pop();
        }
    }

    private static void getmin()
    {
        System.out.println("Min is : "+minstack.peek());
    }

    private static void push(int value) {
        stack.push(value);
        if(minstack.isEmpty())
        {
            minstack.push(value);
        }
        else if(minstack.peek()>=value)
        {
            minstack.push(value);
        }
    }

}

