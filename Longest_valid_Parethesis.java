package POTD;

//GFG -> 16-09-2024
import java.util.Stack;

public class Longest_valid_Parethesis {
    public static void main(String[] args) {
        System.out.println(Longest_valid_ParethesisI(")()()()"));
    }

    public static int Longest_valid_ParethesisI(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(i);
            } else {
                stk.pop();
                if (stk.isEmpty()) {
                    stk.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stk.peek());
                }
            }
        }
        return maxLen;
    }
}