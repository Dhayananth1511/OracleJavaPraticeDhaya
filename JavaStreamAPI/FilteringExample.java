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
    LocalDate getDate() { return date; }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return items.toString();
    }
}
public class FilteringExample {
    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order("Joe", LocalDate.of(2018,11,21),
                List.of("Tea")),
            new Order("Bob", LocalDate.of(2018,11,22),
                List.of("Coffee")),
            new Order("Joe", LocalDate.of(2018,11,22),
                List.of("Cake"))
        );

        Map<String, Set<Order>> customerOrdersOnDate =
            orders.stream()
                .collect(Collectors.groupingBy(
                    o -> o.getCustomer(),
                    Collectors.filtering(
                        o -> o.date.equals(LocalDate.of(2018,11,22)),
                        Collectors.toSet()
                    )
                ));

        System.out.println(customerOrdersOnDate);
    }
}