package Ary_36_Question;

public class Ary_30_1_missing_num {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,7};
int sum=0;
int n=7;
        for(int i=0;i<ary.length;i++)
        {
            sum=sum+ary[i];
        }
     int sum2=(n*(n+1) )/2;
        System.out.println("Your missing number is : "+(sum2-sum));
    }
}
