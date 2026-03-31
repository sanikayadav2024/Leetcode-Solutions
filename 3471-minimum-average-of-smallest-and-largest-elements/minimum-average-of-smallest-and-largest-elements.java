class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double[] ans = new double[n/2];
        for(int i = 0; i < n/2; i++){
            ans[i] = (double)(nums[i] + nums[n-i-1])/2;
        }
        Arrays.sort(ans);
        return ans[0];
    }
}