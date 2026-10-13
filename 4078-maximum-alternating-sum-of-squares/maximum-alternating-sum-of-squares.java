class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] a = new long[nums.length];

        for(int i = 0; i < nums.length; i++){
            a[i] = (long) nums[i]*nums[i];
        }

        Arrays.sort(a);

        int n = nums.length/2;
        long ans = 0;

        for(int i = 0; i < n; i++){
            ans -= a[i];
        }
        for(int i = n; i < nums.length; i++){
            ans += a[i];
        }

        return ans;
    }
}