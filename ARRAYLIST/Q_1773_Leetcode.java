import java.util.ArrayList;
import java.util.List;

public class Q_1773_Leetcode {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items= new ArrayList<>();
        String rulekey="name";
        String rulevalue="lenovo";
        ArrayList<String> item =new ArrayList<>();
        item.add("vadapav");
        item.add("panipuri");
        item.add("panipuri");
        ArrayList<String> itemprize =new ArrayList<>();
        itemprize.add("20");
        itemprize.add("10");
        itemprize.add("23");
        ArrayList<String> itemprize2 =new ArrayList<>();
        itemprize2.add("20");
        itemprize2.add("10");
        itemprize2.add("lenovo");
        items.add(item);
        items.add(itemprize);
        items.add(itemprize2);

        int count=0;
        int index=0;
        if(rulekey.equals("color"))
        {
            index=1;
        }
        else if(rulekey.equals("name"))
        {
            index=2;
        }
        for(List<String> i : items)
        {
            if(i.get(index).equals(rulevalue))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
