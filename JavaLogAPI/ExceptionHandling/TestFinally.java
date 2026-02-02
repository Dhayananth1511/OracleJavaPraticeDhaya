import java.io.*;

public class TestFinally {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            System.out.println(br);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            br=null;  // Simulating an error scenario

        } catch (IOException e) {
            System.out.println("Error reading file");

        } finally {
            try {
                if (br != null) {
                    br.close();   // MANUAL CLOSE
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
