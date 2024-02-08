import java.util.Scanner;

public class dsaexam {
    public static void main(String[] args) {
        System.out.println("enter arry length : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int ary[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+" elment : ");
            ary[i]=sc.nextInt();
        }
        System.out.println("maiden is : "+ary[ (n/2)]);
    }
}
