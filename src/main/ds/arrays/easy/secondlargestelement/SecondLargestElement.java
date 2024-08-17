package ds.arrays.easy.secondlargestelement;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 2, 8, 10};
        System.out.println(SecondLargestElementArray(nums)); // Output: 8
    }
    public static int SecondLargestElementArray(int[] nums){
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }

        return secondMax;

    }
}
