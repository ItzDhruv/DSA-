import java.util.*;

class checkk
{
    public static void main(String[] args) {
       int nums[]={8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            if(i%2==0) {

                if (!hm.containsKey(i)) {
                    hm.put(i, 1);
                }
                else
                {
                    hm.put(i, hm.get(i) + 1);
                }
            }
        }
        int hifreq=-1;
        int maxval=-1;
        for(Map.Entry<Integer,Integer> me: hm.entrySet())
        {
            int x =  me.getValue();
            if(x>hifreq)
            {
                maxval= me.getKey();
                hifreq=x;
            }
        }
        int multipleeven = Collections.max(hm.values());
        if(multipleeven>1) {
            System.out.println(maxval);
            return;
        }
        Arrays.sort(nums);
        for(int i:nums)
        {
            if(i%2==0) System.out.println(maxval); return;
        }
        System.out.println(maxval);
    }
}