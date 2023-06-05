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


/*
*
* 20. Valid Parentheses
Easy
20.1K
1.2K
Companies
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*
* */