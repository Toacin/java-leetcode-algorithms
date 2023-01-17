package HackerRank;

public class palindromeIndex {
    public static int palindromeIndex(String s) {
        // Write your code here

        if (s.length() == 0 || s == null) return -1;

        // initialize a palindrome where
        int indexOfPallindrome = -1;

        // first check if the string is already a palindrome
        StringBuilder initialStringReversed = new StringBuilder(s);
        initialStringReversed.reverse();
        if (initialStringReversed.toString().equals(s)) return -1;


        for (int i=0; i<s.length(); i++) {
            String unreversedString;
            if (i==0) {
                unreversedString = s.substring(1);
            } else if (i==s.length()-1) {
                unreversedString = s.substring(0, s.length()-1);
            } else {
                unreversedString = s.substring(0,i)+s.substring(i+1);
            }

            StringBuilder reversedString = new StringBuilder(unreversedString);
            reversedString.reverse();

            if (unreversedString.equals(reversedString.toString())) return i;
        }

        return indexOfPallindrome;
    }
}
