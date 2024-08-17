<h2>Palindrome Check</h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />
<hr>
<p>Given a string <code>str</code>, the goal is to determine if the string is a palindrome. A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).</p>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> str = "madam"
<strong>Output:</strong> true
<strong>Explanation:</strong> The string "madam" reads the same forward and backward.
</pre>

<pre>
<strong>Input:</strong> str = "hello"
<strong>Output:</strong> false
<strong>Explanation:</strong> The string "hello" does not read the same forward and backward.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
 <li>The input string <code>str</code> is non-empty.</li>
 <li>The input string <code>str</code> consists of lowercase English letters.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="Solution">Solution:</strong></p>

<p><strong class="Explanation">Explanation:</strong></p>

1. Initialize an empty string <code>revStr</code> to store the reversed string.
2. Iterate through the input string <code>str</code> from the end to the beginning.
3. For each character in the string, append it to <code>revStr</code>.
4. Compare the original string <code>str</code> with the reversed string <code>revStr</code>.
5. Return <code>true</code> if they are equal, otherwise return <code>false</code>.

```java

private static boolean isPalindrome(String str) {
    String revStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        revStr += str.charAt(i);
    }
    return str.equals(revStr);
}
```

<p><strong>Time Complexity:</strong></p>
<p>The time complexity of this solution is <code>O(n)</code>, where <code>n</code> is the length of the input string <code>str</code>. The string is traversed once to create the reversed string.</p>

<p><strong>Space Complexity:</strong></p>
<p>The space complexity is <code>O(n)</code>, where <code>n</code> is the length of the input string <code>str</code>. The reversed string is stored in a separate variable.</p>
