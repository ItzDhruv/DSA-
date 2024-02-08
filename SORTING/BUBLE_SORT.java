import java.util.Arrays;

public class BUBLE_SORT {
    public static void main(String[] args) {
        int ary[]={6,3,6,9,3,8,2};
        for(int i=0;i<ary.length;i++)
        {
            for(int j = 0;j< ary.length-i-1;j++)
            {
                if(ary[j+1]<ary[j])
                {
                    int temp = ary[j+1];
                    ary[j+1]=ary[j];
                    ary[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ary));
    }
}
