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
    int sum=0;
    public int  Tsum(TreeNode root, int dir){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null&&dir==1){
            sum=sum+root.val;
        }
         if(root.left==null&&root.right==null&&dir==-1){
            
            return 0;
        }
        if(root.left!=null){
            Tsum(root.left,1);
        }
        if(root.right!=null){
            Tsum(root.right,-1);
        }
        return 0;




    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }

        Tsum(root.right,-1);
        Tsum(root.left,1);



        return sum;

        
    }
}