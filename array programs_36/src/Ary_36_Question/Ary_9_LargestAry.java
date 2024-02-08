package Ary_36_Question;

public class Ary_9_LargestAry {
    public static void main(String[] args) {
        int ary[]={2562,34,56,78,90};
        int max=ary[0];
        for(int i=0;i<ary.length;i++)
        {
        if(max<ary[i])
        {
            max=ary[i];
        }

        }
        System.out.println("Max value is : "+max);

    }
}
