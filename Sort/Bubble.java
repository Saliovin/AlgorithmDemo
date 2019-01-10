package Sort;

public class Bubble extends SortAlgorithm {

    @Override
    public void sort(int[] array) {
        for(int i = array.length; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    array = super.swap(array, j, j + 1);
                }
            }
        }
    }
}
