class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> f : freq.entrySet()) {
            if(i == 2){
                break;
            }
            if(f.getValue() == 2){
               ans[i++] = f.getKey() ;
            }
            
        }
        return ans;
    }
}