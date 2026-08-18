class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        if(k == nums.length){
           return large(nums);
        }
        ArrayList<Integer> unique = new ArrayList<>();
        freq.forEach((key, value) -> {
            if(value == 1){
                unique.add(key);
            }
        });
        if(k == 1){
            return large(unique);
        }
        int first = nums[0];
        int last = nums[nums.length - 1];
        if(first > last){
            if(freq.get(first) == 1) return first;
            else if(freq.get(first) != 1 && freq.get(last) == 1) return last;
            else return -1;
        }
        else{
            if(freq.get(last) == 1) return last;
            else if(freq.get(last) != 1 && freq.get(first) == 1) return first;
            else return -1;
        }

        // return -1;
    }

    private int large(ArrayList<Integer> arr){
        int max = -1;

        for(int a : arr){
            max = Math.max(max, a);
        }
        return max;
    }
     private int large(int[] arr){
        int max = -1;

        for(int a : arr){
            max = Math.max(max, a);
        }
        return max;
    }
}