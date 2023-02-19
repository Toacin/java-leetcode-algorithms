package LeetCode.Easy;

import java.util.HashMap;
import java.util.Objects;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String, Integer> firstStringFreq = new HashMap<>();
        HashMap<String, Integer> secondStringFreq = new HashMap<>();

        stringHashUpdater(s, firstStringFreq);
        stringHashUpdater(t, secondStringFreq);

        HashMap<Integer, Integer> stringOneUniqueCount = new HashMap<>();
        HashMap<Integer, Integer> stringTwoUniqueCount = new HashMap<>();

        uniqueCountMapper(firstStringFreq, stringOneUniqueCount);
        uniqueCountMapper(secondStringFreq, stringTwoUniqueCount);

        for (Integer unique : stringOneUniqueCount.keySet()) {
            if ((stringTwoUniqueCount.get(unique) == null) || (!Objects.equals(stringOneUniqueCount.get(unique), stringTwoUniqueCount.get(unique)))) return false;
        }

        return true;
    }

    public static void stringHashUpdater(String s, HashMap<String, Integer> stringFreq) {
        for (int i=0; i<s.length(); i++) {
            String charInQuestion = String.valueOf(s.charAt(i));
            if (stringFreq.get(charInQuestion) == null) stringFreq.put(charInQuestion, 1);
            else stringFreq.put(charInQuestion, stringFreq.get(charInQuestion)+1);
        }
    }

    public static void uniqueCountMapper(HashMap<String, Integer> stringFreq, HashMap<Integer, Integer> uniqueCount) {
        for (String charInQ : stringFreq.keySet()) {
            int freqInQ = stringFreq.get(charInQ);
            if (uniqueCount.get(freqInQ) == null) uniqueCount.put(freqInQ, 1);
            else uniqueCount.put(freqInQ, uniqueCount.get(freqInQ)+1);
        }
    }
}
