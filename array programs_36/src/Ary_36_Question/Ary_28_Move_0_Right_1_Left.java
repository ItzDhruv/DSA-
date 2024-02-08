package Ary_36_Question;

public class Ary_28_Move_0_Right_1_Left {
    public static void main(String[] args) {
        int ary[]={0,1,0,1,0,0,1,0,0,1,1};
        int f=0;
        int l=ary.length-1;
        int i=0;
        while(f<l)
        {
            if(ary[f]==0)
            {
                f++;
            }
            else if(ary[l]==1)
            {
                l--;
            }
            else {
                int temp;
                temp=ary[f];
                ary[f]=ary[l];
                ary[l]=temp;
            }
            i++;
        }
        for(int j=0;j<ary.length;j++)
        {
            System.out.print(" "+ary[j]);
        }
    }
}
