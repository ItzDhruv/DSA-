import org.w3c.dom.ls.LSOutput;

public class Q_9_REVERSE_WORD_Internally {
    public static void main(String[] args) {
        String s="yM eman si vurhD";
       s=s.trim();
       String news="";
       String ary[]=s.split(" ");
       for(String i : ary)
       {
         i=  reverse(i);
         news=news+i+" ";
       }
        System.out.println(news);
    }
       public static String reverse(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        return rev;
    }
}
