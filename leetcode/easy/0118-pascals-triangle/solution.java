class Solution {

    public long findPascalElement(int r, int c) {
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }

        return result;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int r = 1; r <= numRows; r++) {

            List<Integer> row = new ArrayList<>();

            for (int c = 1; c <= r; c++) {
                row.add((int) findPascalElement(r, c));
            }

            ans.add(row);
        }

        return ans;
    }
}