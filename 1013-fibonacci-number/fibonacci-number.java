class Solution {
    public int fib(int n) {
      if(n <= 1) return n;
        //recursion
        // return fib(n - 1) + fib(n - 2);
        int prev1 = 1;
        int prev2 = 0;
        int f = 1;

        for(int i = 2; i <= n; i++){
            f = prev1 + prev2;
            prev2 = prev1;
            prev1 = f;
        }
        return f;
    }
}