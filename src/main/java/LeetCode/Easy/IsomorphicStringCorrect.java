package LeetCode.Easy;

import java.util.HashMap;
import java.util.Objects;

public class IsomorphicStringCorrect {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<String, String> stringMap = new HashMap<>();
        HashMap<String, String> reverseStringMap = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            String firstStringChar = String.valueOf(s.charAt(i));
            String secondStringChar = String.valueOf(t.charAt(i));

            if (stringMap.get(firstStringChar) == null) stringMap.put(firstStringChar, secondStringChar);
            else if (!stringMap.get(firstStringChar).equals(secondStringChar)) return false;

            if (reverseStringMap.get(secondStringChar) == null) reverseStringMap.put(secondStringChar, firstStringChar);
            else if (!reverseStringMap.get(secondStringChar).equals(firstStringChar)) return false;
        }
        return true;
    }
}
