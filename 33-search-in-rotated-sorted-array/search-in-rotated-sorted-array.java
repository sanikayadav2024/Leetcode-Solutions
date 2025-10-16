class Solution {
    public int search(int[] nums, int target) {
        int beg=0,end=nums.length-1;
        while(end >= beg){
            int mid = beg+ (end -beg)/2;
            if( target == nums[mid])
              return mid;
            if(nums[mid] >= nums[beg]){
                if(target < nums[mid] && target >= nums[beg]){
                    end = mid -1;
                }else {
                    beg = mid+1;
                }
            }
            else{
                if (target > nums[mid] && target < nums[beg]){
                    beg = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}