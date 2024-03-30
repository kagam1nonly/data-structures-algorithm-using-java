public class MergeSort
{
    public static void main(String[] args)
    {
        /*
            MergeSort is a sorting algorithm that divides the array into two halves,
            recursively sorts the sub-arrays, and then merges them. It's efficient
            for large datasets and has a stable O(n log n) time complexity.
            Credits to My Java Sensei BroCode.

            Merge sort: recursively divide array in 2, sort, re-combine

            Run-time complexity: O(n Log n)

            Space complexity: O(n)
         */

        // Declare the array
        int[] array = {9, 2, 3, 1, 6, 4, 5, 8, 7};
        // MergeSort the selected array
        mergeSort(array);

        // Print the sorted array
        for (int i : array)
        {
            System.out.print(i + " ");
        }
    }

    // Method to perform merge sort
    public static void mergeSort(int[] array)
    {
        // Base case: If array has 1 or fewer elements, it is already sorted
        if (array.length <= 1) return;

        // Find the middle index
        int middle = array.length / 2;

        // Create left and right sub-arrays
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        int i = 0; // left array
        int j = 0; // right array

        // Iterate through the original array
        for (; i < array.length; i++)
        {
            // If the current index is less than the middle index
            if (i < middle)
            {
                // Copy the element at index i from the original array to the left subarray
                leftArray[i] = array[i];
            }
            // If the current index is greater than or equal to the middle index
            else
            {
                // Copy the element at index i from the original array to the right subarray
                rightArray[j] = array[i];
                // Increment the index for the right subarray
                j++;
            }
        }

        // Recursively sort left and right sub-arrays
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted sub-arrays
        merge(leftArray, rightArray, array);
    }

    // Method to merge two sorted sub-arrays
    public static void merge(int[] leftArray, int[] rightArray, int[] array)
    {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;

        // Compare elements from left and right sub-arrays and merge
        while (l < leftSize && r < rightSize)
        {
            if (leftArray[l] < rightArray[r])
            {
                array[i] = leftArray[l];
                i++;
                l++;
            }

            else
            {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // Copy remaining elements from leftArray, if any
        while (l < leftSize)
        {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        // Copy remaining elements from rightArray, if any
        while (r < rightSize)
        {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
