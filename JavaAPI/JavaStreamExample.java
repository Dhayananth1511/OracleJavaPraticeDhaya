
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
class Product {
    private String name;
    private double price;
    private double discount;
    private java.time.LocalDate bestBefore;

    public Product(String name, double price, double discount, java.time.LocalDate bestBefore) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.bestBefore = bestBefore;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public java.time.LocalDate getBestBefore() {
        return bestBefore;
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
        this.price = this.price * (1 - discount);
    }
}

public class JavaStreamExample {

    public static void main(String[] args) {

        // Source collection
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        // Stream processing
        list.stream()          // create stream
            .filter(x -> x > 10)      // intermediate operation
            .map(x -> x * 2)          // intermediate operation
            .forEach(x -> System.out.println(x + ":" + Thread.currentThread().getName()));           // terminal operation
        list.stream().parallel()
            .forEachOrdered(x -> System.out.println(x + ":" + Thread.currentThread().getName()));

        IntStream.generate(() -> (int)(Math.random() * 10)).parallel()
         .limit(5)
         
         .forEachOrdered(x-> System.out.println(x + ":" + Thread.currentThread().getName()));
         
         Stream.iterate(1,n->n+1).parallel()
         .limit(5)
         .forEachOrdered(n->System.out.println(n ));
    List<Product> list1 = List.of(
        new Product("Product1", 100.0, 0, java.time.LocalDate.now().plusDays(10)),
        new Product("Product2", 200.0, 0.15, java.time.LocalDate.now().plusDays(5)),
        new Product("Product3", 150.0, 0, java.time.LocalDate.now().plusDays(20)));
     list1.stream()
    .filter(p -> p.getDiscount() == 0)
    .peek(p -> p.applyDiscount(0.1))
    .forEach(d -> System.out.println("Name : "+ d.getName() + ", Discount : " + d.getDiscount()+ ", Best Before : " + d.getBestBefore()+ ", Price : " + d.getPrice()));
    

    int sum = Stream.of("ONE", "TWO", "THREE", "FOUR")
    .mapToInt(s -> s.length())   // ToIntFunction<String>
    .peek(i -> System.out.println(i)) // IntConsumer
    .filter(i -> i > 3)          // IntPredicate
    .peek(i -> System.out.println(i))
    .sum();       
    System.out.println(sum);               // IntStream terminal

    }
}
// A parallel stream divides data into multiple parts and processes them concurrently using multiple threads to improve performance.