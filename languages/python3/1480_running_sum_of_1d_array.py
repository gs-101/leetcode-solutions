# See: https://leetcode.com/problems/running-sum-of-1d-array/solutions/

# Approach
# 1. Initialize the total sum and return a vector
# 2. Iterate each element in the number vector
# 3. Keep on adding sum to the iterative value and keep on pushing a new sum value to the return array
# 4. Return the array


class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sums = 0
        retSum = []
        for i in nums:
            sums += i
            retSum.append(sums)
        return retSum


# Time complexity: O(n)
# Space complexity: O(1)
