import java.util.*;

class Product {
    String name;
    Product(String name) { this.name = name; }
    String getName() { return name; }
}

public class ReduceExample {
    public static void main(String[] args) {

        List<Product> list = List.of(
            new Product("Tea"),
            new Product("Coffee"),
            new Product("Cake")
        );

        // 1️⃣ reduce without identity
        Optional<String> r1 =
            list.stream()
                .map(p -> p.getName())
                .reduce((s1, s2) -> s1 + " " + s2);

        System.out.println(r1.get());

        // 2️⃣ reduce with identity
        String r2 =
            list.stream()
                .map(p -> p.getName())
                .reduce("", (s1, s2) -> s1 + " " + s2);

        System.out.println(r2);

        // 3️⃣ parallel reduce with combiner
        String r3 =
            list.stream()
                .parallel()
                .reduce("",
                    (s, p) -> s + p.getName() + " ",
                    (s1, s2) -> s1 + s2);

        System.out.println(r3);
    }
}