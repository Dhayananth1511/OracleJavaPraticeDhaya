import java.io.*;
public class trywithresourceauto {   

    public static void main(String[] args) {

        try (BufferedReader br =
                 new BufferedReader(new FileReader("data.txt"))) {

            
            //readMore lines how we do
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
 


