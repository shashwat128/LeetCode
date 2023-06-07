package easy.q41to60;

public class Q58_Length_of_Last_Word_2 {
    public static void main(String[] args) {
        String input = "Hello World";

        int length = lengthOfLastWord(input);

        System.out.println("Length of the last word: " + length);
    }

    public static int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else if (len > 0) {
                return len;
            }
        }
        return len;
    }
}
