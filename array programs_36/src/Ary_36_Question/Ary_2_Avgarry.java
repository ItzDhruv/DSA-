package Ary_36_Question;

import java.util.Scanner;

public class Ary_2_Avgarry {
    public static void main(String[] args) {
        int ary[]= {23,34,45,56,3};
        System.out.println("Enter 5 values : ");
        int j=0;
        for(int i=0;i<ary.length;i++)
        {
            j=j+ary[i];
        }
        System.out.println("Your avg is : "+j/5);
    }
}
