package Recursion;

public class Rec8 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isPalindrome(String s) {
            //1.remove non-alphanumeric characters
            StringBuilder str = new StringBuilder();

            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    str.append(c);
                }
            }
            return checkpalindrome(str.toString(), 0, str.length() - 1);
        }

        public boolean checkpalindrome(String str, int left, int right) {
            if (left > right) return true;
            if (checkpalindrome(str, left + 1, right - 1)) {
                if (str.charAt(left) == str.charAt(right))
                    return true;
            }
            return false;

        }
    }
}
