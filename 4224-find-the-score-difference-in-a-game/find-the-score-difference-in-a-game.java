class Solution {
    public int scoreDifference(int[] nums) {
        int f = 0;
        int s = 0;
        boolean first = true;
        boolean second = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                if(first) {
                    second = true;
                    first = false;
                }else{
                    second = false;
                    first = true;
                }
            }
            if((i+1) % 6 == 0){
                if(first) {
                    second = true;
                    first = false;
                }else{
                    second = false;
                    first = true;
                }
            }
            if(first) {
                    f += nums[i];
            }else{
                    s += nums[i];
                } 
        }
        return f-s;
    }
}