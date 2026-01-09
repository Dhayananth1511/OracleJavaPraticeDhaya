// public class Task2 {
//     public static void main(String[] args) {
//         String a="""
//                    Java 17, as a Long-Term Support (LTS) release for the Java SE platform,
//                 introduces significant enhancements and new features aimed at improving
//                 developer productivity, maintainability, and performance. Key additions
//                 include sealed classes and interfaces, which provide fine-grained control
//                 over class hierarchies and improve type safety by explicitly defining permitted
//                 subclasses or implementing classes. Furthermore, Java 17 advances the pattern
//                 matching capabilities with preview features like pattern matching for switch
//                 expressions, simplifying complex conditional logic.
//                 """;
//         System.out.println(a);
//     }
// }
 class Shape {
    double area()
    {
        return 1;
    }  // package-private
}

class Circle extends Shape {
    double area() {   // ✅ OK — more accessible
        return Math.PI * 5 * 5;
    }
    String name;
    Circle(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Shape shape = new Circle("HUI");
        System.out.println(shape);
    }
}
