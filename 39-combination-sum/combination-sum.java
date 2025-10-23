class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        comb(candidates, target, 0, new ArrayList<>(), 0, list);
        return list;
    }

    void comb(int[] candidates, int target, int index, List<Integer> comb,int total, List<List<Integer>> list){
        if(total == target){
            list.add(new ArrayList<>(comb));
            return;
        }

        if(total > target || index >= candidates.length){
            return;
        }

        comb.add(candidates[index]);
        comb(candidates, target, index, comb, total + candidates[index], list);
        comb.remove(comb.size() - 1);
        comb(candidates, target, index + 1, comb, total, list);
    }
}