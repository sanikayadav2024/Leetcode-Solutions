int sumOfUnique(int* nums, int numsSize) {
    int freq[101];
    for(int n = 0; n < numsSize; n++){
        freq[nums[n]]++;
    }
    int sum = 0;
    for(int i = 1; i < 101; i++){
        if(freq[i] == 1){
            sum += i;
        }
    }
    return sum;
}