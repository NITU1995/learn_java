import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PracticeLinkedList {
    public static void main(String[] args) {

        //Create an empty list
        LinkedList<String> list = new LinkedList<>();

//        Creates a linked list initialized with the elements from the specified collection
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        LinkedList<Integer> myList = new LinkedList<>(numbers);
        System.out.println(myList);

        //Important Methods:
        list.add("add"); //Add end of the list //Overloaded Method
        list.add(1, "add 2nd index"); //Overloaded Method
        list.addFirst("add first");
        list.addLast("add last");

        list.remove("add"); //Removes and returns from first //Overloaded Method
        list.remove(1); //Remove and returns indexed element //Overloaded Method
        list.removeFirst();
        list.removeLast();
        System.out.println(list.get(1));	//Retrieves the element at the specified index.
        System.out.println(list.getFirst());	//Retrieves the first element in the list.
        System.out.println(list.getLast());	//Retrieves the last element in the list.
        System.out.println(list.size());
        System.out.println(list.peek());

        list.clear();

    }
}

/*
* The LinkedList class in Java is part of the java.util package and is a doubly-linked list implementation of the List and Deque interfaces.
* It provides dynamic memory allocation, meaning it can grow or shrink in size at runtime.
* Important Points:
*   1. Can contain duplicate data.
*   2. Maintains order
*   4. Can be used as list, stack or queue
*   5. Accessing by index is less efficient than ArrayList
*
* Characteristics:
*   1. Elements are stored as nodes.
*   2. Each node contains a data value and pointers to the previous and next nodes.
*   3. Supports constant time insertion and deletion (unlike ArrayList, which requires shifting).
*
* Internal Working:
*   1. Internal Working of LinkedList() Constructor.
*   - Creates an empty list by initializing:
*       -> first and last nodes as null.
*       -> Sets size to 0.
*
*   2. Internal Working of add(E e)
*       - Append the element to the end of the list
*           -> Create new node containing the data
*           -> List previous last node to new node
*           -> Update the last pointer to new node
*           -> Increment the list size
*
*   3. Internal working of remove()
*       - Remove the first element of the node
*           -> Store the current first node to temp variable
*           -> Update the first node to point to next node.
*           -> Decrement the size
*           -> If list is empty update the first and last node to empty
*
*   4. Internal working of get(int index)
*       - Get the element from specific index
*           -> If the index is closer to first, traverse from beginning
*           -> if the index is closer to last, traverse from end
*
*   5. Internal working of offer(E e)
*       - Add the element at the end of the queue.
*       - Similar to add(E e) but used in Deque context
*
*   6. Internal working of peek()
*       - Returns the first element of the list without removing it.
*  */
