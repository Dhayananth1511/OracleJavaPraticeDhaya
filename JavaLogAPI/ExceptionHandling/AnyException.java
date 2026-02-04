import java.io.IOException;
import java.nio.file.NoSuchFileException;

class AnyException {
    public void doThings() {
    try {
        a();
        b();
    }
    catch (NoSuchFileException x) {
        c();
    }
    catch (Exception y) {   // generic catch
        d();
        return;              // IMPORTANT
    }
    finally {
        e();
    }

    f();   // may NOT execute
}

    public void b() throws NoSuchFileException {
    if (true) {
        throw new NoSuchFileException("File not found in b()");
    }
}
     public void c() {
    System.out.println("Handled NoSuchFileException");
}
     public void d() {
    System.out.println("Handled generic Exception");
}
     public void e() {
    System.out.println("finally block executed");
}     public void f() {
    System.out.println("f() executed");
}
public void a() throws IOException {
    if (true) {
        throw new IOException();
    }
}
     public static void main(String[] args) {
        AnyException t = new AnyException();
        t.doThings();
        
     }
    
}