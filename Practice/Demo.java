// // // class remo {
// // //      void display(){
// // //         System.out.println("Hello");
// // //      }
// // // }
// // // class Subremo extends remo{
// // //     void show(){
// // //         System.out.println("Welcome");
// // //     }
// // // }
// // public class Demo extends Object {
// //     public static void m1(String s , Object o) {
// //         System.out.println(s);
// //     }
// //     public static void m1(Object o, String s) {
// //         System.out.println(o+" Object");
// //     }
// //     public static void main(String[] args) {
// //        new Demo().m1(null, "Demo");
// //         // Subremo obj=new Subremo();

// //         // System.out.println("Hello, World!");
// //         // double number = 3.36;
// //         // System.out.println("The float number is: " + number);
// //         // double sum = 1.12 * 3;
// //         // System.out.println("The sum is: " + sum);
// //         // System.out.println(number==sum);
     
// //         // System.out.println(a);
// //         // // System.out.println(5.0%2);
// //         // byte a=10;
// //         // while(a>=0){
// //         //     System.out.println(a);
// //         //     a=(byte)(1+a);
// //         // }
// //         // System.out.println((byte)(a-10));
// //         // }
// //     }
// // }


// import java.text.MessageFormat;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.time.format.FormatStyle;
// import java.util.*;

// public class Demo {
//     public static void main(String[] args) {
// //   Locale locale1 = Locale.forLanguageTag("en-US");
// //         Locale locale = new Locale("en", "GB");
// //         String tag = locale.toLanguageTag();
// //         System.out.println(tag); 
//         // Locale locale = Locale.forLanguageTag("th-TH-u-ca-buddhist-nu-thai");

//         // System.out.println("Language: " + locale.getLanguage());
//         // System.out.println("Country: " + locale.getCountry());
//         // System.out.println("Calendar type: " + locale.getUnicodeLocaleType("ca"));
//         // System.out.println("Numbering system: " + locale.getUnicodeLocaleType("nu"));
//         // System.out.println("Display Name: " + locale.getDisplayName());
//         // System.out.println("Language Tag: " + locale.toLanguageTag());
//         // Locale locale = new Locale("en", "US");
//         // BigDecimal bd1 = BigDecimal.valueOf(2.675);
//         // Double tax=10.0;
//         // int a=1212345;
//         // NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
//         // System.out.println(nf.format(bd1));
//         // NumberFormat nf1=NumberFormat.getPercentInstance(locale);
//         // System.out.println(nf1.format(tax));
//         // NumberFormat nf2=NumberFormat.getNumberInstance(locale);
//         // System.out.println(nf2.format(a));

//     //    Locale locale = Locale.forLanguageTag("en-In");
//     //    LocalDate date = LocalDate.now();
//     //    System.out.println(date);
//     //    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE dd MMM yyyy", locale);
//     //      String formattedDate = date.format(dtf);
//     //         System.out.println(formattedDate);
//     // locale=new Locale("en");
//     // date=LocalDate.of(2023,3,12);
//     // dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(locale);
//     // String result=dtf.format(date);
//     // System.out.println(result);
//     // Locale locale = Locale.forLanguageTag("en-In");
//     // ResourceBundle rb = ResourceBundle.getBundle("resources.Messages");
//     // String greeting = rb.getString("greeting");
//     // System.out.println(greeting);
//     //    Locale localeGB = new Locale("en", "GB"); // English - United Kingdom
//     //     ResourceBundle bundleGB = ResourceBundle.getBundle("resources.messages", localeGB);

//     //     String patternGB = bundleGB.getString("product");
//     //     String resultGB = MessageFormat.format(patternGB, "Cookie", "£2.99", 4, "1 Apr 2019");

//     //     System.out.println("With Locale (en_GB):");
//     //     System.out.println(resultGB);
//     String a = "Hello";
// String c = new String("Hello");

// System.out.println(a == c);      // false (different objects)
// System.out.println(a.equals(c)); 

//     }
// }
record Product(String name, double price, int quantity) { 
    // Additional methods can be added if needed
    public Product(String name, double price) {
        this(name, price, 10);
    }
}

public class Demo {
    public static void main(String[] args) {
       Product p1 = new Product("Tea", 1.99);
Product p2 = new Product("Tea", 1.99);

boolean same = p1.equals(p2);   // ✅ true (compares values)
int hashCode = p1.hashCode();   // consistent with equals
String name = p1.name();        // getter method (no 'get' prefix)
String text = p1.toString();    // "Product[name=Tea, price=1.99]"
System.out.println(same);
System.out.println(hashCode);
System.out.println(name);
System.out.println(text);

    }
}