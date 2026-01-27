import java.text.NumberFormat;
import java.util.*;
import java.util.stream.*;
import java.math.BigDecimal;

class Product {
    BigDecimal price;
    Product(BigDecimal p) { price = p; }
    BigDecimal getPrice() { return price; }
}

public class CollectingAndThenExample {
    public static void main(String[] args) {

        List<Product> list = List.of(
            new Product(BigDecimal.valueOf(10)),
            new Product(BigDecimal.valueOf(20)),
            new Product(BigDecimal.valueOf(30))
        );

        NumberFormat fmt =
            NumberFormat.getCurrencyInstance(Locale.US);

        String result =
            list.stream()
                .collect(Collectors.collectingAndThen(
                    Collectors.averagingDouble(
                        p -> p.getPrice().doubleValue()),
                    avg -> fmt.format(avg)
                ));

        System.out.println(result);
    }
}