# Coin Change

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money.

Return  *the fewest number of coins that you need to make up that amount*. If that amount of money cannot be made up by any combination of the coins, return `-1`.

You may assume that you have an infinite number of each kind of coin.

 

 **Example 1:** 

```
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

```

 **Example 2:** 

```
Input: coins = [2], amount = 3
Output: -1

```

 **Example 3:** 

```
Input: coins = [1], amount = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= coins.length <= 12
- 1 <= coins[i] <= 231 - 1
- 0 <= amount <= 104

## Solution

**Language:** Java  
**Runtime:** 39 ms (beats 8.40%)  
**Memory:** 47.4 MB (beats 11.06%)  
**Submitted:** 2026-07-07T19:34:05.188Z  

```java
class Solution {

    private int[][] dp;

    private int solve(int[] coins, int amt, int n, int idx) {

        if (amt == 0) return 0;
        if (idx == n) return (int)1e9;

        if (dp[idx][amt] != -1)
            return dp[idx][amt];

        int notTake = solve(coins, amt, n, idx + 1);

        int take = (int)1e9;
        if (amt >= coins[idx])
            take = 1 + solve(coins, amt - coins[idx], n, idx);

        return dp[idx][amt] = Math.min(notTake, take);
    }

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);

        int ans = solve(coins, amount, n, 0);

        return ans >= 1e9 ? -1 : ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/coin-change/)