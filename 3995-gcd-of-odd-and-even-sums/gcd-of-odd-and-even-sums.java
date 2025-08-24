import java.math.BigInteger;
class Solution {
    public int gcdOfOddEvenSums(int n) {
        //return n;
        int sumOdd = 0;
        int sumEven = 0;
        int even = 2;
        int odd  = 1;
        for (int i = 1; i <= n; i++) {
            sumOdd = sumOdd + odd;
            sumEven = sumEven + even;
            even += 2;
            odd += 2;
        }
        return  gcd(sumOdd, sumEven);
    }
    static  int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}