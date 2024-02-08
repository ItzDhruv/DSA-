public class Q_8_find_sum_of_digit {
    public static void main(String[] args) {
sumofdigit(8470);

    }
    static int sum=0;
    public static void sumofdigit(int x)
    {
        if(x==0)
        {
            System.out.println(sum);
            return;
        }
        sum=sum+(x%10);
        sumofdigit(x/10);

    }
}
