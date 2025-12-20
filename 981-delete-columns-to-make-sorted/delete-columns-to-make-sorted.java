class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;

        for(int j = 0; j < strs[0].length(); j++){
            ans += isUnsorted(strs, j);
        }
        return ans;
    }

    private int isUnsorted(String[] strs, int j){
        for(int i = 1; i < strs.length; i++){
            if(strs[i].charAt(j) < strs[i - 1].charAt(j)){
                return 1;
            }
        }
        return 0;
    }
}