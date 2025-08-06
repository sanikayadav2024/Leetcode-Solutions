class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int x : arr){
            sum += x;
        }

        if(sum % 3 != 0){
            return false;
        }
        int init = 0;
        int cnt = 0;
        int target = sum / 3;
        for(int i = 0; i < arr.length; i++){
            init += arr[i];

            if(init == target){
                cnt++;
                init = 0;
            }
        }
        return (cnt >= 3);
    }
}