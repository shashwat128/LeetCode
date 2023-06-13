package easy.q21to40;

public class Q28_Find_the_Index_of_the_First_Occurrence_in_a_String {
//String

    public static void main(String[] args) {
        // Test cases
        String haystack1 = "The world is full of wonders.";
        String needle1 = "world";
        int result1 = strStr(haystack1, needle1);
        System.out.println("Result 1: " + result1);

        String haystack2 = "C++ is an amazing language.";
        String needle2 = "Java";
        int result2 = strStr(haystack2, needle2);
        System.out.println("Result 2: " + result2);
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}


/*
*
* 28. Find the Index of the First Occurrence in a String
Easy
3.7K
194
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.


Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
*
* */