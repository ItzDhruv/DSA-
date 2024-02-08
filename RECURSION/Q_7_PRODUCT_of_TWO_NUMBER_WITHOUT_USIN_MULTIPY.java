public class Q_7_PRODUCT_of_TWO_NUMBER_WITHOUT_USIN_MULTIPY {
    public static void main(String[] args) {
        product(55,4);
    }
    static int product=0;
    private static void product(int x, int y) {
        if(y==0 || x==0)
        {
            System.out.println(product);
            return;
        }
        if(x<y) {
            product = product + y;
            x--;
        }
        else {
            product = product + x;
            y--;
        }
product(x,y);

    }

}
