
import java.util.Stack;
class myStack {
    Stack<Integer> a;
    int min;

    myStack() {
        a = new Stack<>();
    }

    void getmin() {
        if (a.isEmpty()) System.out.println("stack_empty");
        else System.out.println("min: " + min);
    }

    void pop() {
        if (a.isEmpty()) {
            System.out.println("stack_empty");
            return;
        }
        int x = a.pop();
        if (x < min) {
            System.out.print("min: " + x);
            min = (2 * min) - x;
        } else System.out.println("pop: " + x);
    }

    void push(int v) {
        if (a.isEmpty()) {
            a.push(v);
            min = v;
        } else if (v < min) {
            a.push((2 * v) - min);
            min = v;
        } else {
            a.push(v);
        }
    }

    void peek() {
        if (a.isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        int x = a.peek();
        if (x < min) System.out.print("peek: " + min + "\n");
        else System.out.print("peek: " + x + "\n");

    }
}

public class getmin_o_1 {
    public static void main(String[] args) {
        myStack a = new myStack();
        a.push(6);
        a.push(10);
        a.push(13);
        a.push(5);
        a.getmin();
        a.peek();
        a.push(4);
        a.pop();
        a.getmin();
    }


}
