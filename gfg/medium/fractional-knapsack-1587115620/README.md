# Fractional Knapsack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays,  **val[]** and  **wt[]** , representing the values and weights of items, and an integer  **capacity** representing the maximum weight a knapsack can hold, determine the maximum total value that can be achieved by putting items in the knapsack. You are allowed to break items into  **fractions** if necessary.
Return the  **maximum** value as a double, rounded to 6 decimal places.

 **Examples :** 

```
Input: val[] = [60, 100, 120], wt[] = [10, 20, 30], capacity = 50
Output: 240.000000
Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240

```

```
Input: val[] = [500], wt[] = [30], capacity = 10
Output: 166.670000
Explanation: Since the item’s weight exceeds capacity, we take a fraction 10/30 
```

 **Constraints:** 
1 ≤ val.size = wt.size ≤ 105
1 ≤ capacity ≤ 109
1 ≤ val[i], wt[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T21:09:39.630Z  

```java


class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        Integer[] items = new Integer[n];
        for (int i = 0; i < n; i++) {
            items[i] = i;
        }

        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double) val[b] / wt[b],
                (double) val[a] / wt[a]
            )
        );

        double maxValue = 0.0;

        for (int idx : items) {

            if (wt[idx] <= capacity) {
                maxValue += val[idx];
                capacity -= wt[idx];
            } else {
                maxValue += ((double) val[idx] / wt[idx]) * capacity;
                break;
            }
        }

        return maxValue;
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1)