// See: https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4427/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>(); // HashMap to store characters as numbers

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m , currentCount + 1); // Update the frequency of the letter to the HashMap
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);

            if (currentCount == 0) { // If the letter is not found in magazine, return immediately
                return false;
            }

            magazineLetters.put(r, currentCount - 1); // If it is found, update the frequency of the letter, like removing it from its pile
        }

        return true;

    }

}

// Time complexity: O(m)
// Space complexity: O(k)
