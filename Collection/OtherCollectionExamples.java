import java.util.function.Predicate;
import java.util.*;
class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}


class LongProductNames implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getName().length() > 3;
    }
}


public class OtherCollectionExamples {
    public static void main(String[] args) {

        List<Product> menu = new ArrayList<>();
        menu.add(new Product("Cake"));
        menu.add(new Product("Tea"));
        menu.add(new Product("Cookie"));

        // ---- 1. Convert List to array ----
        Product[] array = new Product[2];   // smaller than list!
        array = menu.toArray(array);        // creates new bigger array

        System.out.println("Array contents:");
        for (Product p : array) {
            System.out.println(p);
        }

        // ---- 2. Remove products whose name length > 3 ----
        menu.removeIf(new LongProductNames());

        System.out.println("\nAfter removeIf:");
        for (Product p : menu) {
            System.out.println(p);
        }
    }
}
