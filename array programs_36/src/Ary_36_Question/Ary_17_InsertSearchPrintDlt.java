package Ary_36_Question;

public class Ary_17_InsertSearchPrintDlt {
    public static void main(String[] args) {


        int ary[] = new int[5];
        int p = 0;

        p = insert(ary, p, 20);           // Insert Value.
        p = insert(ary, p, 20);           // Insert Value.
        p = insert(ary, p, 30);           // Insert Value.
        p = insert(ary, p, 40);           // Insert Value.
        p = insert(ary, p, 50);           // Insert Value.

        System.out.println("Your Arry is : ");
        print(ary,p);                          // Print Value.

        System.out.println("Your Arry after Upadate : ");
        update(ary, p, 20, 10);         // Upadate Value.
        update(ary, p, 50, 80);         // Upadate Value.
        print(ary,p);                           // PrintValue.

        System.out.println(find(ary,p,40));  // Find Value.  40 che Aetle : True.

        p=delete(ary,p,20);                  // Delete Value.
        print(ary,p);                           // PrintValue.

    }




    private static int insert(int[] ary, int p, int value) {
        if(p==ary.length)
        {
            System.out.println("Your ary is full");

        }
        ary[p] = value;
        p++;
        return p;
    }

    private static void update(int[] ary, int p, int old, int neew)
    {
        for (int i = 0; i < p; i++) {
            if (ary[i] == old) {
                ary[i] = neew;
        return;
            }
        }

    }

    private static boolean find(int[] ary, int p, int value) {
        for(int i=0;i<p;i++)
        {
            if(ary[i]==value)
            {
                return true;
            }
        }
        return false;
    }

    private static void print(int[] ary, int p) {
    for (int i=0;i<p;i++)
    {
        System.out.println(ary[i]);
    }
    }

    private static int delete(int[] ary, int p, int delete) {
        for(int i=0;i<p;i++)
        {
           if(ary[i]==delete)
           {
               for(int j=i;j<p-1;j++)
               {
                   ary[j]=ary[j+1];
               }
               p--;
               return p;
           }
        }

        return p;
    }
}
