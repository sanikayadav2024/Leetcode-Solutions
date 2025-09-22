class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int max = Collections.max(freq.values());
        int count = 0;

        for(int c : freq.values()){
            if(c == max){
                count += c;
            }
        }
        return count;
    }
}