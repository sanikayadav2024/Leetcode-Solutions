class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;
        int cnt = 0;

        while(row < m && col >= 0){
            if(grid[row][col] >= 0) row++;
            else {
                cnt += m - row;
                col--;
            }
        }
        return cnt;
    }
}