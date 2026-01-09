import java.util.*;
// https://chatgpt.com/gg/6921b0b9ede88196af45da1f020ffabb
public class Collection
 {
    public static void main(String[] args) {

        // --------------------------
        // 1. Create and Populate HashMap
        // --------------------------
        Map<String, Integer> items = new HashMap<>();

        // put() → insert
        items.put("Cake", 2);
        items.put("Tea", 3);

        // put() → update existing key
        items.put("Cake", 5);   // Cake: 2 → 5

        // --------------------------
        // 2. Access Methods
        // --------------------------
        Integer quantity = items.get("Cake");        // returns 5
        boolean hasTea = items.containsKey("Tea");   // true
        boolean hasQuantity5 = items.containsValue(5); // true

        // Remove a key
        Integer removed = items.remove("Tea"); // removes entry "Tea"

        // --------------------------
        // 3. Iterate using keySet()
        // --------------------------
        System.out.println("Iterating using keySet():");
        for (String key : items.keySet()) {
            Integer value = items.get(key);
            System.out.println(key + " → " + value);
        }

        // --------------------------
        // 4. Iterate using values()
        // --------------------------
        System.out.println("\nIterating using values():");
        for (Integer v : items.values()) {
            System.out.println("Value = " + v);
        }

        // --------------------------
        // 5. List iteration + Iterator remove()
        // --------------------------
        List<String> menu = new ArrayList<>();
        menu.add("Cake");
        menu.add("Tea");
        menu.add("Coffee");

        // System.out.println("\nRemoving items using Iterator:");
        // Iterator<String> iter = menu.iterator();
        // while (iter.hasNext()) {
        // String item = iter.next();
        //     if (item.equals("Tea")) {
        //         iter.remove();   // SAFE removal
        //     }
        // }

        // System.out.println("Menu after remove: " + menu);
    //     for (String item : menu) {
    // menu.remove("Tea");   // ❌ crash
}
 }
