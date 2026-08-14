/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p == null && q == null) {
                return true;
            } else {
                return false;
            }
        } else if (p.val == q.val) {
            if (p.left == null || q.left == null) {
                if (!(p.left == null && q.left == null)) {
                    return false;
                }
            } else if (p.left.val == q.left.val) {
                if (!isSameTree(p.left, q.left)) return false;
            } else {
                return false;
            }
            
            if (p.right == null || q.right == null) {
                if (!(p.right == null && q.right == null)) {
                    return false;
                }
            } else if (p.right.val == q.right.val) {
                if (!isSameTree(p.right, q.right)) return false;
            } else {
                return false;
            }       
        } else {
            return false;
        }
        return true;
    }
}