package easy;

public class Q1_Two_sums {

    public static void main(String[] args) {
        int target = 9;
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No match found.");
        }
    }

        private static int[] twoSum(int[] nums, int target) {
            int [] output = new int[2];

            for (int i = 0; i < nums.length - 1; i++) {
                for(int k = i + 1; k < nums.length; k++) {
                    if (nums[i] + nums[k] == target){
                        output[0] = i;
                        output[1] = k;
                        return output;
                    }
                }
            }
            return null;
        }

}

// ================ Problem statement ===============
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/