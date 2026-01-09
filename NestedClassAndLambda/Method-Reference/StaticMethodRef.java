import java.util.*;

class Util {
    static boolean isEmpty(String s) {
        return s.isEmpty();
    }
}

public class StaticMethodRef {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("jaav");

        
        System.out.println(list);
    

        // Lambda
        // list.removeIf(s -> Util.isEmpty(s));

        // Method reference
        list.removeIf(Util::isEmpty);

        System.out.println(list);
    }
}
//Syntax
// ClassName::staticMethod
