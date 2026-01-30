import java.util.logging.*;

public class LogHandlingWriting {

    // Create logger
    private static final Logger logger =
            Logger.getLogger(LogHandlingWriting.class.getName());

    public static void main(String[] args) throws Exception {

        // 1️⃣ Set logger level
        logger.setLevel(Level.FINER);

        // 2️⃣ Disable default parent handler
        logger.setUseParentHandlers(false);

        // 3️⃣ Console Handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER); // INFO and above
        consoleHandler.setFormatter(new SimpleFormatter());

        // 4️⃣ File Handler
        FileHandler fileHandler = new FileHandler("product.log");
        fileHandler.setLevel(Level.FINER); // FINE and above
        fileHandler.setFormatter(new XMLFormatter());

        // 5️⃣ Add handlers to logger
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);

        // 6️⃣ Log messages
        logger.severe("Severe error occurred");
        logger.warning("Warning message");
        logger.info("Information message");
        logger.fine("Fine level debugging message");
        logger.finer("Finer message (won't appear)");
    }
}
