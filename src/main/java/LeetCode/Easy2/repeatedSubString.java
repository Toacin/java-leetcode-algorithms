package LeetCode.Easy2;

import java.util.Arrays;
import java.util.Objects;

public class repeatedSubString {
    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder currString = new StringBuilder();
        for (int i=0; i<s.length()/2; i++) {
            currString.append(s.charAt(i));
            String tmpString = s.replaceAll(currString.toString(), "");
            if (tmpString.equals("")) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababababababababa"));
    }
}
