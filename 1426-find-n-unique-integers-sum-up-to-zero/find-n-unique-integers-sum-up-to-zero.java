class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        // if(n == 1 || n == 0) return ans;

        // int left = 0;
        // int right = n - 1;
        // while(left < right){
        //     ans[left++] = (-(left + 1));
        //     ans[right--] = left + 1;
        // }
        // if(n%2 != 0) ans[left] = 0;

        ans[0] = n * (1 - n) / 2;
        for(int i = 1; i < n; i++){
            ans[i] = i;
        }
        return ans;
    }
}