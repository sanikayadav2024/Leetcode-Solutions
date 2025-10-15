class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int up = 0, down = n - 1;
        int left = 0, right = n - 1;
        int m = 1;
        while (up <= down && left <= right) {
            for(int i = left; i <= right; i++){
                res[up][i] = m++;
            }
            up++;
            for(int i = up; i <= down; i++){
                res[i][right] = m++;
            }
            right--;
            for(int i = right; i >= left; i--){
                res[down][i] = m++;
            }
            down--;
            for(int i = down; i >= up; i--){
                res[i][left] = m++;
            }
            left++;
        }
        return res;
    }
}