class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int minCost = 0;
        int n = cost.length;

        for(int i = 0; i < n; i += 3){
            minCost += cost[n - 1 - i];
            if(i + 1 < n){
                minCost += cost[n - 1 - (i+1)];
            }
        }
        return minCost;
    }
}