package Ary_36_Question;

public class Ary_36_INSERT_UPDATE_SEARCH_PRINT_DELETE {
    public static void main(String[] args) {
        int p = 0;
        int ary[]=new int[100];
        p=  insrt(ary,p,10);
        p=  insrt(ary,p,20);
        p=  insrt(ary,p,30);
        p=  insrt(ary,p,40);
        p=  insrt(ary,p,50);
        p=  insrt(ary,p,60);

        update(ary,p,20,200);                            //for update
       p= delete(ary,p,30);
     print(ary,p);
//        System.out.println( sarch(ary,p,10));
    }

    private static int delete(int[] ary, int p, int delete) {
        for(int i=0;i<p;i++) {
            if (ary[i] == delete) {
                for (int j = i; j < p - 1; j++) {
                    ary[j] = ary[j + 1];
                }

                p--;
                return p;
            }
        }
        return p;
    }

    private static void print(int[] ary, int p) {
        for(int i=0;i<p;i++) {
            System.out.println(ary[i]);

        }
    }

    private static boolean sarch(int[] ary, int p, int val) {
        for(int i=0;i<p;i++)
        {
            if(ary[i]==val)
            {
                return true;
            }
        }
        return false;
    }

    private static void update(int[] ary, int p, int old, int neew) {
        for(int i=0;i<=p;i++)
        {
            if(ary[i]==old)
            {
                ary[i]=neew;
            }
        }
        ;
    }

    private static int insrt(int[] ary, int p, int value) {
        if(p== ary.length)
        {
            System.out.println("Your array is full ");
        }
      ary[p]=value;
        p++;
        return p;
    }
}
