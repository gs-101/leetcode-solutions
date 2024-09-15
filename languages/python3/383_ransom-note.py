# See: https://leetcode.com/problems/ransom-note/solutions/3856466/python3-using-dict-as-a-hash-map/


class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        cache = dict()  # create an empty dict to be used later
        # Create hash-map
        for letter in magazine:
            if letter in cache:
                cache[letter] += 1
            else:
                cache[letter] = 1

        # Do check
        for letter in ransomNote:
            if letter not in cache:
                return False
            elif cache[letter] == 0:
                return False
            else:
                cache[letter] -= 1

        return True


# Time complexity: O(n)
# Space complexity: O(n)
