public class Basic_about_sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hellow");
        System.out.println(sb);
        sb.setCharAt(1,'o');  // for changing particular character
        sb.insert(4,'x');      // for inserting charcter in string
        sb.append(" Dhruv");        // for adding word in last
        System.out.println(sb);
    }
}
