import java.util.LinkedList;
import java.util.Queue;

public class MyQueue
{
    public static void main(String[] args)
    {
        // Queue: follows a First-In-First-Out (FIFO) data structure
        //        elements are inserted at the rear (end) and removed from the front
        //        enqueue() adds an element to the rear of the queue
        //        dequeue() removes and returns the element from the front of the queue
        //        peek() returns the element at the front of the queue without removing it
        //        isEmpty() checks if the queue is empty
        //        size() returns the number of elements in the queue

        // Declare the queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements into the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");

        // Print the queue
        System.out.println("Queue elements:");
        for (String s : queue)
        {
            System.out.println(s);
        }

        // Dequeue an element
        System.out.println("\nDequeuing...");
        String dequeued = queue.remove();

        // Print the queue after dequeueing
        System.out.println("\nQueue after dequeueing:");
        for (String s : queue)
        {
            System.out.println(s);
        }

        // Peek the front element
        System.out.println("\nPeeking:");
        String peeked = queue.peek();
        System.out.println(peeked);

        // Check if the queue is empty
        System.out.println("\nIs the queue empty?");
        boolean isEmpty = queue.isEmpty();
        System.out.println(isEmpty);

        // Get the size of the queue
        System.out.println("\nSize of the queue:");
        int size = queue.size();
        System.out.println(size);
    }
}
