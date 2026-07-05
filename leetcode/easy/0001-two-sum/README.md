# Two Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `nums` and an integer `target`, return  *indices of the two numbers such that they add up to `target`*.

You may assume that each input would have  ***exactly *one solution**, and you may not use the* same* element twice.

You can return the answer in any order.

 

 **Example 1:** 

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

```

 **Example 2:** 

```
Input: nums = [3,2,4], target = 6
Output: [1,2]

```

 **Example 3:** 

```
Input: nums = [3,3], target = 6
Output: [0,1]

```

 

 **Constraints:** 

- 2 <= nums.length <= 104
- -109 <= nums[i] <= 109
- -109 <= target <= 109
- Only one valid answer exists.

 

 **Follow-up:** Can you come up with an algorithm that is less than `O(n2)` time complexity?

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-05T13:58:16.811Z  

```unknown
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> map = new HashMap<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int complement = target - nums[i];
7
8            if (map.containsKey(complement)) {
9                return new int[] { map.get(complement), i };
10            }
11
12            map.put(nums[i], i);
13        }
14
15        return new int[] {};
16    }
17}
```

---

[View on LeetCode](https://leetcode.com/problems/two-sum/)