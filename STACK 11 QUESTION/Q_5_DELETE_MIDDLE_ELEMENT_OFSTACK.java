import java.util.Stack;

public class Q_5_DELETE_MIDDLE_ELEMENT_OFSTACK {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack2=new Stack<>();

        for(int i=1;i<10;i++)
        {
            stack.push(i*3);
        }
        int mid = 1+stack.size()/2;
        System.out.println("Before Delete : "+stack);
int n=stack.size();
for(int i=1;i<=n;i++) {
    if (i != mid)
    {
        stack2.push(stack.pop());
    }
    else {
        stack.pop();
    }
}
while(!stack2.isEmpty())
{
    stack.push(stack2.pop());
}
        System.out.println(" After Delete : "+stack);
    }
}
