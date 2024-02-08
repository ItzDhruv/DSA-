package Ary_36_Question;                                    //O(n)

import java.util.Scanner;
                                                            // Two pointer method
public class Ary_27_Sum_Present_PAiR {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,6,8,12,15};
        System.out.print("Enter sum of this elment : ");
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int f=0;
        int l=ary.length-1;
        for(int i=0;i<ary.length;i++)
        {
            if(ary[f]+ary[l]<sum)
            {
                f++;
            }
          else  if(ary[f]+ary[l]>sum)
            {
                l--;
            }
            else {
                System.out.println("The pair is "+ary[f]+" & "+ary[l]);
                System.out.println("Index is : "+f+" & "+l);
                return;
            }
        }
        if(f==0 && l== ary.length-1)
        {
            System.out.println("The pair is not avilaible.");
        }
    }
}
