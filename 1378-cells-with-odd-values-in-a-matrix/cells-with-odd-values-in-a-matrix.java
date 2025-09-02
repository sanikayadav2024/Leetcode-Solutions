class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        
        for(int i = 0; i < indices.length; i++){
            for(int col = 0; col < n; col++){
                mat[indices[i][0]][col]++;
            }
            for(int row = 0; row < m; row++){
                mat[row][indices[i][1]]++;
            }
        }
        int count = 0;
        for(int[] row : mat){
            for(int col : row){
                if(col % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}