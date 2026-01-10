import java.util.*;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - " + price;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Cake", 50));
        list.add(new Product("Tea", 20));
        list.add(new Product("Coffee", 40));
        list.add(null);   // to show null handling

        // 1️⃣ Comparator using lambda (abstract method compare)
        Comparator<Product> sortByName =
                (p1, p2) -> p1.name.compareTo(p2.name);

        Comparator<Product> sortByPrice =
                (p1, p2) -> Integer.compare(p1.price, p2.price);

        // 2️⃣ thenComparing() – default method
        Collections.sort(list,
                Comparator.nullsLast(
                        sortByName.thenComparing(sortByPrice)
                )
        );

        System.out.println("Sorted by name, then price:");
        System.out.println(list);

        // 3️⃣ reversed() – default method
        Collections.sort(list,
                Comparator.nullsLast(sortByName.reversed())
        );

        System.out.println("\nReversed name order:");
        System.out.println(list);

        // 4️⃣ nullsFirst() – static method
        Collections.sort(list,
                Comparator.nullsFirst(sortByName)
        );

        System.out.println("\nNulls first:");
        System.out.println(list);
    }
}
