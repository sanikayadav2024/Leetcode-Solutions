class Solution {
    public int minOperations(int[] nums, int x) {
        int k = -x;
        int n = nums.length;
        for(int a : nums){
            k += a;
        }

        if(k < 0) return -1;
        if(k == 0) return n;

        int min = -1;
        int i = 0;
        int s = 0;
        for(int j = 0; j < n; j++){
            s += nums[j];
            while(s > k){
                s -= nums[i++];
            }

            if(s == k){
                min = Math.max(min, j - i + 1);
            }
        }
        return min < 0 ? -1 : n - min;
    }
}