import java.util.*;

public class PracticeSet {
    public static void main(String[] args) {
        //Example HashSet
        Set<String> unorderedSet = new HashSet<>();
        unorderedSet.add("mint");
        unorderedSet.add("Coco 1");
        unorderedSet.add("Coco 2");
        unorderedSet.add("banana");
        unorderedSet.add("");
        System.out.println(unorderedSet);

        //Example LinkedHashSet
        Set<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("mint 1");
        orderedSet.add("mint 2");
        orderedSet.add("Coco 1");
        orderedSet.add("Coco 2");
        orderedSet.add("");
        System.out.println(orderedSet);

        //Example TreeSet
        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("mint 1");
        myTreeSet.add("mint 2");
        myTreeSet.add("Coco 1");
        myTreeSet.add("Coco 2");
        myTreeSet.add("");
        System.out.println(myTreeSet);
    }
}

/*
* Set is an interface in java that extends collection interface.
* It represents collection of unique elements.
*
* Key Features:
*   1. No duplicate values
*   2. Unordered collection
*   3. Implements collection interface, hence inherit methods like add(), remove(), contains(), size()
*   4. HashSet: Allow Null, TreeSet: Doesn't allow
*
* Types of Set Implementation:
*   1. HashSet
*       - Uses hash table for storage
*       - Doesn't guarantee order
*       - Allows one null value
*       - Use case: High performance
*   2. LinkedHashSet
*       - Extends HashSet
*       - Preserve order
*       - Allows one null value
*       - Use case: Preserve element order
 *   3. TreeSet
*       - Implements NavigableSet Interface
*       - Store elements in Sorted order
*       - Doesn't allow null value
*       - Use case: Need elements to be sorted.
*
 * */
