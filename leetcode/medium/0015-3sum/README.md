# 3Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

 

 **Example 1:** 

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

```

 **Example 2:** 

```
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

```

 **Example 3:** 

```
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

```

 

 **Constraints:** 

- 3 <= nums.length <= 3000
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 34 ms (beats 61.22%)  
**Memory:** 59.4 MB (beats 32.88%)  
**Submitted:** 2026-07-05T20:23:33.541Z  

```java
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++) {
            if(i>0 && arr[i]==arr[i-1]) continue;

            int left = i+1; int right= n-1;

            while(left<right) {
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==0) {
                    ans.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while(left<right && arr[left]==arr[left-1]) left++;
                    while(left<right && arr[right]==arr[right+1]) right--;
                }
                else if (sum<0) left++;
                else right--;
                }
            }
            return ans;
        }
    }

```

---

[View on LeetCode](https://leetcode.com/problems/3sum/)