public class Q_15_Sum_of_DIAGONAl_Element {
    public static void main(String[] args) {
        int ary[][]={{1,2,3,2},
                     {4,5,5,6},
                     {7,8,5,9}
                    ,{2,3,5,6}
        };
        int raw=ary.length;
        int colum=ary[0].length;
        int sum=0;
        for(int i=0;i<raw;i++) {
            sum = sum + ary[i][i];
            if (i != raw - i - 1) {
                sum = sum + ary[i][raw - 1 - i];
            }
        }
        System.out.println(sum);
    }
}
