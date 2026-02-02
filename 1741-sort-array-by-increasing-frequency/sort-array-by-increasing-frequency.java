class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(freq.keySet());

        Collections.sort(list, (a, b) ->{
            if(freq.get(a) != freq.get(b)){
                return freq.get(a)-freq.get(b);
            }
            return b-a;
        });

        int res[] = new int[nums.length];
        int index = 0;
        for(int n : list){
            int f = freq.get(n);
            for(int i = 0; i < f; i++){
                res[index++] = n;
            }
        }
        return res;
    }
}