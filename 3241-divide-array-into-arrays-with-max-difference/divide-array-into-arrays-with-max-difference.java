class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int newSize = n / 3;
        Arrays.sort(nums);

        int[][] ans = new int[newSize][3];

        int row = 0;

            for(int i = 0; i < n - 2; i += 3){
                int j = i + 1;
                int l = j + 1;
                if(nums[l] - nums[j] <= k && nums[l] - nums[i] <= k && nums[j] - nums[i] <= k){
                    ans[row][0] = nums[i];
                    ans[row][1] = nums[j];
                    ans[row][2] = nums[l]; 
                    row++;
                }else{
                    return new int[0][];
                }
            }
        return ans;
    }
}