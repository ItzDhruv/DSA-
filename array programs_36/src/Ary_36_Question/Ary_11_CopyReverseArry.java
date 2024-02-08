package Ary_36_Question;

public class Ary_11_CopyReverseArry {
    public static void main(String[] args) {
        int ary[]={1,2,3,45,5,6};
        int ary2[]=new int[ary.length];

        int i=ary.length-1;
        int count=0;
        while(i>=0)
        {
         ary2[count]=ary[i];
            i--;
            System.out.println(ary2[count]);
            count++;
        }
    }
}
