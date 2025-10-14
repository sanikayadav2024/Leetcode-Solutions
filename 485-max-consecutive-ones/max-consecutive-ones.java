class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int count1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count1++;
            }else{
                count1 = 0;
            }
            count = Math.max(count, count1);
        }
        return count;
    }
}