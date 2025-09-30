class Solution {
    public int triangularSum(int[] temp) {
        int n = temp.length;
        if(n == 0 || n == 1) return temp[0];
        for(int step = 1; step < n; step++){
            for(int i = 0; i < n - step; i++){
                temp[i] = (temp[i] + temp[i+1]) % 10;
            }
        }
        return temp[0];
    }
}