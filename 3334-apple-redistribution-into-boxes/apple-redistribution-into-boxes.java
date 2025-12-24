class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
         for(int n : apple){
            totalApples += n;
         }
         Arrays.sort(capacity);
         int ans = 0;
         int i = capacity.length - 1;
        while(totalApples > 0){
            ans++;
            totalApples -= capacity[i--];
        }
         return ans;
    }
}