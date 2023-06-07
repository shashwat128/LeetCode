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
