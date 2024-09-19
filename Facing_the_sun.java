package POTD;
/*
  * Facing_the_sun
 * Input: height = [7, 4, 8, 2, 9]
 * Output: 3
 * Explanation: As 7 is the first element, it can see the sunrise. 4 can't see
 * the sunrise as 7 is hiding it. 8 can see. 2 can't see the sunrise. 9 also can
 * see
 * the sunrise.
 */

public class Facing_the_sun {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 2, 9 };
        System.out.println(countBuildings(arr));
    }

    public static int countBuildings(int[] height) {
        int val = height[0];
        int count = 1;
        for (int i = 1; i < height.length; i++) {
            if (val < height[i]) {
                count++;
                val = height[i];
            }
        }
        return count;
    }
}