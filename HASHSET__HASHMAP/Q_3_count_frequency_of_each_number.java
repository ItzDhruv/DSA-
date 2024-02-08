import java.util.HashMap;

public class Q_3_count_frequency_of_each_number {
    public static void main(String[] args) {
        int ary[] = { 10, 5, 10, 15, 10, 5, 5, 23 };
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : ary) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);         // jo element pelethi hse to 1 add krsu
            } else {
                h.put(i, 1);                    // jo element no hoi and peli vaar ave to 1 nakhsu paci 1 1 plus thato rehse
            }
        }
        for (HashMap.Entry<Integer, Integer> hm : h.entrySet()) {
            System.out.println(hm.getKey() + " : " + hm.getValue());
        }
    }
}
