package Ary_36_Question;

public class Ary_15_CopyTwiceArry {

        public static void main(String[] args) {
            int ary[]={1,2,3,4,5,6};
            int ary2[]=new int[ary.length*2];
            int cont=0;
            int cont2=1;
        for(int i=0;i<ary.length;i++)
        {
            ary2[cont]=ary[i];
           ary2[cont2]=ary[i];
           cont=cont+2;
           cont2=cont2+2;
        }
        for(int i=0;i<ary.length*2;i++)
        {
            System.out.print(" "+ary2[i]);
        }
        }
    }
