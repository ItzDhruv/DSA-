package Ary_36_Question;

public class Ary_1_sumofary {
    public static void main(String[] args) {


        int ary[] = {1, 2, 3, 4, 5};
        int i = 0;
        int j = 0;
        while (i < ary.length) {
            j = ary[i] + j;
            i++;
        }
        System.out.println(j);
    }
}