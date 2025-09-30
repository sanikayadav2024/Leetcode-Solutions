class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return nums[0];

        int[] temp = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = nums[i];
        }
        for(int step = 1; step < n; step++){
            for(int i = 0; i < n - step; i++){
                temp[i] = (temp[i] + temp[i+1]) % 10;
            }
        }
        return temp[0];
    }
}