class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int res = 0;
        int b = 0;

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == 'b')
               b++;
            else if(b > 0){
                res++;
                b--;
            }
        }
        return res;
    }
}