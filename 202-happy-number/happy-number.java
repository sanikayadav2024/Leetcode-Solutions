class Solution {
    public boolean isHappy(int num) {
       if(num == 1 || num == 7) return true;
        while (num > 9){
            int sum = digitSum(num);
            if(sum == 1 || sum == 7) return true;
            else num = sum;
        }
        return false;   
    }
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0){
            sum += (num%10)*(num%10);
            num /= 10;
        }
        return sum;
    }
}