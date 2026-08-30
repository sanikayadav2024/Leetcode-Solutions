class Solution {
    public int minimumDeletions(int[] nums) {
        int min = minIdx(nums);
        int max = maxIdx(nums);
        int left = Math.min(min, max);
        int right = Math.max(min, max);
        int front = left+1;
        int back = nums.length - right;
        return Math.min(front+back, Math.min(right+1, nums.length-left));
    }

    private int minIdx(int[] nums){
        int m = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                m = i;
            }
        }
        return m;
    }

    private int maxIdx(int[] nums){
        int m = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                m = i;
            }
        }
        return m;
    }
}