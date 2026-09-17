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
    int maxVal=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return maxVal;
    }

    public int maxSum(TreeNode tptr){
        if(tptr==null){
            return 0;
        }

        int left=Math.max(maxSum(tptr.left),0);
        int right=Math.max(maxSum(tptr.right),0);

        int curr=left+right+tptr.val;
        maxVal=Math.max(maxVal,curr);

        return tptr.val+Math.max(left,right);
    }
}