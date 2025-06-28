class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                shift(arr , i);
                i++;
            }
        }
    }

    void shift(int[] arr, int i){
        for(int j = arr.length - 1; j > i; j--){
            arr[j] = arr[j-1];
        }
    }
}