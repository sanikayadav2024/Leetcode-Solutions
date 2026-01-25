class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return 0;
        Arrays.sort(nums);
        int i = 0;
        int minDiff = Integer.MAX_VALUE;
        while(i < n && i + k - 1 < n){
            int diff = nums[i+k-1] - nums[i];
            minDiff = Math.min(minDiff, diff);
            i++;
        }
        return minDiff;
    }
}