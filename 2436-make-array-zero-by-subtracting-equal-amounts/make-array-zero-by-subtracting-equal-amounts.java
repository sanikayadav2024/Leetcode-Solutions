class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!list.contains(i) && i != 0){
                list.add(i);
                ans++;
            }
        }
        return ans;
    }
}