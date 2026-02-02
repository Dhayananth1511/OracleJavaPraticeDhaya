

class ProductException extends Exception {

    public ProductException() {
        super();
    }

    public ProductException(String message) {
        super(message);
    }

    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }
}


public class Test {

    static void checkPrice(int price) throws ProductException {
        if (price < 0) {
            throw new ProductException("Invalid product price", new IllegalArgumentException());
        }
    }

    public static void main(String[] args) {
        try {
            checkPrice(-10);
        } catch (ProductException e) {
            System.out.println(e.getMessage());
        }
    }
}

