import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        System.out.println("click 1 for Home");
        System.out.println("click 2 for Hotel");
        System.out.println("click 3 for Bank");
        System.out.println("click 4 for Collage");
        System.out.println("click 5 for exit");
        Scanner sc = new Scanner(System.in);
        int x =10;
       while(x!=1)
        {
            int y = sc.nextInt();
            System.out.println("Enter Your choise");
            if(y==1)
            {
                System.out.println("Home space created");
            }
           else if(y==2)
            {
                System.out.println("Home space created");
            }

           else if(y==3)
            {
                System.out.println("Home space created");
            }
           else if(y==4)
            {
                System.out.println("Home space created");
            }
            else if(y==5){
                System.out.println("Exit");
            x=1;
            }

        }
    }
}
