import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingMethod {

    private static final Logger logger = Logger.getLogger(LoggingMethod.class.getName());

    public static void main(String[] args) {

        logger.setLevel(Level.FINER);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);

        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        // 1️⃣ log() method
        logger.log(Level.INFO, "This is log() method");

        // 2️⃣ logp() – precise logging
        logger.logp(Level.INFO,
                "Test",
                "main",
                "This is logp() method");

        // 3️⃣ entering() – method entry
        logger.entering("Test", "main");

        try {
            int a = 10;
            int b = 0;
            int c = a / b; // exception
        } catch (Exception e) {

            // 4️⃣ throwing() – exception logging
            logger.throwing("Test", "main", e);
            logger.log(Level.SEVERE, "An exception occurred", e);
            // severe() – convenience method
            logger.severe("Exception occurred");
        }

        // 5️⃣ Convenience methods
        logger.warning("This is a warning");
        logger.info("This is an info message");
        logger.config("This is a config message");
        logger.fine("This is a fine message");

        // exiting() – method exit
        logger.exiting("Test", "main");
    }
}
