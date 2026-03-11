class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sumLarg = 0;
        int sumSmall = 0;
        int left = 0;
        int right = nums.length - 1;
        for(int i = 1; i <= k; i++){
            sumLarg += nums[right--];
            sumSmall += nums[left++];
        }
        return Math.abs(sumLarg - sumSmall);
    }
}