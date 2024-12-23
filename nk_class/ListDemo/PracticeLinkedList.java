package ListDemo;

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
