import java.util.*;

class TextSorter {
    int sort(String s1, String s2) {
        return s1.compareTo(s2);
    }
}

public class InstanceMethodObject {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
        TextSorter sorter = new TextSorter();
        
        // Lambda
        Collections.sort(list, (a, b) -> sorter.sort(a, b));

        // Method reference
        Collections.sort(list, sorter::sort);

        System.out.println(list);
    }
}
// Syntax
// object::instanceMethod
