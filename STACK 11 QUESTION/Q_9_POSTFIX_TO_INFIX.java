import java.util.Stack;

public class Q_9_POSTFIX_TO_INFIX {
    public static void main(String[] args) {
        String s="ab+cd-*";
        Stack<String> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' )
            {
                String right =stack.pop();;

                String left =stack.pop();;

                String newstring = "("+left+s.charAt(i)+right+")";
                stack.push(newstring);
            }
            else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
