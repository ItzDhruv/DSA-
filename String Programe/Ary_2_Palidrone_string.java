public class Ary_2_Palidrone_string {
    public static void main(String[] args) {
        String s= "namannvg";

        // ------------------Simple Trick------------------------//
//        char ary[]=s.toCharArray();
//        String s2="";
//        for(int i= ary.length-1;i>=0;i--)
//        {
//            s2+=ary[i];
//        }
//        s=s2;
//        System.out.println(s);


        //--------------------Two Pointer----------------------//
        int left=0;
        int right=s.length()-1;
        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true );
    }
}
