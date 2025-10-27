class Solution {
    public int numberOfBeams(String[] bank) {
        int sum = 0;
        int prev = 0;
        for(int i = 0; i < bank.length; i++){
            int count = 0;
            for(char c : bank[i].toCharArray()){
                if(c - '0' == 1){
                    count++;
                }
            }
            if(count != 0){
                if(prev == 0){
                    prev = count;
                    continue;
                }
                sum += count * prev;
                prev = count;
            }
        }
        return sum;
    }
}