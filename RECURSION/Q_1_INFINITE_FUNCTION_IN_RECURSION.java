public class Q_1_INFINITE_FUNCTION_IN_RECURSION {
    public static void main(String[] args) {
        print();
    }
    public static void print()
    {
        System.out.println("Hellow");  // stack overflow problem because there is not exit in this recursion function
        print();
    }
}
