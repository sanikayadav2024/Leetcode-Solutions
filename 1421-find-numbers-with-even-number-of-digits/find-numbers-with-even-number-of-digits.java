class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int cnt = 0 ;
        for(int x : nums){
            int dig = 0;
            while(x > 0){
              x = x /10;
              dig++; 
            }
            if(dig % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }
}