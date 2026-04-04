class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0;
        int l = 0;
        int u = height.length - 1;

        while(l < u){
            maxVol = Math.max(maxVol, Math.min(height[u], height[l])*(u-l));
            if(height[u] > height[l]){
                l++;
            }
            else{
                u--;
            }
        }
        return maxVol;
    }
}