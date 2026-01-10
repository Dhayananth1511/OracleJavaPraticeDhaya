
import java.util.*;

public class JavaStreamExample {

    public static void main(String[] args) {

        // Source collection
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        // Stream processing
        list.stream()                 // create stream
            .filter(x -> x > 10)      // intermediate operation
            .map(x -> x * 2)          // intermediate operation
            .forEach(System.out::println); // terminal operation
    }
}
