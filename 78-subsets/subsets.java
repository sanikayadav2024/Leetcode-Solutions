class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        create(nums,0,list,ans);
        return ans;
    }

    private void create(int[] nums, int idx, List<Integer> list, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);

        create(nums, idx+1, list, ans);

        list.remove(list.size()-1);
        
        create(nums, idx+1, list, ans);
    }
}