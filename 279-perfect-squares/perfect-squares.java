class Solution {
    public int numSquares(int n) {
       if(isSq(n)) return 1;

       while(n % 4 == 0){
        n /= 4;
       } 

       if(n % 8 == 7){
        return 4;
       }

       for(int i = 1; i*i <= n; i++){
        if(isSq(n-i*i)){
            return 2;
        }
       }
       return 3;
    }

    private boolean isSq(int n){
        int r = (int) Math.sqrt(n);
        return r*r == n;
    }
}