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
    public int search(TreeNode tptr,int count){
        if(tptr==null){
            return count;
        }
        if(tptr.left==null && tptr.right==null){
            return count; 
        }
        return Math.max(search(tptr.left,count+1),search(tptr.right,count+1));
    }

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+search(root,0);
    }
}