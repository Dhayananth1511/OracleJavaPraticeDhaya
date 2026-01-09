import java.util.*;

// Step 1: Create a Student class
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // toString() helps print student details nicely
    public String toString() {
        return name + " - " + marks;
    }
}

// Step 2: Create a Comparator class to compare by marks
class SortByMarks implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        // If s1.marks < s2.marks → return negative
        // If s1.marks > s2.marks → return positive
        // If equal → return 0
        return s1.marks - s2.marks;
    }
}

// Step 3: Create a Comparator class to compare by name
class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Step 4: Main class
public class ComparatorExample {
    public static void main(String[] args) {

        // Step 5: Create a list of students
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ravi", 85));
        list.add(new Student("Kumar", 70));
        list.add(new Student("Anita", 90));

        System.out.println("Original List:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Step 6: Sort by marks
        Collections.sort(list, new SortByMarks());
        System.out.println("\nSorted by Marks:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Step 7: Sort by name
        Collections.sort(list, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class Student implements Comparable<Student> {
//     int rollNo;
//     String name;

//     Student(int rollNo, String name) {
//         this.rollNo = rollNo;
//         this.name = name;
//     }

//     // Defines the natural order
//     public int compareTo(Student s) {
//         return this.name.compareTo(s.name);
//     }

//     public String toString() {
//         return rollNo + " " + name;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> list = new ArrayList<>();
//         list.add(new Student(3, "Asha"));
//         list.add(new Student(1, "Kumar"));
//         list.add(new Student(2, "Ravi"));

//         Collections.sort(list); // Uses compareTo()
//         System.out.println(list);
//     }
// }

