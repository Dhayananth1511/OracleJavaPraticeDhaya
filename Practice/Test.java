// File: Test.java
// File: Product.java
 class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Overriding equals() method
   
    public boolean equals(Object obj) {
        // 1️⃣ If both references point to the same object
        if (this == obj) {
            return true;
        }

        // 2️⃣ If obj is not of type Product
        if (!(obj instanceof Product)) {
            return false;
        }

        // 3️⃣ Typecast and compare meaningful fields
        Product other = (Product) obj;
        return this.id == other.id;  // equality based on product id
    }

    // Optional: toString() for better display
    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(42, "Cake", 2.99);
        Product p2 = new Product(42, "Cake", 2.99);
        Product p3 = new Product(43, "Juice", 3.99);

        // Reference comparison (checks memory location)
        boolean sameObject = (p1 == p2);

        // Content comparison (uses equals method)
        boolean sameContent1 = p1.equals(p2);
        boolean sameContent2 = p1.equals(p3);

        // Display
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println();

        System.out.println("p1 == p2 ➜ " + sameObject);         // false
        System.out.println("p1.equals(p2) ➜ " + sameContent1);  // true
        System.out.println("p1.equals(p3) ➜ " + sameContent2);  // false
    }
}

