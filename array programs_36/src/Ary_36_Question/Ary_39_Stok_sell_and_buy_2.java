package Ary_36_Question;

public class Ary_39_Stok_sell_and_buy_2 {
    public static void main(String[] args) {
        // You sell and buy stokes multy time but holds stoke only one.

        int ary[] = {3, 4, 1, 5,3,10,2,34}; // 1   4   7    32   =   44
        int profit=0;
        for (int i = 1; i < ary.length; i++) {
            if(ary[i]>ary[i-1])
            {
                profit=profit+(ary[i]-ary[i-1]);
            }
        }
        System.out.println(profit);
    }
}
