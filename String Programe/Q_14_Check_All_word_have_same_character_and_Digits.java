public class Q_14_Check_All_word_have_same_character_and_Digits {
    public static void main(String[] args) {
       String s1="Dhruv12234";
       String s2="Deepu5987";
       int s1digit=0,s1char=0;
       int s2digit=0,s2char=0;
       if(s1.length()!=s2.length())
       {
           System.out.println("Not same...........");
           return;
       }
       for(int i=0;i<s1.length();i++)
       {
           int asci1=s1.charAt(i);

           if(asci1>64&&asci1<90   ||  asci1>96&&asci1<123)
           {
               s1digit++;
           }
           else
           {
               s1char++;
           }


       }
        for(int i=0;i<s1.length();i++)
        {
            int asci2=s2.charAt(i);
            if(asci2 >64&&asci2<90   ||  asci2>96&&asci2<123)
            {
                s2digit++;
            }
            else
            {
                s2char++;
            }
        }
        if(s1digit==s2digit && s1char==s2char)
        {
            System.out.println("Equale char Digits");
        }
        else {
            System.out.println("Char and digits are not Equale");
        }
    }
}
