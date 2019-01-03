package Search;

public class Linear implements SearchAlgorithm {

    @Override
    public int search(int[] array, int term) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == term) {
                return i;
            }
        }

        return -1;
    }
}
