class Solution {
    public int lastStoneWeight(int[] stones) {
        
        int n = stones.length;

        for(int i = n-1; i >= 1; i-- ){
            Arrays.sort(stones);
            // if(stones[i] == 0) continue;
            if(stones[i] == stones[i-1]){
                stones[i-1] = 0;
            }
            else{
                stones[i-1] = Math.abs(stones[i] - stones[i-1]);
            }
        }
        if(stones[0] == 0) return 0;
        return stones[0];
    }
}