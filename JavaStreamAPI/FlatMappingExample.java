import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;
class Order {
    String customer;
    LocalDate date;
    List<String> items;

    Order(String c, LocalDate d, List<String> i) {
        customer = c; date = d; items = i;
    }
    String getCustomer() { return customer; }
    Stream<String> getItems() { return items.stream(); }
}

public class FlatMappingExample {
    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order("Joe", LocalDate.of(2018,11,21),
                List.of("Tea","Cake")),
            new Order("Bob", LocalDate.of(2018,11,21),
                List.of("Coffee")),
            new Order("Joe", LocalDate.of(2018,11,22),
                List.of("Coffee","Cake"))
        );

        Map<String, Set<String>> customerProducts =
            orders.stream()
                .collect(Collectors.groupingBy(
                    o -> o.getCustomer(),
                    Collectors.flatMapping(
                        o -> o.getItems(),
                        Collectors.toSet()
                    )
                ));

        System.out.println(customerProducts);
    }
}