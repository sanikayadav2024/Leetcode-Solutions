class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int m = mat.length;
        int n = mat[0].length;
        if(m % 2 != 0){
            sum = mat[m / 2][n / 2];
        }
        for(int i = 0; i < m; i++){
               if(i == m / 2 && m % 2 != 0) continue;
                sum = sum + mat[i][i];
        }
        for(int i = m - 1; i >= 0; i--){
                if(i == m / 2 && m % 2 != 0) continue;
                int j = n -i - 1;
                sum = sum + mat[i][j];
        }
        return sum;
    }
}