package easy.q61to80;

public class Q67_Add_Binary {
//String
    public static void main(String[] args) {
        String a = "101";
        String b = "1101";

        String result = addBinary(a, b);
        System.out.println("Result: " + result);
    }

    public static String addBinary(String a, String b) {
        String answer = "";
        int carry = 0;
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        int j = a.length() - 1;

        for (int i = b.length() - 1; i >= 0; i--, j--) {
            if ((a.charAt(j) - '0') + (b.charAt(i) - '0') + carry == 3) {
                answer = "1" + answer;
                carry = 1;
            } else if ((a.charAt(j) - '0') + (b.charAt(i) - '0') + carry == 2) {
                answer = "0" + answer;
                carry = 1;
            } else if ((a.charAt(j) - '0') + (b.charAt(i) - '0') + carry == 1) {
                answer = "1" + answer;
                carry = 0;
            } else {
                answer = "0" + answer;
                carry = 0;
            }
        }

        while (j >= 0) {
            if ((a.charAt(j) - '0') + carry == 2) {
                answer = "0" + answer;
                carry = 1;
            } else if ((a.charAt(j) - '0') + carry == 1) {
                answer = "1" + answer;
                carry = 0;
            } else {
                answer = "0" + answer;
                carry = 0;
            }
            j--;
        }
        if (carry == 1) {
            return "1" + answer;
        }

        return answer;
    }
}


/*
*
* 67. Add Binary
Easy
8.1K
801
Companies
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*
* */