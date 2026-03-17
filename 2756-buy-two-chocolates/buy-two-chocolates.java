class Solution {
    public int buyChoco(int[] prices, int money) {
      Arrays.sort(prices);
      int sum = prices[0] + prices[1];  
      int left = money - sum;
      if(left < 0) return money;
      return left;
    }
}