class MyResource implements AutoCloseable {
    public void use() throws Exception {
        throw new Exception("Exception in try block");
    }

    public void close() throws Exception {
        throw new Exception("Exception while closing resource");
    }
}

public class SuppressedExample {
    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.use();
        } catch (Exception e) {
            System.out.println("Main exception: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + suppressed.getMessage());
            }
        }
        
    }
}
