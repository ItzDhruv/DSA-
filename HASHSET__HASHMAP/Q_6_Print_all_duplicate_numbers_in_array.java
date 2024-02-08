import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q_6_Print_all_duplicate_numbers_in_array {
    public static void main(String[] args) {
        int ary[]={1,3,5,7,8,92,3,5,5,10,777,7,777};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : ary)
        {
            if(hm.get(i)==null)
            {
                hm.put(i,1);
            }
            else {
                hm.put(i,hm.get(i)+1);
            }
        }


        for(Map.Entry<Integer,Integer> h : hm.entrySet())
        {
           if(h.getValue()>1)
           {
               System.out.println(h.getKey());
           }
        }
    }
}
