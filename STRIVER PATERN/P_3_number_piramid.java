import java.util.Scanner;

public class P_3_number_piramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Piramid Size : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
