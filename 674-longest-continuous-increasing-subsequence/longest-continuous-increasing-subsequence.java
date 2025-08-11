class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int cnt = 1;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > prev){
                cnt++;
                prev = nums[i];
            }else{
                max = Math.max(max , cnt);
                cnt = 1;
                prev = nums[i];
            }
        }
        return Math.max(max, cnt);
    }
}