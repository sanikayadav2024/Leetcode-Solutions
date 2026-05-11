class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i : nums) {
          sb.append(i);
        }
        int[] ans = new int[sb.length()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = sb.charAt(i) - '0';
        }
        return ans;
    }
}