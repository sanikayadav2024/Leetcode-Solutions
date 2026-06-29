class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
       int l = 0;
       int m = arr.length;
       int n = arr[0].length;
       int u = m*n-1;
       while(l <= u){
        int mid = (l+u)/2;
        int midrow = mid / n;
        int midcol = mid % n; 
        int middle = arr[midrow][midcol];

        if(middle == target) return true;
        else if(middle < target){
            l = mid + 1;
        }
        else{
            u = mid - 1;
        }
       }
       return false;
    }
}