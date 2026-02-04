import java.io.Console;
import java.io.PrintWriter;

public class console {
    public static void main(String[] args) {

        Console c = System.console();
        if (c == null) {
            System.out.println("Console is not supported");
            return;
        }

        PrintWriter out = c.writer();
        out.println("To quit type: exit");
        out.println("Type value and press enter:");

        char[] password = c.readPassword("Enter password: ");

        while (!new String(password).equals("exit")) {
            out.println("Echo: " + new String(password));
            password = c.readPassword("Enter password: ");
        }
    }
}
