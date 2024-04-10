public class InsertionSort
{
    public static void main(String[] args)
    {
        /*
            Insertion Sort: after comparing elements to the left
                            shift elements to the right to make the room to insert a value

            Run-time complexity:    Quadratic time O(n^2)
                                    Small data set: decent
                                    Large data set: bad
         */

        int[] array = {3, 6, 9, 1, 5, 7};

        insertionSort(array);

        for (int i : array)
        {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array)
    {
        // Iterate over the array starting from the second element
        for (int i = 1; i < array.length;  i++)
        {
            // Store the current element to be inserted
            int temp = array[i];

            // Initialize a pointer to the previous element
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than temp,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > temp)
            {
                array[j + 1] = array[j];
                j--;
            }

            // Insert the temp value at its correct position in the sorted subarray
            array[j + 1] = temp;
        }
    }
}
