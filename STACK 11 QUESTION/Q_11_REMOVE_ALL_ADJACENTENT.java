import java.util.Stack;

public class Q_11_REMOVE_ALL_ADJACENTENT {
    public static void main(String[] args) {
        String s ="abbaca";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty()) {


                if (s.charAt(i) == stack.peek()) {
                    stack.pop();
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        String ans="";
        while(!stack.isEmpty())
        {
            ans=stack.pop()+ans;
        }
        System.out.println(ans);


    }
}
