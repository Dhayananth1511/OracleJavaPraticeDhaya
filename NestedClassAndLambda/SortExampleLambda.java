// import java.util.*;

// public class SortExample {
//     public static void main(String[] args) {

//         List<String> list = new ArrayList<>();
//         list.add("Banana");
//         list.add("Apple");
//         list.add("Cherry");

//         Collections.sort(list, (a, b) -> a.compareTo(b));

//         System.out.println(list);
//     }
// }

import java.util.*;

public class SortExampleLambda {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);

        Collections.sort(list, (a, b) -> a - b);  // ascending order

        System.out.println(list);
    }
}
