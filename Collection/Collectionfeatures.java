import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Product implements Comparable<Product> {
    String name;
    Product(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Food extends Product {
    Food(String name) {
        super(name);
    }
}

class Drink extends Product {
    Drink(String name) {
        super(name);
    }
}
public class Collectionfeatures {
    public static void main(String[] args) {
    Product p1 = new Food("Cake");
Product p2 = new Drink("Tea");
Product p3 = new Food("Cookie");

List<Product> menu = new ArrayList<>();
menu.add(p1);
menu.add(p2);
menu.add(p3);

Collections.sort(menu);      // sort list
Collections.reverse(menu);   // reverse order

// binarySearch works reliably only on a sorted list; get an index result and then fetch the Product if found
int idx = Collections.binarySearch(menu, p2); // search

Collections.shuffle(menu);   // random shuffle
Collections.fill(menu, new Food("Pie"));        // replace all
System.out.println("Menu contents:");
for (Product p : menu) {

    System.out.println("- " + p.name);
}
System.out.println("Index of Tea: " + idx);
System.out.println("Menu size: " + menu.size());
System.out.println("Is menu empty? " + menu.isEmpty());

}
}