// // interface Animal {
// //     default void sound() {
// //         System.out.println("Animal sound");
// //     }
// // }
// // interface Innerfile {

// //      default void sound() {
// //         System.out.println("Animal sound1");
// //     }
// // }
// // class Dog implements Animal , Innerfile {
// //     @Override
// //     public void sound() {
// //         System.out.println("Dog barks");
// //         Animal.super.sound(); 
// //         Innerfile.super.sound();
// //         // ✅ Calls interface's default method
// //     }
// // }

// // public class file {
// //     public static void main(String[] args) {
// //         Animal d = new Dog();
// //         d.sound();
// //     }
// // }
// interface Y {
//     void a();
//     void b();
// }

// class Z implements Y {
//     public void a() {System.out.println("hi");}
//     public void b() {System.out.println("hello");  }
// }
// public class Y1 {
// public static void main(String[] args) {
//     Z z = new Z();
// z.toString();   // ✅ from Object class
// z.a();          // ✅ from interface Y (implemented in Z)
// z.b();          // ✅ from Z

// if (z instanceof Y) {
//     Y y =  z;
//     y.toString();  // ✅ still accessible (from Object)
//     y.a();      
//     y.b();   // ✅ allowed (declared in Y)
     
// }
    
// }
//        // ❌ not allowed (not in Y)
// }
@FunctionalInterface
interface Action {
    void perform();
}

public class Test {
    public static void main(String[] args) {
        Action jump = () -> System.out.println("Jumping!");
        jump.perform();
    }
}
