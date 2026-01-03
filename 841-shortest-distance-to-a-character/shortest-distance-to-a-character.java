class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] dist = new int[s.length()];
        int n = s.length();
        int prev = -1;
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c){ 
                dist[i] = 0;
               for(int j = prev + 1; j < i; j++){
                dist[j] = Math.abs(i - j);
               }
               prev = i;
            }
        }

        prev = n;

        for(int i = n - 1; i >= 0; i--){
            if(s.charAt(i) == c){
                for(int j = prev - 1; j > i; j--){
                    dist[j] = Math.min(dist[j], Math.abs(i - j));
                }
                prev = i;
            }
        }
        return dist;
    }
}