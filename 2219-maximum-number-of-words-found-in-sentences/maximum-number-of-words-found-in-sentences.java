class Solution {
    public int mostWordsFound(String[] sentences) {
        int cnt = 1;
        for(int i = 0; i < sentences.length; i++){
            int curr = 1;
            for(char c : sentences[i].toCharArray()){
                if(c == ' '){
                    curr++;
                }
            }
            if(curr > cnt){
                cnt = curr;
            }
        }
        return cnt;
    }
}