// This problem was asked by Facebook.

// Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
// For example, given the string "([])[]({})", you should return true.
// Given the string "([)]" or "((()", you should return false.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        sout("" + areBalanced("([])[]({})")); //  => true
        sout("" + areBalanced("([)]")); //        => false
        sout("" + areBalanced("((()")); //        => false
    }

    private static boolean areBalanced(String braces) {
        List<Character> openingBraces = new ArrayList<>();

        for (int i = 0; i < braces.length(); i++) {
            char bracket = braces.charAt(i);

            if (bracket == '[' || bracket == '(' || bracket == '{') { // opening bracket
             openingBraces.add(bracket);
             continue;
            }

            int lastOpeningIndex = openingBraces.size() - 1;
            char lastOpeningBracket = openingBraces.get(lastOpeningIndex);

            if (
                    lastOpeningBracket == '[' && bracket == ']'
                            || lastOpeningBracket == '{' && bracket == '}'
                            || lastOpeningBracket == '(' && bracket == ')'
            ) {
                openingBraces.remove(lastOpeningIndex);
                continue;
            }

            return false;
        }

        return openingBraces.isEmpty();
    }

    static void sout(String str) {
        System.out.println(str);
    }
}
