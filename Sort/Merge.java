package Sort;

public class Merge extends SortAlgorithm {

    @Override
    public void sort(int[] array) {
        divider(array, 0, array.length - 1);
    }

    private void divider(int[] array, int start, int end) {
        if(start == end) {
            return;
        }

        int mid = (start + end) / 2;
        divider(array, start, mid);
        divider(array, mid + 1, end);

        mergeSort(array, start, mid, end);
    }
    private void mergeSort(int[] array, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] merged = new int[end - start + 1];

        while(i <= mid && j <= end) {
            if(array[i] < array[j]) {
                merged[k] = array[i];
                i++;
            }
            else {
                merged[k] = array[j];

                j++;
            }
            k++;
        }

        if(i > mid) {
            while(j <= end) {
                merged[k] = array[j];
                k++;
                j++;
            }
        }
        else {
            while(i <= mid) {
                merged[k] = array[i];
                k++;
                i++;
            }
        }

        int arrayI = start;

        for(int mergedI = 0; mergedI < merged.length; mergedI++) {
            array[arrayI] = merged[mergedI];
            arrayI++;
        }
    }
}
