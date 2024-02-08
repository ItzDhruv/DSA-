public class Q_4_Top_3_Student {
    public static void main(String[] args) {
        Student s2 = new Student(102, "Yash", 20, 20, 20, 20, 20);
        Student s3 = new Student(103, "Kevin", 30, 30, 30, 30, 30);
        Student s4 = new Student(104, "ABC", 7, 9, 5, 8, 5);
        Student s5 = new Student(105, "DEF", 8, 5, 9, 3, 2);
        Student s1 = new Student(101, "Dakshit", 10, 10, 10, 10, 10);
        Student s6 = new Student(106, "GHI", 8, 1, 3, 7, 0);

        Student []students=new Student[6];              // Create a class level Array.

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        students[5] = s6;
        Student.top3student(students);
    }
}
class Student
{
    private int rollno;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
    private int mark5;
    private int perc;

    Student(){}

public Student(int rollno,String name,int mark1,int mark2,int mark3,int mark4,int mark5)                        //Create Constructor.
{
    this.rollno = rollno;
    this.name = name;
    this.mark1 = mark1;
    this.mark2 = mark2;
    this.mark3 = mark3;
    this.mark4 = mark4;
    this.mark5 = mark5;
    perc=(mark1+mark2+mark3+mark4+mark5)/5;
}
public static void top3student(Student[] students)
{
    for(int i=0;i<students.length;i++)
    {
        for(int j=0;j<students.length-i-1;j++)
        {


            if(students[j].perc<students[j+1].perc)
            {
                Student temp=students[j];
                students[j]=students[j+1];
                students[j+1]=temp;
            }
        }
    }
    Student max1=students[0];
    Student max2=students[1];
    Student max3=students[2];
    System.out.println("1St rank |||| Name : "+max1.name+" Roll no : "+max1.rollno+" Perc : "+max1.perc);
    System.out.println("2St rank |||| Name : "+max2.name+" Roll no : "+max2.rollno+" Perc : "+max2.perc);
    System.out.println("3St rank |||| Name : "+max3.name+" Roll no : "+max3.rollno+" Perc : "+max3.perc);
}
}
