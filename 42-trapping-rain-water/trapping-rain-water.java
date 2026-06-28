class Solution {
    public int trap(int[] h) {
        int n =  h.length;
        int left = 0;
        int right = 0;
        int l = 0;
        int r = n - 1;
        int ans = 0;

        while(l < r){
            left = Math.max(left, h[l]);
            right = Math.max(right, h[r]);

            if(left < right){
                ans += left - h[l];
                l++;
            }
            else{
                ans += right - h[r];
                r--;
            }
        }
        return ans;
    }
}