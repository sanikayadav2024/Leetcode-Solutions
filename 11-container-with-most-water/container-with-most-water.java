class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int u = h.length-1;
        int maxVol = Integer.MIN_VALUE;
        while(l < u){
            int vol = Math.min(h[l], h[u])*(u-l);
            maxVol = Math.max(maxVol, vol);
            if(h[u] < h[l]) u--;
            else l++;
        }
        return maxVol;
    }
}