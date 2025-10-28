class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int res = 0;
        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        int l = 0;
        int r = sum;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                if(l - r >= 0 && l - r <= 1){
                    res++;
                }
                if(r - l >= 0 && r - l <= 1){
                    res++;
                }
            }else{
                l += nums[i];
                r -= nums[i];
            }
        }
        return res;
    }
}