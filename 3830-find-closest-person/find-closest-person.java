class Solution {
    public int findClosest(int x, int y, int z) {
            int xdiff = Math.abs(z - x);
            int ydiff = Math.abs(z - y);
            return (xdiff == ydiff) ? 0 : (xdiff > ydiff) ? 2 : 1;
    }
}