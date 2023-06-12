package easy.q21to40;

public class Q35_Search_Insert_Position {

    public static void main(String[] args) {
        Q35_Search_Insert_Position solution = new Q35_Search_Insert_Position();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int index = solution.searchInsert(nums, target);
        System.out.println("Index: " + index);
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
