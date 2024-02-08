public class Q_7_Print_Frequency_of_all_elements {
    public static void main(String[] args) {
        String s= "my name is dhruv";
        int ary[]=new int[128];
        for(int i=0;i<s.length();i++)
        {
int asci = s.charAt(i);
ary[asci]=ary[asci]+1;

        }
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]>0)
            {
                System.out.print((char)i+" : "+ary[i]+" || ");
            }
        }
    }
}
