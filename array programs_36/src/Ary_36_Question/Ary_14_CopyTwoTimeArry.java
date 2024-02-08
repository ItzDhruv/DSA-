package Ary_36_Question;

public class Ary_14_CopyTwoTimeArry {
    public static void main(String[] args) {
        int ary[]={1,2,2,2,5,6};
        int ary2[]=new int[ary.length*2];

           for(int j=0;j<ary.length*2-1;j++)
           {
               if(j<ary.length) {
                   ary2[j] = ary[j];
               }
               else {
                   ary2[j ] = ary[(j / 2)];
               }
        System.out.print(" "+ary2[j]);
        }
    }

}
