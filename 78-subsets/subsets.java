class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        create(nums, 0, ans, subset);
        return ans;
    }

    public void create(int[] nums, int index, List<List<Integer>> ans, List<Integer> subset){
        if(index == nums.length){
            ans.add(new ArrayList<>(subset));
            return ;
        }

        subset.add(nums[index]);
        create(nums, index+1, ans, subset);

        subset.remove(subset.size() - 1);
        create(nums, index+1, ans, subset);
    }
}