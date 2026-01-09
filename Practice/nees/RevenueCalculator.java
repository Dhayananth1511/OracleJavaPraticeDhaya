import java.util.*;
class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class RevenueCalculator {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
            new Item("Laptop", 50000, 2),
            new Item("Mouse", 500, 5),
            new Item("Keyboard", 1500, 3)
        );

        double totalRevenue = items.stream()
                                   .map(item -> item.price * item.quantity)
                                   .reduce(0.0, (a, b) -> a + b);

        System.out.println(totalRevenue);
    }
}
