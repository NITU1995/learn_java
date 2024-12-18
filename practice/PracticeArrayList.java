import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Removing an element
        list.remove("Banana");

        // Checking size
        System.out.println("Size of list: " + list.size());

        // Iterating through the list
        System.out.println("Elements in list:");
        for(String fruit: list){
            System.out.println(fruit);
        }

        // Sorting the list
        list.sort(String::compareTo);
        System.out.println("Sorted list: " + list);

        //1. ArrayList(): Creates an empty list with an initial capacity of 10.
        ArrayList<String> list1 = new ArrayList<>();

        //2. ArrayList(int initialCapacity)
        ArrayList<String> list2 = new ArrayList<>(20);

        //3. ArrayList(Collection c):
        List<String> names = Arrays.asList("Alice", "Bob");
        ArrayList<String> list3 = new ArrayList<>(names);
    }
}

/*
* ArrayList class in java ia a part of Java.util package,
* provide resizable array is a implementation of List interface.
*
* Key Characteristics:
*   1. Resizable
*   2. Maintains Insertion order
*   3. Store duplicates & null
*   4. Random access
*   5. Not Synchronized: ArrayList is not thread-safe. For a synchronized version, use Collections.synchronizedList().
*
* How ArrayList internally works:
*   1. Backing Array: uses an array internally to store. Resized dynamically as por need
*   2. Dynamic Resizing: When current capacity is full it creates an array 1.5 times more capacity and copies the element
*   3. Access by index: It uses array indexing so accessing is O(1)
*   4. Insertion & deletion: Insertion at end is O(1), but inserting and deleting in the middle is O(n)
*
* Advantages:
*   Dynamic Sizing, Fast Random Access, Ease of Use.
*
* Disadvantages:
*   - Slow Insert/Delete in Middle
*   - Not Thread-Safe
*   - Higher Resize Overhead
* */
