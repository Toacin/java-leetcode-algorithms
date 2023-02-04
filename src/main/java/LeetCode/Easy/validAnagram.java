package LeetCode.Easy;

import java.util.HashMap;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
//        int sLength = s.length();
//        int tLength = t.length();
//        if (sLength != tLength) return false;
        int[] bucketAlphabet = new int[26];
        for (int i=0; i<s.length(); i++) {
            bucketAlphabet[s.charAt(i)-'a']++;
        }

        for (int i=0; i<t.length(); i++) {
            int charInQ = t.charAt(i)-'a';
            if (bucketAlphabet[charInQ]==0) return false;
            bucketAlphabet[charInQ]--;
        }

        for (int freq: bucketAlphabet) {
            if (freq != 0) return false;
        }
        return true;
    }
}
