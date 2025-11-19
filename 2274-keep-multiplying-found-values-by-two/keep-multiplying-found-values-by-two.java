class Solution {
    public int findFinalValue(int[] nums, int original) {
      boolean x = true;
      while(x){
        x = find(nums, original);
        original *= 2;
      }
      return original/2;  
    }

    public boolean find(int[] nums, int original){
        for(int num : nums){
            if(num == original){
                return true;
            }
        }
        return false;
    }
}