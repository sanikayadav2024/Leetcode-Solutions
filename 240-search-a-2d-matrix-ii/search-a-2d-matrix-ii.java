class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while(c >= 0 && r < matrix.length){
            int current = matrix[r][c];
            if(target == current) return true;

            if(current > target) c -= 1;

            if(current < target)
                 r += 1;
        }
        return false;
    }
}