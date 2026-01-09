// public class MemberInnerclass {

//     private String outerField = "Outer Field";

//     class InnerClass {
//         void display() {
//             System.out.println("Accessing: " + outerField);
//         }
//     }

//     public static void main(String[] args) {
//         MemberInnerclass outer = new MemberInnerclass();
//         MemberInnerclass.InnerClass inner = outer.new InnerClass();
//         inner.display();
//     }
// }





// access modifier of member inner class is same as other class
// it can be public, private, protected, default
// member inner class can access all members of outer class including private ones below eg
// class Outer {
//     private String privateField = "Private Field";

//     private class Inner {
//         void show() {
//             System.out.println("Accessing: " + privateField);
//         }
//     }
//     void test() {
//         Inner inner = new Inner();
//         inner.show();
//     }
    
   
// }
// public class MemberInnerclass {

//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         outer.test();
        
//     }
// }




//example for protected member inner class
class InnerMemberInnerclass {
    protected class Inner {
        void display() {
            System.out.println("Inside Protected Inner Class");
        }
    }
    
}
public class MemberInnerclass {


    public static void main(String[] args) {
        InnerMemberInnerclass outer2 = new InnerMemberInnerclass();
        InnerMemberInnerclass.Inner inner = outer2.new Inner();
        inner.display();
    }
}