class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int u = h.length-1;

        int max = 0;

        while(l < u){
            int curr = Math.min(h[l], h[u]) * (u-l);
            max = Math.max(curr, max);
            if(h[l] < h[u]) l++;
            else u--;
        }
        return max;
    }
}