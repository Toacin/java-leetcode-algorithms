package LeetCode.Easy;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        HashMap<String, Integer> letterFrequency = new HashMap<>();
        for (int i=0; i<magazine.length(); i++) {
            String characterInQ = String.valueOf(magazine.charAt(i));
            Integer prevFrequency = letterFrequency.get(characterInQ);
            if (prevFrequency == null) letterFrequency.put(characterInQ, 1);
            else letterFrequency.put(characterInQ, prevFrequency+1);
        }

        System.out.println(letterFrequency.toString());

        for (int i=0; i<ransomNote.length(); i++) {
            String characterInQ = String.valueOf(ransomNote.charAt(i));
            Integer prevFrequency = letterFrequency.get(characterInQ);
            if (prevFrequency == null || prevFrequency == 0) return false;
            else letterFrequency.put(characterInQ, prevFrequency-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
