class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for(int[] r : grid){
            Arrays.sort(r);
        }
        for(int col = 0; col < grid[0].length; col++){
            int max = 0;
            for(int row = 0; row < grid.length; row++){
                max = Math.max(max, grid[row][col]);
            }
            sum += max;
        }
        return sum;
    }
}