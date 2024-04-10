public class BubbleSort
{
    public static void main(String[] args)
    {
        /*
            Bubble Sort: is a simple sorting algorithm that repeatedly steps through the list,
                         compares adjacent elements, and swaps them if they are in the wrong order.

            Bubble sort: pairs of adjacent elements are compared, and the elements swapped
                         if they are not in order.

            Run-time complexity:    Quadratic time O(n^2)
                               :    Small data set = okay-ish
                               :    Large data set = not good

            Space complexity: O(1)
         */

        // Declare the array
        int[] array = {9, 2, 3, 1, 6, 4, 5, 8, 7};
        // MergeSort the selected array
        bubbleSort(array);

        // Print the sorted array
        for (int i : array)
        {
            System.out.print(i + " ");
        }
    }

    // Method to perform bubble sort
    public static void bubbleSort(int[] array)
    {
        // Iterate over the array
        for (int i = 0; i < array.length; i++)
        {
            // Inner loop for each pass through the array
            for (int j = 0; j < array.length - i - 1; j++)
            {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
