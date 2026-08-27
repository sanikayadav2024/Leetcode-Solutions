class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int gap = nums[i-1] - nums[i] + 1;
                ans += gap;
                nums[i] += gap;
            }
        }
        return ans;
    }
}