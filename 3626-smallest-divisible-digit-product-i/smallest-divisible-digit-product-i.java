class Solution {
    public int smallestNumber(int n, int t) {
        int prod;
        for(int i=n; i<=100; i++){
            if( i<10 && i%t==0){
                return i;
            }
            else{
                prod = digProd(i);
                if(prod%t==0)
                    return i;
            }
        }
        return 0;
    }

    private int digProd(int n){
        int prod = 1;
        while(n != 0){
            int dig = n % 10;
            prod *= dig;
            n /= 10;
        }
        return prod;
    }
}