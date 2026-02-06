import java.io.*;

// --------------------
// Address Class (Child Object)
// --------------------
class Address implements Serializable {
    String city;
    String country;

    Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

// --------------------
// Student Class (Main Object)
// --------------------
class Student implements Serializable {
    String name;
    int age;

    Address address; // Object graph

    transient String password; // Will NOT be serialized

    Student(String name, int age, Address address, String password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.password = password;
    }
}

// --------------------
// Main Program
// --------------------
public class SerializationFullExample {

    public static void main(String[] args) throws Exception {

        // 1️⃣ Create objects
        Address addr = new Address("Chennai", "India");
        Student s1 = new Student("Dhaya", 20, addr, "secret123");

        // 2️⃣ SERIALIZATION (Object → File)
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("student.dat"));

        out.writeObject(s1);
        out.close();

        System.out.println("Object serialized successfully");

        // Remove object from memory
        s1 = null;

        // 3️⃣ DESERIALIZATION (File → Object)
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("student.dat"));

        Student s2 = (Student) in.readObject();
        in.close();

        System.out.println("\nObject deserialized successfully");

        // Display data
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("City: " + s2.address.city);
        System.out.println("Country: " + s2.address.country);

        // Transient variable check
        System.out.println("Password: " + s2.password);
    }
}
