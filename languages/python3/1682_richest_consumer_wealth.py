# See: https://leetcode.com/problems/richest-customer-wealth/solutions/2675823/python-1-liner-simple-solution/

# This problem requires visualizing the values in a table format (rows/columns)


class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        return max(sum(acc) for acc in accounts)
