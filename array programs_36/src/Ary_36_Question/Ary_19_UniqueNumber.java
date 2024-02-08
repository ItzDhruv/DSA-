package Ary_36_Question;
import java.util.Scanner;

public class Ary_19_UniqueNumber {

        public static void main(String[] args)
        {
            System.out.println("Enter number : ");
                                                                                          //o(n)
                    int arr[]={1,4,4,1,8,2,8};
                    int cont=0;
                    Scanner sc=new Scanner(System.in);
                    int v=sc.nextInt();

                    boolean flag=false;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==v) {
                        cont++;
                    }
                }
                        for(int i=0;i<arr.length;i++){

                            if(arr[i]==v){

                                if(flag==true){
                                    System.out.println("not unique");
                                    return;
                                }
                                else{
                                    flag=true;
                                }
                        }
                    }
                    if(cont<=0)
                    {
                        System.out.println("Not valid value.");
                        return;
                    }
                    System.out.println("unique");
                  }
            }


