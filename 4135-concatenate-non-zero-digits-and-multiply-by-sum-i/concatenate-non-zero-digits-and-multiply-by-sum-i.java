class Solution {
    public long sumAndMultiply(int n) {
        long rev = 0;
        while(n != 0){
            if(n% 10 != 0)
               rev =(long) (rev*10 + n % 10);
            n /= 10;
        }
        long sum = 0;
        while(rev != 0){
            sum +=(long) (rev % 10);
            n =(int) (n*10 + rev % 10);
            rev /= 10;
        }
        return sum*n;

    }
}