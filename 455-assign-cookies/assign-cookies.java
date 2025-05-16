class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int cookies = s.length;
        if(cookies == 0) return 0;

        int count = 0;
        int cookie = cookies - 1;
        int child = g.length - 1;

        while(cookie >= 0 && child >= 0){
            if(s[cookie] >= g[child]){
                count++;
                cookie--;
                child--;
            }else{
                child--;
            }
        }
        return count;
    }
}