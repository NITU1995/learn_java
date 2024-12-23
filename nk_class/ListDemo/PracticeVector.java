package ListDemo;

import java.util.Vector;

public class PracticeVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Add elements
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Access elements
        System.out.println("Element at index 1: " + vector.get(1)); // Output: 20

        // Remove element
        vector.remove((Integer) 20);
        System.out.println("Vector: " + vector);                   // Output: [10, 30]
    }
}
