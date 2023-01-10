package LeetCode.Easy;

public class lengthOfFinalWord {
    static public int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length-1].length();
    }

    static public void main(String[] args) {
        String test1 = "Hello my name is Toacin";
        String test2 = "Hello my name is Jonathan";
        String test3 = "Hello my name is jfksldjf;aslkdfjskldfjsdl;kfjsl;";

        System.out.println(lengthOfLastWord(test3));
    }
}
