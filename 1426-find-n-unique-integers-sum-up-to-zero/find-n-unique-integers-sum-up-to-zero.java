class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n == 1 || n == 0) return ans;

        //if(n % 2 != 0) ans[0] = 0;

        int left = 0;
        int right = n - 1;
        while(left < right){
            ans[left++] = (-(left + 1));
            ans[right--] = left + 1;
        }
        if(n%2 != 0) ans[left] = 0;
        return ans;
    }
}