class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        for(int i = 0; i < k; i++){
            min++;
            max--;
            if(min > max || min == max){
                return 0;
            }
        }
        return max - min;
    }
}