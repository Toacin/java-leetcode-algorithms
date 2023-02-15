package LeetCode.Medium;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s.length()==1) return s;
        int startingIndex = 0;
        int secondaryIndex = 1;
        String longestPalindrome = String.valueOf(s.charAt(0));
        boolean palindromeFound = false;

        for(int i=0; i<s.length(); i++) {
            StringBuilder currentString = new StringBuilder();
            StringBuilder currentStringReverse = new StringBuilder();
            for (int j=0; j<s.length(); j++) {
            }
        }

        return "";
    }
}
