class Solution {
    public int alternatingSum(int[] nums) {
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < nums.length; i += 2){
            sumEven += nums[i];
            if(i + 1 < nums.length){
                sumOdd += nums[i+1];
            }
        }
        return sumEven - sumOdd;
    }
}