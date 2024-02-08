package Ary_36_Question;

public class Ary_35_Largest_contiguous_sum {
    public static void main(String[] args) {
        int ary[]={12,2,-23,344,-65,56,56};
int sum=0;
int maxsum=ary[0];
for(int i=0;i< ary.length;i++)
{
    sum=sum+ary[i];
    if(sum>maxsum)
    {
        maxsum=sum;
    }
    if(sum<0)
    {
        sum=0;
    }
}
        System.out.println("Largest subarry sum is : "+maxsum);
    }
}

























