class Solution {
    public boolean check(int[] nums) {
        int i = 1;
        int n = nums.length;
        if(n <= 1) return true;
        while(i < n && nums[i] >= nums[i - 1]){
            i++;
        }
        if(i == n) return true;
        i++;
        while(i < n && nums[i] >= nums[i - 1]){
            i++;
        }
        if(i == n && nums[n-1] <= nums[0]){
            return true;
        }
        return false;
    }
}