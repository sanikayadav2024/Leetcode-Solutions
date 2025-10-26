class Solution(object):
    def sumOfUnique(self, nums):
        freq = [0] * 101  # frequency array of size 101
    
        for num in nums:
           freq[num] += 1

        total = 0
        for i in range(len(freq)):
          if freq[i] == 1:
            total += i

        return total
