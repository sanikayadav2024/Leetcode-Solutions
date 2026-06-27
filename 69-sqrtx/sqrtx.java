class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 0) return x;

        int l = 1;
        int u = x/2;
        int mid = -1;
        while(l <= u){
            mid = (l+u)/2;
            if(mid*mid == x) return mid;
            else if((long)mid*mid < (long) x) l = mid + 1;
            else u = mid - 1;  
        }
        return u;
    }
}