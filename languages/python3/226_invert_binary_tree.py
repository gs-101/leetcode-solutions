# See: https://leetcode.com/problems/invert-binary-tree/solutions/5513149/video-swap-left-child-and-right-child/


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        # Base Case
        # Check if the `root` is `None`. If it is, return `None`.
        if not root:
            return

        # Swap Left and Right
        root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)

        return root


# Time complexity: O(n)
# Space complexity: O(n)
