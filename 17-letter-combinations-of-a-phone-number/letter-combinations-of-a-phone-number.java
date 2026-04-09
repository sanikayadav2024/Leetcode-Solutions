class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return res;
        }

        String[] mapping = new String[]{
            "", 
            "",     "abc",  "def", 
            "ghi",  "jkl",  "mno", 
            "pqrs", "tuv",  "wxyz"
        };
        phoneComb(digits, 0, new StringBuilder(), mapping, res);
        return res;
    }

    private void phoneComb(String digits, int idx, StringBuilder curr, String[] mapping, List<String> res){
       if(idx == digits.length()){
        res.add(curr.toString());
        return;
       } 

       String letters = mapping[digits.charAt(idx) - '0'];

       for(char c : letters.toCharArray()){
        curr.append(c);

        phoneComb(digits, idx+1, curr, mapping,res);
        curr.deleteCharAt(curr.length() - 1);
       }
    }
}