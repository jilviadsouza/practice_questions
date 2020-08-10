// leafSimilar
/*
Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
      // to find the leaf value of a tree, use dfs
        
        List<Integer> leaves1 = new ArrayList();
        List<Integer> leaves2 = new ArrayList();
        
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        
        return leaves1.equals(leaves2);
    }
    
    public void dfs(TreeNode node, List<Integer> leaves){
        if (node != null){
            if(node.left == null && node.right == null) //if youre on the last node of the tree (leaf node)
                leaves.add(node.val);
            
            dfs(node.left, leaves);
            dfs(node.right, leaves);
        }
    }
}