import java.util.Stack;

public class MyStack
{
    public static void main(String[] args)
    {
        /*
            Stack: follows a Last-In-First-Out (LIFO) data structure
                   stores objects in a vertical tower

            Methods:    Push() inserts an element onto the top of the stack
                        Pop() removes and returns the element from the top of the stack
                        Peek() returns the element at the top of the stack without removing it
                        Search() searches for the element in the stack and returns its 1-based position
         */

        // Declare the stack
        Stack<String> stack = new Stack<String>();

        // Push elements onto the stack
        stack.push("Mariano");
        stack.push("Rafael");
        stack.push("Sydney");
        stack.push("Ana");

        // Print the stack
        for (String s : stack)
        {
            System.out.println(s);
        }

        // Remove the last item (pop)
        System.out.println("\nPopping...");
        stack.pop();

        // Print the stack after popping
        System.out.println("\nStack after popping:");
        for (String s : stack)
        {
            System.out.println(s);
        }

        // Peeking the last item
        System.out.println("\nPeeking:");
        System.out.println(stack.peek());

        // Search for a specific item
        System.out.println("\nSearching for 'Sydney':");
        int position = stack.search("Sydney");
        if (position != -1)
        {
            System.out.println("Found at position: " + position);
        }
        else
        {
            System.out.println("Not found in the stack.");
        }
    }
}
