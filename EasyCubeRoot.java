// class Test {
//     static int count = 0;
//     Test() {
//         count++;//2
//         // System.out.println(count);
//     }

    
// }
// public class Count {
// public static void main(String[] args) {
//     new Test();
//     new Test();
//     new Test();
//     System.out.println(Test.count);
//     int a[]=new int[0];
//     System.out.println(a.length);
// }
    
// }
import java.util.Scanner;

class EasyCubeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = Math.abs(n); // work with positive value first
        int i = 1;

        // find cube root by incrementing i
        while (i * i * i < num) {
            i++;
        }

        if (i * i * i == num) {
            // adjust for negative numbers
            if (n < 0) i = -i;
            System.out.println(n + " is a Perfect Cube. Cube root = " + i);
        } else {
            System.out.println(n + " is NOT a Perfect Cube");
        }
    }
}