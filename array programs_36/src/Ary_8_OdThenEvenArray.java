public class Ary_8_OdThenEvenArray {
    public static void main(String[] args) {
        int ary[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int even = 0;
//        System.out.println("This is Even : ");
        while (i < ary.length) {
            if (ary[i] % 2 == 0) {

                System.out.print(" "+ary[i]);
            }
            i++;
        }
//        System.out.println("This is Odd : ");
        int j=0;
        while (j < ary.length) {
            if (ary[j] % 2 == 1)
            {
                System.out.print(" "+ary[j]);
            }
            j++;
        }
    }
}
