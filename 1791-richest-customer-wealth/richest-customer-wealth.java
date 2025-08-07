class Solution {
    public int maximumWealth(int[][] a) {
        if(a.length == 0) return 0;

        int max = 0;

        for(int i = 0; i < a.length; i++){
            int sum = 0;
            for(int j = 0; j < a[i].length; j++){
                sum += a[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}