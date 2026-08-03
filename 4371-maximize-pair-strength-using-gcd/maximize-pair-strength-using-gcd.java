class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                long mult = ((long) nums[i] * (long) nums[j]);
                long curr = gcd(nums[i], nums[j]);
                curr *= curr;

                max = Math.max(max, mult/curr);
            }
        }
        return max;
    }

    int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}