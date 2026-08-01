# Permutation Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The set `[1, 2, 3,..., n]` contains a total of `n!` unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for `n = 3`:

- "123"
- "132"
- "213"
- "231"
- "312"
- "321"

Given `n` and `k`, return the `kth` permutation sequence.

 

 **Example 1:** 

```
Input: n = 3, k = 3
Output: "213"

```

 **Example 2:** 

```
Input: n = 4, k = 9
Output: "2314"

```

 **Example 3:** 

```
Input: n = 3, k = 1
Output: "123"

```

 

 **Constraints:** 

- 1 <= n <= 9
- 1 <= k <= n!

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.63%)  
**Memory:** 42.7 MB (beats 76.15%)  
**Submitted:** 2026-08-01T13:59:02.305Z  

```java
class Solution {
    public String getPermutation(int n, int k) {
        int[] fact = new int[n + 1];
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        boolean[] used = new boolean[n + 1];
        StringBuilder res = new StringBuilder();

        k--;

        for (int pos = n; pos >= 1; pos--) {
            int block = fact[pos - 1];
            int idx = k / block;
            k %= block;

            for (int num = 1; num <= n; num++) {
                if (used[num])
                    continue;

                if (idx == 0) {
                    res.append(num);
                    used[num] = true;
                    break;
                }

                idx--;
            }
        }

        return res.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-sequence/)