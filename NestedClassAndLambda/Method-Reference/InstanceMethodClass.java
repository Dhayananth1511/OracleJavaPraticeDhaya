import java.util.*;

public class InstanceMethodClass {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("banana", "Apple", "cherry");

        // Lambda
        Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // Method reference
        Collections.sort(list, String::compareToIgnoreCase);

        System.out.println(list);
    }
}
// Syntax
// ClassName::instanceMethod
// // 
// 📌 Mapping

// java
// Copy code
// (s1, s2) -> s1.compareToIgnoreCase(s2)
// String::compareToIgnoreCase
