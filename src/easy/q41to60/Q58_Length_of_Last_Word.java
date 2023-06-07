package easy.q41to60;

public class Q58_Length_of_Last_Word {
    public static void main(String[] args) {
        String input = "Hello World, this is Matrix";

        int length = lengthOfLastWord(input);

        System.out.println("Length of the last word: " + length);
    }

    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }
}


/*
*
* 58. Length of Last Word
Easy
3.3K
174
Companies
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*
* */