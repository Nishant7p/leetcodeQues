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
    public void helper(int depth, int i,TreeNode root,int[] sum){
        if(root==null){
            return;
        }
        if(depth==i){
            sum[0]=sum[0]+root.val;
            return;

        }
        helper(depth,i+1,root.left,sum);
        helper(depth,i+1,root.right,sum);

    }
    public int help(TreeNode root){
        if(root==null){
            return 0;
        }
        int x=help(root.left);
        int y=help(root.right);
        return 1+Math.max(x,y);

    }
    public int deepestLeavesSum(TreeNode root) {

        int max_d=help(root);
        int[] sum={0};

        helper(max_d,1,root,sum);



        return sum[0];
        
    }
}