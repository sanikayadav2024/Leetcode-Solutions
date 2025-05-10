class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        int zn1 = 0;
        int zn2 = 0;
        for(int x : nums1){
            if( x == 0) zn1++;
            sum1 += x;
        }

        for(int y : nums2){
            if( y == 0) zn2++;
            sum2 += y;
        }

        long min1 = sum1 + zn1;
        long min2 = sum2 + zn2;

        if(zn1 == 0 && zn2 == 0){
            return sum1 == sum2 ? sum1 : -1;
        }else if(zn1 == 0){
            return sum2 + zn2 <= sum1 ? sum1 : -1;
        }else if(zn2 == 0){
            return sum1 + zn1 <= sum2 ? sum2 : -1;
        }else{
            return Math.max(min1, min2);
        }
    }
}