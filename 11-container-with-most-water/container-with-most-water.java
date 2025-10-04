class Solution {
    public int maxArea(int[] h) {
      int maxVol = 0;
      int l = 0;
      int u = h.length - 1;

      while(l < u){
        maxVol = Math.max(maxVol, Math.min(h[u], h[l])*(u - l));
        if(h[u] > h[l]){
            l++;
        }else{
            u--;
        }
      }
      return maxVol;
    }
}