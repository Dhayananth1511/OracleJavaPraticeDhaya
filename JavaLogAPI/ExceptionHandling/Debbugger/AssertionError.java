public class AssertionError {
    public static void main(String[] args) {
        int value = 15;
        assert value < 18 : "Value is not greater than 18";
        System.out.println("Value is: " + value);
        b();
    }
    static void b() {
        System.out.println("Method b() called");
    }
}