class Solution {
    public int countHillValley(int[] nums) {
        int cnt = 0;
        int left = 0;
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                continue;
            }
            if(nums[left] > nums[i] && nums[i + 1] > nums[i]){
                cnt++;
                left = i;
            }
            else if(nums[left] < nums[i] && nums[i + 1] < nums[i]){
                cnt++;
                left = i;
            }else{
                continue;
            }
        }
        return cnt;
    }
}