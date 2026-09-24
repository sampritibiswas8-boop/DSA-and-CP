import java.util.Arrays;

class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);

        int m = cuts.length;
        int arr[] = new int[m + 2];

        arr[0] = 0;
        arr[m + 1] = n;

        for (int i = 0; i < m; i++) {
            arr[i + 1] = cuts[i];
        }

        int t[][] = new int[m + 2][m + 2];

        for (int len = 2; len < m + 2; len++) {
            for (int i = 0; i + len < m + 2; i++) {
                int j = i + len;
                t[i][j] = Integer.MAX_VALUE;

                for (int k = i + 1; k < j; k++) {
                    int cost = arr[j] - arr[i] + t[i][k] + t[k][j];
                    t[i][j] = Math.min(t[i][j], cost);
                }

                if (t[i][j] == Integer.MAX_VALUE) {
                    t[i][j] = 0;
                }
            }
        }

        return t[0][m + 1];
    }
}