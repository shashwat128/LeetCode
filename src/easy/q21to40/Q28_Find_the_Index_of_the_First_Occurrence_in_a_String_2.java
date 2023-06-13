package easy.q21to40;

public class Q28_Find_the_Index_of_the_First_Occurrence_in_a_String_2 {

    public static void main(String[] args) {
        String haystack = "The matrix has made prisons of gold.";
        String needle = "prison";
        int result = strStr(haystack, needle);
        System.out.println("Result: " + result); // Output: 7
    }

    public static int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();

        if (haylength < needlelength) {
            return -1;
        }

        for (int i = 0; i <= haylength - needlelength; i++) {
            int j = 0;

            while (j < needlelength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needlelength) {
                return i;
            }
        }

        return -1;
    }
}
