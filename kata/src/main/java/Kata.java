import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -4, 5};
        int[] additiveInverse = invert(numbers);
        System.out.println(Arrays.toString(additiveInverse));
    }

    public static int[] invert(int[] array) {
        int[] additiveInverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            additiveInverse[i] = -array[i];
        }

        return additiveInverse;
    }
}
