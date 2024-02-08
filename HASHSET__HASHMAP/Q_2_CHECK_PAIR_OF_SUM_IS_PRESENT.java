import java.util.HashSet;

public class Q_2_CHECK_PAIR_OF_SUM_IS_PRESENT {
    public static void main(String[] args) {
        int ary[]={1,2,4,5,7,8,9,10};
        HashSet<Integer> hs = new HashSet<>();
        int target=18;
        for(int i=0;i<ary.length;i++)
        {
            hs.add(ary[i]);
        }

        for(int i=0;i<ary.length;i++) {
            int temp = target - ary[i];

            if (hs.contains(temp)) {
                System.out.println("(" + ary[i] + "," + temp + ")");
            }
        }
//        hs.contains()
    }
}
