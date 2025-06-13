class Solution {
  public int singleNumber(int[] nums) {
    int ones = 0;
    int threes = 0;

    for (final int num : nums) {
      ones ^= (num & ~threes);
      threes ^= (num & ~ones);
    }

    return ones;
  }
}