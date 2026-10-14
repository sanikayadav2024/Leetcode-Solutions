class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int ans = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    check(grid, visited, m, n, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void check(char[][] grid, boolean[][] visited, int m, int n, int i, int j){
        if(grid[i][j] == '0') return;
        if(visited[i][j]) return;

        visited[i][j] = true;
        if(i+1 < m) check(grid, visited, m, n, i+1, j);
        if(j+1 < n) check(grid, visited, m, n, i, j+1);
        if(i-1 >= 0) check(grid, visited, m, n, i-1, j);
        if(j-1 >= 0) check(grid, visited, m, n, i, j-1);
        return;
    }
}