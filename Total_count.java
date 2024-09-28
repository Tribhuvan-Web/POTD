package POTD;

/**
 * Total_count
 */
public class Total_count {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 3, 4, 7 };
        System.out.println(totalCount(4, arr));
    }

    public static int totalCount(int k, int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] % k == 0 ? arr[i] / k : arr[i] / k + 1;
        }
        return sum;
    }
}