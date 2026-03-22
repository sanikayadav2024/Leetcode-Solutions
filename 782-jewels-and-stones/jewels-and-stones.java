class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] freq = jewels.toCharArray();
        int cnt = 0;
        for(int i = 0; i < stones.length(); i++){
            for(char c : freq){
                if(c == stones.charAt(i)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}