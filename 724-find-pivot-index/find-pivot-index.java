class Solution {
    public int pivotIndex(int[] arr) {
      int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i = 0; i < n; i++){
            int lindex = 0;
            int rindex = n - 1;
            while(lindex < i){
                left[i] += arr[lindex];
                lindex++;
            }
            while(rindex > i){
                right[i] += arr[rindex];
                rindex--;
            }
        }

        for (int i = 0; i < n; i++) {
            if(right[i] == left[i]){
                return  i;
            }
        }
        return -1;  
    }
}