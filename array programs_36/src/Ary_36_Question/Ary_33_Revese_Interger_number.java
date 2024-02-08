package Ary_36_Question;

public class Ary_33_Revese_Interger_number {
    public static void main(String[] args) {
        int i=1256;
        int r=0;
        while(i>0) {
            int j = i % 10;
            i=i/10;
            r=(r*10)+j;
        }
        System.out.println(r);
    }
}
