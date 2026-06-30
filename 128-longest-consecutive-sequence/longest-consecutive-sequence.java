class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        
        int max = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int cnt = 1;
                int number = n + 1;
                while(set.contains(number)){
                    cnt++;
                    number++;
                }
                max = Math.max(max, cnt);
            }
            
        }
        if(set.size() == 1) return 1;
        return max;
    }
}