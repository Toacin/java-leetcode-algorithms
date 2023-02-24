package LeetCode.Easy2;

public class SubSequence {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (tLength<sLength) return false;
        int highIndex = sLength-1;

        StringBuilder testString = new StringBuilder();
        for (int i=0; i<sLength; i++) {
            testString.append(t.charAt(i));
        }

        if (testString.toString().equals(s)) return true;
        highIndex++;

        while (highIndex<tLength) {
            testString.deleteCharAt(0);
            testString.append(highIndex);
            if (testString.toString().equals(s)) return true;
            highIndex++;
        }

        return false;
    }
}
