import java.util.Scanner;

public class P_5_Revers_piramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Piramid Size : ");
        int n=sc.nextInt();

            for(int j=1;j<=n;j++)
            {
                for(int i=n-j+1;i>=1;i--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

    }
}
