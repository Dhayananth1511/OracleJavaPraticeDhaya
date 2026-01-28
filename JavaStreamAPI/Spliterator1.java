import java.util.Random;
import java.util.Spliterator;

public class Spliterator1 {
    public static void main(String[] args) {
        Spliterator<Integer> s1 = new Random().ints(10, 0, 10).spliterator();

        s1.tryAdvance(v -> System.out.print(v));

        Spliterator<Integer> s2 = s1.trySplit();
        System.out.println("Size " + s1.getExactSizeIfKnown());
        System.out.println("Estimate " + s1.estimateSize()); 
        System.out.println("Size " + s2.getExactSizeIfKnown());
        System.out.println("Estimate " + s2.estimateSize()); 
        
        if (s2 != null) {
            s1.forEachRemaining(v -> System.out.print(v));
            s2.forEachRemaining(v -> System.out.print(v));
        }
        // spliterator characteristics
        System.out.println("\nCharacteristics:");
        System.out.println(
                "Ordered " + s2.hasCharacteristics(Spliterator.ORDERED));
        System.out.println("Size " + s2.getExactSizeIfKnown());
        System.out.println("Estimate " + s2.estimateSize());

    }
}