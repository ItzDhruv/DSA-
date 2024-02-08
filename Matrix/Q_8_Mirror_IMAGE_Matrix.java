public class Q_8_Mirror_IMAGE_Matrix {
    public static void main(String[] args) {


        int ary[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int colum = ary.length;
        int raw = ary[0].length;
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("  "+ary[i][colum - j - 1]);
            }
            System.out.println("\n");
        }
    }
}