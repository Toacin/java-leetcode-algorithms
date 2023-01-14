package LeetCode.Medium;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        String longestPalindromicString = "";
        for (int i = 0; i < s.length(); i++) {
            StringBuilder normalStringBuilder = new StringBuilder();
            if (s.length()-i<longestPalindromicString.length()) return longestPalindromicString;
            normalStringBuilder.append(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                normalStringBuilder.append(s.charAt(j));
                StringBuilder reverseStringBuilder = new StringBuilder(normalStringBuilder.toString());
                reverseStringBuilder.reverse();


                if (normalStringBuilder.toString().equals(reverseStringBuilder.toString()) && normalStringBuilder.length()>longestPalindromicString.length()) {
                    longestPalindromicString = normalStringBuilder.toString();
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