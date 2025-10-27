class Solution(object):
    def numberOfBeams(self, bank):
        count = [row.count('1') for row in bank]
        sum = 0

        for i in range(0, len(count) - 1):
            if count[i] != 0 :
                for j in range(i + 1, len(count)):
                    if count[j] != 0:
                        sum = sum + count[i] * count[j]
                        break

        return sum