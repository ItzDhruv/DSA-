package Ary_36_Question;

public class Ary_10_CopyArray {
    public static void main(String[] args) {
        int []ary={1,2,3,4,5,6,};
        int []ary2=new int [ary.length];
        for(int i=0;i<ary.length;i++)
        {
            ary2[i]=ary[i];
            System.out.print(ary2[i]+"  ");
        }
    }
}
