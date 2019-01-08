import Sort.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Insertion test = new Insertion();
        Random rng = new Random();

        int[] array = new int[20];

        for(int i = 0; i < array.length; i++) {
            array[i] = rng.nextInt(100);
        }

        for(int i : test.sort(array)) {
            System.out.println(i);
        }
    }
}
