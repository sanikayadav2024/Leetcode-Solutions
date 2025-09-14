class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for(int i = 0; i < k; i++){
            ans[i] = entries.get(i).getKey();
        }
        
        return ans;
    }
}