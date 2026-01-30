
//code 
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    // Create Logger using class name
    private static final Logger logger = Logger.getLogger(Test.class.getName());
    private static final Logger logger2 = Logger.getLogger("MyCustomLogger" );

    public static void main(String[] args) {

        logger.info("Program started");

        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // will cause exception
            logger.info("Result: " + result);

        } catch (Exception e) {
            // Log error with exception
            logger.log(Level.SEVERE, "An error occurred", e);
        }

        logger.warning("This is a warning message");
        logger.config("Configuration message");
        // 🧠 Key Points (VERY IMPORTANT)
        // Default level = INFO
        
        // To see:
        
        // CONFIG → level must be CONFIG or lower
        // FINE → level must be FINE or lower
        
        // Both Logger level and Handler level must allow it
        logger.fine("Fine level message");

        logger.info("Program ended");
        sampleMethod();

        
    }
    public static void sampleMethod() {
        logger2.info("info level message from sampleMethod");
    }
}
// Java Logging API(java.util.logging)Java provides a built‑in logging framework
// to record messages about how a program is running.

// 1 ️⃣Logger A Logger is used to write log messages.

// Each logger has a name(usually the
// class name).

// private static Logger logger =
// Logger.getLogger(Test.class.getName());2 ️⃣
// Logging Levels
// Java supports 7
// levels of

// logging (from highest to lowest priority):

// SEVERE –

// serious failure (crash, system error)

// WARNING – potential problem

// INFO – general information

// CONFIG – configuration details

// FINE – small debugging details

// FINER – more detailed debugging

// FINEST – very detailed debugging

// 3️⃣ Logging Messages
// You can log messages like this:

// logger.info("Your message");
// logger.log(Level.INFO, "Your message");
// For errors with exceptions:

// catch (Exception e) {
// logger.log(Level.SEVERE, "Your error message", e);
// }
// 4️⃣ module-info.java (Java 9+)
// If you use modules, you must declare:

// module demos {
// requires java.logging;
// }
// 📌 Why use logging?
// Helps debug errors

// Tracks program flow

// Better than System.out.println()
