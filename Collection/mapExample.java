import java.util.HashMap;
import java.util.Map;

public class mapExample {
    public static void main(String[] args) {
Product p1 = new Food("Cake");
Product p2 = new Drink("Tea");

Map<Product, Integer> items = new HashMap<>();

items.put(p1, Integer.valueOf(2));    // Insert Cake → 2
items.put(p2, Integer.valueOf(2));    // Insert Tea → 2

Integer n1 = items.put(p1, Integer.valueOf(5)); // Update Cake value
Integer n2 = items.remove(p2);                  // Remove Tea

boolean hasTea = items.containsKey(p2);         // false
boolean hasTwo = items.containsValue(n1);       // true if value 2 exists
Integer quantity = items.get(p1);               // 5
System.out.println("Items size: " + items.size());
System.out.println(items);
System.out.println("n1: " + n1);  // previous value of Cake
System.out.println("n2: " + n2);  // removed value of Tea   
System.out.println("hasTea: " + hasTea);
System.out.println("hasTwo: " + hasTwo);
System.out.println("quantity of Cake: " + quantity);















        Map<String, Integer> map = new HashMap<>(4, 0.75f);
map.put("A", 100);   // ok
map.put("B", 200);   // ok
map.put("C", 300);   // ok

// 4 * 0.75 = 3 → Next insert triggers resize
map.put("D", 400);   // RESIZE -> new capacity = 8
System.out.println(map);
Map<String, Integer> map3 = Map.ofEntries(
    Map.entry("A", 1),
    Map.entry("B", 2),
    Map.entry("C", 3),
    Map.entry("D", 4)
);
System.out.println( map3);
Map<String, Integer> map1 = Map.of(  "A", 1,"B", 2, "C", 3, "D", 4);
System.out.println( map1);

    }
}
