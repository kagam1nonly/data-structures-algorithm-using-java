public class QuickSort
{
    public static void main(String[] args)
    {
        /*
            Quicksort is a sorting algorithm that divides a list into smaller sub-lists,
            then sorts those sub-lists independently. It's fast and efficient for large datasets.
            Credits to My Java Sensei BroCode.

            QuickSort = moves smaller elements to left of a pivot.
                        recursively divide array in 2 partitions

            Run-time complexity = Best case O(n log(n))
                                  Average case O(n log(n))
                                  Worst case O(n^2) if already sorted

            Space complexity = O(log(n)) due to recursion
         */
        int[] array = {9, 2, 3, 1, 6, 4, 5, 8, 7};
        quickSort(array, 0, array.length - 1);

        for (int i : array)
        {
            System.out.print(i + " ");
        }
    }

    // Method to perform quick sort
    public static void quickSort(int[] array, int start, int end)
    {
        // Base case: If array has 1 or fewer elements, it is already sorted
        if (end <= start) return;

        // Partition the array and get the pivot index
        int pivot = partition(array, start, end);

        // Recursively sort elements before and after the pivot
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    // Method to partition the array
    private static int partition(int[] array, int start, int end)
    {
        // Choose the last element as the pivot
        int pivot = array[end];

        // Index of the smaller element
        int i = start - 1;

        // Iterate through the array
        for (int j = start; j <= end; j++)
        {
            // If current element is less than or equal to pivot
            if (array[j] < pivot) {
                // Increment index of smaller element
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap pivot with element at index (i + 1)
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        // Return the pivot index
        return i;
    }
}
