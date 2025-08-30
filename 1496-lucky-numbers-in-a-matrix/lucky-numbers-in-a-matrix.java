class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minRow = new ArrayList<>();
        List<Integer> maxCol = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            int min = matrix[i][0];
            for(int j = 0; j < n; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
            minRow.add(min);

        }
         for(int j = 0; j < n; j++){
            int max = matrix[0][j];
            for(int i = 0; i < m; i++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
            maxCol.add(max);

        }
        List<Integer> commonElements = new ArrayList<>(minRow); 
        commonElements.retainAll(maxCol);
        return commonElements;
    }
}