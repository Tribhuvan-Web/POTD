package POTD;

// Same as Leetcode no -> 151 Reverse word in the String & GFG POTD => 19-09-2024 Simple change remove space and add comma in the space

public class Reverse_Word {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        if (s.length() == 1 && s.charAt(0) == ' ') {
            return ans.toString();
        }
        int i = s.length() - 1;
        System.out.println(i);
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                --i;
            } else {
                int j = i;
                if (ans.length() > 0) {
                    ans.append(" ");
                }
                while (j >= 0 && s.charAt(j) != ' ') {
                    --j;
                }
                ans.append(s.substring(j + 1, i + 1));
                i = j;
            }
            System.out.println(ans);
        }
        return ans.toString();
    }
}