import java.util.*;
import java.util.function.*;

public class MapExample {
    public static void main(String[] args) {

        List<String> names = List.of("  Java  ", " Stream ", " API ");

        Function<String, String> trim = s -> s.trim();
        Function<String, String> upper = s -> s.toUpperCase();

        // default: andThen()
        names.stream()
            .map(trim.andThen(upper))
            .forEach(System.out::println);

        // default: compose()
        names.stream()
            .map(upper.compose(trim))
            .forEach(System.out::println);

        // static: identity()
        names.stream()
            .map(Function.identity())
            .forEach(System.out::println);

        // mapToInt
        int totalLength =
            names.stream()
                 .mapToInt(String::length)
                 .sum();

        System.out.println("Total Length = " + totalLength);
    }
}