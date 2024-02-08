package Ary_36_Question;

import java.util.Arrays;

public class Ary_23_2nd_largest_Arry {
    public static void main(String[] args) {
        int arr[]={1,2222,4,5,7,8,19,320};

        int max=Integer.MIN_VALUE;                // 19
        int max2=Integer.MIN_VALUE;               // 8

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max) {
                max2=max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i]>max2)
            {
                max2=arr[i];

            }
        }
        System.out.println(max2);
        }
    }

