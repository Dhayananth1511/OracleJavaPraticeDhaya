
// import java.io.IOException;

// public class Checked {

//     public static void main(String[] args) throws Exception {
        
//             openFile(null);
        
//     }

//     static void openFile(String fileName) throws IOException {
//         if (fileName == null) {
//             throw new IOException("Filename must be set");
//         }
//     }
// }
import java.io.IOException;

public class Checked {

    public static void main(String[] args)  {
        try {
            openFile(null);
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Execution completed.");
        }
        
    }

    static void openFile(String fileName) throws IOException {
        if (fileName == null) {
            throw new IOException("Filename must be set");
        }
    }
}

