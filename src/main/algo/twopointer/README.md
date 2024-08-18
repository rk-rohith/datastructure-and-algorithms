<h2>Two Pointer Approach</h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>
<p>Given a sorted array of integers <code>nums</code> and an integer <code>target</code>, return the indices of the two numbers such that they add up to <code>target</code>.</p>

<p>You may assume that each input would have exactly one solution, and you may not use the same element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> nums = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], target = 10
<strong>Output:</strong> [1, 4]
<strong>Explanation:</strong> The numbers at indices 1 and 4 add up to 10.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
 <li>The array <code>nums</code> is sorted in ascending order.</li>
 <li>The elements of <code>nums</code> are integers.</li>
 <li>There is exactly one solution.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="Solution">Solution:</strong></p>

<p><strong class="Explanation">Explanation:</strong></p>

1. Initialize two pointers, <code>left</code> and <code>right</code>, to the start and end of the array, respectively.
2. While <code>left</code> is less than <code>right</code>:
    - Calculate the sum of the elements at the <code>left</code> and <code>right</code> pointers.
    - If the sum is equal to the target, return the indices <code>left + 1</code> and <code>right + 1</code> (one-based index).
    - If the sum is less than the target, move the <code>left</code> pointer to the right.
    - If the sum is greater than the target, move the <code>right</code> pointer to the left.
3. If no solution is found, return an empty array.

```java
public class TwoPointerApproach {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;
        System.out.println(Arrays.toString(twoPointerApproach(nums, target))); // Output: [1, 4]
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
```

<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(n)</code>, where <code>n</code> is the number of elements in the array. The array is traversed once using the two-pointer approach.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(1)</code>, as the solution uses a constant amount of extra space regardless of the input array.</p>

<p>&nbsp;</p>
<h3><strong>Visual Example:</strong></h3>

 <h3> Example 1: Find a pair with given sum in a sorted array using Two Pointer Approach</h3>

<details>
  <summary><strong>Two-Pointer Approach to Find Target Sum</strong></summary>

  <p><strong>Array:</strong> <code>[2, 7, 11, 15]</code></p>
  <p><strong>Target:</strong> 9</p>

  <p><strong>Initial Pointers:</strong></p>
  <p><code>L: 2 (index 0)</code> <code>R: 15 (index 3)</code></p>

  <p><strong>Step 1: Initial Pointers</strong></p>
  <pre><code>[2, 7, 11, 15]
^           ^
L           R
</code></pre>
  <p><strong>Sum:</strong> 2 + 15 = 17</p>
  <p><strong>Action:</strong> Sum > Target, move Left Pointer right</p>

  <p><strong>Step 2: Move Left Pointer Right</strong></p>
  <pre><code>[2, 7, 11, 15]
  ^       ^
  L       R
</code></pre>
  <p><strong>Sum:</strong> 7 + 15 = 22</p>
  <p><strong>Action:</strong> Sum > Target, move Left Pointer right</p>

  <p><strong>Step 3: Move Left Pointer Right</strong></p>
  <pre><code>[2, 7, 11, 15]
    ^   ^
    L   R
</code></pre>
  <p><strong>Sum:</strong> 11 + 15 = 26</p>
  <p><strong>Action:</strong> Sum > Target, move Right Pointer left</p>

  <p><strong>Step 4: Move Right Pointer Left</strong></p>
  <pre><code>[2, 7, 11, 15]
    ^ ^
    L R
</code></pre>
  <p><strong>Sum:</strong> 7 + 11 = 18</p>
  <p><strong>Action:</strong> Sum > Target, move Left Pointer right</p>

  <p><strong>Step 5: Move Left Pointer Right</strong></p>
  <pre><code>[2, 7, 11, 15]
      ^ ^
      L R
</code></pre>
  <p><strong>Sum:</strong> 2 + 11 = 13</p>
  <p><strong>Action:</strong> Sum > Target, move Left Pointer right</p>

  <p><strong>Step 6: Move Left Pointer Right</strong></p>
  <pre><code>[2, 7, 11, 15]
        ^ ^
        L R
</code></pre>
  <p><strong>Sum:</strong> 7 + 11 = 18</p>
  <p><strong>Action:</strong> Sum > Target, move Left Pointer right</p>

  <p><strong>Termination:</strong></p>
  <pre><code>[2, 7, 11, 15]
          ^
          L
</code></pre>
  <p><strong>Conclusion:</strong> No pair of numbers in the array sums up to the target value of 9.</p>
</details>



<h3> Example 2: Reversing a String</h3>
<details>
  <summary><strong>Reversing a String</strong></summary>

  <p><strong>String:</strong> <code>"hello"</code></p>

  <p><strong>Initial Pointers:</strong></p>
  <pre><code>String:  h e l l o
Index:   0 1 2 3 4
         ^               ^
         L               R
</code></pre>

  <p><strong>First Swap:</strong></p>
  <pre><code>Swap 'h' and 'o'
New String: "oellh"
         o e l l h
Index:   0 1 2 3 4
         ^           ^
         L           R
</code></pre>

  <p><strong>Move the Pointers Inward:</strong></p>
  <pre><code>String:  o e l l h
Index:   0 1 2 3 4
           ^       ^
           L       R
</code></pre>

  <p><strong>Second Swap:</strong></p>
  <pre><code>Swap 'e' and 'l'
New String: "olleh"
         o l l e h
Index:   0 1 2 3 4
           ^   ^
           L   R
</code></pre>

  <p><strong>Move the Pointers Inward:</strong></p>
  <pre><code>String:  o l l e h
Index:   0 1 2 3 4
             ^   ^
             L   R
</code></pre>

  <p><strong>Pointers Cross:</strong></p>
  <pre><code>String:  o l l e h
Index:   0 1 2 3 4
               ^ ^
               L R
</code></pre>

  <p><strong>Conclusion:</strong> The string is now reversed to <code>"olleh"</code>.</p>
</details>
