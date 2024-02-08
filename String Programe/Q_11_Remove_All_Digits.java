public class Q_11_Remove_All_Digits {
    public static void main(String[] args) {
        String s="6H9y8 %&D4H5R54U.V";
        String news ="";

        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i);
            if(x==32 || x>64 && x<91 || x>96 && x<123)    // 32 is for Space
            {
                news=news+s.charAt(i);
            }

        }
        System.out.println(news);
    }
}
