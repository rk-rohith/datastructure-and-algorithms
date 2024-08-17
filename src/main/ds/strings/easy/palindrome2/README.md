<h2>Palindrome Check for Integer</h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />
<hr>
<p>Given an integer <code>value</code>, the goal is to determine if the integer is a palindrome. A palindrome is a number that reads the same forward and backward.</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> value = 1234321
<strong>Output:</strong> true
<strong>Explanation:</strong> The integer 1234321 reads the same forward and backward.
</pre>

<pre>
<strong>Input:</strong> value = 12345
<strong>Output:</strong> false
<strong>Explanation:</strong> The integer 12345 does not read the same forward and backward.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
 <li>The input integer <code>value</code> is non-negative.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="Solution">Solution:</strong></p>

<p><strong class="Explanation">Explanation:</strong></p>

1. Store the original value of the integer in <code>originalValue</code>.
2. Initialize <code>reverseValue</code> to 0.
3. While the integer <code>value</code> is greater than 0:
    - Update <code>reverseValue</code> by multiplying it by 10 and adding the last digit of <code>value</code>.
    - Remove the last digit from <code>value</code> by dividing it by 10.
4. Compare the original integer <code>originalValue</code> with the reversed integer <code>reverseValue</code>.
5. Return <code>true</code> if they are equal, otherwise return <code>false</code>.

```java

private static boolean isPalindrome(int value) {
    int originalValue = value;
    int reverseValue = 0;
    while (value > 0) {
        reverseValue = (reverseValue * 10) + (value % 10);
        value = value / 10;
    }
    return originalValue == reverseValue;
}
```

<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(log n)</code>, where <code>n</code> is the value of the input integer. The number of digits in the integer determines the number of iterations required to reverse the integer.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(1)</code>, as the solution uses a constant amount of extra space regardless of the input integer.</p>
