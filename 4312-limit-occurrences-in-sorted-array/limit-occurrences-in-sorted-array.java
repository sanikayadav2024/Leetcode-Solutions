class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        freq.forEach((key, value) ->{
            if(value < k){
                for(int i = 0; i < value; i++){
                    list.add(key);
                }
            }
            else{
                for(int i = 0; i < k; i++){
                    list.add(key);
                }
            }
        });
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}