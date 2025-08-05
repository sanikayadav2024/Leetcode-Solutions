class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0;
        for(int f = 0; f < n; f ++){
            ans[i] = nums[f];
            i +=2;
        }
        int j = 1;
        for(int s = n; s < nums.length; s++){
            ans[j] = nums[s];
            j += 2;
        }
        return ans;
    }
}