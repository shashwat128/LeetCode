package easy.q1to20;

public class Q9_Palindrome_Number {
    public static void main(String[] args) {
        int num = 12321;
        boolean result = isPalindrome(num);

        if (result) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }
    }

    private static boolean isPalindrome(int num) {
        int a = num;
        int b = 0;

        while(a > 0) {
            b = b * 10 + a%10;
            a = a/10;
        }

        // this is a better solution as it consumes less space
        if(b == num)
            return true;
        else
            return false;
    }
}


/*
*
* 9. Palindrome Number
Easy
9.8K
2.5K
Companies
Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
*
* */