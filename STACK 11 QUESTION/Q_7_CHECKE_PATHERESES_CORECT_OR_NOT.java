import java.util.Stack;

public class Q_7_CHECKE_PATHERESES_CORECT_OR_NOT {
    public static void main(String[] args) {
        String s =")";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(' )
            {
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty())
                {
                    System.out.println("f");
                    return;
                }
                char temp = s.charAt(i);

                if(temp==')' && stack.peek()=='(' || temp==']' && stack.peek()=='[' || temp=='}' && stack.peek()=='{')
                {
                    stack.pop();
                }
                else {
                    System.out.println("False");
                    return;
                }
            }
        }
        if(!stack.isEmpty())
        {
            System.out.println("false");
            return;
        }
        System.out.println("true");
    }
}
