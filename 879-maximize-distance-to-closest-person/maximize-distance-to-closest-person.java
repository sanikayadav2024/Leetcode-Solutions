class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int n = seats.length;
        int last = -1;

        for(int i = 0; i < n; i++){
            if(seats[i] == 1){
                res = last < 0 ? i : Math.max(res, (i - last)/2);
                last = i;
            }
        }
        res = Math.max(res, n - last - 1);
        return res;
    }
}