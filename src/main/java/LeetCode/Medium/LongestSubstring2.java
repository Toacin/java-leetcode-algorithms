package LeetCode.Medium;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring2 {
    public int lengthOfLongestSubstring(String s) {
//        StringBuilder maxString = new StringBuilder();


        HashMap<String, Integer> charSet = new HashMap<>();

        int maxLength = 0;
        int startingIndex = 0;

        for (int i=0; i<s.length(); i++) {
            String charInQuestion = String.valueOf(s.charAt(i));
            if (charSet.containsKey(charInQuestion)) {
                int prevInstance = charSet.get(charInQuestion);
                maxLength = Math.max(maxLength, charSet.size());
                for (int j=startingIndex; j<=prevInstance; j++) {
                    charSet.remove(String.valueOf(s.charAt(j)));
                }
                startingIndex = prevInstance+1;
                charSet.put(charInQuestion, i);
            } else {
                charSet.put(charInQuestion, i);
            }
        }

        return Math.max(maxLength, charSet.size());
    }
}
