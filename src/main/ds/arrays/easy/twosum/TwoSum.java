package ds.arrays.easy.twosum;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        // Test the solution with the given example
        int[] nums = {2, 11, 15, 7};
        int target = 9;  // Expected output: [0, 1]  (since nums[0] + nums[1] = 9)

        int[] result = twoSum(nums, target);
        System.out.println("Two sum result: " + result[0] + ", " + result[1]); // Output: 0, 1
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diffVal = target - nums[i];
            if (map.containsKey(diffVal)) {
                return new int[]{map.get(diffVal), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}