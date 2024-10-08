<h2><a href="https://leetcode.com/problems/two-sum">Two Sum</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>

<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>Only one valid answer exists.</strong></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n<sup>2</sup>)</code><font face="monospace">&nbsp;</font>time complexity?


<p><strong class="Solution">Solution:</strong></p>

<p><strong class="Explanation">Explanation:</strong></p>

1. Initialize an empty HashMap called map.
2. Iterate through the array nums using a for loop with index i.
3. For each element nums[i], calculate the difference between the target value and the current element (diffVal = target - nums[i]).
4. Check if the map contains the key diffVal. If it does, it means that we have found two distinct indices i and j such that nums[i] + nums[j] = target. In this case, return the indices as an array [map.get(diffVal), i].
5. If the map does not contain the key diffVal, add the current element nums[i] as a key and its index i as a value to the map.
6. After iterating through the entire array, if no solution is found, return null.

```java

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
```
<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(n)</code>, where <code>n</code> is the number of elements in the array. This is because we traverse the array once, and each lookup and insertion operation in the HashMap takes <code>O(1)</code> time on average.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(n)</code>, where <code>n</code> is the number of elements in the array. This is because, in the worst case, we might store all <code>n</code> elements in the HashMap.</p>