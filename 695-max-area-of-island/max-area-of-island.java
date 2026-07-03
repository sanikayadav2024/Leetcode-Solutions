class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                  ans = Math.max(ans, check(grid,visited,i,j,m,n));
                }
            }
        }
        return ans;
    }

    private static int check(int[][] grid, boolean[][] visited, int i, int j,int m, int n) {
        if(visited[i][j]) return 0;
        if(grid[i][j] == 0) return 0;
        visited[i][j] = true;
        int cur = 1;
        if(i + 1 < m)
           cur +=check(grid,visited,i+1,j,m,n);
        if(j+1 < n)
          cur +=check(grid, visited, i, j+1,m,n);
        if(i-1 >= 0)
           cur += check(grid,visited,i-1,j,m,n);
        if(j - 1 >= 0)
           cur += check(grid, visited, i, j-1,m,n);
        return cur;
    }
}
