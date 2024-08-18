<h2>Binary Search</h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>
<p>Given a sorted array of integers <code>nums</code> and an integer <code>target</code>, return the index of the target if it is present in the array. If it is not present, return -1.</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> nums = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], target = 10
<strong>Output:</strong> 4
<strong>Explanation:</strong> The target 10 is at index 4.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The array <code>nums</code> is sorted in ascending order.</li>
	<li>The elements of <code>nums</code> are integers.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="Solution">Solution:</strong></p>

<p><strong class="Explanation">Explanation:</strong></p>

1. Initialize two pointers, <code>left</code> and <code>right</code>, to the start and end of the array, respectively.
2. While <code>left</code> is less than or equal to <code>right</code>:
    - Calculate the middle index <code>mid</code> to avoid potential overflow.
    - If the element at <code>mid</code> is equal to the target, return <code>mid</code>.
    - If the element at <code>mid</code> is less than the target, move the <code>left</code> pointer to <code>mid + 1</code>.
    - If the element at <code>mid</code> is greater than the target, move the <code>right</code> pointer to <code>mid - 1</code>.
3. If the target is not found, return -1.

```java
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
```

<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(log n)</code>, where <code>n</code> is the number of elements in the array. The array is divided in half at each step, reducing the search space by half.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(1)</code>, as the solution uses a constant amount of extra space regardless of the input array.</p>
