class Solution(object):
    def minimumOperations(self, nums):
        totalSteps = 0
        for i in nums :
            if (i % 3 != 0):
                totalSteps += 1
        return totalSteps
        