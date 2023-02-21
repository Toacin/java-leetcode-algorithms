package LeetCode.Easy;

import java.util.HashSet;
import java.util.Stack;

public class vowelReverse {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int leftIndex = 0;
        int rightIndex = s.length()-1;

        StringBuilder leftSide = new StringBuilder();
        StringBuilder rightSide = new StringBuilder();


        while (leftIndex<=rightIndex) {
            char leftCharInQ = s.charAt(leftIndex);
            char rightCharInQ = s.charAt(rightIndex);
            if (leftIndex==rightIndex) {
                leftSide.append(leftCharInQ);
                break;
            }

            boolean leftIsVowel = vowels.contains(leftCharInQ);
            boolean rightIsVowel = vowels.contains(rightCharInQ);

            if (leftIsVowel && rightIsVowel) {
                rightSide.append(leftCharInQ);
                leftSide.append(rightCharInQ);
                leftIndex++;
                rightIndex--;
            } else if (leftIsVowel) {
                rightSide.append(rightCharInQ);
                rightIndex--;
            } else {
                leftSide.append(leftCharInQ);
                leftIndex++;
            }
        }

        return leftSide.toString() +rightSide.reverse();
    }
}
