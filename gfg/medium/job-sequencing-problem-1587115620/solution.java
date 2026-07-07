        int maxDeadline = 0;
        for (int d : deadline) {
            maxDeadline = Math.max(maxDeadline, d);
        }

        parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int jobsDone = 0;
        int totalProfit = 0;

        for (int idx : jobs) {

            int slot = find(deadline[idx]);

            if (slot > 0) {
                jobsDone++;
                totalProfit += profit[idx];

                parent[slot] = find(slot - 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(jobsDone);
        ans.add(totalProfit);

        return ans;
    }
}