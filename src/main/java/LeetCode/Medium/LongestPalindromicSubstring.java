package LeetCode.Medium;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        String longestPalindromicString = "";
        for (int i = 0; i < s.length(); i++) {
            String normalStringBuilder = "";
            String reverseStringBuilder = "";
            if (s.length()-i<longestPalindromicString.length()) return longestPalindromicString;
            normalStringBuilder = normalStringBuilder+s.charAt(i);
            reverseStringBuilder = s.charAt(i) + reverseStringBuilder;
            for (int j = i+1; j < s.length(); j++) {
                normalStringBuilder = normalStringBuilder + s.charAt(j);
                reverseStringBuilder = s.charAt(j) + reverseStringBuilder;

                if (normalStringBuilder.equals(reverseStringBuilder) && normalStringBuilder.length()>longestPalindromicString.length()) {
                    longestPalindromicString = normalStringBuilder;
                }
            }
        }
        if (longestPalindromicString.length()>0) return longestPalindromicString;
        else return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
