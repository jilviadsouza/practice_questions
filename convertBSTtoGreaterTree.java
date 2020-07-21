// convertBSTtoGreaterTree
/*
Given a Binary Search Tree (BST), 
convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

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
    
    private int sum = 0; // private so that it cant be changed
    
    public TreeNode convertBST(TreeNode root) {
        
        // visit nodes from big to small, keeping sum of all visited values
        // greater value nodes are in the right sub tree so start there
        // visit node, update sum 
        
        if(root != null){
            convertBST(root.right);
            
            sum += root.val;
            root.val = sum; // changing the original tree to the greatest val tree
            
            convertBST(root.left);
        }
        return root;
        
    }
}