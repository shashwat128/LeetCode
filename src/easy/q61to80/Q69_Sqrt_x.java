package easy.q61to80;

public class Q69_Sqrt_x {
    public static void main(String[] args) {
        int x = 19;
        int result = mySqrt(x);
        System.out.println("Square root of " + x + ": " + result);
    }

    public static int mySqrt(int x) {
        int start = 1, end = x, root = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                root = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return root;
    }
}

/*
*
* 69. Sqrt(x)
Easy
6.6K
4.1K
Companies
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1
*
* */