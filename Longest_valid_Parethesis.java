package POTD;

import java.util.Stack;

public class Longest_valid_Parethesis {
    public static void main(String[] args) {
        System.out.println(Longest_valid_ParethesisI(")()()("));
    }

    public static int Longest_valid_ParethesisI(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(i);
                System.out.println("Valid stack" + stk);
            } else {
                stk.pop();
                if (stk.isEmpty()) {
                    stk.push(i);
                    System.out.println(stk);
                } else {
                    maxLen = Math.max(maxLen, i - stk.peek());
                    System.out.println("Maximum length " + maxLen);
                }
            }
        }
        return maxLen;
    }
}