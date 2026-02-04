
import java.io.Console;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FullConsoleEg {

    public static void main(String[] args) {

        // Get console
        Console c = System.console();
        if (c == null) {
            System.out.println("Console is not supported");
            return;
        }

        // Writer for console output
        PrintWriter out = c.writer();

        // Read username
        out.println("Enter username:");
        String username = c.readLine();

        try {
            // Read password securely (not shown on screen)
            out.println("Enter password:");
            char[] password = c.readPassword();

            // Create SHA-256 MessageDigest
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Convert password to hash
            byte[] digest = md.digest(
                    String.valueOf(password).getBytes()
            );

            // Convert hash to hexadecimal string
            String hash = new BigInteger(1, digest).toString(16);

            // Output (for demo purpose)
            out.println("Username: " + username);
            out.println("Password hash: " + hash);

        } catch (NoSuchAlgorithmException e) {
            out.println("Unable to create password hash");
        }
    }
}
