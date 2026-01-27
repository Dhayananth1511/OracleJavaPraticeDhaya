import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;

class Product {
    private String name;
    private BigDecimal price;
    private BigDecimal discount;
    private LocalDate bestBefore;

    Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.discount = BigDecimal.ZERO;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setBestBefore(LocalDate date) {
        this.bestBefore = date;
    }

    @Override
    public String toString() {
        return name +
               " | price=" + price +
               " | discount=" + discount +
               " | bestBefore=" + bestBefore;
    }
}

public class StreamConsumerExample {

    public static void main(String[] args) {

        List<Product> list = Arrays.asList(
            new Product("Cake", BigDecimal.valueOf(15)),
            new Product("Tea", BigDecimal.valueOf(8)),
            new Product("Coffee", BigDecimal.valueOf(12))
        );
        System.out.println(list);
        List<Product> list2 = list.stream()
                            .peek(p -> p.setBestBefore(LocalDate.now().plusDays(2)))
                            .peek(p->p.setDiscount(BigDecimal.valueOf(0.20)))
                             .toList();
        System.out.println(list);
        System.out.println(list2);
        
        // -------------------------------
        // Consumer definitions
        // -------------------------------

        Consumer<Product> expireProduct =
            p -> p.setBestBefore(LocalDate.now().plusDays(1));

        Consumer<Product> discountProduct =
            p -> p.setDiscount(BigDecimal.valueOf(0.10));
            Consumer<Product> discountProduct1 =
            p -> p.setDiscount(BigDecimal.valueOf(0.50));

        // -------------------------------
        // Example 1: forEach + andThen
        // -------------------------------
        System.out.println(list);
        System.out.println("=== forEach with andThen ===");

        list.stream()
            .forEach(expireProduct.andThen(discountProduct));

        list.forEach(System.out::println);
        System.out.println(list);

        // -------------------------------
        // Example 2: peek + filter + forEach
        // -------------------------------

        System.out.println("\n=== peek + filter + forEach ===");

        list.stream()
            .peek(expireProduct) // intermediate action
            .filter(p -> p.getPrice()
                .compareTo(BigDecimal.valueOf(10)) > 0)
            .forEach(discountProduct1); // terminal action

        list.forEach(System.out::println);

        // -------------------------------
        // Example 3: parallelStream + forEach
        // -------------------------------

        System.out.println("\n=== parallelStream + forEach (order NOT guaranteed) ===");

        list.parallelStream()
            .forEach(p ->
                System.out.println(
                    Thread.currentThread().getName() + " : " + p
                )
            );

        // -------------------------------
        // Example 4: parallelStream + forEachOrdered
        // -------------------------------

        System.out.println("\n=== parallelStream + forEachOrdered (order guaranteed) ===");

        list.parallelStream()
            .forEachOrdered(p ->
                System.out.println(
                    Thread.currentThread().getName() + " : " + p
                )
            );
    }
}
