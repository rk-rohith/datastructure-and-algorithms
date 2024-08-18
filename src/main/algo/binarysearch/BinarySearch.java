package algo.binarysearch;


public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;
        System.out.println(binarySearch(nums, target)); // Output: 4
    }

    private static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids potential overflow

            // Check if target is present at mid
            if (nums[mid] == target) {
                return mid; // Target found
            }

            // If target is greater, ignore left half
            if (nums[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
