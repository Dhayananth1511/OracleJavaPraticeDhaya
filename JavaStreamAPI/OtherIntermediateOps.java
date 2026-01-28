import java.util.stream.Stream;

public class OtherIntermediateOps {
    public static void main(String[] args) {

        Stream.of("A","C","B","D","B","D")
            .distinct()
            .sorted()
            .skip(1)
            .limit(2)
            .forEach(System.out::println);

        Stream.of("B","C","A","E","D","F")
            .takeWhile(s -> !s.equals("D"))
            .forEach(System.out::println);

        Stream.of("B","C","A","E","D","F")
            .dropWhile(s -> !s.equals("D"))
            .forEach(System.out::println);
    }
}
