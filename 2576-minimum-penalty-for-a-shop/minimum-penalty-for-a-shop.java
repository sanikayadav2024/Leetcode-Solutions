class Solution {
    public int bestClosingTime(String cust) {
        int btime = 0;
        int min = 0;
        int prefix = 0;

        for(int i = 0; i < cust.length(); i++){
            char c = cust.charAt(i);
            prefix += (c == 'Y') ? -1 : 1;

            if(prefix < min){
                btime = i + 1;
                min = prefix;
            }
        }
        return btime;
    }
}