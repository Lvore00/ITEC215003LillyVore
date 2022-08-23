public class PrimitiveParameters {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Before incorrectSwap: a=%d, b=%d\n", a, b);
        incorrectSwap(a, b);
        System.out.println("After incorrectSwap: a=%d, b=%d\n", a, b); 
        System.out.println("After incorrectSwap: a=%d, b=%d\n", tmp, tmp2); 
    }

    public static void incorrectSwap(int a, int b) {
        int tmp = a;
        b = tmp;
        int tmp2 = b;
        a = tmp2;
        
    }
}
