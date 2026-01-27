import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product2 {
    String name;
    LocalDate bestBefore;
    Product2(String n, LocalDate d) {
        name = n; bestBefore = d;
    }
    String getName() { return name; }
    LocalDate getBestBefore() { return bestBefore; }
    public String toString() { return bestBefore.toString(); }
}

public class GroupingExample {
    public static void main(String[] args) {

        List<Product2> list = List.of(
            new Product2("Tea", LocalDate.of(2024,3,7)),
            new Product2("Cake", LocalDate.of(2024,3,7)),
            new Product2("Coffee", LocalDate.of(2024,3,14)),
            new Product2("Cake", LocalDate.of(2024,3,7))
        );

        Map<String, List<Product2>> productGroups =
            list.stream()
                .collect(Collectors.groupingBy(
                    p -> p.getName()
                ));

        System.out.println(productGroups);
    }
}