import java.util.*;
import java.util.concurrent.*;

public class SpliteratorAllInOneExample {

    public static void main(String[] args) {

        // 1️⃣ ORDERED, SIZED, SUBSIZED, NONNULL
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Spliterator<Integer> s1 = list.spliterator();

        System.out.println("List Spliterator:");
        printCharacteristics(s1);

        // trySplit → SUBSIZED
        Spliterator<Integer> s2 = s1.trySplit();
        System.out.println("After trySplit:");
        printCharacteristics(s1);
        printCharacteristics(s2);

        System.out.println("--------------------------------");

        // 2️⃣ DISTINCT
        Set<Integer> set = Set.of(10, 20, 30);
        Spliterator<Integer> s3 = set.spliterator();

        System.out.println("Set Spliterator:");
        printCharacteristics(s3);

        System.out.println("--------------------------------");

        // 3️⃣ SORTED
        SortedSet<Integer> treeSet = new TreeSet<>(List.of(5, 1, 3));
        Spliterator<Integer> s4 = treeSet.spliterator();

        System.out.println("TreeSet Spliterator:");
        printCharacteristics(s4);

        System.out.println("--------------------------------");

        // 4️⃣ CONCURRENT
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        Spliterator<Integer> s5 = map.keySet().spliterator();

        System.out.println("ConcurrentHashMap Spliterator:");
        printCharacteristics(s5);

        System.out.println("--------------------------------");

        // 5️⃣ IMMUTABLE
        List<Integer> immutableList = List.of(100, 200, 300);
        Spliterator<Integer> s6 = immutableList.spliterator();

        System.out.println("Immutable List Spliterator:");
        printCharacteristics(s6);
    }

    private static void printCharacteristics(Spliterator<?> s) {
        System.out.println("ORDERED     : " + s.hasCharacteristics(Spliterator.ORDERED));
        System.out.println("DISTINCT    : " + s.hasCharacteristics(Spliterator.DISTINCT));
        System.out.println("SORTED      : " + s.hasCharacteristics(Spliterator.SORTED));
        System.out.println("SIZED       : " + s.hasCharacteristics(Spliterator.SIZED));
        System.out.println("SUBSIZED    : " + s.hasCharacteristics(Spliterator.SUBSIZED));
        System.out.println("NONNULL     : " + s.hasCharacteristics(Spliterator.NONNULL));
        System.out.println("IMMUTABLE   : " + s.hasCharacteristics(Spliterator.IMMUTABLE));
        System.out.println("CONCURRENT  : " + s.hasCharacteristics(Spliterator.CONCURRENT));
        System.out.println("Exact Size  : " + s.getExactSizeIfKnown());
        System.out.println();
    }
}