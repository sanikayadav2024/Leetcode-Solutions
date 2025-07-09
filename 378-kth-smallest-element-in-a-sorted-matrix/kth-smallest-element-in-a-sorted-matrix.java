class Solution {
    public int kthSmallest(int[][] matrix, int z) {
      int m = matrix.length;
      int n = matrix[0].length;
      int[] a = new int[m*n];
      int k = 0;
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            a[k] = matrix[i][j];
            k++;
        }
      }
      Arrays.sort(a);
      return a[z - 1];
    }
}