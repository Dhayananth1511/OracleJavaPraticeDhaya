
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class programflowproducingRuntime {

    public void doThings() {
        try {
            a();
            b();   // RuntimeException occurs here
            c();
        }
        //catch (RuntimeException e) {
    // System.out.println("Runtime exception caught");
// }
       
       
        finally {
            f();   // always executed
        }

        g();   // NOT executed if runtime exception is unhandled
    }

    public void a() {
        System.out.println("a()");
    }

    public void b() {
        // Unchecked exception
        throw new NullPointerException("Runtime Exception in b()");
    }

    public void c() {
        System.out.println("c()");
    }

    public void d() {
        System.out.println("Handled NoSuchFileException");
    }

    public void e() {
        System.out.println("Handled IOException");
    }

    public void f() {
        System.out.println("finally block executed");
    }

    public void g() {
        System.out.println("g()");
    }

    public static void main(String[] args) {
        programflowproducingRuntime t = new programflowproducingRuntime();
        t.doThings();
        System.out.println("Program continues...");
    }
}
