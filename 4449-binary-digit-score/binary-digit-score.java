class Solution {
    public int calculateScore(int a, int b) {
      String s1 = Integer.toBinaryString(a);
      String s2 = Integer.toBinaryString(b);
      int sum1 = digitSum(s1);
      int sum2 = digitSum(s2);
      if(sum1 >= sum2) return sum1*sum2;
      return sum2/sum1;
    }

    private int digitSum(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
}