
// public class Demo3 {
//     // static int a;
//     // int b=10;
//     // void display() {
//     //     a += 10;
//     //     b=a+10;
//     //     System.out.println(b);
//     // }
//     // public static void main(String[] args) {
//     //     System.out.println(Demo3.a);
//     //     Demo3 obj = new Demo3();
//     //     Demo3 ob1 = new Demo3();
//     //     obj.display();
//     //     System.out.println(Demo3.a+" "+obj.b+" "+ob1.b+" "+a);
//     /
//     /     ob1.display();
//     //     System.out.println(Demo3.a+" "+obj.b+" "+ob1.b+" "+a);
//     //     // outter:
//     //     // for(int i=1;i<=3;i++) {
            
//     //     //     inner:
//     //     //     for(int j=1;j<=3;j++) {
//     //     //         if(i+j==4) {
//     //     //             continue outter;
//     //     //         }
//     //     //         if(j==2) {
//     //     //             break inner;
//     //     //         }
//     //     //         System.out.print(i+""+j+" ");
                
//     //     //     }
            
//     //     // }
//     //     // System.out.println("end");
// public static void main(String[] args) {
// //     double a= (Math.round((double)11/3*100)/100.0);
// //     System.out.println(a);
//     // double d=1.2;
//     // float f=1.2f;
    
//     // System.out.println(f == d);
//     // System.out.println(1.2*1.0 == 2.2);
//     // byte a;
//     // int b;
//     // short c;
//     // long d;
//     // double e;
//     // float f;
//     // String s;
//     // int ch;
//     // String n;

//     // Scanner sc=new Scanner(System.in);
//     // a=sc.nextByte();
//     // b=sc.nextInt();
//     // c=sc.nextShort();
//     // d=sc.nextLong();
//     // e=sc.nextDouble();
//     // f=sc.nextFloat();
//     // n=sc.next();
    
//     // s=sc.nextLine();
    
//     // ch=sc.nextInt();
//     // System.out.println(a);
//     // System.out.println(b);
//     // System.out.println(c);
//     // System.out.println(d);
//     // System.out.println(e);
//     // System.out.println(f);
//     // System.out.println(s);
//     // double a=ch/2.0;
//     // float f=2.5f;
//     // double d=2.5;
// //     // boolean b=f==d;
// //   byte b1 = 10;
// // byte b2 = 20;
// // byte sum = (byte)b1 + b2; // ❌ Compilation error

// // //     System.out.println(sum);
    
// // //     // System.out.println(n);

// //     // sc.close();
// //     char status = 'N';
// // double cost = 10;

// // double price = switch (status) {
// //     case 'S', 'N' -> cost += 1;  // yield returns a value for 'price'
// //     case 'D' -> {
// //         double discount = cost * 0.2;
// //         cost -= discount;
// //         yield cost;  // yield returns a value for 'price'
// //     }
// //     case 'E' -> 0;
// //     default -> 3;
// // };
// // System.out.println(price);
// // String s1 = "Hello";
// //     String s2 = " World";
// //     s1.concat(s2);
// //     System.out.println(s1);
// // char ch='A'+1;



// // System.out.println(10 / 0.0);
// // System.out.println(0 / 0.0);
// // System.out.println(10 / 0);
// // System.out.println(0 / 0);
// // String s1 = "Java";
// // s1.concat("World");
// // s1[0]='w';
// // System.out.println(s1);
// int i = 0, j = 0;
// for(; i < 5; i++, j += i % 2) {
// j += ++i - j++ + i++ % 2;
// System.out.print("(" + i + "," + j + ") ");
// break;
// }
// System.out.println("\nFinal: i=" + i + " j=" + j);
// }
//     }

import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(
            1,2,3,4,5
        );
        int[] total = {0};
        list.stream()
            .forEach(p -> total[0] += p);
        System.out.println("Total Price: " + total[0]);

    }
}
