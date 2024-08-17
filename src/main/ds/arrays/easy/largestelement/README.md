Largest Element in an Array

<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />

Problem Description
Given an array of integers nums, the goal is to find and return the largest element in the array.

Example:
Input: nums = [2, 4, 6, 2, 8, 10]

Output: 10

Explanation: The largest element in the array is 10.


Constraints:
The array nums contains at least one element.
The elements of nums are integers.

Solution:
Explanation:

1. Initialize a variable max to the first element of the array. 
2. Iterate through the array starting from the second element. 
3. During each iteration, compare the current element with max. 
4. If the current element is greater than max, update max to the current element. 
5. After completing the iteration, max will contain the largest element in the array. 
6. Return max.
```java

    public static int LargestElementArray(int[] num){
        int max = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }


```
Time Complexity:
The time complexity of this solution is O(n), where n is the number of elements in the array. The array is traversed once to find the largest element.

Space Complexity:
The space complexity is O(1), as no additional space is required apart from the input array.