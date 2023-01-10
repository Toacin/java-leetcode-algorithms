package LeetCode.Easy;

// determine if number is palindromic (return boolean)
// my solution:
public class palindrome {
    static public boolean isPalindrome(int x) {
        String intStringified = String.valueOf(x);
        char[] charArray = new char[intStringified.length()];
        for (int i = 0; i<intStringified.length(); i++) {
            charArray[(intStringified.length()-1)-i] = intStringified.charAt(i);
        }

        String reverseString = new String(charArray);
        return reverseString.equals(intStringified);
    }

    static public void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
