class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        n = n + 1;
        int ans = 1;
        for(int i = 2; i <=n; i++){
            ans = a + b;
            a = b;
            b = ans;
        }
        return ans;
    }
}