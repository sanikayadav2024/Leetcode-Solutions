class Solution {
    public int majorityElement(int[] nums) {
        int elmt = nums[0];
        int cnt = 0;
        for(int i : nums){
            if(i == elmt) cnt++;
            else cnt--;
            
            if(cnt < 0) {
                elmt = i;
                cnt = 1;
            }
        }
        return elmt;
    }
}