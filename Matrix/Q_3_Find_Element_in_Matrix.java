import java.util.Scanner;

public class Q_3_Find_Element_in_Matrix {
    public static void main(String[] args) {
int ary[][]={{1,2,3},{4,5,6},{7,8,9}};
Scanner sc=new Scanner(System.in);
        System.out.println("Element : ");
int v=sc.nextInt();
int colum=ary.length;
int raw=ary[0].length;
for(int i=0;i<colum;i++)
{
    for(int j=0;j<raw;j++)
    {
        if(ary[i][j]==v)
        {
            System.out.println("Colum : "+i+" Raw : "+j);
            return;
        }
    }
}
        System.out.println("Element is not present.");
    }
}
