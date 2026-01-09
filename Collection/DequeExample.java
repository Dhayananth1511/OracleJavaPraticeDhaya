import java.util.ArrayDeque;
import java.util.Deque;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class DequeExample {
    public static void main(String[] args) {

        Product p1 = new Product("Cake");
        Product p2 = new Product("Tea");
        Product p3 = new Product("Cookie");

        Deque<Product> menu = new ArrayDeque<>();

        // Empty poll → returns null
        System.out.println("pollFirst (empty): " + menu.pollFirst());  

        // Insert at front
        menu.offerFirst(p1);      // [ Cake ]
        menu.offerFirst(p2);      // [ Tea, Cake ]

        // Remove from front
        System.out.println("pollFirst: " + menu.pollFirst()); // Tea

        // Peek (no removal)
        System.out.println("peekFirst: " + menu.peekFirst()); // Cake

        // Insert at back
        menu.offerLast(p3);       // [ Cake, Cookie ]
        menu.offerLast(p1);       // [ Cake, Cookie, Cake ]

        // Remove from back
        System.out.println("pollLast: " + menu.pollLast());  // Cake

        // Peek last (no removal)
        System.out.println("peekLast: " + menu.peekLast());  // Cookie
        // menu.offerLast(null);

        // Null not allowed
        // menu.offerLast(null);  // ❌ ERROR
        Deque<Product> menu1 = new ArrayDeque<>(1);

        // Insert at front
        menu1.addFirst(p1);      // [ Cake ]
        menu1.addFirst(p2);
        menu1.addFirst(p3);      // [ Tea, Cookie, Cake ]  
        System.out.println("Deque1 contents:");
        for (Product p : menu1) {   
            System.out.println("- " + p.name);
    
            }
        Deque<String> deque = new ArrayDeque<>(2);

deque.add("A");      // ok
deque.add("B");      // ok

deque.add("C");      // ❌ throws IllegalStateException (no space)
System.out.println(deque);

    }
}
// https://chatgpt.com/gg/6921b0b9ede88196af45da1f020ffabb ----> chatgpt link
// ✅ add() vs offer() — Clear Example
// Important rule:
// add(e) → throws exception if the element cannot be added

// offer(e) → returns false if the element cannot be added

// Both try to insert, but they behave differently on failure.

// 📌 Example using a bounded queue (capacity = 2)
// Deque<String> deque = new ArrayDeque<>(2);

// deque.add("A");      // ok
// deque.add("B");      // ok

// deque.add("C");      // ❌ throws IllegalStateException (no space)
// ▶ Behavior:
// Queue is full (capacity = 2)

// add("C") tries to insert

// Cannot insert → throws exception

// 📌 Using offer()
// Deque<String> deque = new ArrayDeque<>(2);

// deque.offer("A");    // returns true
// deque.offer("B");    // returns true

// boolean result = deque.offer("C");   // returns false (no space)
// ▶ Behavior:
// Queue is full

// offer("C") tries to insert

// Cannot insert → returns false
// (❌ No exception)