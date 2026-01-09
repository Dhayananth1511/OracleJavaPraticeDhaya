import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // simple hashing
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product p = (Product) obj;
        return this.name.equals(p.name);
    }
}

class Food extends Product {
    Food(String name) {
        super(name);
    }
}

class Drink extends Product {
    Drink(String name) {
        super(name);
    }
}

public class set {
    public static void main(String[] args) {

        Product p1 = new Food("Cake");
        Product p5 = new Food("Cake");
        Product p2 = new Drink("Tea");
        Product p3 = new Drink("Juice");
        Product p4 = new Food("Bread");

        // List with 2 items
        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        // ------- 1. Default HashSet (capacity = 16, load factor = 0.75) -------
        Set<Product> productSet1 = new HashSet<>();
        productSet1.add(p1);
        productSet1.add(p2);
        System.out.println("productSet1: " + productSet1);

        // ------- 2. HashSet with initial capacity = 20 -------
        Set<Product> productSet2 = new HashSet<>(20);
        productSet2.add(p1);
        productSet2.add(p2);
        productSet2.add(p3);
        productSet2.add(p4);
        System.out.println("productSet2: " + productSet2);

        // ------- 3. HashSet from existing list -------
        Set<Product> productSet3 = new HashSet<>(list);
        System.out.println("productSet3: " + productSet3);

        // ------- 4. Unmodifiable Set -------
        Set<Product> productSet4 = Set.of(p1, p2);
        System.out.println("productSet4 (unmodifiable): " + productSet4);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p5));
    }
}
