package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class validParentheses {
    public static boolean isValidParentheses(String parenSet) {
        if (parenSet.length() == 0) return true;
        if (parenSet.length() % 2 != 0) return false;

        return recursiveChecker(parenSet);
    }
    private static boolean recursiveChecker(String refinedString) {
        if (refinedString.length() == 0) return true;
        char characterToCheck = refinedString.charAt(0);
        String[] splitRefinedString = refinedString.split("");
        ArrayList<String> stringArray = new ArrayList<String>(Arrays.asList(splitRefinedString));

        if (characterToCheck == '}' || characterToCheck == ')' || characterToCheck == ']') {
            return false;
        } else {
            String characterToRemove = switch (characterToCheck) {
                case '{' -> "}";
                case '(' -> ")";
                default -> "]";
            };

//            int indexOfRemoval = stringArray.indexOf(characterToRemove);

            int indexOfRemoval = -1;
            for (int i=0; i< stringArray.size(); i++) {
                if (Objects.equals(stringArray.get(i), characterToRemove)) {
                    indexOfRemoval = i;
                }
            }
            if (indexOfRemoval == -1) return false;



            List<String> substringArrayList = stringArray.subList(1,indexOfRemoval);
            String subStringJoinedString = String.join("", substringArrayList);
            if (!recursiveChecker(subStringJoinedString)) return false;

            stringArray.remove(0);
            stringArray.remove(indexOfRemoval-1);


            StringBuilder nextStringIteration = new StringBuilder();
            for (String character : stringArray) {
                nextStringIteration.append(character);
            }
            return recursiveChecker(nextStringIteration.toString());
        }
    }

    static public void main(String[] args){
        String parenset1 = "((()))";
        String parenset2 = "((())))";
        String parenset3 = "";
        String parenset4 = "([{}])";
        String parenset5 = "))((";
        String parenset6 = "{{}}[]";
        String parenset7 = "{})([)(][[{{)([]]()(";
        String parenset8 = "(([]){})";
        String parenset9 = "(())[()]";
        System.out.println(isValidParentheses(parenset4));
    }
}
