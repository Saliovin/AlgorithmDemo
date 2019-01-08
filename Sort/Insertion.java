package Sort;

public class Insertion extends SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            for(int j = i; j > 0; j--) {
                if(array[j] < array[j - 1]) {
                    array = super.swap(array, j, j - 1);
                }
            }
        }

        return array;
    }
}
