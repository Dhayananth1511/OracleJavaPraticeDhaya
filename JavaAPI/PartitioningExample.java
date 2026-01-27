import java.util.*;
import java.util.stream.*;

abstract class Product {
    String name;
    Product(String n) { name = n; }
    String getName() { return name; }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
}
class Drink extends Product {
    Drink(String n) { super(n); }
}
class Food extends Product {
    Food(String n) { super(n); }
}

public class PartitioningExample {
    public static void main(String[] args) {

        List<Product> list = List.of(
            new Drink("Tea"),
            new Food("Cake"),
            new Drink("Coffee")
        );

        Map<Boolean, List<Product>> productTypes =
            list.stream()
                .collect(Collectors.partitioningBy(
                    p -> p instanceof Drink
                ));

        System.out.println(productTypes);
    }
}