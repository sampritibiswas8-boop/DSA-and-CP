# Maximum Meetings in One Room

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays  **s[]**  and  **f[]**, where  **s[i]**  and  **f[i]**  denote the start time and finish time of the ith meeting, respectively. There is only one meeting room. A meeting can be scheduled only if its start time is  **strictly greater**  than the finish time of the previously selected meeting.

Find the  **maximum**  number of meetings that can be scheduled in the room such that no two selected meetings overlap. Return the indices (1-based) of the selected meetings in sorted (increasing) order.

 **Note:** If multiple schedules are possible, prefer meetings with  **earlier**   **finish**  times. If two meetings have the same finish time, prefer the meeting with the  **smaller index**.

 **Examples:** 

```
Input: s[] = [1, 3, 0, 5, 8, 5], f[] = [2, 4, 6, 7, 9, 9] 
Output: [1, 2, 4, 5]
Explanation: We can attend the 1st meeting from (1 to 2), then the 2nd meeting from (3 to 4), then the 4th meeting from (5 to 7), and the last meeting we can attend is the 5th from (8 to 9). It can be shown that this is the maximum number of meetings we can attend.
```

```
Input: s[] = [3], f[] = [7]
Output: [1]
Explanation: Since there is only one meeting, we can attend the meeting.
```

 **Constraints:** 
1 ≤ s.size() = f.size() ≤ 105
0 ≤ s[i] ≤ f[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-05T20:22:24.079Z  

```java
import java.util.*;

class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {

        int n = s.length;
        ArrayList<int[]> meetings = new ArrayList<>();

       
        for (int i = 0; i < n; i++) {
            meetings.add(new int[]{f[i], s[i], i + 1});
        }

        
        meetings.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[2] - b[2];
        });

        ArrayList<Integer> result = new ArrayList<>();
        int lastEnd = -1;

        for (int[] m : meetings) {
            int end = m[0];
            int start = m[1];
            int idx = m[2];

            if (start > lastEnd) {   
                result.add(idx);
                lastEnd = end;
            }
        }

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-meetings-in-one-room/1)