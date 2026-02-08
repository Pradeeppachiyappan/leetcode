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
    public boolean isBalanced(TreeNode root) {
        return check(root)!=-1;
    }

    public int check(TreeNode tptr){
        if(tptr==null) return 0;

        int lefth=check(tptr.left);
        if(lefth==-1) return -1;

        int righth=check(tptr.right);
        if(righth==-1) return -1;

        if(Math.abs(lefth-righth)>1) return -1;

        return 1+Math.max(lefth,righth);
    }
}