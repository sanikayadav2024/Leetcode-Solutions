class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Map<Integer, Integer> freq = new HashMap<>();
        // for(int num : nums){
        //     freq.put(num, freq.getOrDefault(num, 0) + 1);
        // }
        // int max = Collections.max(freq.values());
        // int count = 0;

        // for(int c : freq.values()){
        //     if(c == max){
        //         count += c;
        //     }
        // }
        // return count;

        int[] freq = new int[101];
        for(int num : nums){
            freq[num] += 1;
        }
        Arrays.sort(freq);
        int cnt = 0;
        for(int i = freq.length - 1; i >= 0; i--){
            if(freq[i] == freq[freq.length - 1]){
                cnt += freq[i];
            }
        }
        return cnt;
    }
}