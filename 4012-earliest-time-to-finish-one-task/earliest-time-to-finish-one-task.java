class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int[] row: tasks){
            min = Math.min(min, row[0] + row[1]);
        }
        return min;
    }
}