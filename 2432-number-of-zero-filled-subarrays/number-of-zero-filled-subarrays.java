class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0;
        long streak = 0;
        for(int num : nums){
            if(num == 0) streak += 1;
            else streak = 0;

            cnt += streak;
        }
        return cnt;
    }
}