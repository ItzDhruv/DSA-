import java.util.Scanner;

public class Q_3_withdraw_acount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        accountBalance s1 = new accountBalance();
        s1.setAccountDetails();
        System.out.println("Enter (1) for Deposite || (2) for With-draw : ");
        int ops=s.nextInt();
        switch (ops)
        {
            case 1:
            {
                s1.diposite();
                break;
            }
            case 2:
                s1.withdraw();
                break;
        }
        s1.show();
    }
}

    class accountBalance {
int acountno;
String name;
int balance;
public void setAccountDetails()
{
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter Your Account number : ");
    acountno=s1.nextInt();
    System.out.println("Enter Your name : ");
    name=s1.next();
    System.out.println("Enter Your balance : ");
    balance=s1.nextInt();
}
public int withdraw()
{
    Scanner s2=new Scanner(System.in);
    System.out.println("Withdraw Money Enter : ");
    int withdraw=s2.nextInt();
    if(withdraw>balance)
    {
        System.out.println("You have not enough money.");
        return 0;
    }
    balance-=withdraw;
    return balance;
}
        public int diposite()
        {
            Scanner s2=new Scanner(System.in);
            System.out.println("Diposite Money Enter : ");
            int diposite=s2.nextInt();
balance+=diposite;
            return balance;
        }
        public void show()
        {
            System.out.println("-------------------------------------------");
            System.out.println("          Afte updation ");
            System.out.println("--------------------------------------------");
            System.out.println("Acount no :"+acountno);
            System.out.println("Name : "+name);
            System.out.println("updated Balance is : "+balance);
        }
    }
