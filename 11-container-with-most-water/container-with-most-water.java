class Solution {
    public int maxArea(int[] h) {
        int maxVol = 0;
        int i = 0;
        int j = h.length - 1;

        while(i < j){
            maxVol = Math.max(maxVol, Math.min(h[i], h[j])*(j - i));

            if(h[i] < h[j]) i++;
            else j--;
        }
        return maxVol;
    }
}