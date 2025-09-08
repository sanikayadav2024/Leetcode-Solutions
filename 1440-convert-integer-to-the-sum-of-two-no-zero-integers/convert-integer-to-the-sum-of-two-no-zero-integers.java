class Solution {
    public int[] getNoZeroIntegers(int n) {
        // for(int i = 1; i < n; i++){
        //     String numStr = String.valueOf(i);
        //     if(numStr.contains("0")) continue;
        //     else{
        //         String num2 = String.valueOf(n - i);
        //         if(!num2.contains("0")) return new int[] {i, n - i};
        //         else continue;
        //     }
        // }
        // return new int[] {-1, -1};

        for(int i = 1; i < n; i++){
            int a = i;
            int b = n - i;
            if(a > 0 && b > 0 && isValid(a) && isValid(b)){
                return new int[] {i, n - i};
            }
        }
        return new int[] {-1, -1};
    }

    private boolean isValid(int n){
        while(n > 0){
            int digit = n % 10;
            if(digit == 0) return false;
            n /= 10;
        }
        return true;
    }
}