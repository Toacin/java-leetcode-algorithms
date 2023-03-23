package CodeWars;

import java.util.HashSet;

public class isograms {
    public static boolean  isIsogram(String str) {
        String lowerStr = str.toLowerCase();
        HashSet<Character> setOfChars = new HashSet<>();
        for (int i=0; i<lowerStr.length(); i++) {
            setOfChars.add(lowerStr.charAt(i));
        }

        return setOfChars.size()==lowerStr.length();
    }
}
