package Ary_36_Question;

import java.util.Arrays;

public class Ary_13_StoreinmemoryReverseArry {
    public static void main(String[] args) {
        int []ary={1,2,3,4,5,6};
       int i =0;
       int j =ary.length-1;
       while(i<j)
       {
           int temp = ary[i];
           ary[i]=ary[j];
           ary[j]=temp;
           i++;
           j--;
       }
        System.out.println(Arrays.toString(ary));
    }
}
