// invertBinaryTree
/*

Invert a binary tree.


*/
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
    public TreeNode invertTree(TreeNode root) {
        
        //swap the leaves of the subtrees 
        
        if (root == null) return null; 
        
        //traverse down the left and right of the root
        
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        //swap 
        root.right = left;
        root.left = right;
        
        return root;
    }
}