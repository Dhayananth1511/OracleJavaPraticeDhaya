package LoggingConfiguration;

import java.util.logging.Logger;

public class Product {

    // Logger name = demos.Product
    private static final Logger logger =
            Logger.getLogger(Product.class.getName());

    public void process() {

        logger.severe("SEVERE : product failure");
        logger.warning("WARNING : product warning");
        logger.info("INFO : product info");
        logger.config("CONFIG : product config");
        logger.fine("FINE : product debug");
        logger.finer("FINER : product trace");
    }
}
