public class Q_6_Sorting_String_character {
    public static void main(String[] args) {
        String s= "zxyuabcd";
        char ch[]=s.toCharArray();
        String s2="";
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=0;j<s.length()-i-1;j++)
            {
                if(ch[j]>ch[j+1])
                {
                    char temp = ch[j+1];
                    ch[j+1]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        for(int i=0;i<s.length();i++)
        {
            s2=s2+ch[i];
        }
        System.out.println(s2);
    }
}
