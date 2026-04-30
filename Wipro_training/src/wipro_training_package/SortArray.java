package wipro_training_package;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 3};

        // ascending
        Arrays.sort(a);
        System.out.println("Ascending:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // descending
        Integer[] b = {5, 2, 8, 1, 3};
        Arrays.sort(b, Collections.reverseOrder());

        System.out.println("\nDescending:");
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}