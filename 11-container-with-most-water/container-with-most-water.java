class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxVol = Integer.MIN_VALUE;

        while(l < r){
            int curr = Math.min(height[l], height[r])*(r-l);
            maxVol = Math.max(curr, maxVol);

            if(height[l] > height[r]) r--;
            else l++;
        }
        return maxVol;
    }
}