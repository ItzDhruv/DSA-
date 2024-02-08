

class Q2_ReverseWordInternallyInString {
    public static void main(String[] args) {
        String s="ym eman si vurhD";
        char[] stack=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                while(!isempty(top)){
                    top=pop(stack,top);
                }
                System.out.print(" ");
            }
            else {
                top=push(stack,top,s.charAt(i));
            }
        }
        while(!isempty(top)){
            top=pop(stack,top);
        }
    }
    private static boolean isempty(int top) {
        if(top==-1){
            return true;
        }
        return false;
    }
    private static int push(char[] stack, int top, char value) {
        if(top== stack.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
    private static int pop(char[] stack, int top) {
        if(top== -1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.print(stack[top]+"");
        top--;
        return top;
    }
}