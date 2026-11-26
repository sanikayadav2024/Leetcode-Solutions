class Solution {
    public boolean canAliceWin(int n) {
        if( n < 10) return false;
        int a = 10;
        int b = 9;
        while(n >= 0){
            n -= a;
            if(n < 0) return false;
            n -= b;
            if(n < 0) return true;
            a = b - 1;
            b = b - 2;
        }
        return true;
    }
}