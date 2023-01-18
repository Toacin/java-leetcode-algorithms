package HackerRank;

import java.util.Stack;

public class validParenthesis {
    public static String isBalanced(String s) {
        // Write your code here
        Stack<String> stackOfCharacters = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            String characterInQuestion = String.valueOf(s.charAt(i));
            if (characterInQuestion.equals("(")) {
                stackOfCharacters.add(")");
            } else if (characterInQuestion.equals("[")) {
                stackOfCharacters.add("]");
            } else if (characterInQuestion.equals("{")) {
                stackOfCharacters.add("}");
            } else {
                if (stackOfCharacters.size()==0) return "NO";
                String topOfStack = stackOfCharacters.pop();
                if (characterInQuestion.equals(topOfStack)) continue;
                else return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}"));
        System.out.println(isBalanced("{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))["));
        System.out.println(isBalanced("[)](][[([]))[)"));
        System.out.println(isBalanced("]}]){[{{){"));
        System.out.println(isBalanced("{[(}{)]]){(}}(][{{)]{[(((}{}{)}[({[}[}((}{()}[]})]}]]))((]][[{{}[(}})[){()}}{(}{{({{}[[]})]{((]{[){["));
        System.out.println(isBalanced("()}}[(}])][{]{()([}[}{}[{[]{]](]][[))(()[}(}{[{}[[]([{](]{}{[){()[{[{}}{[{()(()({}([[}[}[{(]})"));
        System.out.println(isBalanced("){[])[](){[)}[)]}]]){](]()]({{)(]])(]{(}(}{)}])){[{}((){[({(()[[}](]})]}({)}{)]{{{"));
        System.out.println(isBalanced("[(})])}{}}]{({[]]]))]})]"));
        System.out.println(isBalanced("[{"));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced(""));
    }
}
