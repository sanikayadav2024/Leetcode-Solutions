class Solution {
    public int minimumPushes(String word) {
        int add = 1;
        int total = 1;
        for(int i = 1; i < word.length(); i++){
           if(i % 8 == 0){
            add++;
           } 
           total += add;
        }
        return total;
    }
}