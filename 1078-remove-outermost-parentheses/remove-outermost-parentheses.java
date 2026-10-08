class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int l = 0;

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == '(' ? l++ : --l) > 0){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}