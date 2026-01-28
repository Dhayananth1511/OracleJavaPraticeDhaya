import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;

class Product {
    String name;
    BigDecimal price;

    Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() { return price; }

    public String getName() { return name; }

    public String toString() {
        return name + " : " + price;
    }
}

public class FilterExample {
    public static void main(String[] args) {

        List<Product> list = List.of(
            new Product("Cake", BigDecimal.valueOf(2.99)),
            new Product("Tea", BigDecimal.valueOf(1.99)),
            new Product("Coffee", BigDecimal.valueOf(3.99))
        );

        Predicate<Product> cheap =
            p -> p.getPrice().compareTo(BigDecimal.valueOf(3)) < 0;

        Predicate<Product> isTea =
            p -> p.getName().equals("Tea");

        // default methods: and(), or(), negate()
        list.stream()
            .filter(cheap.and(isTea.negate()))
            .forEach(System.out::println);

        // static method: isEqual()
        list.stream()
            .filter(Predicate.isEqual(
                new Product("Tea", BigDecimal.valueOf(1.99))))
            .forEach(System.out::println);
    }
}