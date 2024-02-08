package Ary_36_Question;

public class Ary_25_Segregate_Even_Odd_num_Array {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,6,7,8,9,10};
        int f=0;
        int l=ary.length-1;
        int temp;
        for(int i=0;i<ary.length;i++)
        {
           if(ary[f]%2!=0)
           {
               f++;
               System.out.println(f);
           } else if (ary[l]%2==0)
           {
           l--;
           }
           else {
               temp=ary[f];
               ary[f]=ary[l];
               ary[l]=temp;
           }
        }
        for(int i=0;i<ary.length;i++)
        {
            System.out.print(" "+ary[i]);
        }

    }
}
