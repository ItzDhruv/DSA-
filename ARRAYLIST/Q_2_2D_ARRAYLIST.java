import java.util.ArrayList;

public class Q_2_2D_ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> menu = new ArrayList<>();
        ArrayList<Integer> prize=new ArrayList<>();
        prize.add(20);
        prize.add(30);
        ArrayList<String> item =new ArrayList<>();
        item.add("vadapav");
        item.add("panipuri");
        ArrayList<String> itemprize =new ArrayList<>();
        itemprize.add("20");
        itemprize.add("10");
        menu.add(item);
        menu.add(itemprize);
        int index = 0;

        for(ArrayList<String> i : menu)
        {
            System.out.println(i.get(1));

        }
    }
}
