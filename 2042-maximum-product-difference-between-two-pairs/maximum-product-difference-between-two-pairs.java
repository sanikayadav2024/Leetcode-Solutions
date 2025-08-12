class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int w = nums[nums.length - 1];
        int x = nums[0];
        int y = nums[nums.length - 2];
        int z = nums[1];

        return (w * y) - (z * x);
    }
}