<h2><a href="https://leetcode.com/problems/largest-element-in-an-array">Largest Element in an Array</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given an array of integers <code>nums</code>, the goal is to find and return the largest element in the array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> nums = [2, 4, 6, 2, 8, 10]
<strong>Output:</strong> 10
<strong>Explanation:</strong> The largest element in the array is 10.
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

1. Initialize a variable <code>max</code> to the first element of the array.
2. Iterate through the array starting from the second element.
3. During each iteration, compare the current element with <code>max</code>.
4. If the current element is greater than <code>max</code>, update <code>max</code> to the current element.
5. After completing the iteration, <code>max</code> will contain the largest element in the array.
6. Return <code>max</code>.

```java
public static int LargestElementArray(int[] num) {
    int max = num[0];
    for (int i = 1; i < num.length; i++) {
        if (num[i] > max) {
            max = num[i];
        }
    }
    return max;
}
```

<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(n)</code>, where <code>n</code> is the number of elements in the array. The array is traversed once to find the largest element.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(1)</code>, as no additional space is required apart from the input array.</p>