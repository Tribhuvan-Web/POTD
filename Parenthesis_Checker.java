package POTD;

import java.util.Stack;

/**
 * Parenthesis_Checker
 */
public class Parenthesis_Checker {
    public static void main(String[] args) {

    }

    public static boolean ispar(String x) {
        Stack<Character> stk = new Stack<>();
        if (x.isEmpty() || x == null) {
            return true;
        }
        for (int index = 0; index < x.length(); index++) {
            if (x.charAt(index) == ')') {
                if (!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                } else {
                    return false;
                }
            } else if (x.charAt(index) == '}') {
                if (!stk.isEmpty() && stk.peek() == '{') {
                    stk.pop();
                } else {
                    return false;
                }
            } else if (x.charAt(index) == ']') {
                if (!stk.isEmpty() && stk.peek() == '[') {
                    stk.pop();
                } else {
                    return false;
                }
            } else {
                stk.push(x.charAt(index));
            }
        }
        return stk.isEmpty();
    }
}