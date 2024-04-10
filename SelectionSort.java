public class SelectionSort
{
    public static void main(String[] args)
    {
        /*
            Selection Sort: Search through an array and keep track of the minimum value during each iteration.
            At the end of each iteration, we swap variables.

            Run-time complexity: Quadratic time O(n^2)
            Small data set: Okay
            Large data set: Bad
         */

        int[] array = {3, 6, 9, 1, 5, 7};

        selectionSort(array);

        for (int i : array)
        {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array)
    {
        // Iterate over the array
        for (int i = 0; i < array.length - 1; i++)
        {
            // Assume the current index holds the minimum value
            int min = i;

            // Iterate over the unsorted portion of the array to find the minimum value
            for (int j = i + 1; j < array.length; j++)
            {
                // Update the index of the minimum value if a smaller value is found
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            // Swap the minimum value with the first element of the unsorted portion
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
