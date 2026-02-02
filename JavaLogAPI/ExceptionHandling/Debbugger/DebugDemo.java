package Debbugger;
// public class TestDebug {

//     static int calculateTotal(int price, int quantity) {
//         int total = price * quantity;   // BUG: quantity may be wrong
//         return total;
//     }

//     public static void main(String[] args) {

//         int price = 100;
//         int quantity = 0;   // ❌ bug: should not be 0

//         int billAmount = calculateTotal(price, quantity);
//         System.out.println("Total Bill = " + billAmount);
//     }
// }
public class DebugDemo {

    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int p = 10;
        int q = 5;

        int s = add(p, q);        // breakpoint here
        int m = multiply(s, 3);

        System.out.println(m);
    }
}
