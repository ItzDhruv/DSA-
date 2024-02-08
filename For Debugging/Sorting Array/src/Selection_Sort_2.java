import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Elements Number : ");
        int x=sc.nextInt();
        int ary[]=new int [x];
        for(int i=0;i<x;i++)
        {
            ary[i]=sc.nextInt();
        }

        for(int i=0;i<x-1;i++)
        {
            int min=i;
            for(int j=i+1;j<x-1;j++)
            {
                if(ary[min]>ary[j])
                {
                    int temp=ary[min];
                    ary[min]=ary[j];
                    ary[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ary));
    }
}
