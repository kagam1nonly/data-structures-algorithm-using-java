import java.util.LinkedList;

public class MyLinkedList
{
    public static void main(String[] args)
    {
        /* LinkedList: stores nodes in 2 parts (data + address)
                       nodes are in non-consecutive memory locations
                       elements are linked using pointers

                                Singly Linked List
                   Node                Node                Node
             [data | address] -> [data | address] -> [data | address]

                                Doubly Linked List
                         Node                           Node
             [address | data | address] <-> [address | data | address]

             Advantages:    1. Dynamic Data Structure (allocates needed memory while running)
                            2. Insertion and Deletion of nodes is easy. O(1)
                            3. No low memory usage

             Disadvantages: 1. Greater memory usage
                            2. No random access of elements (no index[i])
                            3. Accessing/searching elements is more time consuming. O(n)

             Uses:          1. Implement stacks/queues
                            2. GPS navigation
                            3. Music playlist
         */

        // Declare the LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Deadpool");
        linkedList.add("Superman");
        linkedList.add("Wolverine");
        linkedList.add("Cyclops");

        // Print the LinkedList
        System.out.println("LinkedList elements:");
        for (String s : linkedList)
        {
            System.out.println(s);
        }

        // Add an element at a specific index
        linkedList.add(2, "Grapes");

        // Print the LinkedList after adding an element
        System.out.println("\nLinkedList after adding an element:");
        for (String s : linkedList)
        {
            System.out.println(s);
        }

        // Remove an element from the LinkedList
        linkedList.remove("Superman");

        // Print the LinkedList after removing an element
        System.out.println("\nLinkedList after removing an element:");
        for (String s : linkedList)
        {
            System.out.println(s);
        }

        // Get the size of the LinkedList
        System.out.println("\nSize of the LinkedList:");
        int size = linkedList.size();
        System.out.println(size);

        // Check if the LinkedList contains a specific element
        boolean contains = linkedList.contains("Cyclops");
        System.out.println("\nDoes the LinkedList contain 'Cyclops'? " + contains);
    }
}
