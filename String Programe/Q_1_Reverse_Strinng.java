public class Q_1_Reverse_Strinng {
    public static void main(String[] args) {
        String s = "Dhruv";
       char ary[]=s.toCharArray();
        String s2 =new String("") ;
     for(int i=s.length()-1;i>=0;i--)
     {
     s2+=ary[i];

     }

        System.out.println(s2);
    }
}
