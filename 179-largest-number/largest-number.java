class Solution {
    public String largestNumber(int[] nums) {
        String[] sortedArr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            sortedArr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(sortedArr,(a, b) -> (b + a).compareTo(a + b));
        if(sortedArr[0].equals("0")){
            return "0";
        }

        StringBuilder largest = new StringBuilder();
        for(int i = 0; i < sortedArr.length; i++){
            largest.append(sortedArr[i]);
        }
        return largest.toString();
    }
}