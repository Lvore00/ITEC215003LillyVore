/**
 * class:  add class name here
 * name: add your name
 * date: add the date you complete
 * version: 1.2
 * description: please provide information about this program.
 */
public class PrimitiveParameters {
    public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.printf("Before incorrectSwap: a=%d, b=%d\n", a, b);
        incorrectSwap(a, b);
      //  System.out.printf("After incorrectSwap: a=%d, b=%d\n", a, b);
    }

    public static void incorrectSwap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.printf("After incorrectSwap: a=%d, b=%d\n", a, b);

    }
}
