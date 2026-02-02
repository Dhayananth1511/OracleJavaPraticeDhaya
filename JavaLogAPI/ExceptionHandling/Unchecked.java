import java.io.IOException;

public class Unchecked {

    public static void main(String[] args) {
        try {
            int x = divide(10, 0);
            System.out.println(x);
        } 
        finally {
            System.out.println("Execution completed.");
        }
        System.out.println("Continuing with other tasks...");

        
    }

    static int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Error: " + x + "/" + y);
        }
        return x / y;
    }
}
