package easy.q1to20;

public class Q9_Palindrome_Number_2 {
    public static void main(String[] args) {
        int number = 1221;
        String result = isPalindrome(number);
        System.out.println(result);
    }

    private static String isPalindrome(int number) {
        if (number < 0) return "Is negative";

        int reversed = 0;
        int orignal = number;

        while(number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }

        if (orignal == reversed)
            return orignal + " is a Palindrome.";
        else
            return orignal + " is not a Palindrome.";
    }
}
