import java.util.Scanner;

public class Q_1_Student_marks {
    public static void main(String[] args) {
student s1=new student();
s1.input();
s1.show();
        student s2=new student();
        s2.input();
        s2.show();
    }
}
class student
{
    static int uniqueno;
    int rollno;
    String name;
    int mark[]=new int[5];
    int totalmark=0;



    student()           // CONSTUCTOR.

    {
       uniqueno++;
       rollno=uniqueno;
    }
    public void input()
    {
        Scanner sc1=new Scanner(System.in);

        System.out.println("Enter name : ");
        name=sc1.nextLine();
        this.name=name;
        System.out.println("Enter marks : ");
        for(int i=0;i<mark.length;i++)
        {
            int sub=i+1;
            System.out.println("Subject "+sub+" : ");
            mark[i]=sc1.nextInt();
        }
    }
    public int totalmarks()
    {
        for(int i=0;i<mark.length;i++)
        {
            totalmark=mark[i]+totalmark;
        }
        return totalmark;
    }
public int highmark()
{
    int highmark=0;

    for(int i=0;i<mark.length;i++)
    {
        if(mark[i]>highmark)
        {
            highmark=mark[i];
        }
    }
    return highmark;
}
    public int lawmark()
    {
        int lawmark=Integer.MAX_VALUE;
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]<lawmark)
            {
                lawmark=mark[i];
            }
        }
        return lawmark;
    }
    public int avg()
    {
        return totalmark/mark.length;
    }
    public int passcount()
    {int passcount=0;
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]>=50)
            {
                passcount++;
            }
        }
        return passcount;
    }

    public void show()
    {
        System.out.println("Roll no : "+rollno);
        System.out.println("Student name :"+name);
        System.out.println("Total marks : "+totalmarks());
        System.out.println("Average : "+avg());
        System.out.println("Highest Marks  : "+highmark());
        System.out.println("Lowest Mark : "+lawmark());
        System.out.println("Pass in "+passcount()+" Subject.");
        System.out.println("Total student is : "+rollno);

    }
}
