import java.util.*;

public class ShortCircuitExample {
    public static void main(String[] args) {

        String[] colors = {"RED", "GREEN", "BLUE"};

        boolean allGreen =
            Arrays.stream(colors)
                .allMatch(s -> s.equals("GREEN"));

        boolean anyGreen =
            Arrays.stream(colors)
                .anyMatch(s -> s.equals("GREEN"));

        boolean noneBlack =
            Arrays.stream(colors)
                .noneMatch(s -> s.equals("BLACK"));

        Optional<String> any =
            Arrays.stream(colors).findAny();

        Optional<String> first =
            Arrays.stream(colors).findFirst();

        System.out.println(allGreen);
        System.out.println(anyGreen);
        System.out.println(noneBlack);
        System.out.println(any.get());
        System.out.println(first.get());
    }
}