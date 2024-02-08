package Ary_36_Question;

import java.util.Arrays;

public class Ary_37_max_number_withmax_index_differtnt {
    public static void main(String[] args) {
        int ary[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        // Q. ary[i]<ary[j]  And  j-i MAximum Hona jahiye
        int n = ary.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = ary[0];
        right[n-1]=ary[n-1];
        for (int i = 1; i < n; i++)
        {
            left[i] = Math.min(ary[i], left[i - 1]);
         }
     for(int i=n-2;i>=0;i--)
     {
         right[i]=Math.max(ary[i],right[i+1]);
     }

     int i=0,j=0,maxindx=-1;
     while(i<n && j<n)
     {
         if(right[j]>left[i])
         {
             maxindx=Math.max(maxindx,j-i);
             j++;
         }
         else {
             i++;
         }
     }
        System.out.println(maxindx);
         }
}
