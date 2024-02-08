package Ary_36_Question;

import java.util.Scanner;

public class Ary_32_Binery_search {
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur num");
        int value=sc.nextInt();
        int start=0; int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]==value){
                System.out.println("ur index is : "+mid);
                return;
            }
            else if(arr[mid]>value){
                end--;
            }
            else{
                start++;
            }
            mid=(start+end)/2;
        }
    }


}
