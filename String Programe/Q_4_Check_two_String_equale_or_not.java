public class Q_4_Check_two_String_equale_or_not {
    public static void main(String[] args) {
        String s1 = "Dhruv";
        String s2= new String("Dhhuv");
        if(s1.length()!=s2.length())
        {
            System.out.println("Not same");
            return;
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                continue;
            }
            System.out.println("Not same");
           return;
        }
        System.out.println("Same");
    }

}
