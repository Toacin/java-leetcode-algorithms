package LeetCode.Easy;

//find the common prefix in an array of words
// my solution:
public class commonPreFix {
    static public String longestCommonPrefix(String[] strs) {
        String wordToCheck = strs[0];
        String finalPrefix = "";
        for (int i=0; i<wordToCheck.length(); i++) {
            char letterToCheck = wordToCheck.charAt(i);
            for (int j=1; j < strs.length; j++) {
                if ((i >= strs[j].length()) || !(letterToCheck == strs[j].charAt(i))) {
                    return finalPrefix;
                }
            }
            finalPrefix += letterToCheck;
        }
        return finalPrefix;
    }
}
