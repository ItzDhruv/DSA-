package Ary_36_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Ary_29_Left_Rotation_D_After_Times {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,6,7,8};
        int temp[]=new int[ary.length];

        Scanner sc = new Scanner(System.in);
       int d=sc.nextInt();

        if (d>=ary.length)                  //core case
        {
            d=d%ary.length;
        }

        int cont=0;

        for(int i=d;i<ary.length;i++)
        {
            temp[cont]=ary[i];
            cont++;
        }

        for(int j=0;j<d;j++)
        {
            temp[cont]=ary[j];
            cont++;
        }


        System.out.println(Arrays.toString(temp));

    }
}
