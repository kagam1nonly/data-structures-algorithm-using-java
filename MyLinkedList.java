import java.util.LinkedList;

public class MyLinkedList
{
    public static void main(String[] args)
    {
        // LinkedList: a linear data structure where elements are stored in nodes
        //              each node has a reference to the next node in the sequence
        //              supports dynamic memory allocation
        //              provides operations for adding, removing, and accessing elements

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
