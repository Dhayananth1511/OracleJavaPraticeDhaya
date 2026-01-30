import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class GuardedLog {
    public static final Logger logger = Logger.getLogger(GuardedLog.class.getName());
    public static void main(String[] args) {
        int id = 101;
        // Guarded log statement
        logger.log(Level.FINE, "Product " + id + " has been selected");//poor practice
        
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Product " + id + " has been selected");
        }//good practice

        logger.setLevel(Level.FINE);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
        
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Product1 " + id + " has been selected");
        }//now good practice will log the message

        logger.log(Level.FINE, "Product2 {0} has been selected", id);//preferred way why because
        // it avoids string concatenation when the log level is disabled it is more efficient than guarded log  statement 
        // why we using like this because in large applications string concatenation may be expensive in terms of performance in poor practice what happens 
        // is even though the log level is disabled the string concatenation still happens
    }
    

}
