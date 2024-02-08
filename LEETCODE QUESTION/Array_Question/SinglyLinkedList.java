package Array_Question;

class s
{
    public static void main(String[] args) {
       String s = "is2 sentence4 This1 a3";
       String []ary = s.split(" ");
       String []ans = new String[ary.length];

 for(String i : ary)
 {
   int asci =  i.charAt(i.length()-1)-49;
ans[asci]=i.substring(0,i.length()-1);
 }
 String join = "";
 for(String i : ans)
 {
     join=join+i+" ";
 }
        System.out.println(join);
    }
}