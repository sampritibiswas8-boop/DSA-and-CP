# Target Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and an integer `target`.

You want to build an  **expression**  out of nums by adding one of the symbols `'+'` and `'-'` before each integer in nums and then concatenate all the integers.

- For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".

Return the number of different  **expressions**  that you can build, which evaluates to `target`.

 

 **Example 1:** 

```
Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3

```

 **Example 2:** 

```
Input: nums = [1], target = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= nums.length <= 20
- 0 <= nums[i] <= 1000
- 0 <= sum(nums[i]) <= 1000
- -1000 <= target <= 1000

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 73.70%)  
**Memory:** 45 MB (beats 45.05%)  
**Submitted:** 2026-09-22T15:53:07.849Z  

```java
class Solution {
    public int findTargetSumWays(int[] nums, int diff) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        if (Math.abs(diff) > sum)
            return 0;
        if ((diff + sum) % 2 != 0)
            return 0;

        int target = (diff + sum) / 2;

        int[][] t = new int[n + 1][target + 1];

        for(int i = 1;i<n+1;i++){
            t[i][0]=1;
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < target + 1; j++) {
                if(i==0) t[i][j] = 0;
                if(j==0) t[i][j] =1;
                if(i>0) {
                   if (nums[i - 1] <= j)
                    t[i][j] = t[i - 1][j] + t[i - 1][j - nums[i - 1]];
                  else
                    t[i][j] = t[i - 1][j];
                }
                
            }
        }
        return t[n][target];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/target-sum/)