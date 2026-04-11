class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(List<Integer> indices : mp.values()){
            if(indices.size() < 3) continue;

            for(int i = 0; i + 2 < indices.size(); i++){
                int dist = 2 * (indices.get(i+2) - indices.get(i));
                min = Math.min(min, dist); 
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;  
    }
}