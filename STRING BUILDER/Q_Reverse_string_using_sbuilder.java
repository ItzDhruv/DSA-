public class Q_Reverse_string_using_sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("vurhD wolleH");
      for(int i=0;i< sb.length()/2;i++)
      {
          int first=i;
          int last=sb.length()-i-1;
          char f= sb.charAt(first);
          char l=sb.charAt(last);
          sb.setCharAt(first,l);
          sb.setCharAt(last,f);

      }
        System.out.println(sb);
    }
}
