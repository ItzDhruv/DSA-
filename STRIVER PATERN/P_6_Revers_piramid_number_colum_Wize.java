import java.util.Scanner;

public class P_6_Revers_piramid_number_colum_Wize {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Piramid Size : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
