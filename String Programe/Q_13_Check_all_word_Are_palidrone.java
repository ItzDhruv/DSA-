public class Q_13_Check_all_word_Are_palidrone {
    public static void main(String[] args) {
        String s="naman lol";
        String ary[]=s.split(" ");
        boolean flag = true;
        for(int i=0;i<ary.length;i++) {
            if (check(ary[i], flag) == true) {
continue;
            }
            else {
                System.out.println("not palidrone");
                return;
            }

        }
        System.out.println("palidrine");
    }

    private static Boolean check(String s,boolean flag) {
        int left=0;
        int right=s.length()-1;
       while(left<right)
       {
           if(s.charAt(left)==s.charAt(right))
           {
               left++;
               right--;
               continue;
           }
           else {
flag=false;
return flag;
           }
       }
       flag =true;
       return flag;
    }

}
