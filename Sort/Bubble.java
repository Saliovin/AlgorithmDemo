package Sort;

public class Bubble implements SortAlgorithm{

    @Override
    public int[] sort(int[] array) {
        for(int i = array.length; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
