import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SafeCollectionsExample {
    public static void main(String[] args) {

        // Original list
        List<String> list = new ArrayList<>();
        list.add("Cake");
        list.add("Tea");
        list.add("Coffee");

        // 1. Unmodifiable collection (read‑only)
        List<String> readOnlyList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable: " + readOnlyList);
        // readOnlyList.add("Cookie"); // ❌ throws UnsupportedOperationException


        // 2. Synchronized collection (slow but safe)
        List<String> syncList = Collections.synchronizedList(list);
        synchronized (syncList) {
            syncList.add("Cookie");
            System.out.println("Synchronized: " + syncList);
        }


        // 3. Copy‑On‑Write List (fast for reading)
        List<String> cowList = new CopyOnWriteArrayList<>(list);
        cowList.add("Milk");
        System.out.println("Copy‑On‑Write: " + cowList);
    }
}

