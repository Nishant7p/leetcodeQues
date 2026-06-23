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
17    int s=0;
18    public void post(TreeNode root){
19        if(root==null){
20            return ;
21        }
22      
23        
24       
25       
26        post(root.right);
27        s=s+root.val;
28        root.val=s;
29        post(root.left);
30        
31    }
32    public TreeNode convertBST(TreeNode root) {
33        post(root);
34        return root;
35        
36    }
37}