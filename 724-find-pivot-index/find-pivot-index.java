class Solution {
    public int pivotIndex(int[] nums) {
        int size = nums.length;
        int[] sumLeft = new int[size];
        int[] sumRight = new int[size];
        
        for(int i = 0; i < size; i++){
         int ri = size - 1;
         int li = 0;  

         while(li < i){
            sumLeft[i] += nums[li];
            li++;
         }

         while(ri > i){
            sumRight[i] += nums[ri];
            ri--;
         }
        }

        for(int i = 0; i < size; i++){
            if(sumRight[i] == sumLeft[i]) return i;
        }
        return -1;

    }
}