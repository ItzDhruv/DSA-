public class Q_15_Remove_Dublicate_from_string {
    public static void main(String[] args) {
        String s="naman";
     int ary[]=new int[128];
     String ans="";
     for(int i=0;i<s.length();i++)
     {
         int asci=s.charAt(i);
         ary[asci]=ary[asci]+1;

     }
     for(int i=0;i<s.length();i++)
     {
         int asci=s.charAt(i);
         if(ary[asci]>=1)
         {
             ans+=(char)asci;
             ary[asci]=0;
         }
     }
        System.out.println(ans);
    }
}

