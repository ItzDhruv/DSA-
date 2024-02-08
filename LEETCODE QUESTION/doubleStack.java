public class doubleStack {

    static int[] arr = new int[50];
    static int p1 =-1;
    static int p2 = arr.length;
    public static void main(String[] args) {
        //push1 for 1st stack & push 2 for 2nd same in other methods

        System.out.println(isemptyp1(p1));
        System.out.println(isemptyp2(p2));
        p1 = push1(10,p1);
        p2 = push2(30,p2);
        p1 = push1(40,p1);
        p2 = push2(50,p2);
        System.out.println(top1(p1));
        System.out.println(top2(p2));
//        p1 = pop1(p1);
//        p2=pop2(p2);
        print1(p1);
        System.out.println();
        print2(p2);
        System.out.println();
        System.out.println(isemptyp1(p1));
        System.out.println(isemptyp2(p2));
    }

    private static int top2(int p2) {
        return arr[p2];
    }

    private static int top1(int p1) {
        return arr[p1];
    }

    private static boolean isemptyp2(int p2) {
        return p2 == arr.length ? true : false;
    }

    private static boolean isemptyp1(int p1) {
        return p1 == -1 ? true : false ;
    }

    private static void print2(int p2) {
        if(p2 == arr.length){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = arr.length-1 ; i>=p2 ; i--){
            System.out.print(arr[i] + " ");
        }
    }

    private static void print1(int p1) {
        if (p1 == -1){
            System.out.println("Stack is Empty");
            return;
        }
        for (int i=0 ; i<=p1;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static int pop2(int p2) {
        if(p2 == arr.length){
            System.out.println("Stack is Empty");
            return p2;
        }
        p2++;
        return p2;
    }

    private static int pop1(int p1) {
        if(p1 == -1){
            System.out.println("Stack is Empty");
            return p1;
        }
        p1--;
        return p1;
    }

    private static int push2(int v, int p2) {
        if(p2 == -1 || p2 == p1+1){
            System.out.println("Stack is full ");
            return p2;
        }
        p2--;
        arr[p2] = v;
        return p2;
    }

    private static int push1(int v,int p1) {
        if(arr.length == p1 || p1 == p2){
            System.out.println("Stack is full");
            return p1;
        }
        p1++;
        arr[p1] = v;
        return p1;
    }
}
