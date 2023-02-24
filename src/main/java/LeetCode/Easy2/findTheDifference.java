package LeetCode.Easy2;

import java.util.HashMap;
import java.util.Objects;

public class findTheDifference {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> sCharFreq = new HashMap<>();
        HashMap<Character, Integer> tCharFreq = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (sCharFreq.get(s.charAt(i))==null) sCharFreq.put(s.charAt(i), 1);
            else sCharFreq.put(s.charAt(i), sCharFreq.get(s.charAt(i))+1);
        }

        for (int i=0; i<t.length(); i++) {
            if (tCharFreq.get(t.charAt(i))==null) tCharFreq.put(t.charAt(i), 1);
            else tCharFreq.put(t.charAt(i), tCharFreq.get(t.charAt(i))+1);
        }

        System.out.println(sCharFreq.toString());
        System.out.println(tCharFreq.toString());

        for (char charInQ : tCharFreq.keySet()) {
            if (sCharFreq.get(charInQ) == null) return charInQ;
            if ((sCharFreq.get(charInQ) == null) || (sCharFreq.get(charInQ) != tCharFreq.get(charInQ))) return charInQ;
        }

        return '*';
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
