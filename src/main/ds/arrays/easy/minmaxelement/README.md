<h2>Min and Max Element in an Array</h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given an array of integers <code>nums</code>, the goal is to find and return the minimum and maximum elements in the array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> nums = [2, 4, 6, 2, 8, 10]
<strong>Output:</strong> Min: 2 Max: 10
<strong>Explanation:</strong> The minimum element in the array is 2 and the maximum element in the array is 10.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The array <code>nums</code> contains at least one element.</li>
	<li>The elements of <code>nums</code> are integers.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="Solution">Solution:</strong></p>

<p><strong class="Explanation">Explanation:</strong></p>

1. Initialize a variable <code>min</code> to <code>Integer.MAX_VALUE</code>.
2. Initialize a variable <code>max</code> to <code>Integer.MIN_VALUE</code>.
3. Iterate through the array to find the minimum element:
    - If the current element is less than <code>min</code>, update <code>min</code> to the current element.
4. Iterate through the array to find the maximum element:
    - If the current element is greater than <code>max</code>, update <code>max</code> to the current element.
5. Return an array containing <code>min</code> and <code>max</code>.

```java
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
```

<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(n)</code>, where <code>n</code> is the number of elements in the array. The array is traversed twice to find the minimum and maximum elements.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(1)</code>, as the solution uses a constant amount of extra space regardless of the input array.</p>