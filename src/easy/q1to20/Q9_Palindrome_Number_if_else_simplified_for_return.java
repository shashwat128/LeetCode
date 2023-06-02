package easy.q1to20;

public class Q9_Palindrome_Number_if_else_simplified_for_return {
    public static void main(String[] args) {
        int num = 126464;
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

        return b == num;
    }
}
