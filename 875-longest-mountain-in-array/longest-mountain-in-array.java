class Solution {
    public int longestMountain(int[] arr) {
       int n = arr.length;
       if(n < 3) return 0;
       int max = 0;
       int si = 0;
       int i = si + 1;
       while(i < n){
        if(arr[i] <= arr[i-1]){
            si = i;
            i++;
            continue;
        }

        while(i < n && arr[i] > arr[i-1]){
            i++;
        }

        if(i == n || arr[i] == arr[i-1]){
            continue;
        }

        while(i < n && arr[i] < arr[i-1]){
            i++;
        }

        max = Math.max(i-si, max);
        si = i - 1;
       }  
       return max;
    }
}