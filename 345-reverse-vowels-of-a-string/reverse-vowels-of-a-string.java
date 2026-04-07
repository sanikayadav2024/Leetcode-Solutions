class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] chars = s.toCharArray();
        String vo = "aeiouAEIOU";

        while(l < r){
            while(l < r && vo.indexOf(chars[l]) == -1){
                l++;
            }
            while(l < r && vo.indexOf(chars[r]) == -1){
                r--;
            }
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        String ans = new String(chars);
        return ans;
    }
}