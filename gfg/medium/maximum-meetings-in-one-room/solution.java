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
