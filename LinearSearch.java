public class LinearSearch
{
    public static void main(String[] args)
    {
        /*
            Linear Search: iterate through a collection one element at a time

            Runtime Complexity: O(n)

            Disadvantages:  Slow for large data sets

            Advantages:    Fast for search of small to medium data sets
                           Does not need to be sorted
                           Useful for data structures that do not have random access(Linked List)
         */
        // Initialize an array of integers
        int[] array = {27, 30, 50, 23, 10, 14};

        // Search for the target element 14 in the array
        int index = linearSearch(array, 14);

        // Print the result
        if (index != -1)
        {
            System.out.println("Element found at index " + index + ".");
        } else
        {
            System.out.println("Element not found in the array.");
        }

    }

    private static int linearSearch(int[] array, int value)
    {
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++)
        {
            // Check if the current element is equal to the target value
            if (array[i] == value)
            {
                // If found, return the index of the element
                return i;
            }
        }

        // If the target element is not found, return -1
        return -1;
    }
}
