# Pascal's Triangle

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `numRows`, return the first numRows of  **Pascal's triangle**.

In  **Pascal's triangle**, each number is the sum of the two numbers directly above it as shown:

 

 **Example 1:** 

```
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

```

 **Example 2:** 

```
Input: numRows = 1
Output: [[1]]

```

 

 **Constraints:** 

- 1 <= numRows <= 30

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 94.28%)  
**Memory:** 43.6 MB (beats 33.72%)  
**Submitted:** 2026-07-21T17:48:44.415Z  

```java
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            long value = 1;

            for (int j = 0; j <= i; j++) {

                row.add((int) value);

                value = value * (i - j) / (j + 1);
            }

            ans.add(row);
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/pascals-triangle/)