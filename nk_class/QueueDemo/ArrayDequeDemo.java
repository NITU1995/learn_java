package QueueDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Start");
        deque.addLast("Middle");
        deque.addLast("End");

        deque.pollFirst(); //Removed: Start
        deque.pollLast(); //Removed: End
        System.out.println(deque); // Output: [Middle]
    }
}
