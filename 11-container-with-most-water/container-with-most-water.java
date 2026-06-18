class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int u = height.length - 1;
        int maxVol = 0;
        while(l < u){
            maxVol = Math.max(maxVol, Math.min(height[l] , height[u])*(u-l));
            if(height[l] < height[u]){
                l++;
            }
            else{
                u--;
            }
        }
        return maxVol;
    }
}