package Ary_36_Question;

import java.util.Arrays;

class x {
    public static void main(String[] args) {
        int ary[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;
        k = k % ary.length;
        int temp[] = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            temp[i] = ary[i];
        }
        int index = 0;
        for (int i = k; i < ary.length; i++) {
            ary[index++] = temp[i];
        }
        for (int i = 0; i < k; i++) {
            ary[index++] = temp[i];
        }
        System.out.println(Arrays.toString(ary));
    }
}