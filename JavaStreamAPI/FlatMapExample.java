import java.util.*;
import java.util.stream.Stream;

class Order {
    List<String> items;

    Order(List<String> items) {
        this.items = items;
    }

    Stream<String> items() {
        return items.stream();
    }
}

public class FlatMapExample {
    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order(List.of("Tea", "Cake")),
            new Order(List.of("Coffee", "Tea"))
        );

        orders.stream()
            .flatMap(order -> order.items())
            .filter(item -> item.equals("Tea"))
            .forEach(System.out::println);
    }
}