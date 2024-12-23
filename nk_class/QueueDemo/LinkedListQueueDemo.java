package QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        queue.offer("Task4");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Processes in order: Task1, Task2, Task3, Task4
        }
    }
}
