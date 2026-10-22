class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;

        for(int i : nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
            f = Math.min(f, i);
        }
        Arrays.sort(nums2);
        for(int i : nums2){
            if(map.getOrDefault(i, 0) == 1) return i;
            s = Math.min(s, i);
        }

        if(f < s) return f*10+s;
        return s*10+f;
    }
}