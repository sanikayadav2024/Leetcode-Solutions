int minimumOperations(int* nums, int numsSize) {
    int totalSteps = 0;
    for(int i = 0; i < numsSize; i++){
        if(nums[i] % 3 != 0){
            totalSteps++;
        }
    }
    return totalSteps;
}