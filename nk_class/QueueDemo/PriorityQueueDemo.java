package QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> eventHandler = new PriorityQueue<>();
        eventHandler.add(3);
        eventHandler.add(1);
        eventHandler.add(10);
        eventHandler.offer(6);

        while (!eventHandler.isEmpty()){
            System.out.println(eventHandler.poll()); // Processes in order: 1, 3, 6, 10
        }
    }
}
