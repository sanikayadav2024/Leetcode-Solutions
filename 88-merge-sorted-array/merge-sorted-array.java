class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int idx = num1.length - 1;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0){
            if(num1[i] > num2[j]){
                num1[idx--] = num1[i--];
            }else{
                num1[idx--] = num2[j--];
            }
        }
        while(j >= 0){
            num1[idx--] = num2[j--];
        }
    }
}