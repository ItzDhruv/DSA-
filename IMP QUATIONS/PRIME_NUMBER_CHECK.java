import java.util.ArrayList;

public class PRIME_NUMBER_CHECK {
    public static void main(String[] args) {
        int n=4;  // find prime element between 1 to 10
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i==2)
            {
                count++;
            }
            for(int j=2;j<=Math.sqrt(i);j++)
            {

                if(i%j==0)
                {
                }
                else {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
//2,3,5,7,