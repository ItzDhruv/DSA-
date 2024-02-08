package Ary_36_Question;

public class Ary_34_Mearge_Arry {
    public static void main(String[] args) {
        int ary1[]={1,2,3,4,5};
        int ary2[]={6,7,8,9,10};
        int merg[]=new int[ary1.length+ary2.length];
        for (int i=0;i< ary1.length;i++)
        {
            merg[i]=ary1[i];
            merg[ary1.length+i]=ary2[i];
        }
        for (int i=0;i< merg.length;i++)
        {
            System.out.print(merg[i]+" ");
        }
    }
}
