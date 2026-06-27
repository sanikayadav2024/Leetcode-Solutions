class Solution {
    public int[] searchRange(int[] arr, int target) {
      return new int[] {findFirst(arr, target), findLast(arr,target)};  
    }

    public  int findFirst(int[] arr, int target){
        int l = 0;
        int u = arr.length - 1;
        boolean find = false;
        while(l <= u){
            int mid = (l+u)/2;
            if(arr[mid] == target){
                find = true;
                u = mid - 1;
            }else if(arr[mid] < target){
                l = mid + 1;
            }else{
                u = mid - 1;
            }
        }
        return find ? l : -1;
    }
    public int findLast(int[] arr, int target){
        int l = 0;
        int u = arr.length - 1;
        boolean find = false;
        while(l <= u){
            int mid = (l+u)/2;
            if(arr[mid] == target){
                find = true;
                l = mid + 1;
            }else if(arr[mid] < target){
                l = mid + 1;
            }else{
                u = mid - 1;
            }
        }
        return find ? u : -1;
    }
}