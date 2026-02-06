import java.nio.file.*;
import java.io.IOException;

public class PathExample {

    public static void main(String[] args) throws IOException {

        // Construct path
        Path p = Path.of("docs", "file.txt");

        System.out.println("Path: " + p);

        // Normalize path
        Path p2 = Path.of("docs/../docs/file.txt");
        System.out.println("Normalized: " + p2.normalize());

        // List directory
        Path dir = Path.of(".");
        System.out.println("\nFiles in current folder:");

        Files.list(dir)
             .forEach(System.out::println);
    }
}

