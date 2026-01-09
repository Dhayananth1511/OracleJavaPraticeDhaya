import java.util.function.Supplier;
import java.util.*;

public class ConstructorRef {
    public static void main(String[] args) {

        // Lambda
        Supplier<List<String>> s1 = () -> new ArrayList<>();

        // Method reference
        Supplier<List<String>> s2 = ArrayList::new;
        List<String> l=s1.get();
        List<String> list = s2.get();
        list.add("Java");
        l.add("ka");
        System.out.println(l);
        System.out.println(list);
    }
}
//Syntax
// ClassName::new

