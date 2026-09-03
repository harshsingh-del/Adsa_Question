class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int sr = -1, sc = -1;
        List<int[]> litter = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                char ch = classroom[r].charAt(c);

                if (ch == 'S') {
                    sr = r;
                    sc = c;
                } else if (ch == 'L') {
                    litter.add(new int[]{r, c});
                }
            }
        }

        int k = litter.size();
        if (k == 0) {
            return 0;
        }
        int[][] litterId = new int[m][n];
        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < k; i++) {
            litterId[litter.get(i)[0]][litter.get(i)[1]] = i;
        }

        int allCollected = (1 << k) - 1;
        int[][][] bestEnergy = new int[m][n][1 << k];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                Arrays.fill(bestEnergy[r][c], -1);
            }
        }

        Queue<State> queue = new ArrayDeque<>();

        bestEnergy[sr][sc][0] = energy;
        queue.offer(new State(sr, sc, 0, energy, 0));

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            State cur = queue.poll();

            if (cur.mask == allCollected) {
                return cur.moves;
            }
            if (cur.energy == 0) {
                continue;
            }

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                int newEnergy = cur.energy - 1;
                int newMask = cur.mask;
                if (classroom[nr].charAt(nc) == 'L') {
                    int id = litterId[nr][nc];
                    newMask |= (1 << id);
                }

                if (classroom[nr].charAt(nc) == 'R') {
                    newEnergy = energy;
                }

                if (bestEnergy[nr][nc][newMask] >= newEnergy) {
                    continue;
                }

                bestEnergy[nr][nc][newMask] = newEnergy;

                queue.offer(
                    new State(nr, nc, newMask, newEnergy, cur.moves + 1)
                );
            }
        }

        return -1;
    }

    static class State {
        int r, c;
        int mask;
        int energy;
        int moves;

        State(int r, int c, int mask, int energy, int moves) {
            this.r = r;
            this.c = c;
            this.mask = mask;
            this.energy = energy;
            this.moves = moves;
        }
    }
}