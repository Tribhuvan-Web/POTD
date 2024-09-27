package POTD;

import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayList;

public class SlidingMaximum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        System.out.println(max_of_subarray(3, arr));
    }

    public static ArrayList<Integer> max_of_subarray(int k, int nums[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> que = new LinkedList<>();
        int i = 0, j = 0;
        while (j < nums.length) {
            if (que.size() == 0) {
                que.add(nums[j]);
            } else {
                while (que.size() > 0 && que.peekLast() < nums[j]) {
                    que.removeLast();
                }
                que.add(nums[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                list.add(que.peek());
                if (nums[i] == que.peek()) {
                    que.removeFirst();
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
