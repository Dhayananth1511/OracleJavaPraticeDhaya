// /// // // // import java.math.BigDecimal;    
// // // // // class Product {
// // // // //      int a=10;
// // // // //      static Product r= new Product( );
// // // // //          static void a(){
// // // // //             System.out.println(r.a);
// // // // //             System.out.println(r.a);
// // // // //         }
// // // // //     // private final String name;
// // // // //     // private final BigDecimal price;
// // // // //     //  {
// // // // //     //     name = "Default Product";
// // // // //     //     price = BigDecimal.ZERO;
// // // // //     //     System.out.println("Instance Block");
// // // // //     //  }
// // // // //     // public Product(String name, BigDecimal price) {
// // // // //     //     this.name = name;
// // // // //     //     this.price = price;
// // // // //     // }
// // // // import static java.lang.Math.PI;
// // // // import java.math.BigDecimal;
// // // // class Product {
// // // //     public BigDecimal discount=BigDecimal.ZERO;
// // // //     public BigDecimal price=BigDecimal.ZERO;
// // // // }
// // // // class Food extends Product {
// // // //     private BigDecimal discount=BigDecimal.TEN;

// // // //     public BigDecimal getDiscount() {
// // // //         return price.subtract(discount.add(discount));
// // // //     }
// // // // }


// // // // public class HelloWorld {
// // // //     // {
// // // //     //     System.out.println("Hello, World!");
// // // //     // }
// // // //     // static{
// // // //     //     System.out.println("Static Block");
// // // //     // }
    
// // // //     public static void main(String[] args) {
// // // //         System.out.println(PI);
// // // //         Product p = new Food();
// // // //         p.price=BigDecimal.valueOf(50);
// // // //         System.out.println(((Food) p).getDiscount());

// // // //     }
// // // // }
// // // class Product{
// // //     {
// // //         System.out.println("Product instance");
// // //     }
// // //     static {
// // //         System.out.println("Product static");
// // //     }
// // // }
// // // class Food extends Product{
// // //     static {
// // //         System.out.println("child static");
// // //     }
// // //     {
// // //         System.out.println("child instance");
// // //     }
// // // }
// // // class Object{
// // //     {
// // //         System.out.println("Object Instance");
// // //     }
// // //     static{
// // //         System.out.println("Object Static");
// // //     }
// // // }
// // // public class Shop extends Object
// // // {
// // //     {
// // //      System.out.println("Shop Instance");    
// // //     }
// // //     static{
// // //         System.out.println("Shop static-2");
// // //   }
// // // 	public static void main(String[] args) {
// // // 		Product p = new Food();
// // // 		Product f = new Food();
// // //         Food a = new Food();
// // // 	}
// // // 	static{
// // // 	    System.out.println("shop static-1");
// // // 	}
// // // }
// // class Product {
// //     // Static block → runs once when class is loaded
// //     static {
// //         System.out.println("Product static");
// //     }

// //     // Instance initializer block → runs before constructor each time object is created
// //     {
// //         System.out.println("Product instance block");
// //     }

// //     // Constructor
// //     // public Product() {
// //     //     System.out.println("Product constructor");
// //     // }
// // }

// // class Food extends Product {
// //     // Static block → runs once when Food class is loaded
// //     static {
// //         System.out.println("Food static");
// //     }

// //     // Instance initializer block
// //     {
// //         System.out.println("Food instance block");
// //     }

// //     // Constructor
// //     // public Food() {
// //     //     // super() is called automatically here by compiler
// //     //     System.out.println("Food constructor");
// //     // }
// // }

// // class BaseObject {
// //     static {
// //         System.out.println("BaseObject static");
// //     }

// //     {
// //         System.out.println("BaseObject instance block");
// //     }

// //     // public BaseObject() {
// //     //     System.out.println("BaseObject constructor");
// //     // }
// // }

// // public class Shop extends BaseObject {
// //     static {
// //         System.out.println("Shop static-2");
// //     }

// //     static {
// //         System.out.println("Shop static-1");
// //     }

// //     {
// //         System.out.println("Shop instance block");
// //     }

// //     // public Shop() {
// //     //     System.out.println("Shop constructor");
// //     // }

// //     public static void main(String[] args) {
// //         System.out.println("\n--- Program Started ---");

// //         // Object creation
// //         Product p1 = new Food();
// //         System.out.println("------------------------");
// //         Product p2 = new Food();
// //         System.out.println("------------------------");
// //         Food f1 = new Food();

// //         System.out.println("\n--- Program Ended ---");
// //     }
// // }
// // class Product {
// //     int price = 100;
// //     Product() {
// //         System.out.println("Product constructor");
// //     }
// // }

// class Food  {
   
//     void food() { 
//         System.out.println(quantity);
       
//     }
//     int quantity=2;
// }

// public class Main {
//     public static void main(String[] args) {
//         Food f = new Food();
//         f.food();
//     }
// }

import java.math.BigDecimal;

class A{
    public void show(){
        System.out.println("A");
        
    }
}
class B extends A{

    public void show(){
        System.out.println("B");
        
    }
}
class C extends B{

    public void show(){
        System.out.println("C");
        
    }
}
class InnerMain{
    public static void main(String[] args) {
        A a = new C();
        a.show();

    }
}