package Ary_36_Question;

public class Ary_38_Stok_sell_and_buy_1 {
    public static void main(String[] args) {

// You sell and buy stokes only one time.
        int ary[] = {3, 4, 1, 5};
        int maxprofit = 0;
        int minvalue = ary[0];
        for (int i = 0; i < ary.length; i++) {
            minvalue = Math.min(minvalue, ary[i]);
            int profit = ary[i] - minvalue;
            maxprofit = Math.max(maxprofit, profit);
        }
        System.out.println(maxprofit);
    }
}