class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        List<Integer> list = new ArrayList<>();

        int size = n / 3;

        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        freq.forEach((key, value) ->{
           if(value > size){
            list.add(key);
           }
        });

        return list;
    }
}