package POTD;

import java.util.Arrays;

/*
 * Date -> 17-09-2024
 * Input: k = 2, arr[] = {1, 5, 8, 10}
 * Output: 5
 * Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
 * The difference between the largest and the smallest is 8-3 = 5.
 */

public class Minimize_the_height {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 10 };
        System.out.println(getMinDiff(arr, 2));
    }

    static int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);

        // Initial difference b/w max and min height => 10 - 1 = 9
        int diff = arr[arr.length - 1] - arr[0];

        // Smallest = 1 + 2 => 3
        int smallest = arr[0] + k;

        // Largest = 10 + 2 => 12
        int largest = arr[arr.length - 1] - k;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);
            // Skip if the min get less than zero
            if (min < 0) {
                continue;
            }
            diff = Math.min(diff, max - min);
        }

        return diff;
    }
}
