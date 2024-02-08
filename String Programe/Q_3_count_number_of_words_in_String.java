public class Q_3_count_number_of_words_in_String {
    public static void main(String[] args) {
        String s="  my name is dhruv   ";
        int count=0;
        s=s.trim();  // for removing extra sapace right and backside
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
              count++;
            }
        }
        System.out.println(count+1);
    }
}
