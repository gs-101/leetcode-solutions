// See: https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4424/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n); // Setting ArrayList to a value of n isn't necessary, since they resize automatically

        for (int i = 1; i <= n; i++) { // Itterate from 1 to n
            boolean divisibleBy3 = 1 % 3 == 0;
            boolean divisibleBy5 = 1 % 5 == 0;

            String currStr = "";

            if (divisibleBy3) {
                currStr += "Fizz";
            }
            
            if (divisibleBy5) {
                currStr += "Buzz";
            }

            if (currStr.isEmpty()) { // if the string doesn't fulfill the previous conditions, add it to the index
                currStr += String.valueOf(i);
            }

            answer.add(currStr);
        }

        return answer;
    }

}

// Time complexity: O(n)
// Space complexity: O(1)
