import java.util.*;
import java.util.function.Predicate;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " " + price;
    }
}

public class PredicateExample {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Cake", 50));
        list.add(new Product("Tea", 20));
        list.add(new Product("Coffee", 40));

        // Predicate 1: price < 40
        Predicate<Product> cheap =
                p -> p.price < 40;

        // Predicate 2: name starts with C
        Predicate<Product> startsWithC =
                p -> p.name.startsWith("C");

        // and()
        list.removeIf(cheap.and(startsWithC));
        System.out.println(list);

        // negate()
        list.removeIf(cheap.negate());
        System.out.println(list);
    }
}
