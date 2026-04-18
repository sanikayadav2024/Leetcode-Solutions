class Solution {
    public int mirrorDistance(int n) {
      int r = rev(n);
      return Math.abs(n - r);  
    }
    public static int rev(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}