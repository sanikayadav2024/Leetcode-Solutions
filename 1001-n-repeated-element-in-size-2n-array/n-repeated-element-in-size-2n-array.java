class Solution {
    public int repeatedNTimes(int[] nums) {
       ArrayList<Integer> list=new ArrayList<>();
       for(int i = 0; i <= nums.length; i++){
           if(list.contains(nums[i])){
               return nums[i];
            }
            else {
               list.add(nums[i]);
            }
       }
       return nums[nums.length];
    }
}