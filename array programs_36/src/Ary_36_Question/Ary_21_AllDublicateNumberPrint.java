package Ary_36_Question;                                    // O(n2)

public class Ary_21_AllDublicateNumberPrint {
    public static void main(String[] args) {

        int ary[]={1,2,2,3,4,5,3,4,5,1,6,7,8};              // 3 value same hoi to 3 vaar print thai 6.
for(int i=0;i<ary.length;i++)
    for(int j=i+1;j<ary.length;j++)
    {
      if(i!=j)
      {
          if(ary[i]==ary[j])
          {
              System.out.print(" "+ary[i]);
          }
      }
    }
}

    }
