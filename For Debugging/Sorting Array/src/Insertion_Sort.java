import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion_Sort {


        public static void main(String[] args) {
        int ary[]={1,2,3,4,0};
            int temp,j;

        for(int i=1;i<ary.length;i++)
        {
                temp =ary[i];

         for(j=i;j>0&&ary[j-1]>temp;j--)
            {
                ary[j]=ary[j-1];
            }
            ary[j]=temp;
            }

            System.out.print(Arrays.toString(ary));
        }
    }
