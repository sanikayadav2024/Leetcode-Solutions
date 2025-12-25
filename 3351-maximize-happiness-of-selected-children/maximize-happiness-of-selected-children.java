class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
       long max = 0;
       Arrays.sort(hap);

       int n = hap.length;
       for(int i = 0; i < k; i++){
        int val = hap[n - i - 1] - i;

        if(val <= 0) break;
        max += val;
       }
       return max;
    }

    
}