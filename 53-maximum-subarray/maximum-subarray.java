class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for(int n : nums){
            if(sum < 0){
                sum = 0;
            }
            sum += n;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}