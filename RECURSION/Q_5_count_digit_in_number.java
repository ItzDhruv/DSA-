public class Q_5_count_digit_in_number {
    public static void main(String[] args) {
        int x=12045;
        digitsum(x);
            }
static int sum=0;
    public static void digitsum(int x)
    {

if(x==0)
{
    System.out.println(sum);
    return;
}
sum=sum+(x%10);
digitsum(x/10);
    }
}
