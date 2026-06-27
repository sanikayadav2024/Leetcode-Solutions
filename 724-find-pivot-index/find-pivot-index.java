class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
         int leftSum = 0;
        int rightSum = 0;
        int total = 0;

        for(int i : arr){
            total += i;
        }
        for(int i = 0; i < n; i++){
            rightSum = total - leftSum - arr[i];
            if(rightSum == leftSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }
}