/**
 * class:  PrimitiveParameters
 * course: Intermediate Programming Sec 03
 * name: Lillian Vore
 * date: 8/23/2022
 * version: 1.2
 * description: Practice Data Swap
 */
public class PrimitiveParameters {
    public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.printf("Before incorrectSwap: a=%d, b=%d\n", a, b);
        incorrectSwap(a, b);
    }

    public static void incorrectSwap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.printf("After incorrectSwap: a=%d, b=%d\n", a, b);

    }
}
