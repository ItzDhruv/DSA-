import java.util.HashSet;

public class Q_1_CHECK_SUBSET_OF_ARRAY {

    public static void main(String[] args) {
        int ary1[]={1,2,4,5,7,8,9,10};
        int ary2[]={1,2,48,5};

HashSet<Integer> hs = new HashSet<>();

for(int i=0;i< ary1.length;i++)
{
    hs.add(ary1[i]);
}
for(int i=0;i<ary2.length;i++)
{
    if(!hs.contains(ary2[i]))
    {
        System.out.println("false");
        return;
    }
}
        System.out.println("true");
    }
}
