class Solution {
    public int minimumOperations(int[] nums) {
        int opr = 0;
        for(int num : nums){
            if(num % 3 != 0){
                opr++;
            }
        }
        return opr;
    }
}