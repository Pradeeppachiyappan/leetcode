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
    int max=0;
    public int check(TreeNode tptr){
        if(tptr==null){
            return 0;
        }

        int lh=check(tptr.left);
        int rh=check(tptr.right);
        System.out.println(lh+" "+rh);

        max=Math.max(max,lh+rh);

        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int dummy=check(root);
        return max;
    }
}