package Ary_36_Question;

public class Ary_16_AlternetiveAry {
    public static void main(String[] args) {
            int ary []={1,2,3};
            int ary2[]={9,1,0};
            int ary3[]=new int[ary.length*2];
            int cont=0,cont2=1;

            for(int i=0;i<ary.length;i++)
            {
                ary3[cont]=ary[i];
                System.out.println(ary3[cont]);
                ary3[cont2]=ary2[i];
                System.out.println(ary3[cont2]);
                cont=cont+2;
                cont2=cont2+2;
            }
    }
}
