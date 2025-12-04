class Solution {
    public int countCollisions(String d) {
        int n = d.length();
        if(n == 1) return 0;
        int l = 0;
        int r = n - 1;

        while(l < r && d.charAt(l) == 'L') l++;
        while(l < r && d.charAt(r) == 'R') r--;

        if(l >= r) return 0;

        int col = 0;

        for( ; l <= r; l++){
            if(d.charAt(l) != 'S'){
                col += 1;
            }
        }
        return col;
    }
}