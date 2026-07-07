

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