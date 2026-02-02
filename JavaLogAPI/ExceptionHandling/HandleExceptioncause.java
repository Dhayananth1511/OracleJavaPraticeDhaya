import java.io.*;

public class HandleExceptioncause {
    static void readFile() throws Exception {
        try {
            new FileReader("dat.txt");
        } catch (IOException e) {
            throw new Exception("Failed to read file", e); // wrapping
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
