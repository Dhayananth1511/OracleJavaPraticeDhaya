// public class StaticInnerEg {
//     static class Inner {
//         void display() {
//             System.out.println("Inside static nested class");
//         }
//     }

//     public static void main(String[] args) {
//         StaticInnerEg.Inner inner = new StaticInnerEg.Inner();
//         inner.display();
//     }
    
// }


// With Access Modifier Change:
class InnerStaticInnerEg {

     private static class Inner {
        static void display() {
            System.out.println("Inside private static nested class");
        }
    }
    static void  play() {
        Inner.display();
    }
    
}
public class StaticInnerEg {

    public static void main(String[] args) {
        InnerStaticInnerEg.play(); 
    }
    
}
