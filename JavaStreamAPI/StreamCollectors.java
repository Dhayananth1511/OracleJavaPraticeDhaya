
import java.util.*;
import java.util.stream.*;
import java.math.BigDecimal;

class Product {
    String name;
    BigDecimal price;
    Product(String n, BigDecimal p) {
        name = n; price = p;
    }
    String getName() { return name; }
    BigDecimal getPrice() { return price; }
}

public class StreamCollectors {
    public static void main(String[] args) {

        List<Product> list = List.of(
            new Product("Tea", BigDecimal.valueOf(10)),
            new Product("Coffee", BigDecimal.valueOf(20)),
            new Product("Cake", BigDecimal.valueOf(30))
        );

        // summarizing
        DoubleSummaryStatistics stats =
            list.stream()
                .collect(Collectors.summarizingDouble(
                    p -> p.getPrice().doubleValue()));

        System.out.println(stats);

        // mapping + joining
        String names =
            list.stream()
                .collect(Collectors.mapping(
                    Product::getName,
                    Collectors.joining(",")));

        System.out.println(names);

        // toList
        List<Product> expensive =
            list.stream()
                .filter(p -> p.getPrice().intValue() > 15)
                .collect(Collectors.toList());

        System.out.println(expensive.size());
    }
}