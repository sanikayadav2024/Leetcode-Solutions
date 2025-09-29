class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length <= 1) return 0;
        Arrays.sort(nums);
        int max = nums[1] - nums[0];
        for(int i = 1; i < nums.length - 1; i++){
            max = Math.max(max, nums[i + 1] - nums[i]);
        }
        return max;
    }
}