class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates, target, 0, new ArrayList<>());
        return (ans);
    }

    private void find(int coins[], int target, int idx, List<Integer> wallet){
        if(target == 0){
            ans.add(new ArrayList<>(wallet));
            return;
        }
        for(int i = idx; i < coins.length; i++){
            if(coins[i] <= target){
                wallet.add(coins[i]);
                find(coins, target-coins[i], i, wallet);
                wallet.remove(wallet.size()-1);
            }
        }
    }
}