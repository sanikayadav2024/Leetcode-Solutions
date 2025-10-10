class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;
        int i = n - 1;
        while(i >= 0){
            if(i + k < n){
                energy[i] += energy[i + k];
            }
            max = Math.max(energy[i], max);
            i--;
        }
        return max;
    }
}