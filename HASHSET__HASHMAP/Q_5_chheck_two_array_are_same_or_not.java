import java.util.HashSet;

public class Q_5_chheck_two_array_are_same_or_not {
    public static void main(String[] args) {

        int ary1[]={1,3,4,5,6,21};
        int ary2[]={21,4,5,6,3,21};

        if(ary1.length!=ary2.length )
        {
            System.out.println(false);
            return;
        }

        HashSet<Integer> hs = new HashSet<>();

        for (int i : ary1)
        {
hs.add(i);
        }

        for(int i : ary2)
        {
            if(!hs.contains(i))
            {
                System.out.println("Note same");
                return;
            }
        }
        System.out.println("Same");
    }
}
