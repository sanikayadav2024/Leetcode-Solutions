class Solution {
    public int minMoves(int[] nums) {
        // Arrays.sort(nums);
        // int ans = 0;
        // for(int i : nums){
        //     ans += Math.abs(nums[nums.length-1] - i);
        // }
        // return ans;

        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(max, i);
        }
        int ans = 0;
        for(int i : nums){
            ans += max - i;
        }
        return ans;
    }
}