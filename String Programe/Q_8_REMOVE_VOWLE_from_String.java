public class Q_8_REMOVE_VOWLE_from_String {
    public static void main(String[] args) {
        String s="OpinionxxxxxxxxxxxxxxuxuxuuxuxUAGFVx";
        char ary []= s.toCharArray();
        String s2="";
        for(int i=0;i<ary.length;i++)
        {
                if(ary[i]=='a' || ary[i]=='e' || ary[i]=='i' || ary[i]=='o' || ary[i]=='u' ||ary[i]=='A' || ary[i]=='E' || ary[i]=='I' || ary[i]=='O' || ary[i]=='U' )
                {
                    continue;
                }
                s2+=ary[i];
        }
        System.out.println(s2);
    }
}
