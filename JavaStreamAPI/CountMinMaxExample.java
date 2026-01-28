import java.util.*;
import java.util.stream.*;

public class CountMinMaxExample {
    public static void main(String[] args) {

        String[] values = {"RED", "GREEN", "BLUE"};

        // count
        long count =
            Arrays.stream(values)
                  .filter(s -> s.indexOf('R') != -1)
                  .count();
        System.out.println("Count = " + count);   // 2

        // sum
        int sum =
            Arrays.stream(values)
                  .mapToInt(String::length)
                  .sum();
        System.out.println("Sum = " + sum);       // 12

        // average
        OptionalDouble avg =
            Arrays.stream(values)
                  .mapToInt(String::length)
                  .average();

        System.out.println("Average = " +
            (avg.isPresent() ? avg.getAsDouble() : 0));

        // max
        Optional<String> max =
            Arrays.stream(values)
                  .max((s1, s2) -> s1.compareTo(s2));// lexicographical order

        System.out.println("Max = " + max.orElse("no data"));

        // min
        Optional<String> min =
            Arrays.stream(values)
                  .min((s1, s2) -> s1.compareTo(s2));// lexicographical order

        System.out.println("Min = " + min.orElse("no data"));
    }
}