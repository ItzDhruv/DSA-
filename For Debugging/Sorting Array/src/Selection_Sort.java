import java.util.Arrays;
public class Selection_Sort {
    public static void main(String[] args) {
        int ary[] = {9, 8, 7, 5, 9, 7, 12, 5, 1, 10, 6};
        for (int i=0; i < ary.length-1; i++) {
            int min=i;
        for(int j=i+1;j<ary.length;j++)
        {
            if(ary[j]<ary[min])
            {
                min=j;
            }
        }
        if(min!=i)
        {
            int temp=ary[min];
            ary[min]=ary[i];
           ary[i] =temp;
        }
        }
        System.out.println(Arrays.toString(ary));
    }
}
