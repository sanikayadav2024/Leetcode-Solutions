class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
    
        for(int i : nums){
            if(i < pivot){
                small.add(i);
            }
            else if(i > pivot){
                big.add(i);
            }
            else{
                equal.add(i);
            }
        }
        int i = 0;
        int j = 0;
        while(i < nums.length && j < small.size() && !small.isEmpty()){
            nums[i++] = small.get(j++);
        }
        j = 0;
        while( i < nums.length && j < equal.size() && !equal.isEmpty()){
            nums[i++] = equal.get(j++);
        }
        j = 0;
        while(i < nums.length && j < big.size() && !big.isEmpty()){
            nums[i++] = big.get(j++);
        }
        return nums;
    }
}