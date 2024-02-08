import java.util.Stack;
public class Q_10__PREFIX_TO_POSTFIX {
    public static void main(String[] args) {
        String s = "++ab*cd";
        Stack<String> stack = new Stack<>();
for(int i=s.length()-1;i>=0;i--)
{
    if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' )
    {
String left=stack.pop();
String right=stack.pop();
String newstring =left+right+s.charAt(i);
stack.push(newstring);

    }
    else {
stack.push(String.valueOf(s.charAt(i)));
    }
}
        System.out.println(stack.peek());
    }
}
