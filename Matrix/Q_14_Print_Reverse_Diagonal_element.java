public class Q_14_Print_Reverse_Diagonal_element {
    public static void main(String[] args) {
        int ary[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int raw=ary.length;
        for(int i=0;i<raw;i++)
        {
            System.out.println(ary[i][raw-i-1]);
        }
    }
}
