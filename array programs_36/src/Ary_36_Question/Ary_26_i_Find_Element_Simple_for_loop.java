package Ary_36_Question;

import java.util.Scanner;

public class Ary_26_i_Find_Element_Simple_for_loop {
    public static void main(String[] args) {
        int ary[]={2,21,5,2,8,6,3,5,7,15,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your num : ");
        int v=sc.nextInt();
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]==v)
            {
                System.out.println("Your number of index is : "+(i-1));
            }
        }
    }
}
