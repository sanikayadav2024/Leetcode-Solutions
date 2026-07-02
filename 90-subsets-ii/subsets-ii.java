class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);

        create(nums, 0, ans, subset);

        return new ArrayList<>(ans);
    }

    public void create(int[] nums, int index, Set<List<Integer>> ans, List<Integer> subset) {
        if (index == nums.length) {
                ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        create(nums, index + 1, ans, subset);

        subset.remove(subset.size() - 1);
        create(nums, index + 1, ans, subset);
    }
}