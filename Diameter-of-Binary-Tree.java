1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int max=0;
18    public int help(TreeNode root){
19        if(root==null){
20            return 0;
21        }
22        int l_h=help(root.left);
23        int r_h=help(root.right);
24        max=Math.max(max,l_h+r_h);
25        return 1+Math.max(l_h,r_h);
26    }
27     
28    public int diameterOfBinaryTree(TreeNode root) {
29        int depth=help(root);
30        return max;
31
32       
33        
34        
35    }
36}