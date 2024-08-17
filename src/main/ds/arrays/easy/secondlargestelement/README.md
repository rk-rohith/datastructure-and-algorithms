<h2><a href="https://leetcode.com/problems/second-largest-element-in-an-array">Second Largest Element in an Array</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given an array of integers <code>nums</code>, the goal is to find and return the second largest element in the array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> nums = [2, 4, 6, 2, 8, 10]
<strong>Output:</strong> 8
<strong>Explanation:</strong> The second largest element in the array is 8.
</pre>

<pre>
<strong>Input:</strong> nums = [1, 2, 3, 4, 5]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The second largest element in the array is 4.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
 <li>The array <code>nums</code> contains at least two elements.</li>
 <li>The elements of <code>nums</code> are integers.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="Solution">Solution:</strong></p>

<p><strong class="Explanation">Explanation:</strong></p>

1. Initialize two variables, <code>max</code> and <code>secondMax</code>, to <code>Integer.MIN_VALUE</code>.
2. Iterate through the array <code>nums</code>.
3. For each element in the array:
    - If the element is greater than <code>max</code>, update <code>secondMax</code> to <code>max</code> and <code>max</code> to the current element.
    - Else if the element is greater than <code>secondMax</code> and not equal to <code>max</code>, update <code>secondMax</code> to the current element.
4. Return <code>secondMax</code>.

```java

 public static int SecondLargestElementArray(int[] nums) {
     int max = Integer.MIN_VALUE;
     int secondMax = Integer.MIN_VALUE;

     for (int num : nums) {
         if (num > max) {
             secondMax = max;
             max = num;
         } else if (num > secondMax && num != max) {
             secondMax = num;
         }
     }

     return secondMax;
 }

```

<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(n)</code>, where <code>n</code> is the number of elements in the array. The array is traversed once to find the second largest element.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(1)</code>, as no additional space is required apart from the input array.</p>
