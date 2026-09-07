class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = words.length;
        int ans = 0;
        for(String s : words){
            for(int j = 0; j < pref.length(); j++){
                if(s.length() < pref.length()) break;
                if(s.charAt(j) != pref.charAt(j)){
                    break;
                }
                if(j == pref.length() - 1){
                    ans++;
                }
            }
        }
        return ans;
    }
}