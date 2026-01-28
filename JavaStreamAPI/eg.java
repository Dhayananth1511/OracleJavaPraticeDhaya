import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
class Product {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
class Food extends Product {
    public Food(String name, BigDecimal price) {
        super(name, price);
    }
}
class Drink extends Product {
    public Drink(String name, BigDecimal price) {
        super(name, price);
    }
}
public class eg {

    public static void main(String[] args) {
        Product p1 = new Food("Cake", BigDecimal.valueOf(3.10));
Product p2 = new Drink("Tea", BigDecimal.valueOf(1.20));

Map<Product, Integer> items = new HashMap<>();
items.put(p1, Integer.valueOf(1));
items.put(p2, Integer.valueOf(3));

items.forEach((p, q) ->
   
    System.out.println(p.getName() + ": " + p.getPrice() + " x " + q + " = " + p.getPrice().multiply(BigDecimal.valueOf(q.intValue())))
    );
    }
}// here for each use BIconsumer in map
