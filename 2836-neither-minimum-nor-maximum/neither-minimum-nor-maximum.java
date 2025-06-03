class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length == 1 || nums.length == 2 || nums.length == 0) return -1;

        Arrays.sort(nums);

        int ans = nums[nums.length / 2];   
        return ans;
    }
}