class Solution {
    public int singleNonDuplicate(int[] nums) {
       return bst(0, nums.length - 1, nums);
    }
    private int bst(int start, int end, int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];

        if(nums[0] != nums[1]) return nums[0];

        if(nums[n - 1] != nums[n - 2]) return nums[n - 1];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]){
                return nums[mid];
            }
            if(nums[mid] == nums[mid + 1] && mid % 2 == 0 || nums[mid] == nums[mid - 1] && mid % 2 == 1){
                return bst(mid + 1, end, nums);
            } else{
                return bst(start, mid - 1, nums);
            }
        }
        return -1;
    }
}