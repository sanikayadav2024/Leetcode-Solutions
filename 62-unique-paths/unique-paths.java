class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for(int row = 1; row < m; row++){
            int[] curr = new int[n];
            Arrays.fill(curr, 1);
            for(int col = 1; col < n; col++){
                curr[col] = curr[col-1] + dp[col];
            }
            dp = curr;
        }
        return dp[n-1];
    }
}