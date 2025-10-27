class Solution {
    public int numberOfBeams(String[] bank) {
        int sum = 0;
        int[] count = new int[bank.length];
        for(int i = 0; i < bank.length; i++){
            for(char c : bank[i].toCharArray()){
                if(c - '0' == 1){
                    count[i]++;
                }
            }
        }
        for(int i = 0; i < count.length - 1; i++){
            if(count[i] != 0){
                for(int j = i + 1; j < count.length; j++){
                    if(count[j] != 0){
                        sum = sum + count[i] * count[j];
                        break;
                    }
                }
            }
        }
        return sum;
    }
}