class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = 0;
        for(int num : nums){
            right += num;
        }

        for(int i = 1; i < n; i++){
            left += nums[i-1];
            int r = right - left - nums[i];
            ans[i] = Math.abs(left - r);
        }
        ans[0] = Math.abs(right-nums[0]);
        return ans;
    }
}