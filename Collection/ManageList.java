import java.util.ArrayList;
import java.util.List;
class Product {
    String name;
    Product(String name) {
        this.name = name;
    }
    public void setName(String string) {
        this.name = string;
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
public class ManageList {
    public static void main(String[] args) {
        Product p1 = new Food("Cake");
Product p2 = new Drink("Tea");
List<Product> menu = new ArrayList<>();

menu.add(p1);     // insert first element
menu.add(p2);     // insert second
menu.add(p2);     // insert second
// menu.add(2, null);  insert null at index 2
menu.add(3, p1);   // insert Cake again at index 3
menu.add(2, p1);   // insert Cake at index 2
menu.set(2, p2);   // replace index 2 with Tea
menu.remove(0);    // remove element at index 0
menu.remove(p2);   // remove object p2 from list
boolean hasTea = menu.contains(p2);
int index = menu.indexOf(p1);
menu.get(index).setName("Cookie");
// menu.add(4, p2);   // throws exception - IndexOutOfBoundsException
System.out.println("Menu size: " + menu.size());
System.out.println("Menu contents:");
for (Product p : menu) {
    System.out.println("- " + p.name);

    }

}
}
