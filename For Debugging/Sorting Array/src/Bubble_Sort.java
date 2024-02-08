import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int ary[] = {7, 9, 5, 47, 8, 32, 1, 66, 4};
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = 0; j < ary.length - i - 1; j++) {
                if (ary[j + 1] < ary[j]) {
                    int temp = ary[j + 1];
                    ary[j + 1] = ary[j];
                    ary[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ary));
    }
}