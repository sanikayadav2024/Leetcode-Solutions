class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int cnt = 0;
        int x = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1] || nums[i] == nums[i + 1]){
                cnt ++;
                x = i;
            }
        }
        if(cnt > 1) return false;
        else if(cnt == 1){
            if(x == 0 || x ==nums.length -2) return true;
            if(nums[x + 1] > nums[x - 1] || nums[x + 2] > nums[x]) return true;
            else return false;
        }
        return true;
    }
}