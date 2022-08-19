public class PrimitiveParameters {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Before incorrectSwap: a=%d, b=%d\n", a, b);
        incorrectSwap(a, b);
        System.out.println("After incorrectSwap: a=%d, b=%d\n", a, b);  // Corrections: d and n are not mentioned in the code, printf is changed to println
    }

    public static void incorrectSwap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        
    }
}
