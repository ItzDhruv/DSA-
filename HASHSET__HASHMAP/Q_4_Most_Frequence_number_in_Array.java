import java.util.HashMap;

public class Q_4_Most_Frequence_number_in_Array {
    public static void main(String[] args) {
        int ary[] = { 10, 95, 10, 15, 10, 5, 5, 23 };

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i : ary) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);
            } else {
                h.put(i, 1);
            }
        }

        int max = 0;
        int maxfreq=0;

        int min=0;
        int minfreq= ary.length;  // ----------> ani jagyaae Integer.max b lai saki bt ary ni lingth krta moti to frequincy hovani nathi

        for (HashMap.Entry<Integer, Integer> hm : h.entrySet()) {
            int count = hm.getValue();
            int element = hm.getKey();

            if(maxfreq<count)
            {
                max=element;
                maxfreq=count;
            }
            if(minfreq>count)
            {
                min = element;
                minfreq=count;
            }

        }
        System.out.println("Minimum frequency : "+min);
        System.out.println("Highest frequency : "+max);
    }
}
