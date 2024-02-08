public class Q_12_Print_Alternetive_String {
    public static void main(String[] args) {
        String s1="kkkk";
        String s2="aaaa";
        String s3="";
        for(int i=0;i<s1.length();i++)
        {
            s3=s3+s1.charAt(i);
            s3=s3+s2.charAt(i);
        }
        System.out.println(s3);
        }
}
