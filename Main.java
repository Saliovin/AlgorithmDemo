import Sort.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Merge test = new Merge();
        Random rng = new Random();

        int[] array = new int[50];

        for(int i = 0; i < array.length; i++) {
            array[i] = rng.nextInt(100);
        }

        test.sort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
