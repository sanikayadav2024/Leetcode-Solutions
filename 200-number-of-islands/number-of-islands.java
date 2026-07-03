class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    check(grid, visited, i, j, m, n);
                    ans++;
                }
            }
        }
        return ans;
    }

    private static void check(char[][] grid, boolean[][] visited, int i, int j, int m, int n) {
        if (visited[i][j])
            return;
        if (grid[i][j] == '0')
            return;
        visited[i][j] = true;
        if (i + 1 < m)
            check(grid, visited, i + 1, j, m, n);
        if (j + 1 < n)
            check(grid, visited, i, j + 1, m, n);
        if (i - 1 >= 0)
            check(grid, visited, i - 1, j, m, n);
        if (j - 1 >= 0)
            check(grid, visited, i, j - 1, m, n);
        return;
    }
}