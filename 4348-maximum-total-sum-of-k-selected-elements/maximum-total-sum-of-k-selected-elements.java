class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ans = 0;
        Arrays.sort(nums);
        int i = nums.length - 1;
        while(k > 0 ){
            if(mul > 0){
                ans += (long)nums[i]*mul;
                mul--;
            }
            else{
                ans += (long) nums[i];
            }
            i--;
            k--;
        }
        return ans;
    }
}