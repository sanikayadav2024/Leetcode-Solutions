class Solution {
    public int findClosest(int x, int y, int z) {
            int xdiff = Math.abs(z - x);
            int ydiff = Math.abs(z - y);
            if(xdiff < ydiff) return 1;
            if(xdiff > ydiff) return 2;
            return 0;
    }
}