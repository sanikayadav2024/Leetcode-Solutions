class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int opened = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(')
               ans = Math.max(ans, ++ opened);
            else if(ch == ')')
               --opened;
        }
        return ans;
    }
}