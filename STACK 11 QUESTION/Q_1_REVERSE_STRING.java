public class Q_1_REVERSE_STRING {
    public static void main(String[] args) {
        String s ="Dhruv";
        System.out.println("Orignal String : "+s);
        int top=-1;
        char stack[]=new char[100];
        for(int i=0;i<s.length();i++)
        {
           top = push(stack,s.charAt(i),top);
        }
        System.out.print("After reverseing word : ");
        show(stack,top);
        System.out.println();
        top=pop(stack,top);
        top=pop(stack,top);
        System.out.print("After pop 2 times : ");
        show(stack,top);
    }

    private static void show(char ary[],int top) {
        while(top>=0)
        {
            System.out.print(ary[top--]);
        }
    }

    private static int pop(char stack[],int top) {
        if (top == -1) {
            System.out.println("stack is empty");
            return top;
        }
        top--;
        return top;
    }

    private static int push(char stack[],char ch, int top) {
if(top>stack.length)
{
    System.out.println("Stack is sover flow");
}
else {
    stack[++top]=ch;
}
        return top;
    }
}
