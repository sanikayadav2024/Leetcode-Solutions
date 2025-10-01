class Solution {
    public int numWaterBottles(int n, int ex) {
        int sum = 0;
        int rem = 0;

        while(n > 0){
            sum = sum + n - rem;
            int num = n / ex;
            if(num == 0) break;
            rem = n % ex;
            n = num + rem;
        }
        return sum;
    }
}