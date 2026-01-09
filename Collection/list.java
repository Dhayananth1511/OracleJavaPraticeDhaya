import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
class Product {
    String name;
    Product(String name) {
        this.name = name;
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
public class list {
public static void main(String[] args) {
    List<String> myList = new ArrayList();//default initial capacity is 10 if (1) means capacity is 1 
    System.out.println(myList.size()); 
    myList.add("Apple");
    myList.add(0,"Banana");
    System.out.println(myList.size()); 
   
        // System.out.println(myList.get(0));
        // List<String> anotherList = List.of("One", "Two", "Three");
        // System.out.println(anotherList.size());
        // anotherList.forEach(System.out::println);
        // anotherList.add("Four"); // This will throw UnsupportedOperationException
        // //why? Because List.of() creates an immutable list
    Product p1 = new Food("Cake");
Product p2 = new Drink("Tea");

Set<Product> set1 = new HashSet<>();
set1.add(p1);
set1.add(p1);

List<Product> list1 = new ArrayList<>();
List<Product> list2 = new ArrayList<>(20);
List<Product> list3 = new ArrayList<>(set1);
List<Product> list4 = Arrays.asList(p1, p2);
List<Product> list5 = List.of(p1, p2);
System.out.println("List1 size: " + list1.size());
System.out.println("List2 size: " + list2.size());  
System.out.println("List3 size: " + list3.size());
System.out.println("List4 size: " + list4.size());
System.out.println("List5 size: " + list5.size());
System.out.println("List3 contents:");
for (Product p : list3) {
    System.out.println("- " + p.name);

    }
    
}
}
