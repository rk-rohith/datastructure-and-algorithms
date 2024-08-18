package algo.twopointer;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;
        System.out.println(twoPointerApproach(nums, target)); // Output: 4
    }

    private static int[] twoPointerApproach(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // Returning one-based index
            } else if (sum < target) {
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }

        return new int[0]; // Return an empty array if no solution found
    }
}
