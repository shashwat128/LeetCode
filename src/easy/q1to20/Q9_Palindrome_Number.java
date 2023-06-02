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
