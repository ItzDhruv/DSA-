import java.util.Scanner;

public class Q_2_Bank_Account {
    public static void main(String[] args) {
        account ac1= new account();
ac1.getInterset();
ac1.show();
    }
}
class account
{
    double accountno;
    String name;
    double balance;

   static double interset=3.5;
public void getInterset()
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Account no : ");
    accountno=sc.nextInt();
    System.out.println("Enter Name : ");
    name=sc.next();
    System.out.println("Enter Balance : ");
    balance=sc.nextInt();
    balance+=(balance*interset)/100;

}
public void show()
{
    System.out.println("Acount No : "+accountno);
    System.out.println("Name : "+name);
    System.out.println(" Your balance is : "+balance);
}

}
