package Sort;

public class Selection extends SortAlgorithm {

    @Override
    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int lowest = i;

            for(int j = i; j < array.length; j++) {
                if(array[lowest] > array[j]) {
                    lowest = j;
                }
            }

            array = super.swap(array, i, lowest);
        }
    }
}
