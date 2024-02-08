public class Q_5_Upadate_String_without_using_replace {
    public static void main(String[] args) {
        String s= "numun";
        char ary[]=s.toCharArray();
              char c='a';
              String s2="";
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)=='u')
          {
        ary[i]=c;

          }
          s2+=ary[i];
      }
        System.out.println(s2);

    }
}
