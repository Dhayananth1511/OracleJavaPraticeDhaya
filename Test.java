// // class A {}

// // class B extends A {}
// // class Test {
// // void show(Object o) { System.out.println("Object"); }
// // void show(A a) { System.out.println("A"); }
// // void show(B b) { System.out.println("B"); }


// // public static void main(String[] args) {
// // A obj = new B();
// // new Test().show(obj);

// // }
// // }

// // // A. Object
// // // B. A
// // // C. B
// // // D. Compile-time error
// // // E.run-time error
// // class Test {
// //     int a;      // instance variable
// //     double d;   // instance variable
// //     boolean flag;
    
// //     void show() {
// //         System.out.println(a);     // prints 0
// //         System.out.println(d);     // prints 0.0
// //         System.out.println(flag);  // prints false
// //     }

// //     public static void main(String[] args) {
// //         new Test().show();
// //     }
// // }
// class Test {

// public static void main(String[] args) {
// // char c = 'A';
// // byte b = (byte)c;
// // System.out.println(c);
// // System.out.println(b);
// // for(int i = 1; i <= 3; i++) {
// // for(int j = 1; j <= 2; j++) {
// // System.out.print(i + "" + j + " ");
// outer:
// for(int i = 1; i <= 3; i++) {
// inner:
// for(int j = 1; j <= 3; j++) {
// if(i + j == 4) continue outer;
// if(j == 2) break inner;
// System.out.print(i + "" + j + " ");

// }
// }
// }}
package java vs;
class Test {
    void print(Integer i) { System.out.println("Integer"); }
    void print(int i) { System.out.println("Varargs"); }
    void print1(Integer i) {
    System.out.println(i+(Integer)10); // i points to Integer object holding 5
}


    public static void main(String[] args) {
        new Test().print(5);
         // int literal
         new Test().print1(5);
         System.err.println("adsfgf");
    }
}