class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int f = 0;
        int s = 0;
        int n = nums1.length;
        int m = nums2.length;
        while(f < n && s < m){
            if(nums1[f] == nums2[s]){
                return nums1[f];
            }
            else if(nums1[f] < nums2[s]){
                f++;
            }
            else{
                s++;
            }
        }
        return -1;
    }
}