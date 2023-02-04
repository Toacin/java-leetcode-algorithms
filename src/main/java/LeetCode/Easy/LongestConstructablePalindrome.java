package LeetCode.Easy;

import java.util.HashMap;

public class LongestConstructablePalindrome {
    public int longestPalindrome(String s) {
        int[] bucketAlphabet = new int[52];
        for (char charInQ: s.toCharArray()) bucketAlphabet[(charInQ-'a'<0) ? (charInQ-'a')+59 : charInQ-'a']++;

        int palindromeCounter = 0;
        boolean oddChar = false;
        for (int freq: bucketAlphabet) {
            palindromeCounter += Math.floor(freq/2)*2;
            if (freq%2 != 0) oddChar = true;
        }

        if (oddChar) palindromeCounter++;
        return palindromeCounter;
    }

    public static void main(String[] args) {
        System.out.println(0^1);
    }
}
