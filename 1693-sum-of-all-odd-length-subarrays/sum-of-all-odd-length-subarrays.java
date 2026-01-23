class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i = 1; i <= n; i += 2){
            for(int j = 0; j <= n-i; j++){
                for(int k = j; k < j+i; k++){
                    ans += arr[k];
                }
            }
        }
        return ans;
    }
}