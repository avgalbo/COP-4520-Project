public class QuickSort
{
    public static void quickSort(int low, int high, int[] array)
    {
        if (low < high) 
        {
            // partitioningIdx is partitioning index, arr[p]
            // is now at right place
            int partitioningIdx = partition(low, high, array);

            // Separately sort elements before
            // partition and after partition
            quickSort(low, partitioningIdx - 1, array);
            quickSort(partitioningIdx + 1, high, array);
        }
    }

    public static void swap(int i, int j, int [] array)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int low, int high, int[] array)
    {
        // pivot point
        int pivot = array[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) 
        {
            // If current element is smaller
            // than the pivot
            if (array[j] < pivot) 
            {
                // Increment index of
                // smaller element
                i++;
                swap(i, j, array);
            }
        }
        swap(i + 1, high, array);
        return (i + 1);
    }
}
