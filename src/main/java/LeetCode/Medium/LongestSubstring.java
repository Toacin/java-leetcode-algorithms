package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
//        this solution works but extremely slow on leet code (about 1444ms runtime)

        if (s.length()==0) return 0;
        int longestSubstring = 1;
        String[] stringSplit = s.split("");
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(stringSplit));
        System.out.println(stringList.toString());

        for (int i=0; i< stringList.size(); i++) {
            ArrayList<String> uniqueStringArray = new ArrayList<String>();
            uniqueStringArray.add(stringList.get(i));
            int iOfSubsqChar = i+1;
            while(iOfSubsqChar<stringList.size() && !uniqueStringArray.contains(stringList.get(iOfSubsqChar))) {
                uniqueStringArray.add(stringList.get(iOfSubsqChar));
                iOfSubsqChar++;
            }
            if (uniqueStringArray.size()>longestSubstring) longestSubstring = uniqueStringArray.size();
        }

        return longestSubstring;
    }
}
