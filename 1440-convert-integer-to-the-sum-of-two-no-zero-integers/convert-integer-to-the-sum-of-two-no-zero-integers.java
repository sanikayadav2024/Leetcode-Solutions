class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1; i < n; i++){
            String numStr = String.valueOf(i);
            if(numStr.contains("0")) continue;
            else{
                String num2 = String.valueOf(n - i);
                if(!num2.contains("0")) return new int[] {i, n - i};
                else continue;
            }
        }
        return new int[] {-1, -1};
    }
}