public class Q_10_Find_dublicate_from_String {
    public static void main(String[] args) {
        String s="naman";
        int ary[]= new int[128];
        for(int i=0;i<s.length();i++)
        {
            int ascii=s.charAt(i);
            ary[ascii]=ary[ascii]+1;
        }
        for(int i=0;i<128;i++)
        {
            if(ary[i]>1)
            {
                System.out.println((char)i + " ------ is dublicate and its -----  " + ary[i] +" ---- time in String");
            }
        }
    }
}
