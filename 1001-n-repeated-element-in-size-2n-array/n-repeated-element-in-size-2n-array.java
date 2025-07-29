class Solution {
    public int repeatedNTimes(int[] nums) {
        if(nums.length <= 2) return nums[0];
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];

    }
}