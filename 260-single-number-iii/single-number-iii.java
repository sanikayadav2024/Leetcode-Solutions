class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(); 
        int i = 0;
        for (Map.Entry<Integer, Integer> f : freq.entrySet()) {
            if(f.getValue() == 1){
               list.add(f.getKey()) ;
            }
        }
        int[] res = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;
    }
}