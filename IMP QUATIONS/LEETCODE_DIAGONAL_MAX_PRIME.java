import java.util.Stack;

public class LEETCODE_DIAGONAL_MAX_PRIME {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for(int i=1;i<=11;i++)
        {
            s.push(i);
        }
        int mid = s.size()/2;
        System.out.println(mid);

        for(int i=1;i<=11;i++)
        {
            s.pop();
            if(i!=mid)
            {
              s.push(i);
            }
        }
        System.out.println(s);
    }
}
