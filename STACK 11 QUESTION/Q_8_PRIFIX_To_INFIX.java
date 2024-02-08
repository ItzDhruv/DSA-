import java.util.Stack;

public class Q_8_PRIFIX_To_INFIX {
    public static void main(String[] args) {
        String s = "++ab*cd";
        Stack<String> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' )
            {
                String left=stack.peek();
                stack.pop();
                String right=stack.peek();
                stack.pop();
                String newstring = "("+left+s.charAt(i)+right+")";
                stack.push(newstring);
            }

            else {
               stack.push(String.valueOf(s.charAt(i)));    //  <------------------- In this case s.charAt(i) not useable because stack in string form not character
            }
        }
        System.out.println(stack.peek());
    }
}
