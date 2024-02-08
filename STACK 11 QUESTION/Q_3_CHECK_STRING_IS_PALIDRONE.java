import java.util.Stack;

public class Q_3_CHECK_STRING_IS_PALIDRONE {
    public static void main(String[] args) {
String s = "oballabo";
        Stack<Character> stack = new Stack<>();
       int mid=s.length()/2;
        for(int i=0;i<mid;i++)
        {
            stack.push(s.charAt(i));
        }
        for(int i=s.length()-mid;i<s.length();i++)
            if(s.charAt(i)!=stack.pop())
            {
                System.out.println(false);
                return;
            }
        System.out.println(true);
    }
}
