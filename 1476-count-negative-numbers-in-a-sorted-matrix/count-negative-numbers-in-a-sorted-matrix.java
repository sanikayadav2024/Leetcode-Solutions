class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;
        int count = 0;

        while(row < m && col >= 0){
            if(grid[row][col] >= 0){
                row++;
            }
            else{
                count += m - row;
                col--;
            }
        }
        return count;
    }
}