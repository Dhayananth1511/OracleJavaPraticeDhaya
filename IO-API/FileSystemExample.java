import java.nio.file.*;
import java.io.IOException;

public class FileSystemExample {

    public static void main(String[] args) throws IOException {

        // Create Path
        Path p = Paths.get("example.txt");

        // Create file
        Files.createFile(p);

        System.out.println("File created: " + p.toAbsolutePath());

        // Get file size
        System.out.println("File size: " + Files.size(p));

        // Show disk space
        FileSystem fs = FileSystems.getDefault();

        fs.getFileStores().forEach(store -> {
            try {
                System.out.println("\nDrive: " + store.name());
                System.out.println("Total space: " + store.getTotalSpace());
                System.out.println("Free space: " + store.getUsableSpace());
            } catch (IOException e) {
                System.out.println(e);
            }
        });
    }
}
