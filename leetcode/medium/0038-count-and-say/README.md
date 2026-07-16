# Count and Say

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The  **count-and-say**  sequence is a sequence of digit strings defined by the recursive formula:

- countAndSay(1) = "1"
- countAndSay(n) is the run-length encoding of countAndSay(n - 1).

Run-length encoding (RLE) is a string compression method that works by replacing each maximal group of consecutive identical characters with the concatenation of the length of the group followed by the character itself. For example, to compress the string `"3322251"` we replace `"33"` with `"23"`, replace `"222"` with `"32"`, replace `"5"` with `"15"`, and replace `"1"` with `"11"`. Thus the compressed string becomes `"23321511"`.

Given a positive integer `n`, return  *the* `nth` *element of the  **count-and-say**  sequence*.

 

 **Example 1:** 

 **Input:**  n = 4

 **Output:**  "1211"

 **Explanation:** 

```
countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"

```

 **Example 2:** 

 **Input:**  n = 1

 **Output:**  "1"

 **Explanation:** 

This is the base case.

 

 **Constraints:** 

- 1 <= n <= 30

 

 **Follow up:**  Could you solve it iteratively?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.61%)  
**Memory:** 43.2 MB (beats 39.71%)  
**Submitted:** 2026-07-16T16:53:37.876Z  

```java
class Solution {
    public String RLE(String sequence) {
        StringBuilder sb = new StringBuilder();
        char[] nums = sequence.toCharArray();
        char curr = nums[0];
        int count = 0;
        
        
        for (char num : nums) {
            if (num == curr)
                count++;
            else {
                sb.append(count);
                sb.append(curr);
                curr = num;
                count = 1;
            }
        }
        
        
        sb.append(count);
        sb.append(curr);
        return sb.toString();
    }
    
    
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        
        
        return RLE(countAndSay(n - 1));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-and-say/)