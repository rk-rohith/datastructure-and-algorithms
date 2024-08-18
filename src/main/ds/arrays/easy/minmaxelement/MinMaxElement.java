package ds.arrays.easy.minmaxelement;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 2, 8, 10};
        int[] result = minMaxElementArray(nums);
        System.out.println("Min: " + result[0] + " Max: " + result[1]); // Output: Min: 2 Max: 10
    }

    private static int[] minMaxElementArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        return new int[]{min, max};
    }
}
