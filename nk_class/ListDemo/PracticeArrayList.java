package ListDemo;

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
        list.set(1, "aaa");

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
