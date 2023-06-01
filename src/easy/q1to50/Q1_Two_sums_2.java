package easy.q1to50;

public class Q1_Two_sums_2 {
    public static void main(String[] args) {
        int target = 11;
        int[] nums = {4,9,5,0};
        int[] result = twoSums(nums, target);

        if (result != null) {
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No match found");
        }
    }

    private static int[] twoSums(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++ ) {
            for (int k = i + 1; k < nums.length; k++ ) {
                if (nums[i] + nums[k] == target) {
                    return new int [] {i, k};
                }
            }
        }
        return null;
    }
}
