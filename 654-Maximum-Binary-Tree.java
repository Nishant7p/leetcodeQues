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
    public TreeNode help(int[] arr,int s,int e){
        if(s>e){
            return null;
        }
        int max=arr[s];
        int m_i=s;
        for(int i=s;i<=e;i++){
            if(max<arr[i]){
                max=arr[i];
                m_i=i;
            }
        }
        TreeNode node=new TreeNode(max);
        if(m_i-1>=s){
             node.left=help(arr,s,m_i-1);

        }
        if(m_i+1<=e){
       
        node.right=help(arr,m_i+1,e);}

        return node;

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return help(nums,0,nums.length-1);

        
    }
}