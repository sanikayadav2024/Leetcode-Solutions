class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for(int i = 3; i <= 3 * n / 4; i++){
            for(int j = i + 1; j < n; j++){
                int sum = i*i + j*j;
                int sq =(int) Math.sqrt(sum);
                if(sq <= n){
                    if(sq*sq == sum){
                        cnt += 2;
                    }
                }else{
                    break;
                }
            }
        }
        return cnt;
    }
}