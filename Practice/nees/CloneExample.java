// Example of using Cloneable interface

import java.util.Arrays;

class Product implements Cloneable {
    String name;
    double price;

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Overriding the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Call Object class clone() method
        return super.clone();
    }
}

public class CloneExample {
    public static void main(String[] args) {
        // try {
        //     // Create an object
        //     Product p1 = new Product("Tea", 50.0);

        //     // Clone the object
        //     Product p2 = (Product) p1.clone();

        //     // Display both objects
        //     System.out.println("Original Object:");
        //     System.out.println("Name: " + p1.name + ", Price: " + p1.price);

        //     System.out.println("\nCloned Object:");
        //     System.out.println("Name: " + p2.name + ", Price: " + p2.price);

        //     // Verify if both objects are different
        //     System.out.println("\nAre both objects same? " + (p1 == p2));

        // } catch (CloneNotSupportedException e) {
        //     System.out.println("Cloning not allowed for this object!");
        // }
//         char[] a1 = {'a', 'c', 'm', 'e','l'};
// char[] a2 = {'t', 'o', 'm', 'e', 'r','_'};

// System.arraycopy(a1, 1, a2, 1, 5 - 1);
// // System.out.println(a2);  // Output: to_me
// char[] b1 = {'a', 'c', 'm', 'e'};
// char[] b2 = Arrays.copyOfRange(b1, 1,4);
// // System.arraycopy(b1, 0, b2, 4, 4 );
// System.out.println(b2);  
String[] values = new String[5];
Arrays.fill(values, 2, 4, "aaa");
int x = Arrays.binarySearch(values, , 4, null);
System.out.println(x);
    }
}
