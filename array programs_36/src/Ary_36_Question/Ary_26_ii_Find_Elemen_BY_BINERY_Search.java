package Ary_36_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Ary_26_ii_Find_Elemen_BY_BINERY_Search {
    public static void main(String[] args) {
        int ary[]={2,21,5,8,6,3,5,7,15,10};
        Arrays.sort(ary);                // For soting Arry.
        int mid=ary[ary.length/2];
        System.out.println(mid);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your num : ");
        int v=sc.nextInt();
      if(mid==v)
      {
          System.out.println(mid+" index is : "+ary.length/2);
      }
        else if(mid>v)
        {
            for(int i=0;i<mid;i++)
            {
                if(ary[i]==v)
                {
                    System.out.println(ary[i]+" index is : "+i);          // Index is after sorting Array.
                }
            }
        }
       else if(mid<v)
        {
            for(int i=mid;i<ary.length;i++)
            {
                if(ary[i]==v)
                {
                    System.out.println(ary[i]+" index is : "+i);
                }
            }
        }
       else {
          System.out.println("Elment not present.");
      }
    }
}
