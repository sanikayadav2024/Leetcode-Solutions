class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int total = 0;
            for(int w : accounts[i]){
                total += w;
            }
            max = Math.max(max, total);
        }
        return max;
    }
}