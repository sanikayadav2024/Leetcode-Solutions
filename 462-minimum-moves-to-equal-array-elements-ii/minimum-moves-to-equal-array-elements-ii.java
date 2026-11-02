class Solution {
    public int minMoves2(int[] nums) {
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // for(int i : nums){
        //     min = Math.min(min, i);
        //     max = Math.max(max, i);
        // }
        Arrays.sort(nums);
        int mid = nums.length / 2;

        // int avg = (min + max) / 2;
        int steps = 0;
        for(int i : nums){
            steps += Math.abs(i-nums[mid]);
        }
        return steps;
    }
}