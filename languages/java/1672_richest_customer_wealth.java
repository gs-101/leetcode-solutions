// See: https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4423/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0; // Variable to keep track of the wealth values found so far

        for (int[] customer : accounts) { // Iterate through each customer and their accounts
            int currentCustomerWealth = 0; // Variable to keep track of the current customer's wealth

            for (int bank : customer) { // Iterate through all the banks the customer is in
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth); // Compare the current customer's wealth then set it as the maxWealthSoFar if it is the biggest
        }
        return maxWealthSoFar;
    }
}

// Time complexity: O(n x m)
// Space complexity: O(1)
