package Search;

public class Binary implements SearchAlgorithm{

    @Override
    public int search(int[] array, int term) {
        int upperLimit = array.length - 1;
        int lowerLimit = 0;

        while(true) {
            int difference = upperLimit - lowerLimit;

            if(difference < 0) {
                return -1;
            }

            int index = difference / 2 + lowerLimit;
            int value = array[index];

            if(upperLimit == lowerLimit) {
                if(value == term) {
                    return index;
                }
                return -1;
            }

            if(value == term) {
                return index;
            }
            else if(value > term) {
                upperLimit = index - 1;
            }
            else {
                lowerLimit = index + 1;
            }
        }
    }
}
