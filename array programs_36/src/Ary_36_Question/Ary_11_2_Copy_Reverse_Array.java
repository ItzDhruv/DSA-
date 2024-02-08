package Ary_36_Question;

public class Ary_11_2_Copy_Reverse_Array {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,6,7};
        int ans[]=new int[ary.length];
        int start=0;
        int end=ary.length-1;
        while(start<=end)
        {
            int temp;
            temp=ary[start];
            ans[start]=ary[end];
            ans[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<ary.length;i++)
        {

            System.out.println(" "+ans[i]);
        }
    }
}
