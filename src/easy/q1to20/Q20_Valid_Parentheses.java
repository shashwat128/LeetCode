package easy.q1to20;

import java.util.Stack;

public class Q20_Valid_Parentheses {
    public static void main(String[] args) {
        String parenthesesSet = "(){}";
        boolean parenthesesAnalysis = parenthesesAnalysis(parenthesesSet);
        System.out.println(parenthesesAnalysis);
    }

    private static boolean parenthesesAnalysis(String parenthesesSet) {
        if (parenthesesSet == null) {
            return true;
        }

        Stack<Character> stack01 = new Stack<>();
        for (Character c : parenthesesSet.toCharArray()) {
            if (c == '(') {
                stack01.push(')');
            } else if (c == '{') {
                stack01.push('}');
            } else if (c == '[') {
                stack01.push(']');
            } else if (stack01.isEmpty() || stack01.pop() != c) {
                return false;
            }
        }

        return stack01.isEmpty();
    }
}
