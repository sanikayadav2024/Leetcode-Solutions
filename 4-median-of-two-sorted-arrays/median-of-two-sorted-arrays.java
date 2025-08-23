class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[ m + n ];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }else{
                merged[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            merged[k++] = nums1[i++];
        }
        while(j < nums2.length){
            merged[k++] = nums2[j++];
        }
        // for( int i = 0; i < n; i++ ){
        //     merged[k] = nums1[i];
        //     k++;
        // }
        // for( int j = 0; j < m; j++){
        //     merged[k] = nums2[j];
        //     k++;
        // }
        // Arrays.sort(merged);
        
        int total = merged.length;

        if( total % 2 == 1){
            return (double) merged[total/2];
        }
        else{
            int mid1 = merged[total / 2 - 1];
            int mid2 = merged[total / 2];
            return ((double) mid1 + (double)mid2) / 2.0;
        }
    }
}