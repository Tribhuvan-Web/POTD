/*
 * GFG -> POTD 
 * Roof Top
 * Input: arr[] = [1, 2, 2, 3, 2]
 * Output: 1
 * Explanation: 1, 2, or 2, 3 are the only consecutive buildings with increasing heights 
 * thus maximum number of consecutive steps with an in gain in altitude would be 1 in both cases.
 */

package POTD;

public class RoofTop {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(maxSteps(arr));
    }

    public static int maxSteps(int arr[]) {
        int steps = 0;
        int maxStep = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                steps++;
            } else {
                steps = 0;
            }
            maxStep = Math.max(maxStep, steps);
        }
        maxStep = Math.max(maxStep, steps);
        return steps;
    }
}
