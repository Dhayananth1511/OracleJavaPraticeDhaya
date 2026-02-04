
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class chardatareadandwrite {
    public static void main(String[] args) throws Exception {
        // Your code goes here
        try (Reader in = new FileReader("some.txt");
                Writer out = new FileWriter("other.txt")) {
            // work
            char[] buffer = new char[10];
            int length;
            while ((length = in.read(buffer)) != -1) {  //read returns number of characters read
                out.write(buffer, 0, length);
                System.out.println("Read " + length + " characters.");
            }

        }

    }
}