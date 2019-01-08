package Sort;

public abstract class SortAlgorithm {

    abstract int[] sort(int[] array);

    int[] swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        return array;
    }
}
