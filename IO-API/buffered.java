
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class buffered {
    static Logger logger = Logger.getLogger(buffered.class.getName());
    public static void main(String[] args) throws IOException {
        var i=new buffered();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("some.txt"), "UTF-8"));

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream("other.txt"), "UTF-8"));

        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        br.close();
        pw.close();

        System.err.println("File copied successfully with buffering.");
        
        try {
            logger.log(Level.SEVERE, "File copied successfully with buffering.");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
