class Solution {
    public String frequencySort(String s) {
        int[][] cnt = new int[256][2];

        for(int i = 0; i < 256; i++) cnt[i][1] = i;

        for(char ch : s.toCharArray()){
            cnt[ch][0]++;
        }
        Arrays.sort(cnt, (a,b) -> b[0] - a[0]);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 256 && cnt[i][0] > 0; i++){
            for(int j = 0; j < cnt[i][0]; j++){
                sb.append((char) cnt[i][1]);
            }
        }
        return sb.toString();
    }
}