package Ary_36_Question;

public class Ary_3_oddevenAry {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,6,7,8,9,10};
        int i=0;
        int even = 0;
        while(i<ary.length)
        {
            if(ary[i]%2==0)
            {
                even=ary[i];
                System.out.println("this :"+even);
            }
            else
            {
                System.out.println(ary[i]);
            }


            i++;
        }
        System.out.println(even);
    }
}
