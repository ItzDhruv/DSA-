package Ary_36_Question;

public class Ary_24_3RD_largest_num_in_Arry {
    public static void main(String[] args) {
        int ary[]={1,23,23,23,32,8,25,39,39,39,40};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<ary.length;i++)
        {

            if(ary[i]>max3) {

                max1 = max2;
                max2 = max3;
                max3 = ary[i];

            }


           if(ary[i]<max3 && ary[i]>max2)
            {
                max2=ary[i];
                max1=max2;
            }
            if(ary[i]<max2 && ary[i]>max1)
            { 
                max1=ary[i];
            }

        }
        System.out.println(max1);
    }
}
