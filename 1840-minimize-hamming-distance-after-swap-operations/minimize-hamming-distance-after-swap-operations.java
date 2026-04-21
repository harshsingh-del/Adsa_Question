class Solution {
    int[] parent;

    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] swap : allowedSwaps) {
            union(swap[0], swap[1]);
        }
        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int root = find(i);
            groups.putIfAbsent(root, new ArrayList<>());
            groups.get(root).add(i);
        }

        int ans = 0;
        for (List<Integer> group : groups.values()) {
            Map<Integer, Integer> freq = new HashMap<>();

            for (int idx : group) {
                freq.put(source[idx], freq.getOrDefault(source[idx], 0) + 1);
            }

            for (int idx : group) {
                int val = target[idx];

                if (freq.getOrDefault(val, 0) > 0) {
                    freq.put(val, freq.get(val) - 1);
                } else {
                    ans++;
                }
            }
        }

        return ans;
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px != py) {
            parent[py] = px;
        }
    }
}